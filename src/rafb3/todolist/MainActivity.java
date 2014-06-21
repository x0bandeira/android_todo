package rafb3.todolist;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        list = new TodoList(this);
        input = new TodoInput((EditText) findViewById(R.id.taskInput));
    	setListAdapter(list.getAdapter());

    }

    TodoInput input;
    TodoList list;

	public void saveTask(View view) {
		list.add(input.getValue());
    	input.clear();
    }
}
