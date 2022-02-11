package com.company;

public class palindromeRecursion {

    public static boolean palindrome(String s, int l, int n){
        if(l >= n/2)
            return true;
        if(s.charAt(l) != s.charAt(n-l-1))
            return false;
        return palindrome(s,l+1,n);
    }

    public static void main(String[] args) {
        String s = "11211";
        int l = 0;
        int n = s.length();
        System.out.println(palindrome(s,l,n));
    }
}
