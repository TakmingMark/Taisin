package MVC;

import Model.JsonModel;
import Model.Model;
import View.View;

public class Activity {

	public static void main(String[] args) {
		new Activity().initTaisin();
	}

	private void initTaisin() {
		View view=View.getViewObject();
		
		JsonModel jsonModel=JsonModel.getJosnModelObject();
		
		Controller controller=Controller.getControllerObject();
		controller.setJsonModel(jsonModel);
		controller.setView(view);
		controller.initController();
	}
}
