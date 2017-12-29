package Table;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import Component.OutputLeaveDataComponent;
import Component.OutputLeaveDataComponent.AgentData;
import Component.TextContent;

public class Table extends TableController{
	private Table() {
		super();
	}
	
	public static Table getTableObject() {
		return new Table();
	}
}
