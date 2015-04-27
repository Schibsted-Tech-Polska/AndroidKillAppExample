package pl.schibsted.killappexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class ActivityA extends ActionBarActivity {

    public static final String SHOULD_FINISH = "should_finish";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.inject(this);

        if (getIntent().getBooleanExtra(SHOULD_FINISH, false)) {
            finish();
        }
    }

    @OnClick(R.id.button)
    protected void onNextClick() {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }

}
