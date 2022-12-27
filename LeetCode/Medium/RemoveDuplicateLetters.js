/**
 * @param {string} s
 * @return {string}
 */
var removeDuplicateLetters = function(s) {
    let count = new Array(26).fill(0);
    let visited = new Array(26).fill(false);
    for (let c of s) {
        count[c.charCodeAt(0) - 97]++;
    }
    let stack = [];
    for (let c of s) {
        let i = c.charCodeAt(0) - 97;
        count[i]--;
        if (visited[i]) continue;
        while (stack.length > 0 && stack[stack.length - 1] > c && count[stack[stack.length - 1].charCodeAt(0) - 97] > 0) {
            visited[stack.pop().charCodeAt(0) - 97] = false;
        }
        stack.push(c);
        visited[i] = true;
    }
    return stack.join("");
};
