package entities;

public class Guest {
	
	private String name;
	private String email;
	private int room;
	
	//Guest(name:String,email:String,room:int)
	public Guest(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	//getters and setters
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//room
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}

}
