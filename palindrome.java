package Leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        int n=x,Ans=0;
        if(n>=0){
        while(n != 0){
            int l=n%10;
            Ans=(Ans*10)+l;
            n=n/10;
        }
        if(x==Ans)
        return true;
        else
        return false;             
    }
    else
    return false;
    }
}
