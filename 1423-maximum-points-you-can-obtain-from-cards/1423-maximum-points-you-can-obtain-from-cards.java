class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total= 0 ;
        int n = cardPoints.length;
        int winSize = n-k;
        int winSum=0;

        for(int ele:cardPoints){
            total+=ele;
        }

        // first window
        for(int j=0;j<winSize;j++){
            winSum+=cardPoints[j];
        }
        int minWinSum= winSum;

        // window slide
        for(int x=winSize;x<n;x++){
            winSum+=cardPoints[x]-cardPoints[x-winSize];
            minWinSum = Math.min(minWinSum,winSum);
        }
        return total-minWinSum;
    }
}