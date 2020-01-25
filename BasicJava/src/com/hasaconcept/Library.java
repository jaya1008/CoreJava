package com.hasaconcept;

public class Library {

	String name;
	Book b[];
	
	public Library(String name, Book b[]) {
		
		this.name = name;
		this.b = b;
	}
    public void display()
    {
    	System.out.println("name  "+name);
    	System.out.println("books are ");
    	for(Book b1:b)
    	{
    		b1.display();
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bk[];
		bk=new Book[3];
		
		bk[0]=new Book(110, "Complete Reference of C", "aaa",4000, 
				new Author("Yashwant K", "y@gmail.com", "pune", 1000));
		bk[1]=new Book(111, "HTML black book", "bbb",765, 
				new Author("Peter s", "p@gmail.com", "pune", 1000));
		bk[2]=new Book(112, "Complete Reference of Java", "aaa",670, 
				new Author("Games Gosling", "g@gmail.com", "Delhi", 1001));
		
		Library obj=new Library("Wisdom ", bk);
		obj.display();
	}

}
