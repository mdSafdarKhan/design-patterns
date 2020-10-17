package p3_abstract_factory.shapefactory;

import p3_abstract_factory.enums.FactoryType;

public class FactoryProvider {

	public static AbstractFactory getFactory(FactoryType factoryType) {
		AbstractFactory abstractFactory = null;
		switch (factoryType) {
		case TWO_D_FACTORY:
			abstractFactory = new TwoDShapeFactory();
			break;
		case THREE_D_FACTORY:
			abstractFactory = new ThreeDShapeFactory();
			break;
		default:
			break;
		}
		return abstractFactory;
	}
}
