package innopolis.study.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ekaterina on 10/11/17.
 */

public class ClickerActivity extends Activity {
    private int i = 0;
    private TextView counterTV;
    String tag = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tag = getIntent().getStringExtra(MainActivity.COUNTER_TAG);

        setContentView(R.layout.activity_clicker);

        TextView tagTV = (TextView) findViewById(R.id.tagTextView);
        counterTV = (TextView) findViewById(R.id.counterTextView);

        tagTV.setText(tag);

        Button button = (Button) findViewById(R.id.clickerButton);
        button.setText("+1 " + tag);
    }

    public void onClick(View view) {
        counterTV.setText(String.valueOf(++i));
    }
}
