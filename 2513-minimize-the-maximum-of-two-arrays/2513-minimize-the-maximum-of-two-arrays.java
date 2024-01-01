class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        while(low < high){
            int mid = low + (high - low)/2;
            if(findarrays(mid,divisor1,divisor2,uniqueCnt1,uniqueCnt2))
                high = mid;
            else
                low = mid+1;
        }
        return low;
    }
    
    public boolean findarrays(long num,long d1,long d2,long c1,long c2){
        long divbyd1d2 = num/lcm(d1,d2);
        long possiblinar1 = (num/d1) - divbyd1d2;
        long possiblinar2 = (num/d2) - divbyd1d2;
        long rest = num-(divbyd1d2 + possiblinar1 + possiblinar2);
        if(c1 >= possiblinar2){
            rest -= (c1 - possiblinar2);
        }
        if(c2 >= possiblinar1){
            rest -= (c2 - possiblinar1);
        }
        if(rest >= 0)
            return true;
        return false;
    }
    
    public long lcm(long d1,long d2){
        return (d1*d2)/gcd(d1,d2);
    }
    
    public long gcd(long a,long b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    
}