package com.jmatharu.gurbanigyan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jmatharu.gurbanigyan.youtube.Youtube1;
import com.jmatharu.gurbanigyan.youtube.Youtube10;
import com.jmatharu.gurbanigyan.youtube.Youtube11;
import com.jmatharu.gurbanigyan.youtube.Youtube2;
import com.jmatharu.gurbanigyan.youtube.Youtube3;
import com.jmatharu.gurbanigyan.youtube.Youtube4;
import com.jmatharu.gurbanigyan.youtube.Youtube5;
import com.jmatharu.gurbanigyan.youtube.Youtube6;
import com.jmatharu.gurbanigyan.youtube.Youtube7;
import com.jmatharu.gurbanigyan.youtube.Youtube8;
import com.jmatharu.gurbanigyan.youtube.Youtube9;

public class YoutubeList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_youtube_list);

		Button bYouube1 = (Button) findViewById(R.id.buttonYou1);
		bYouube1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube1.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});

		Button bYouube2 = (Button) findViewById(R.id.buttonYou2);
		bYouube2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube2.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube3 = (Button) findViewById(R.id.buttonYou3);
		bYouube3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube3.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube4 = (Button) findViewById(R.id.buttonYou4);
		bYouube4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube4.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube5 = (Button) findViewById(R.id.buttonYou5);
		bYouube5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube5.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube6 = (Button) findViewById(R.id.buttonYou6);
		bYouube6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube6.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube7 = (Button) findViewById(R.id.buttonYou7);
		bYouube7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube7.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube8 = (Button) findViewById(R.id.buttonYou8);
		bYouube8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube8.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube9 = (Button) findViewById(R.id.buttonYou9);
		bYouube9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube9.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube10 = (Button) findViewById(R.id.buttonYou10);
		bYouube10.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube10.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
		Button bYouube11 = (Button) findViewById(R.id.buttonYou11);
		bYouube11.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(YoutubeList.this,
						Youtube11.class);
				YoutubeList.this.startActivity(activityIntent);
			}
		});
	}

}
