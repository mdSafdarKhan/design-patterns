package p4_builder.house;

public class HouseBuilder {

	public String room; // required
	public String kitchen; // required
	public String pool; // optional
	public String basement; // optional

	public HouseBuilder() {
	}

	public HouseBuilder setRoom(String room) {
		this.room = room;
		return this;
	}

	public HouseBuilder setKitchen(String kitchen) {
		this.kitchen = kitchen;
		return this;
	}

	public HouseBuilder setPool(String pool) {
		this.pool = pool;
		return this;
	}

	public HouseBuilder setBasement(String basement) {
		this.basement = basement;
		return this;
	}

	public House build() {
		return new House(this);
	}

}
