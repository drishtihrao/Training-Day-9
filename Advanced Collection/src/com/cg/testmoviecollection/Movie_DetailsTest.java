package com.cg.testmoviecollection;

import com.cg.moviecollection.Movie_Details;
import com.cg.moviecollection.Movie_DetailsList;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		Movie_DetailsList movieList = new Movie_DetailsList();
		
		Movie_Details sh = new Movie_Details("SherlockHolmes", "RobertD.Jr.", "RachelMcAdams", "Mystery");
		Movie_Details istr = new Movie_Details("Interstellar", "MathhewM", "AnneHathway", "ScienceFiction");
		Movie_Details dark = new Movie_Details("DarkKnight", "ChristianBale", "AnneHathway", "Fiction");
		Movie_Details dch = new Movie_Details("DilChahtaHai", "AmirKhan", "PrietyZinta", "Bollywood");
		Movie_Details yjhd = new Movie_Details("YJHD", "RK", "DP", "Bollywood");
		
		movieList.add_movie(yjhd);
		movieList.add_movie(dark);
		movieList.add_movie(dch);
		movieList.add_movie(istr);
		movieList.add_movie(sh);
		
		//printing the array list
		movieList.list.stream().forEach(System.out::print);
		
		System.out.println();
		
		movieList.remove_movie(yjhd);
		movieList.list.stream().forEach(System.out::print);
		
	}

}
