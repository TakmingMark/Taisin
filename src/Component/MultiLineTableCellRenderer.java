package Component;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BoxView;
import javax.swing.text.ComponentView;
import javax.swing.text.Element;
import javax.swing.text.IconView;
import javax.swing.text.LabelView;
import javax.swing.text.ParagraphView;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

public class MultiLineTableCellRenderer extends JTextPane  implements TableCellRenderer {                                                                                                                                 
	public MultiLineTableCellRenderer() {
		this.setEditorKit(new MyEditorKit());
		StyledDocument doc = getStyledDocument();
	     SimpleAttributeSet center = new SimpleAttributeSet();
	     StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
	     doc.setParagraphAttributes(0, doc.getLength(), center, false);
	}
	public Component getTableCellRendererComponent(JTable table, Object value,
		      boolean isSelected, boolean hasFocus, int row, int column) {
		    if (isSelected) {
		      setForeground(table.getSelectionForeground());
		      setBackground(table.getSelectionBackground());
		    } else {
		      setForeground(table.getForeground());
		      setBackground(table.getBackground());
		    }
		    setFont(table.getFont());
		    if (hasFocus) {
		      setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		      if (table.isCellEditable(row, column)) {
		        setForeground(UIManager.getColor("Table.focusCellForeground"));
		        setBackground(UIManager.getColor("Table.focusCellBackground"));
		      }
		    } else {
		      setBorder(new EmptyBorder(1, 2, 1, 2));
		    }
		    setText((value == null) ? "" : value.toString());
		    return this;
		  }
}

class MyEditorKit extends StyledEditorKit {
	
	@Override
	public ViewFactory getViewFactory() {
	    return new StyledViewFactory();
	}
 
    static class StyledViewFactory implements ViewFactory {
        public View create(Element elem) {
            String kind = elem.getName();
            if (kind != null) {
                if (kind.equals(AbstractDocument.ContentElementName)) {
                    return new LabelView(elem);
                } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
                    return new ParagraphView(elem);
                } else if (kind.equals(AbstractDocument.SectionElementName)) {
                    return new CenteredBoxView(elem, View.Y_AXIS);
                } else if (kind.equals(StyleConstants.ComponentElementName)) {
                    return new ComponentView(elem);
                } else if (kind.equals(StyleConstants.IconElementName)) {
                    return new IconView(elem);
                }
            }
            return new LabelView(elem);
        }

    }
}

class CenteredBoxView extends BoxView {
    public CenteredBoxView(Element elem, int axis) {
        super(elem,axis);
    }
    protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {
        super.layoutMajorAxis(targetSpan,axis,offsets,spans);
        System.out.println("targetSpan:"+targetSpan+"axis:"+axis+"offsets:"+offsets+"spans:"+spans);
        for(int element:spans) {
        	System.out.println(element);
        }
        int textBlockHeight = 0;
        int offset = 0;
 
        for (int i = 0; i < spans.length; i++) {
            textBlockHeight += spans[i];
        }
        
        offset = (targetSpan - textBlockHeight) / 2;
        for (int i = 0; i < offsets.length; i++) {
            offsets[i] += offset;
        }
    	System.out.println(offset);
    }
}    