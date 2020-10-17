package p4_builder.house;

public class House {

	public String room; // required
	public String kitchen; // required
	public String pool; // optional
	public String basement; // optional

	public House(HouseBuilder houseBuilder) {
		this.room = houseBuilder.room;
		this.kitchen = houseBuilder.kitchen;
		this.pool = houseBuilder.pool;
		this.basement = houseBuilder.basement;
	}

	public String getRoom() {
		return room;
	}

	public String getKitchen() {
		return kitchen;
	}

	public String getPool() {
		return pool;
	}

	public String getBasement() {
		return basement;
	}

	@Override
	public String toString() {
		return "House [room=" + room + ", kitchen=" + kitchen + ", pool=" + pool + ", basement=" + basement + "]";
	}

}
