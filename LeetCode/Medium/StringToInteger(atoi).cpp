class Solution {
public:
    int myAtoi(string str) {
        // Remove leading whitespace characters
        size_t start = str.find_first_not_of(' ');
        if (start == string::npos) {
            // The string only contains whitespace characters
            return 0;
        }
        str = str.substr(start);

        // Check if the string starts with a sign character
        int sign = 1;
        if (str[0] == '+') {
            str = str.substr(1);
        } else if (str[0] == '-') {
            sign = -1;
            str = str.substr(1);
        }

        // Convert the remaining string to an integer
        int result = 0;
        for (const char c : str) {
            if (!isdigit(c)) {
                // Stop when we reach the first non-digit character
                break;
            }
            // Check for overflow/underflow
            if (result > INT_MAX / 10 || (result == INT_MAX / 10 && c > '7')) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            result = result * 10 + (c - '0');
        }
        return sign * result;
    }
};
