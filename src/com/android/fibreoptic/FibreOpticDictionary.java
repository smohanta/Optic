package com.android.fibreoptic;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class FibreOpticDictionary extends Activity {
    /** Called when the activity is first created. */
	MediaPlayer mpSplash;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        mpSplash = MediaPlayer.create(this, R.raw.splashmusic);
        mpSplash.start();
        Thread logoTimer = new Thread(){
			public void run(){
				try{
					int logoTimer = 0;
					while(logoTimer<4000){
						sleep(100);
						logoTimer = logoTimer + 100 ;
					}
        
        startActivity(new Intent("com.android.fibreoptic.MENU"));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			finally{
					finish();
				}
    }
};
logoTimer.start();
    }

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy(); 
		mpSplash.release();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mpSplash.pause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		mpSplash.start();
	}





}
        