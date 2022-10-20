class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        else if(n<0){
            x=(1/x)*myPow((1/x),-1*(n+1));
        }else if(n%2==0){
            x=myPow(x*x,n/2);
        }else if(n%2!=0){
            x=x*myPow(x*x,n/2);
        }
        return x;
    }
}