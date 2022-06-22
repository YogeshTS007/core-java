class BookMyMovieTester{

	public static void main (String a[]){

	String movies[] = {"Om","Gaalipata","A","H2o","Upendra","rakta kanneeru","surya vamshi","Yajamana"};
	String snacks[] = {"Kurkure","bingo","Lays","salted Popcorn","veg puffs","samosa","popcorn","masala popcorn","sprite","coca cola","chaska maska"};

		BookMyMovie bookMyShow = new BookMyMovie("navrang",200,movies,snacks);
		System.out.println("the name of the theatre is "+BookMyMovie.theatreName);
		bookMyShow.showTime(20,"Devi ","Om ");
		bookMyShow.buySnacks("veg puffs",60,45);
		System.out.println("-----------------------------------------------------");



		BookMyMovie bookMyshow1 = new BookMyMovie("mahadeshwara",250,movies,snacks);
		System.out.println("the name of the theatre is"+ bookMyshow1.theatreName);
		bookMyShow1.showTime(23,"praveen","adventure");
		bookMyShow1.buySnacks("salted Popcorn",30,22);
		System.out.println("=====================================================");

		BookMyMovie bookMyshow2 = new BookMyMovie("shantala",350,movies,snacks);
		System.out.println("the name of the theatre is "+ bookMyshow2.theatreName);
		bookMyshow2.showtime(12,"gowda ck","rakta kanneeru");
		bookMyshow2.buySnacks("coca cola",15,50);

	}


}