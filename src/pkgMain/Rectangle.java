package pkgMain;

public class Rectangle {
//comment to stage changes
	
	private double Length;
	private double Width;
	public Rectangle(double length, double width) {
		Length = length;
		Width = width;
	}
	public double getLength() {
		return Length;
	}
	public double getWidth() {
		return Width;
	}
	
	public double Area()
	{
		return getLength() * getWidth();
	}	
}
