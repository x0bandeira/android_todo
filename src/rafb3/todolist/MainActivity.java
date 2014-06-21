package rafb3.todolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;

public class MainActivity extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        linkList();
    }
    
    SimpleAdapter adapter;
    List<HashMap<String, String>> list;
    
    private void linkList() {
    	list = new ArrayList<HashMap<String, String>>();
    	adapter = new SimpleAdapter(this, list,
    			R.layout.task,
    			new String[] { "description" },
    			new int[] { R.id.taskDescription });
    	setListAdapter(adapter);
	}

	public void saveTask(View view) {
    	EditText t = (EditText) findViewById(R.id.taskInput);
    	HashMap<String, String> h = new HashMap<String, String>();
    	h.put("description", t.getText().toString());
    	list.add(h);
    	adapter.notifyDataSetChanged();
    	t.setText("");
    }
}
