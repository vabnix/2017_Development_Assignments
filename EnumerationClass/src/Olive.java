
public class Olive {

public static final long BLACK = 0x000000;
	
	public OliveNameEnum oliveName;
	public long color = BLACK;
	
	public Olive() {
	}

	public Olive(OliveNameEnum oliveName) {
		this.oliveName = oliveName;
	}
	
	public Olive(OliveNameEnum oliveName, long color) {
		this(oliveName);
		this.color = color;
	}
}
