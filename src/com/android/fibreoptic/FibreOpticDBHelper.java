package com.android.fibreoptic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FibreOpticDBHelper extends SQLiteOpenHelper {
	
	public FibreOpticDBHelper(Context context) {
		super(context, "CursorDemo", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		   
      	db.execSQL("create table fibreopticdictionary (_id integer primary key autoincrement, " 
        		+ " title text not null, definition text not null, " + " category text not null);");
      	//String sql = "INSERT or replace INTO definitions (title, definition, category) VALUES('A/B Switch','A device that accepts inputs (optical or electrical) from a primary path and a secondary path to provide automatic or manual switching in the event that the primary path signal is broken or otherwise disrupted. In optical A/B switches, optical signal power thresholds dictate whether the primary path is functioning and signals a switch to the secondary path until optical power is restored to the primary path','other')" ;       

      	db.execSQL("INSERT or replace INTO fibreopticdictionary (title, definition, category) VALUES('A/B Switch','A device that accepts inputs (optical or electrical) from a primary path and a secondary path to provide automatic or manual switching in the event that the primary path signal is broken or otherwise disrupted. In optical A/B switches, optical signal power thresholds dictate whether the primary path is functioning and signals a switch to the secondary path until optical power is restored to the primary path','other')" );
      	db.execSQL("INSERT or replace INTO fibreopticdictionary (title, definition, category) VALUES('Absorption','That portion of optical attenuation in optical fiber resulting from the conversion of optical power to heat. Caused by impurities in the fiber such as hydroxyl ions.','Optical transmitter')" );
      	db.execSQL("INSERT or replace INTO fibreopticdictionary (title, definition, category) VALUES('Add/Drop Multiplexing ','a multiplexing function offered in connection with SONET that allows lower level signals to be added or dropped from a high-speed optical carrier in a wire center. The connection to the add/drop multiplexer is via a channel to a central office port at a specific digital speed (DS3, DS1, etc.) ','Multiplexing')" );
      	db.execSQL("INSERT or replace INTO fibreopticdictionary (title, definition, category) VALUES('Light-emitting Diode (LED) ','A semiconductor that emits incoherent light when forward biased. Two types of LED’s include edge-emitting LED’s and surface-emitting LED’s (illustrated). ','other')" );
      	db.execSQL("INSERT or replace INTO fibreopticdictionary (title, definition, category) VALUES('Transmitter ','A device that includes a source and driving electronics. It functions as an electrical-to-optical converter. ','Optical Transmitters')" );
      	db.execSQL("INSERT or replace INTO fibreopticdictionary (title, definition, category) VALUES('Raman Amplifier','An optical amplifier based on Raman scattering which generates many different wavelengths of light from a nominally single-wavelength source by means of lasing action or by the beating together of two frequencies. The optical signal can be amplified by collecting the Raman scattered light. ','Amplifier')" );
      	
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Steps to upgrade the database for the new version ...
	}

}
