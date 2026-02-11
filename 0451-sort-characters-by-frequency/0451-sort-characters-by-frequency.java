class Solution {
    public String frequencySort(String s) {
        
        // 1.count frequency
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        // 2. create arr of list which stores char and it's frequency as index means charFreq = index no.
        List<Character>[] arr = new List[s.length()+1];
        for(char c : hm.keySet()){
            int freq=hm.get(c);
            if(arr[freq]==null) arr[freq] = new ArrayList<>();
            arr[freq].add(c);
        }

        // 3. res for storing high freq to low 
        StringBuilder ans = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){            // starting from back so no need for sorting 
            if(arr[i]!=null){
                for(char c: arr[i]){      
                    for(int j=0;j<i;j++){                // running loop for freq 
                        ans.append(c);
                    }
                }
            }
        }

        return ans.toString();

    }
}

// Time Complexity:
// Counting → O(n)
// Bucket creation → O(k) ≤ O(n)
// Result building → O(n)
// ✅ Overall: O(n)

// Space Complexity: O(n) for buckets + O(n) for the result string → O(n)