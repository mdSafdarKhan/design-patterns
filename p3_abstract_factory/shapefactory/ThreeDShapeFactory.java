package p3_abstract_factory.shapefactory;

import p3_abstract_factory.enums.ShapeType;
import p3_abstract_factory.shape.GeometricShape;
import p3_abstract_factory.shape.Sphere;

public class ThreeDShapeFactory implements AbstractFactory{

	@Override
	public GeometricShape getShape(ShapeType shapeType) {
		GeometricShape geometricShape = null;
		switch (shapeType) {
		case SPHERE:
			geometricShape = new Sphere();
			break;
		default:
			break;
		}
		return geometricShape;
	}



}
