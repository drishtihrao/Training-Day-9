package com.cg.moviecollection;

import java.util.ArrayList;
import java.util.List;

import com.cg.savingaccountcollection.SavingAccount;

public class Movie_DetailsList {
		public List<Movie_Details> list = new ArrayList<>();
		
		//defining method to add a new Movie in the list
		public void add_movie(Movie_Details md) {
			list.add(md);
		}
		//defining method to remove a Movie from the list
		public void remove_movie(Movie_Details md) {
			list.remove(md);
		}
		
		//defining method to remove all Movies from the list
		public void remove_AllMovies() {
			list.removeAll(list);
		}
	}
