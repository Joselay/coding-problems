/**
 * @param {number} n
 * @param {number[][]} edges
 * @return {number[]}
 */
var findMinHeightTrees = function(n, edges) {
    if (n === 1) return [0];
    let adj = new Array(n);
    for (let i = 0; i < n; i++) {
        adj[i] = new Set();
    }
    for (let [u, v] of edges) {
        adj[u].add(v);
        adj[v].add(u);
    }
    let leaves = [];
    for (let i = 0; i < n; i++) {
        if (adj[i].size === 1) leaves.push(i);
    }
    while (n > 2) {
        n -= leaves.length;
        let newLeaves = [];
        for (let i of leaves) {
            let j = adj[i].values().next().value;
            adj[j].delete(i);
            if (adj[j].size === 1) newLeaves.push(j);
        }
        leaves = newLeaves;
    }
    return leaves;
};
