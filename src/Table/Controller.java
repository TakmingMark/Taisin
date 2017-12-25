package Table;

public class Controller {
	private View view;
	private Model model;
	
	protected Controller() {
		
	}
	
	public static Controller getControllerObject() {
		return new Controller();
	}
	
	private void initController() {
		
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}

	public void setView(View view) {
		this.view = view;
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	
}
