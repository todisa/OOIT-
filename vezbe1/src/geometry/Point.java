package geometry;

public class Point {

	private int x;
	private int y;
	
	private boolean selected;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
	public double distance(int x,int y) {
		int dx= this.x-x;
		int dy=this.y-y;
		
		double d=Math.sqrt(Math.abs(dx*dx-dy*dy));
		return d;
	}
	
	

	
	

}
