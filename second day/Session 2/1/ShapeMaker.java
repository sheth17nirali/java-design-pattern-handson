


public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
//	private Shape s;
	
	public ShapeMaker() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
//		 TODO Auto-generated constructor stub
	}
	
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
}
