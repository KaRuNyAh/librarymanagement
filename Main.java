import java.util.Scanner;
class Book{
int bookno;
String bookname;
String bookdept;
int no_of_copies_available;
int version_details;
int rackno;

}
class User{
    int regno;
    String name;
   String address;
   int phoneno;
   
   
}
class Card{
    int membershipno;
    String membership_type;
    int regno;
    String name;
   String address;
    int phoneno;
   String membership_validity;
    
}
class Remaindermessage{
    int duedate;
    int fine_details;
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to library");
		
		Scanner sc=new Scanner(System.in);
		int value=0;
		while(value!=-1){
		System.out.println("ENTER 1 for Book:\nENTER 2 for User:\nENTER 3 for Card:\nENTER 4 for Remaindermessage:");
		System.out.println("ENTER -1 for exit.");
		     value=sc.nextInt();
	if(value==1){
	    Book obj1=new Book();
	    Book obj5=new Book();
	    obj1.bookno=12;
	    obj1.bookname="my name is karunyah";
        obj1.bookdept="biography";
        obj1.no_of_copies_available=7;
        obj1.version_details=0;
        obj1.rackno=14;
        obj5.bookno=102;
	    obj5.bookname="my name is karu";
        obj5.bookdept="biography11";
        obj5.no_of_copies_available=71;
        obj5.version_details=1;
        obj5.rackno=140;
	    System.out.println("rackno: "+obj1.rackno);
	    System.out.println("bookname: "+obj1.bookname);
	    System.out.println("bookno: "+obj1.bookno);
	    System.out.println("bookdept: "+obj1.bookdept);
	    System.out.println("version_details: "+obj1.version_details);
	    System.out.println("no_of_copies_available: "+obj1.no_of_copies_available);
	    System.out.println();
	   System.out.println("rackno: "+obj5.rackno);
	    System.out.println("bookname: "+obj5.bookname);
	    System.out.println("bookno: "+obj5.bookno);
	    System.out.println("bookdept: "+obj5.bookdept);
	    System.out.println("version_details: "+obj5.version_details);
	    System.out.println("no_of_copies_available: "+obj5.no_of_copies_available);
	    
	}
	else if(value==3){
	   Card obj2=new Card();
	    
	    obj2.membershipno=1234;
        obj2.membership_type="GOLDEN";
        obj2.regno=37;
        obj2.name="karunyah";
        obj2.address="40,pudur";
        obj2.phoneno=9374;
        obj2.membership_validity="4 month";
        
        System.out.println("membershipno: "+obj2.membershipno);
	    System.out.println("membership_type: "+ obj2.membership_type);
	    System.out.println("regno: "+obj2.regno);
	    System.out.println("name: "+obj2.name);
	    System.out.println("address: "+obj2.address);
	    System.out.println("phoneno: "+obj2.phoneno);
	    System.out.println("membership_validity: "+obj2.membership_validity);
	    
	}
	else if(value==2){
	    User obj3=new User();
	    
	    obj3.regno=37;
        obj3.name="karu";
        obj3.address="pudur,9";
        obj3.phoneno=2547;
        
       System.out.println("regno: "+obj3.regno);
       System.out.println("name: "+obj3.name);
       System.out.println("address: "+obj3.address);
       System.out.println("phoneno: "+obj3.phoneno);
     
	}
	else if(value==4){
	
	Remaindermessage obj=new Remaindermessage();
	
    	obj.duedate=5;
    	obj.fine_details=30;
    	
    	System.out.println("duedate: "+obj.duedate);
    	System.out.println("fine_details per day: "+obj.fine_details);
    	
	}
	else if(value!=-1){
	System.out.println("Enter valid number!");
	}
	}
	System.out.println();
	System.out.println("-----THANK YOU FOR COMING -----");
	System.out.println("-----HAPPY READING-----");
	}
}
