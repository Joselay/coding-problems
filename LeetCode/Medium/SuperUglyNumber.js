/**
 * @param {number} n
 * @param {number[]} primes
 * @return {number}
 */
var nthSuperUglyNumber = function(n, primes) {
    let ugly = new Array(n).fill(0);
    ugly[0] = 1;
    let p = new Array(primes.length).fill(0);
    for (let i = 1; i < n; i++) {
        let min = Number.MAX_SAFE_INTEGER;
        for (let j = 0; j < primes.length; j++) {
            min = Math.min(min, primes[j] * ugly[p[j]]);
        }
        ugly[i] = min;
        for (let j = 0; j < primes.length; j++) {
            if (min === primes[j] * ugly[p[j]]) p[j]++;
        }
    }
    return ugly[n - 1];
};
