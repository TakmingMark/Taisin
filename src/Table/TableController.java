package Table;

public class TableController {
	private TableView view;
	private TableModel model;
	
	protected TableController() {
		
	}
	
	public static TableController getControllerObject() {
		return new TableController();
	}
	
	private void initController() {
		
	}

	public TableView getView() {
		return view;
	}

	public TableModel getModel() {
		return model;
	}

	public void setView(TableView view) {
		this.view = view;
	}
	
	public void setModel(TableModel model) {
		this.model = model;
	}
	
	
}
