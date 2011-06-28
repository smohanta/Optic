package com.android.fibreoptic;


import android.app.Activity;
import android.database.Cursor;
//import android.database.Cursor;
import android.os.Bundle;


//display terms with meanings 
public class listofword extends Activity{

	//private static final int MENU_SEARCH = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchbycat);
		
		FibreOpticDictionaryDBAdapter db = new FibreOpticDictionaryDBAdapter(this);
		
		//adding 2 titles into the titles
        db.open();
        long id;
        id = db.insertFibreOpticdictionary("000001", "Absorption", "That portion of optical attenuation in optical fiber resulting from the conversion of optical power to heat. Caused by impurities in the fiber such as hydroxyl ions.", "More");
        id = db.insertFibreOpticdictionary("000002", "Add/Drop Multiplexing",
        		"a multiplexing function offered in connection with SONET that allows lower level signals to be added or dropped from a high-speed optical carrier in a wire center. The connection to the add/drop multiplexer is via a channel to a central office port at a specific digital speed (DS3, DS1, etc.)",
        		"Multiplexing");
        db.close();
		
        
      //---get all titles---
       db.open();
        Cursor c = db.getAllFibreOpticdictionary();
        if (c.moveToFirst())
        {
            do {          
                DisplayTitle(c);
            } while (c.moveToNext());
        }
        db.close();
	}
	private void DisplayTitle(Cursor c) {
		// TODO Auto-generated method stub
		
	}
		
		
}
