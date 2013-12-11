package valera.client.sentMail;

import com.google.gwt.dom.client.Style.BorderStyle;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.HasDirection.Direction;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;



public class SentMail extends Composite{
	//private Label vasa;
	ReportSizeLabel theLabel;
	public SentMail() {
		
	
			theLabel = new ReportSizeLabel("What's my size?");
			initWidget(theLabel);
			
			// Add a ClickHandler to the label - this should cause an exception to be raised
			// since ReportSizeLabel overides the addClickHandler method of InnerLabel to explicitly
			// prevent a ClickHandler being added
			theLabel.addClickHandler(new ClickHandler(){
				public void onClick(ClickEvent event) {
					Window.alert("You clicked me!");
				}			
			});
	
	}
}
