public class Rectangle {
	float width;
	float height;

	Rectangle(float newWidth, float newHeight) {
		width = newWidth;
		height = newHeight;
	}

	public void print() {
		System.out.println("width = " + width + ", height = " + height);
		}

	public boolean equal(Rectangle r1, Rectangle r2) {
		if ((r1.width == r2.width) && (r1.height == r2.height))
			return true;
		else
			return false;
	}

	public float compare(Rectangle r1, Rectangle r2) {
		return r1.width*r1.height - r2.width*r2.height;
	}

	public void resize(Rectangle r, float ratio) {
		r.width = ratio;
		r.height = ratio;
	}	
}