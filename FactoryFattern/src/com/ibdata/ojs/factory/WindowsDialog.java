package com.ibdata.ojs.factory;

import com.ibdata.ojs.buttons.Button;
import com.ibdata.ojs.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
