/**
 * @param {number} n
 * @param {number} start
 * @return {number}
 */
var xorOperation = function(n, start) {
    let xor = 0;
    let res = 0;
    for(let i=0;i<n;i++){
        xor = start + 2 * i;
        res ^=xor;
    }
    return res;
};
