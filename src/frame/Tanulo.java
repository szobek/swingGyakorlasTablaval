package frame;

public class Tanulo {
	private String name;
	private byte irodalom;
	private byte matek;
	private int azonosito;
	public Tanulo(int azonosito,String name, byte irodalom, byte matek) {
		this.name = name;
		this.irodalom = irodalom;
		this.matek = matek;
		this.azonosito=azonosito;
	}
	public String getName() {
		return name;
	}
	public byte getIrodalom() {
		return irodalom;
	}
	public byte getMatek() {
		return matek;
	}
	
	public int getAzonosito() {
		return azonosito;
	}
	@Override
	public String toString() {
		return name + ", irodalom: " + irodalom + ", matek: " + matek;
	}

}
