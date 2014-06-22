package rafb3.todolist.views;

import java.util.ArrayList;
import java.util.List;

import rafb3.todolist.TodoItem;
import rafb3.todolist.TodoListAdapter;
import android.app.ListActivity;

public class TodoListView {

	TodoListAdapter adapter;
	List<TodoItem> list;

	public TodoListView(ListActivity view) {
		list = new ArrayList<TodoItem>();
		adapter = new TodoListAdapter(view, list);
		view.setListAdapter(adapter);
	}

	public void add(String description) {
		list.add(new TodoItem(description));
		adapter.notifyDataSetChanged();
	}
}
