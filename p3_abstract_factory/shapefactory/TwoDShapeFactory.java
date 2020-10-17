package p3_abstract_factory.shapefactory;

import p3_abstract_factory.enums.ShapeType;
import p3_abstract_factory.shape.Circle;
import p3_abstract_factory.shape.GeometricShape;
import p3_abstract_factory.shape.Line;

public class TwoDShapeFactory implements AbstractFactory {

	@Override
	public GeometricShape getShape(ShapeType shapeType) {
		GeometricShape geometricShape = null;
		switch (shapeType) {
		case LINE:
			geometricShape = new Line();
			break;
		case CIRCLE:
			geometricShape = new Circle();
			break;
		default:
			break;
		}
		return geometricShape;
	}

}
