package rafb3.todolist;

import android.app.Activity;
import android.widget.EditText;

public class TodoInput {
	EditText el;

	public TodoInput(Activity ac, int elId) {
		this.el = (EditText) ac.findViewById(elId);
	}

	public String getValue() {
		return el.getText().toString();
	}
	
	public void clear() {
		el.setText("");
	}
}
