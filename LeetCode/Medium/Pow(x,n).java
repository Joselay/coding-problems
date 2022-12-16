class Solution {
    public double myPow(double x, int n) {
        List<double[]> memo = new ArrayList<>();
        memo.add(new double[] {1, x});
        
        double p = Math.abs((double) n);
        double r = 0, result = 1;

        while(r < p) {
            for(int i = memo.size()-1; i >= 0; i--) {
                double key = memo.get(i)[0];
                double val = memo.get(i)[1];
                
                if(r + key <= p) {
                    r += key;
                    result *= val;
                    memo.add(new double[] {r, result});
                    break;
                }
            }
        }
        return n < 0 ? 1 / result : result;
    }
}
