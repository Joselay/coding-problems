/**
 * @param {number[]} nums
 * @return {number[]}
 */
var singleNumber = function(nums) {
    let xor = 0;
    for (let num of nums) {
        xor ^= num;
    }
    let mask = 1;
    while ((xor & mask) === 0) {
        mask <<= 1;
    }
    let a = 0;
    let b = 0;
    for (let num of nums) {
        if ((num & mask) === 0) {
            a ^= num;
        } else {
            b ^= num;
        }
    }
    return [a, b];
};
