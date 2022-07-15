import java.util.Scanner ;

class BooksTester{

      public static void main(String a[]){
	   
	      Scanner sc = new Scanner(System.in);
		  System.out.println("The Number of Books");
		  int size = sc.nextInt();
		  
		  Library lib = new Library(size);
		  for(int i=0; i<size;i++){
		   
		   BooksDTO book = new BooksDTO();
		   System.out.println("Enter the id ");
		   int id = sc.nextInt();
		   System.out.println("Enter The Name Of Book");
		   String name = sc.next();
		   System.out.println("Enter the Author");
		   String author = sc.next();
		   System.out.println("Enter the publication");
		   String publication = sc.next();
		   System.out.println("Enter the type of Book");
		   String type = sc.next();
		   
		   book.setId(id);
		   book.setName(name);
		   book.setAuthor(author);
		   book.setPublication(publication);
		   book.setType(type);
		   
		   lib.createBook(book);

		  }
		  
		  lib.getBookDetails();
	     
		/* System.out.println("Enter the existing Name to update the publication");
		 String existingName = sc.next();
		 System.out.println("Enter publication to be update");
		 String updatePublication = sc.next();
		 lib.updatePublicationByName(existingName, updatePublication);
		 
		  lib.getBookDetails();*/
		  
		 System.out.println("Enter the name to be deleted");
		 String name1 = sc.next();
		 lib.deleteByName(name1);
		 lib.getBookDetails();
		 System.out.println("enter the author to be deleted");
		 String author1 = sc.next();
		 lib.deleteByAuthor(author1);
		lib.getBookDetails();
	  
	  }



}