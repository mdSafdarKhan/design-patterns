package p6_prototype.tree;

public class PlasticTree {

	private String color;
	private Double height;

	public PlasticTree() {
		super();
	}

	public PlasticTree(String color, Double height) {
		super();
		this.color = color;
		this.height = height;
	}

	@Override
	public Object clone() {
		PlasticTree copy = new PlasticTree();
		copy.color = this.color;
		copy.height = this.height;
		return copy;
	}

	@Override
	public String toString() {
		return "PlasticTree [color=" + color + ", height=" + height + "]";
	}

}
