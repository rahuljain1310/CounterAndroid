package com.example.asd.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.count) TextView count;
    @BindView(R.id.multiplier) Button multiplier;
    @BindView(R.id.reset) Button reset;
    @BindView(R.id.add_m) Button add_m;
    @BindView(R.id.reduce_m) Button reduce_m;
    @BindView(R.id.increment) Button increment;
    @BindView(R.id.decrement) Button decrement;

    int count_value = 0;
    int multiplier_value = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.reset)
    public void reset () {
        count_value=0;
        count.setText(count_value);
        multiplier_value=0;
        multiplier.setText(multiplier_value);
    }

    @OnClick(R.id.increment)
    public void incrementCount () {
        count_value = count_value + multiplier_value;
        count.setText(count_value);
    }

    @OnClick(R.id.decrement)
    public void decrementCount () {
        count_value = count_value + multiplier_value;
        count.setText(count_value);
    }
    @OnClick(R.id.add_m)
    public void increasemultiplier () {
        multiplier.setText(++multiplier_value+" x");
    }
    @OnClick(R.id.reduce_m)
    public void decreasemultiplier () {
        multiplier.setText(--multiplier_value+" x");
    }
}
