package pl.schibsted.killappexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Jacek Kwiecień on 27.04.15.
 */
public class ActivityC extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.button)
    protected void onFinishClick() {
        Intent intent = new Intent(this, ActivityA.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra(ActivityA.SHOULD_FINISH, true);
        startActivity(intent);
    }
}
