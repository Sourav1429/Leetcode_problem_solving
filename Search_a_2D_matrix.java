/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104*/
//Link: https://leetcode.com/problems/search-a-2d-matrix/
class Solution {
    public boolean searchMatrix(int[][] A, int target) {
        int N=A.length,M=A[0].length,lr,ur,lc,uc,till_now=0,mid;
        lr=0;ur=N-1;
        lc=0;uc=M-1;
        while(lr<=ur)
        {
            mid=(lr+ur)/2;
            if(A[mid][0]==target)
                return true;
            else if(A[mid][0]<target)
            {
                till_now=mid;
                lr=mid+1;
            }
            else{
                ur=mid-1;
            }
        }
        while(lc<=uc)
        {
            mid=(lc+uc)/2;
            if(A[till_now][mid]==target)
            {
                return true;
            }
            else if(A[till_now][mid]<target)
            {
                lc=mid+1;
            }
            else{
                uc=mid-1;
            }
        }
        return false;
        
    }
}
