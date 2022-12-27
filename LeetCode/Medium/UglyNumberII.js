/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    let uglyNumbers = [1];
    let i2 = 0;
    let i3 = 0;
    let i5 = 0;
    while (uglyNumbers.length < n) {
        let next2 = uglyNumbers[i2] * 2;
        let next3 = uglyNumbers[i3] * 3;
        let next5 = uglyNumbers[i5] * 5;
        let next = Math.min(next2, next3, next5);
        if (next === next2) i2++;
        if (next === next3) i3++;
        if (next === next5) i5++;
        uglyNumbers.push(next);
    }
    return uglyNumbers[n - 1];
};
