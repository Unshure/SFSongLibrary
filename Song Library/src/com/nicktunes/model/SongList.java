package com.nicktunes.model;

import java.util.ArrayList;
import java.util.Iterator;
//import xml parsing stuff here

public class SongList {
	
	public void addSong(String songname, String artist, String album, String year, ArrayList<Song> songList) {
		Song newSong = new Song(songname, artist, album, year);
		
		Iterator<Song> songListIterator = songList.iterator();
		while(songListIterator.hasNext()) {
			
		}
	}
	
	public void deleteSong(String songname, String artist, ArrayList<Song> songList) {
		
	}
	
	public void editSong(String songname, String artist, ArrayList<Song> songList) {
		
	}
	
	public ArrayList<Song> readFromXML(){
		
		ArrayList<Song> songList = new ArrayList<Song>();
		//do xml parsing stuff here
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		return songList;
	}
	
	public void writeToXML() {
		
	}

}
