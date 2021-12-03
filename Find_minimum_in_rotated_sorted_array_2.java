/*154. Find Minimum in Rotated Sorted Array II
Hard

2432

352

Add to List

Share
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [1,3,5]
Output: 1
Example 2:

Input: nums = [2,2,2,0,1]
Output: 0
 

Constraints:

n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
nums is sorted and rotated between 1 and n times.
 

Follow up: This problem is similar to Find Minimum in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?*/
class Solution {
    public int findMin(int[] A) {
        int l,N=A.length,u,mid=0,min,i;
        l=0;
        u=N-1;
        if(N==1)
            return A[0];
        while(l<=u)
        {
            mid=(l+u)/2;
            if(mid==0 && A[mid]<A[N-1])
            {
                return A[mid];
            }
            else if(mid==0 && A[mid]>=A[N-1])
            {
                l=mid+1;
            }
            else if(A[mid-1]==A[mid] && A[mid]>A[N-1])
            {
                l=mid+1;
            }
            else if(A[mid-1]==A[mid] && A[mid]<A[N-1])
            {
                u=mid-1;
            }
            else if(A[mid-1]==A[mid] && A[mid]>A[0])
            {
                u=mid-1;
            }
            else if(A[mid-1]==A[mid] && A[mid]<A[0])
            {
                l=mid+1;
            }
            else if(A[mid-1]==A[mid] && A[mid]==A[N-1] && A[mid]==A[0])
            {
                min=A[0];
                for(i=1;i<N;i++)
                {
                    if(min>A[i])
                    {
                        min=A[i];
                    }
                }
                return min;
            }
            else if(A[mid-1]>A[mid])
                    return A[mid];
            else if(A[mid]>A[mid-1] && A[mid]>A[N-1])
                l=mid+1;
            else
                    u=mid-1;
            
        }
        return A[mid];
    }
}
