package com.javaex.ex05;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	public Song() { }
	
	public Song(String title) {
		this();
		this.title = title;
	}
	
	public Song(String title, String artist) {
		this(title);
		this.artist = artist;
	}
	
	public Song(String title, String artist, String album) {
		this(title, artist);
		this.album = album;
	}
	
	public Song(String title, String artist, String album, String composer) {
		this(title, artist, album);
		this.composer = composer;
	}
	
	public Song(String title, String artist, String album, String composer, int year) {
		this(title, artist, album, composer);
		
		if(year<0) {
			this.year = 2022;
		} else {
			this.year = year;
		}
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist, album, composer, year);
		
		this.track = track;
	}
	
	//메소드 (get, set)
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public int getTrack() {
		return track;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer 
				+ ", year=" + year + ", track=" + track + "]";
	}
	
	public void showInfo() {
		System.out.println("제목: " + title);
		System.out.println("아티스트: " + artist);
		System.out.println("엘범: " + album);
		System.out.println("작곡가: " + composer);
		System.out.println("연도: " + year);
		System.out.println("트랙번호: " + track);
	}
	
}
