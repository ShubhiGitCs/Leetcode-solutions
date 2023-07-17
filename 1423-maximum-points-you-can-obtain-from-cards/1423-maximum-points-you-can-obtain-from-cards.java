class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int max = -1 ; 
        int sum = 0 ; 
        int sum2 = 0 ;
        for(int i = 0 ; i < k ; i++){
            sum+=cardPoints[i];
        }
        max = Math.max(sum,max);
        for(int i = 0 ; i < k ; i++){
            sum2+=cardPoints[cardPoints.length-1-i];
            sum-=cardPoints[k-1-i];
            max = Math.max(sum+sum2,max);
        }
        return max ;
      }
        
        
    }
