package p3_abstract_factory.shapefactory;

import p3_abstract_factory.enums.ShapeType;
import p3_abstract_factory.shape.GeometricShape;

public interface AbstractFactory {
	GeometricShape getShape(ShapeType shapeType);
}
