package visualizerAbstractFactory;

public class TUIFactory implements Factory {

	@Override
	public Visualizer getVisualizer() {
		return new TUIVisualizer();
	}

}
