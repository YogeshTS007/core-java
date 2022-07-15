import java.util.Arrays;
class Library{

       BooksDTO[] books;
       int index;

      public Library(int size){
	      books = new BooksDTO[size];
		  System.out.println("The Library constructor is created");
	  
	  } 

       public boolean createBook(BooksDTO book){
	      System.out.println("Inside createBook()");
		  boolean isAdded = false;
		  if(book != null && book.getName() != null){
		      
			  this.books[index++] = book;
			  isAdded = true;
			  System.out.println("The book details are saved");
		  }
		  else{
		      System.out.println("The book details are not saved");
		  }
		  System.out.println("createBook() ended");
           return isAdded;
	   }

       public void getBookDetails(){
		   System.out.println("Inside getBookDetails()");
	       for(int i=0; i<books.length;i++){
		   
		    System.out.println(books[i].getId()+"  "+books[i].getName()+" "+books[i].getAuthor()+"  "+books[i].getPublication()+"  "+books[i].getType());

		   }
		   System.out.println("The getBookDetails() ended");
	   
	   }

        public boolean updatePublicationByName(String name, String publication){
		 
		 System.out.println("Inside updatePublicationByName ");
		 boolean updatePublication = false;
		 for(int i=0; i<books.length;i++){
			 if(books[i].getName().equals(name)){
				 books[i].setPublication(publication);
				 updatePublication = true;
				 
			 }
			 else{
				 System.out.println("The book name is not found");
			 }
		 }
		 return updatePublication;
	 }	   
	 
	 public boolean deleteByName(String name){
		 System.out.println("inside deleteByName");
		 boolean deleteBook=false;
		 int i,j;
		 for(i=0,j=0;j<books.length;j++){
			 if(!books[j].getName().equals(name)){
				 books[i++]=books[j];
				 deleteBook = true;
			 } else {
				 System.out.println("the book is deleted");
			 }
		 }
		 books = Arrays.copyOf(books, i);
		 return deleteBook;
	 }
	 
	 public boolean deleteByAuthor(String author){
		 System.out.println("inside deleteByAuthor");
		 boolean deleteBook=false;
		 int i,j;
		 for(i=0,j=0;j<books.length;j++){
			 if(!books[j].getAuthor().equals(author)){
				 books[i++]=books[j];
				 deleteBook = true;
			 } else {
				 System.out.println("the book is deleted");
			 }
		 }
		 books = Arrays.copyOf(books, i);
		 return deleteBook;
	 }
	 
	 
	  




}