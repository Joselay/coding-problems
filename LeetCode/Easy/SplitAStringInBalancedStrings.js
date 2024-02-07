/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let c =0,res=0;
    for(let i=0;i<s.length;i++){
        c += (s[i]==='L' ? 1 : -1);
        res += (c===0);
    }
    return res;

};
