/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let sum = n.toString().split('').reduce((acc,curr) => acc + parseInt(curr),0)
    let product = n.toString().split('').reduce((acc,curr) => acc * parseInt(curr),1)


    return product - sum;
};
