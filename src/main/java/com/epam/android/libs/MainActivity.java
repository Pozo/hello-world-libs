package com.epam.android.libs;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import com.epam.android.InMemoryRepository;

public class MainActivity extends ListActivity {
    private final InMemoryRepository<String> repository = new InMemoryRepository<String>();
    private ArrayAdapter<String> adapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        this.adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{});
        setListAdapter(adapter);
    }

    public void addItems(View v) {
        adapter.notifyDataSetChanged();
    }
}
