package rafb3.todolist.views;

import android.app.Activity;
import android.widget.EditText;

public class TodoInputView {
	EditText el;

	public TodoInputView(Activity ac, int elId) {
		this.el = (EditText) ac.findViewById(elId);
	}

	public String getValue() {
		return el.getText().toString();
	}
	
	public void clear() {
		el.setText("");
	}
}
