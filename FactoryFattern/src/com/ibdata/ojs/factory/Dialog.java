package com.ibdata.ojs.factory;

import com.ibdata.ojs.buttons.Button;

public abstract class Dialog {

	public void rederWindow() {
		
		Button okButton = createButton();
		okButton.render();
	}
	
	public abstract Button createButton();
}
