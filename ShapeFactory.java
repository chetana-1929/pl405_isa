package shape_package;

public class ShapeFactory {
public Shape getInstance(shapeType type) {
		
		Shape shape = null;
			
		switch(type) 
		{		
			case RECTANGLE:
				shape = new Rectangle(10,4);
				break;
				
			case TRINGLE:
				shape = new Tringle(8,12);
				break;
				
			case CIRCLE:
				shape = new Circle(15);
				break;
				
		}
		
		return shape;
	}	
}
