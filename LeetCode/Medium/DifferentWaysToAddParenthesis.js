/**
 * @param {string} input
 * @return {number[]}
 */
var diffWaysToCompute = function(input) {
    let res = [];
    for (let i = 0; i < input.length; i++) {
        if (input[i] === '+' || input[i] === '-' || input[i] === '*') {
            let left = diffWaysToCompute(input.substring(0, i));
            let right = diffWaysToCompute(input.substring(i + 1));
            for (let j = 0; j < left.length; j++) {
                for (let k = 0; k < right.length; k++) {
                    if (input[i] === '+') {
                        res.push(left[j] + right[k]);
                    } else if (input[i] === '-') {
                        res.push(left[j] - right[k]);
                    } else if (input[i] === '*') {
                        res.push(left[j] * right[k]);
                    }
                }
            }
        }
    }
    if (res.length === 0) res.push(parseInt(input));
    return res;
};
