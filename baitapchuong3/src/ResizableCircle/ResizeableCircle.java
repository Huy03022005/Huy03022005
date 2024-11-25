package ResizableCircle;

public class ResizeableCircle   extends Circle implements Resizeable  {
	public int resize(int percent) {
		return 0;
	}

	public ResizeableCircle(Double radius) {
		super(radius);
	}

	@Override
	public String toString() {
		return "ResizeableCircle []";
	}
	
}
