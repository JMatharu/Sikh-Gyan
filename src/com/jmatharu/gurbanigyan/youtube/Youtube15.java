package com.jmatharu.gurbanigyan.youtube;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import com.jmatharu.gurbanigyan.R;

public class Youtube15 extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener {
	static private final String DEVELOPER_KEY = "AIzaSyAtqdhiy9NVwbw1rEN5DKRS5m7NK6ziO70";
	static private final String VIDEO = "_7qDJSp8TxQ";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_youtube15);
		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view15);
		youTubeView.initialize(DEVELOPER_KEY, this);
	}

	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Oh no! " + arg1.toString(), Toast.LENGTH_LONG)
				.show();
	}

	@Override
	public void onInitializationSuccess(Provider arg0, YouTubePlayer arg1,
			boolean arg2) {
		// TODO Auto-generated method stub
		arg1.loadVideo(VIDEO);
	}

}
