/**
 * @param {number} n
 * @return {number}
 */
var sumOfMultiples = function(n) {
   const arr = [] 
   for(let i=3;i<=n;i++){
       if(i%3===0 || i%5===0 || i%7===0)
        arr.push(i);
   }
   return arr.reduce((a,b) => a+b,0);
};
