class Solution {
    public int lengthOfLastWord(String t) {
        t=s.trim();
        int length=0;
        for(int i=t.length()-1;i>=0;i--)
            if(t.charAt(i)!=' ')
                length++;
        else break;
        System.out.println("Hi This is Akash");
        System.out.println("My Name is Amit");
    return length;
    }

}