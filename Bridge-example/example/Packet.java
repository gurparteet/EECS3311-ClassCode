package example;
public class Packet {
	
	public Packet(String contents, int id) {
		super();
		this.contents = contents;
		Id = id;
	}

	private String contents;
	int Id;
	
	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
