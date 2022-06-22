class BookMyMovie{


	String theatreName ;
	String movies[] ;

		int noOfTickets ;
		static int ticketPrice = 600;
		int  totalNoOfTickets ;
		int totalTicketPrice ;


		String snacks[] ;
		int noOfSnacks=130;
		static int snackPrice = 50 ;
		int snacksQuantity;

		public BookMyMovie(String theatreName, int totalNoOfTickets,String movies[],String snacks[]){
			this.theatreName = theatreName;
			this.totalNoOfTickets = totalNoOfTickets;
			this.movies = movies;
			this.noOfSnacks = noOfSnacks;
			this.snacks = snacks;
			System.out.println ("BookMyMovieobject is created");

		}


		public int showTime(int noOfTickets,String bookedBy,String movieName){

			int totalTicketPrice = 0;

			System.out.println("inside showtime()......");
			System.out.println("Arg 1 : No of Tickets " +noOfTickets);
			System.out.println("Arg 2 : Booked by " + bookedBy);
			System.out.println("Arg 3 : Movie Name " + movieName);


			for (int index = 0 ;index < movies.length;index++){


				if (movieName == movies[index]){

					System.out.println ("movie name matched");

					if (noOfTickets<totalNoOfTickets){
					totalTicketPrice = noOfTickets*ticketPrice;
					totalNoOfTickets =totalNoOfTickets-noOfTickets;
					System.out.println("For Movie: "+movieName + "no Of Tickets that are remaining : "+noOfTickets+"Total price is "+totalTicketPrice);	

				}

			
			else{

				System.out.println ("Isht Tickets illa guru bere kade hogu illa next show ge ba.....");
			}
			}
			else{

				System.out.println("Movie not Available");
			}
		}
			return totalTicketPrice ;

		}

		public int buySnacks(String snackName,int quantity,int seatNo){
			int totalSnackPrice = 0;
			System.out.println("the snackTime method is started");
			System.out.println("the snacks name is "+ snackName);
			System.out.println("the quantity of the snacks"+snacksQuantity);
			System.out.println("the seat no is " + seatNo);


			for (int i=0;i<snacks.length;i++)
			{
				if(snackName == snacks[i]){
					System.out.println("the snack is matched");
					if(snacksQuantity<noOfSnacks)
					{
						totalSnackPrice = snackPrice * snacksQuantity;
						noOfSnacks = noOfSnacks - snacksQuantity;
						System.out.println("the snacks name ;"+snackName+"the price of the snacks "+ totalSnackPrice+"total number of snacks available in the theatre"+noOfSnacks);
					}
					else{
						System.out.println("snacks illa bhaiya");
					}
				}
				else{
					System.out.println("the snack is not Available");
				}
			}
		
		return totalSnackPrice;
	}

}