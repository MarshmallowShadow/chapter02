package com.javaex.ex05;

public class SongApp {
	public static void main(String[] args) {
		Song s01 = new Song();
		s01.setTitle("너랑 나");
		s01.setArtist("아이유");
		s01.setAlbum("Last Fantasy");
		s01.setComposer("이민수");
		s01.setYear(2011);
		s01.setTrack(4);
		
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-Dragon", 2007);
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집");
		
		System.out.println(s02.toString());
		System.out.println(s03.toString());
		s01.showInfo();
	}
}
