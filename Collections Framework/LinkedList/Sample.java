public class Sample {
	
	private int x;
	private int y;
	
	public Sample(int x, int y) {
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
	public boolean equals(Object obj) {
		//System.out.println(this + "\t" + obj);
		if(obj instanceof Sample s) {
			return this.x == s.x 
					&& this.y == s.y;
		}
		return false;

	}
	
	@Override
	public String toString() {
		return "Sample(x=" + x + ", y=" + y + ")";
	}
}