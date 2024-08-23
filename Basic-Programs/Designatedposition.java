package Programs;
import java.util.*;
public class Designatedposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num[]= {10,20,30,40,60};
      int val=50;
      int pos=4;
      int newnum[]=new int[num.length];
      int ipos=pos-1;
      for(int i=0;i<newnum.length;i++) {
    	  if(i==ipos) {
    		  newnum[i]=val;
    	  }
      }

}
