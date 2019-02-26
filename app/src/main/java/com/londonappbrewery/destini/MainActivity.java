package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottonButton;
    private int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
             mStoryTextView = findViewById(R.id.storyTextView);
            mTopButton = findViewById(R.id.buttonTop);
            mBottonButton = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mTopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mStoryIndex == 1 ) {
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottonButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    }else if(mStoryIndex == 3){
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottonButton.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), " this is the end T6_end" ,Toast.LENGTH_SHORT  ).show();
                    }else if(mStoryIndex == 2){
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottonButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    }
                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mBottonButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mStoryIndex == 1) {
                        mStoryTextView.setText(R.string.T2_Story);
                        mTopButton.setText(R.string.T2_Ans1);
                        mBottonButton.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                    }else if(mStoryIndex == 2){
                        mStoryTextView.setText(R.string.T4_End);
                        mBottonButton.setVisibility(View.GONE);
                        mTopButton.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), " this is the end T4_End" ,Toast.LENGTH_SHORT  ).show();
                    }else if(mStoryIndex == 3){
                        mStoryTextView.setText(R.string.T5_End);
                        mBottonButton.setVisibility(View.GONE);
                        mTopButton.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), " this is the end T5_End" ,Toast.LENGTH_SHORT  ).show();

                    }
                }
            });

    }



    public void updateStory(){

    }
}
