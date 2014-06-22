package rafb3.todolist.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import rafb3.todolist.R;
import rafb3.todolist.TodoItem;
import rafb3.todolist.TodoListAdapter;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;

public class TodoListView {

    ArrayAdapter adapter; 
    List<TodoItem> list;

	public TodoListView(ListActivity view) {
		list = new ArrayList<TodoItem>();
    	adapter = new TodoListAdapter(view, list);
    	view.setListAdapter(adapter);
	}

	public void add(String value) {
    	list.add(new TodoItem(value));
    	adapter.notifyDataSetChanged();
	}
}
