/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let n = nums.length;
    let left = new Array(n).fill(1);
    let right = new Array(n).fill(1);
    let result = new Array(n);
    for (let i = 1; i < n; i++) {
        left[i] = nums[i - 1] * left[i - 1];
    }
    for (let i = n - 2; i >= 0; i--) {
        right[i] = nums[i + 1] * right[i + 1];
    }
    for (let i = 0; i < n; i++) {
        result[i] = left[i] * right[i];
    }
    return result;
};
