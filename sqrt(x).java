class Solution {
    public int mySqrt(int x) {
        int l,u,mid,till_now=0
        l=1;
        u=x;
        while(l<=u)
        {
            mid=(l+u)/2;
            a=mid*mid;
            if(a==x)
                return mid;
            else if (a>x)
            {
                till_now=a;
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        return till_now;
    }
}
