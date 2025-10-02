class Solution {
    public boolean isPalindrome(int x) {
        int og=x;
        int result=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int rem=x%10;
            x/=10;
            result=(result*10)+rem;
        }
        if(result==og){
            return true;
        }
        else{
            return false;
        }
    }
}