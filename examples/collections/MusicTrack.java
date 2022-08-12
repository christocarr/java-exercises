package examples.collections;

public class MusicTrack {
	private String album;
	private String artist;
	private long id;
	private String title;
	
	public MusicTrack() {
		
	}
	public MusicTrack(long id, String album, String artist, String title) {
		this.id = id;
		this.album = album;
		this.artist = artist;
		this.title = title;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MusicTrack))
	        return false;
		MusicTrack mt = (MusicTrack) obj;
	    return mt.id == this.id;
	}
}
