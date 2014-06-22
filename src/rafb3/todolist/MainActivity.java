package rafb3.todolist;

import rafb3.todolist.views.TodoInputView;
import rafb3.todolist.views.TodoListView;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		list = new TodoListView(this);
		input = new TodoInputView(this, R.id.taskInput);
	}

	TodoInputView input;
	TodoListView list;

	public void saveTask(View view) {
		list.add(input.getValue());
		input.clear();
	}
}
