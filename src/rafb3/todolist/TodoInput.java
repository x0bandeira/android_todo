package rafb3.todolist;

import android.widget.EditText;

public class TodoInput {
	EditText el;
	
	public TodoInput(EditText el) {
		this.el = el;
	}

	public String getValue() {
		return el.getText().toString();
	}
	
	public void clear() {
		el.setText("");
	}
}
