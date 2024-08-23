package DAY6;
import java.util.*;
class Linkedex{
	int id;
	String Bookname,author;
	public Linkedex(int id,String Boookname,String author) {
		this.id=id;
		this.Bookname=Bookname;
		this.author=author;
	}
	
	
}
public class Books {
	public static void main(String[] args) {
	LinkedList<Linkedex> li=new LinkedList<Linkedex>();
	Linkedex b1=new Linkedex(101,"Tamil","Kavi");
	Linkedex b2=new Linkedex(102,"English","dharani");
	li.add(b1);
	li.add(b2);
	for(Linkedex b:li) {
		System.out.println(b.id+" "+b.Bookname+" "+b.author);
	}
	

	}

}
