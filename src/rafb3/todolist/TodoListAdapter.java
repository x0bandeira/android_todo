package rafb3.todolist;

import java.util.List;

import rafb3.todolist.views.TodoItemView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class TodoListAdapter extends ArrayAdapter<TodoItem> {

	public TodoListAdapter(Context context, List<TodoItem> objects) {
		super(context, 0, objects);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		TodoItemView view = (TodoItemView) convertView;
		if (view == null)
			view = TodoItemView.inflate(parent);
		view.setModel(this.getItem(position));
		return view;
	}

}
