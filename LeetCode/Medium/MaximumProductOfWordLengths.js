/**
 * @param {string[]} words
 * @return {number}
 */
var maxProduct = function(words) {
    let n = words.length;
    let mask = new Array(n);
    for (let i = 0; i < n; i++) {
        mask[i] = 0;
        for (let c of words[i]) {
            mask[i] |= 1 << (c.charCodeAt(0) - 97);
        }
    }
    let max = 0;
    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            if ((mask[i] & mask[j]) === 0) {
                max = Math.max(max, words[i].length * words[j].length);
            }
        }
    }
    return max;
};
