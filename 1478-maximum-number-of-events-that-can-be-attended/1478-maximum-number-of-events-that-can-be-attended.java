class Solution {
    public int maxEvents(int[][] a) {

       int maxday=0;
        for(int[] i:a){
            maxday=Math.max(maxday,i[1]);
        }
        Arrays.sort(a,(x,y)->{
            return x[0]-y[0];
        });
        int j=0;int ans=0;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=1;i<=maxday;i++){
            while(j<a.length && a[j][0]<=i){
                p.add(a[j][1]);j++;
                }
            while(!p.isEmpty() && p.peek()<i)p.poll();
            if(!p.isEmpty()){
                p.poll();
                ans++;
            }

        }
        return ans;
     
        
    }
}