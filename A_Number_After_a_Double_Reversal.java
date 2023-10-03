class Solution {
    public boolean isSameAfterReversals(int num) 
    {
        int x=num,ans=0,y;
        while(x!=0)
        {
            y=x%10;
            ans=(ans*10)+y;
            x=x/10;
        } 
        String s1=Integer.toString(num);
        String s2=Integer.toString(ans);
        if(s1.length()==s2.length())  return true;
        return false;
    }
}