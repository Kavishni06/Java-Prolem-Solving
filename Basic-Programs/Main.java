package Programs;

import java.util.*;
class Main {
public static boolean isHappy(int n) {
    int sum=n;
    int rem=0,rev=0;
    while(sum!=1){
    rem=sum%10;
    rev=sum/10;
    sum=rem*rem+rev*rev;
    }
    if(sum==1) return true;
    return false;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean res=isHappy(n);
    if(true) System.out.println("Happy no");
    else System.out.println("Not happy");
}
}


