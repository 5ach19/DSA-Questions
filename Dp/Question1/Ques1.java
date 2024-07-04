package Question1;

import java.util.Arrays;

//Given N friends, each one can remain single or can be paired up with some other friend. 
//Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

public class Ques1 {
    public static int []dp;   
    public static int f(int i) {
    if(i==0 || i==1 || i==2){              // <<----  base case 
        return i;   
    } 
    if(dp[i] != -1) return dp[i];
        return dp[i]= f(i-1) + (i-1) * f(i-2);  
    }

    public static int numberOfWays(int n){
     dp = new int[10005];
     Arrays.fill(dp,-1);
     return f(n);
    }

 }


 


