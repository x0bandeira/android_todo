package rafb3.todolist.views;

import rafb3.todolist.R;
import rafb3.todolist.TodoItem;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TodoItemView extends RelativeLayout implements OnTouchListener {

	public TodoItemView(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.todo_item_view_children, this, true);
	}

	public void setModel(TodoItem item) {
		TextView t = (TextView) this.findViewById(R.id.todoItemDescription);
		t.setText(item.getDescription());
	}

	public static TodoItemView inflate(ViewGroup parent) {
		TodoItemView item = (TodoItemView) LayoutInflater
				.from(parent.getContext())
				.inflate(R.layout.todo_item_view, parent, false);
		return item;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		return false;
	}
}
