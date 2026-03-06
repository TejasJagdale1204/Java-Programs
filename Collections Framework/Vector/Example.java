public class Example {
	
	private int x;
	private int y;
	
	public Example(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	void setX(int x) {
		this.x = x;
	}

	int getY() {
		return y;
	}

	void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Example(x=" + x + ", y=" + y + ")";
	}
	
	
}