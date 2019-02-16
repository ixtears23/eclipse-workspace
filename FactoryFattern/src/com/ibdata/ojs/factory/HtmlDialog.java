package com.ibdata.ojs.factory;

import com.ibdata.ojs.buttons.Button;
import com.ibdata.ojs.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
