package com.zukirou.pomsshortening;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AnswerList extends ListActivity {
	String tests[] = {	"LifeCycleTest",
						"SingleTouchTest",
						"MultiTouchTest",
						"KeyTest",
						"AccelerometerTest",
						"AssetsTest",
						"ExternalStorageTest",
						"SoundPoolTest",
						"MediaPlayerTest",
						"FullScreenTest",
						"RenderViewTest",
						"ShapeTest",
						"BitmapTest",
						"FontTest",
						"SurfaceViewTest"};
	
	public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allanswer);
 //       setListAdapter(new ArrayAdapter <String> (this, android.R.layout.allanswer, tests));
        
	}
	/*
    @Override
    protected void onListItemClick(ListView list, View view, int position, long id){
    	super.onListItemClick(list, view, position, id);
    	String testName = tests[position];
    	try{
    		Class clazz = Class.forName("jp.zukirou.studyapi." + testName);
    		Intent intent = new Intent(this, clazz);
    		startActivity(intent);
    	}catch(ClassNotFoundException e){
    		e.printStackTrace();
    	}
    }
    */
}
