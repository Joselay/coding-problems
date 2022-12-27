/**
 * @param {string} secret
 * @param {string} guess
 * @return {string}
 */
var getHint = function(secret, guess) {
    let bulls = 0;
    let cows = 0;
    let secretCounts = new Array(10).fill(0);
    let guessCounts = new Array(10).fill(0);
    for (let i = 0; i < secret.length; i++) {
        if (secret[i] === guess[i]) {
            bulls++;
        } else {
            secretCounts[secret[i]]++;
            guessCounts[guess[i]]++;
        }
    }
    for (let i = 0; i < 10; i++) {
        cows += Math.min(secretCounts[i], guessCounts[i]);
    }
    return bulls + "A" + cows + "B";
};
