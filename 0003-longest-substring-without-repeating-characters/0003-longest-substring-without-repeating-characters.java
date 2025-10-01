class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length();i++){
            String current = "";
           for (int j = i;j < s.length();j++){
               char c = s.charAt(j);
               if ( current.contains(String.valueOf(c))){
                   break;
                }
                   current+=c;
               if(current.length() > maxLength){
                   maxLength = current.length();
               }
           }
        }         
        return maxLength;        
               
            

          

    }    
        
    
}