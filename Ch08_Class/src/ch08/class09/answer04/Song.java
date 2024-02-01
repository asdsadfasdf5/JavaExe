package ch08.class09.answer04;

public class Song {
	/*
	 * 4. 노래를 나타내는 Song이라는 클래스를 설계하세요. <필드> 노래제목 title 가수 artist 앨범제목 album 작곡가
	 * composer 노래가 발표된 연도 year 노래가 속한 앨범에서의 트랙 번호를 나타내는 track
	 * 
	 * <메서드> 노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌 노래의 정보를 나타내는 show()
	 * 
	 * <main 실행> ABBA의 "Dancing Queen"노래를 Song객체로 생성하고 Show()로 출력하세요
	 */
	private String title; // 노래제목
	private String artist; // 가수
	private String album; // 앨범제목
	private String composer; // 작곡가
	private int year; // 노래가 발표된 연도
	private int track; // 노래가 속한 앨범에서의 트랙 번호를 나타내는

	// 매개 생성자
	public Song(String title, String artist) {
		this.title = title; // 노래제목
		this.artist = artist; // 가수

	}

	public void setSongInfo(String album, String composer, int year, int track) {

		// private를 안했을때 this로 바로 할당
		this.album = album; // 앨범제목
		this.composer = composer; // 작곡가
		this.year = year; // 노래가 발표된 연도
		this.track = track; // 노래가 속한 앨범에서의 트랙 번호를 나타내는
//		setAlbum(album); // 노래가 속한 앨범에서의 트랙 번호를 나타내는
//		setComposer(composer); // 노래가 속한 앨범에서의 트랙 번호를 나타내는
//		setYear(year); // 노래가 속한 앨범에서의 트랙 번호를 나타내는
//		setTrack(track); // 노래가 속한 앨범에서의 트랙 번호를 나타내는

	}

	public void show() {
		System.out.printf("노래제목 : %s\n 가수 : %s\n 앨범제목 : %s\n " + "작곡가 : %s\n 발표된 연도 : %d\n" + "앨범에서의 트랙 번호 : %d\n",
				getTitle(), getArtist(), getAlbum(), getComposer(), getYear(), getTrack());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
}
