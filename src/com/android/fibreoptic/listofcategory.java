package com.android.fibreoptic;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.SimpleExpandableListAdapter;


/**
 * Demonstrates expandable lists using a custom {@link ExpandableListAdapter}
 * from {@link BaseExpandableListAdapter}.
 */
public class listofcategory extends ExpandableListActivity implements OnClickListener{
	
	private static final String NAME = "NAME";


	private ExpandableListAdapter mAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	FibreOpticDictionaryDBAdapter db = new FibreOpticDictionaryDBAdapter(getApplicationContext());

	List<String> header = (List<String>) db.getAllFibreOpticdictionary();
	List<Map<String, String>> groupData = new ArrayList<Map<String, String>>();
	List<List<Map<String, String>>> childData = new ArrayList<List<Map<String, String>>>();

	for (String category : header) {
	Map<String, String> curGroupMap = new HashMap<String, String>();
	groupData.add(curGroupMap);
	curGroupMap.put(NAME, category);


	List<String> categoryWords = (List<String>) db.getAllFibreOpticdictionary();

	List<Map<String, String>> children = new ArrayList<Map<String, String>>();
	for (String word : categoryWords) {
	Map<String, String> curChildMap = new HashMap<String, String>();
	children.add(curChildMap);

	curChildMap.put(NAME, word);

	}
	childData.add(children);
	}


	mAdapter = new SimpleExpandableListAdapter(
	this,
	groupData,
	android.R.layout.simple_expandable_list_item_1,
	new String[] { NAME },
	new int[] { android.R.id.text1 },
	childData,
	android.R.layout.simple_expandable_list_item_2,
	new String[] { NAME },
	new int[] { android.R.id.text1 }
	);

	setListAdapter(mAdapter);
	}


@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
}
	
	/*super.onCreate(savedInstanceState);
	setListAdapter(new  ArrayAdapter<String>(this, R.layout.single_item, opticalcategory));
	
	ListView list = getListView();
	list.setTextFilterEnabled(true);
	list.setOnItemClickListener(new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			//Toast.makeText(getApplicationContext(), ((TextView) arg1).getText(), Toast.LENGTH_SHORT).show(); 
			
		}
		
	});
	
	//ListView list = (ListView) findViewById(R.string.)
}




static final String[] opticalcategory = new String[]{
"Optical Transmitters", "Optical Receivers", "Optical Amplifiers" , "Dispersion in Optical Fibre", "Multiplexing ", "Optical Fibre ", "Loss in Optical Fibre", "System Performance" 
};*/

}






