/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maximizeSum = function(nums, k) {
    let res =0;
   let maxNum = Math.max(...nums);
   for(let i=1;i<=k;i++)
    res+=(maxNum++);
    return res;
};
