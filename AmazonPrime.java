class AmazonPrime{


	static String series[] = {"Mirzapur","family man","lakhon mein ek","undone","legacies","vampire diaries","hostel daze","roswell","the expense","fear the walking dead","reacher","inside edge","runaways","this is us","breathe into the shadows","the flash","the good doctor","modern love"};
	static String kannadaMovies[] = {"kgf","kgf 2","avane of srimannaraya","yuvaratna","love mocktail","love mocktail 2","kotigobba 3","roberrt","dia","geetha","one cut two cut","french biriyani","madhagaja","dandupalya 2","kavaludari","devaki","family pack ","rathnan prapancha","gantu moote","u turn","ondu motteya kathe","yajamana"};
	static String englishMovies [] = {"no time to die","the tomorrow war ","the boy next door","manchester by the sea","the lost of z","interstellar","top gun","aquaman","beautiful boy","wrong turn","inception","the big sick","the revenenant","tom and jerry","bachchhan pandey","sky fall","the only living boy in new york","hero panti 2","dune"};
	static String hindiMovies [] = {"raazi","chhori","section 375","sharmaji namkeen","chakde India","thapad","shubh mangal jyada sawdan","jalsa","gangs of wasseypur","jayesh bhai jordar","dilwale duniya le jayenge","bell bottom","pagal panti","jindagi na milegi dobara","pati patni or teesra","shersha","ye jawani hai deewani","sherni"};

		public static void main (String a[]){

			for (int Y = 0 ; Y < series.length; Y++){

			System.out.println (series[Y]);

			System.out.println("----------------------------------");
			}

			for(int Y =0;Y<kannadaMovies.length;Y++){

			System.out.println(kannadaMovies[Y]);
			System.out.println("----------------------------------");

			}

			for (int Y = 0;Y<englishMovies.length;Y++){

			System.out.println(englishMovies[Y]);
			System.out.println("----------------------------------");
			}


			for (int Y = 0;Y<hindiMovies.length;Y++){

			System.out.println(hindiMovies[Y]);
			System.out.println("----------------------------------");
			}

		}
}