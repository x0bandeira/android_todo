package rafb3.todolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

public class TodoList {

    SimpleAdapter adapter; 
    List<HashMap<String, String>> list;

	public TodoList(Context view) {
		list = new ArrayList<HashMap<String, String>>();
    	adapter = new SimpleAdapter(view, list,
    			R.layout.task,
    			new String[] { "description" },
    			new int[] { R.id.taskDescription });
	}

	public ListAdapter getAdapter() {
		return adapter;
	}

	public void add(String value) {
    	HashMap<String, String> h = new HashMap<String, String>();
    	h.put("description", value);
    	list.add(h);
    	adapter.notifyDataSetChanged();
	}
}
