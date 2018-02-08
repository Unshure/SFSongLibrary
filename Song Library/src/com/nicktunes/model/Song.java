package com.nicktunes.model;

public class Song {
	
	//Fields for song
	private String songName;
	private String artist;
	private String album;
	private String year;
	
	//Constructor for song object
	public Song(String songName, String artist, String album, String year) {
		this.songName = songName;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	
	//Getters
	public String getSongName() {
		return this.songName;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public String getYear() {
		return this.year;
	}
	
	//Setters
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Song)) {
			return false;
		}
		Song song = (Song)o;
		if(this.songName.equals(song.songName) && this.artist.equals(song.artist)) {
			return true;
		}else {
			return false;
		}
	}

}
