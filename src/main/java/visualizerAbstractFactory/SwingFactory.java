package visualizerAbstractFactory;

public class SwingFactory implements Factory {

	@Override
	public Visualizer getVisualizer() {
		return new SwingVisualizer();
	}

}
