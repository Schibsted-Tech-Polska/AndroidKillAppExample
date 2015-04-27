package pl.schibsted.killappexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Jacek Kwiecień on 27.04.15.
 */
public class ActivityB extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.button)
    protected void onNextClick() {
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }
}
