package com.android.fibreoptic;



import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class TermActivity extends ListActivity{

	
	private CursorAdapter dataSource;
	//private static final String fields[] = {"title", "definition","category",BaseColumns._ID };
	private static final String fields[] = {"title",BaseColumns._ID };

			    
		/** Called when the activity is first created. */
	
	 
		@Override
		public void onCreate(Bundle savedInstanceState) {
			      
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.terms);
		 FibreOpticDBHelper helper = new FibreOpticDBHelper(this);
		 SQLiteDatabase database = helper.getWritableDatabase();
		 /*Cursor data = database.query("fibreopticdictionary", fields, null, null, null, null, null);
		 String[] from = new String[] { FibreOpticDictionaryDBAdapter.KEY_TITLE, FibreOpticDictionaryDBAdapter.KEY_DEFINITION, FibreOpticDictionaryDBAdapter.KEY_CATEGORY};
		 int[] to = new int[] {R.id.list_title, R.id.list_definition, R.id.list_category};*/
		 Cursor data = database.query("fibreopticdictionary", fields, null, null, null, null, null);
		 String[] from = new String[] { FibreOpticDictionaryDBAdapter.KEY_TITLE};
		 int[] to = new int[] {R.id.list_title};
		 dataSource = new SimpleCursorAdapter(this, R.layout.search_byword, data, from, to);
		 //getListView();
		 ListView lv = getListView();;
		 lv.setHeaderDividersEnabled(true);
		// lv.addHeaderView(getLayoutInflater().inflate(R.layout.terms, null));
		 setListAdapter(dataSource);
		
		 lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
			}
			 
		 });
		

	}

	
}
