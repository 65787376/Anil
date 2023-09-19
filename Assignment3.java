package a4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import a5.Account;



public class Assignment3 {

	public static void main(String[] args) {

		  Account a1 = new Account(1,"Anil", 12000, "Pune");

		  Account a2 = new Account(2,"Kumar", 10500, "Hyderabad");

		  Account a3 = new Account(3,"Pavan", 22000, "Mumbai");

		  Account a4 = new Account(4,"Harsha", 6000, "Mumbai");

		  Account a5 = new Account(5,"Kishore", 35000, "Bangalore");

		  

		  Map<Integer,Account> accountMap = new HashMap<>();

		  

		  accountMap.put(a1.getAccountNumber(), a1);

		  accountMap.put(a2.getAccountNumber(), a2);

		  accountMap.put(a3.getAccountNumber(), a3);

		  accountMap.put(a4.getAccountNumber(), a4);

		  accountMap.put(a5.getAccountNumber(), a5);

 

		  Scanner sc = new Scanner(System.in);

		  System.out.println("Enter key to get account info");

		  int key = sc.nextInt();

		 Account acc = accountMap.get(key);

		  System.out.println(acc.toString());

		  System.out.println("Enter location to get account info");

		  String loc = sc.next();

		  Map<String,List<Account>> locAccount = new HashMap<>();

		  List<Account> accountList = new ArrayList<>();

		  for(Map.Entry<Integer, Account> e : accountMap.entrySet()) {

			  if(e.getValue().getLocation().equals(loc)) {

				  accountList.add(e.getValue());

			  }

		  }

		  locAccount.put(loc, accountList);
		  System.out.println(locAccount+"    ");

	}
}