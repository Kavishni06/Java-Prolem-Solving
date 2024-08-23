package DAY11;
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	class Account {
	    private String name;
	    private int age;
	    private String joinAccount;

	    public Account(String name, int age, String joinAccount) {
	        this.name = name;
	        this.age = age;
	        this.joinAccount = joinAccount;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getJoinAccount() {
	        return joinAccount;
	    }


	    public int hashCode() {
	        return name.hashCode() + age + joinAccount.hashCode();
	    }

	  
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Account other = (Account) obj;
	        return name.equals(other.name) && age == other.age && joinAccount.equals(other.joinAccount);
	    }
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Join Account: " + joinAccount;
	    }
	}

	public class Banking {
	    public static void main(String[] args) {
	        Set<Account> A = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Enter name: ");
	            String name = scanner.nextLine();

	            System.out.println("Enter age: ");
	            int age = Integer.parseInt(scanner.nextLine());

	            System.out.println("Enter join account details: ");
	            String joinAccount = scanner.nextLine();

	            Account account = new Account(name, age, joinAccount);

	            if (A.add(account)) {
	                System.out.println("Account details added successfully!");
	            } else {
	                System.out.println("Duplicate account details found. Skipping...");
	            }
	        }

	        System.out.println("The Account Details are:");
	        for (Account account : A) {
	            System.out.println(account);
	        }
	    }	

	}


