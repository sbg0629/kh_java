package question06;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {}
	
	
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}



	public void show() {
		System.out.println(year+"년 "+country+"국적 의 "+artist+"가 부른 "+ title);
	}
public static void main(String[] args) {
	Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
	
	song.show();
}
}
