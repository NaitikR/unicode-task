import java.util.*;

public class Student
{

		public static void main(String args[])
		{	int no_borrow,no_return,ch=0;
			long id;
		
			Scanner sc=new Scanner(System.in);
			
			System.out.print("WELCOME TO THE LIBRARY");
			System.out.print("\nEnter your choice \n 1 to Borrow new Book \n 2 to Return the book\n 3 for EXIT \n");
			ch=sc.nextInt();

			while(ch!=3){
			
			System.out.print("\nEnter your ID:");
			id=sc.nextLong();
			sc.nextLine();

			System.out.print("\nEnter your Name:");
			String name=sc.nextLine();

			
			
			

				if(ch==1){
				
				System.out.print("\nEnter number of books to borrow:");
				no_borrow=sc.nextInt();
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("Name:"+name);
				System.out.println("ID:"+id);
		
				borrow(no_borrow);
				}

				else if(ch==2){
				System.out.print("\nEnter number of books to return:");
				no_return=sc.nextInt();
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("Name:"+name);
				System.out.println("ID:"+id);
		
				retn(no_return);
				}
					
				else if(ch!=3){
				System.out.println("Incorrect input!!!!!");}
				
				System.out.println("-----------------------------------------------------------------------");
				System.out.print("\nEnter your choice \n 1 to Borrow new Book \n 2 to Return the book\n 3 for EXIT \n");
				ch=sc.nextInt();
			
			}
		}
		static void borrow(int b)
		{	

			Library li=new Library();
			if(b>3)
			{
				System.out.println("More than 3 books cannot be borrowed at same time");
			}
			else if(b>0 && b<=3)
			{
			
				li.decr(b);
				int finalbooks=li.display();

				System.out.println(b+" book(s) borrowed from the library.\nTotal number of books in library="+finalbooks);
				System.out.println("Return the books within 1 week to avoid fine(Rs.10 per day per book after 1 week)");
			}
			else
			System.out.println("Incorrect Input");
		}
		static void retn(int r)
		{	
			if(r>0)
			{
			Library li=new Library();
			li.incr(r);
			int finalbooks=li.display();

			System.out.println(r+" book(s) returned to the library successfully.\nTotal number of books in library="+finalbooks);	
			}	  
			else
			System.out.println("Incorrect Input");
		}
}	
		
	
class Library
{
	
		public int total_books=4260;
		
		public void incr(int x)
		{
			total_books=total_books+x;
		}
		
		public void decr(int y)
		{
			total_books=total_books-y;	
		}
		
		public int display()
		{
			return	total_books;
		}
		
}				