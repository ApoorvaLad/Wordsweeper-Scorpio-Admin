package com.model;

import java.util.ArrayList;

public class Model {
	ArrayList<Game>games = new ArrayList<>();
	
	
	public void addGame(Game game) {
		games.add(game);
	}
	
	public ArrayList<Game> getGames() {
		return games;
	}

	
}
