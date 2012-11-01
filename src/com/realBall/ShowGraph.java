package com.realBall;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Activity for showing the last graph
 * The graph is based on the last game the user played
 * @author Yu, Marty and Lingchen
 *
 */
public class ShowGraph extends Activity{
	
	

	private Coordinates graph;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		graph = new Coordinates(this);
		
		setContentView(graph);
		//pass the data of velocity and acceleration to the graph
		graph.setData(LevelOne.velocityList,LevelOne.accelerationList);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		startActivity(new Intent("com.realBall.MENULIST"));
	}
	
	
	

}
