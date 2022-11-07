package visualizerAbstractFactory;

public interface Factory {
	public static Factory getFactory(String type) {
		switch (type) {
		
			case "tui":
				return new TUIFactory();
			case "swing":
				return new SwingFactory();
			default:
				throw new IllegalArgumentException("formato non valido");
		
		} 
	}
	
	public abstract Visualizer getVisualizer();

}
