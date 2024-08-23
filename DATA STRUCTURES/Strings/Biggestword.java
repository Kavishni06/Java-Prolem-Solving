package Strings;
import java.util.*;
public class Biggestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="I am Biggest the one";
        String arr[]=str.split(" ");
        String big="";
        for(String word:arr) {
        	if(big.length()<word.length()) {
        		big=word;
        	}
        }
        String secbig="";
        for(String word:arr) {
        	if(secbig.length()<word.length() && (word.length()<big.length())) {
        		secbig=word;
        	}
        	  
        }
        System.out.println(secbig);
	}

}
