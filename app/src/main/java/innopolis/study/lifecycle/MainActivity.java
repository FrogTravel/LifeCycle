package innopolis.study.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final static String TAG = "MySuperTag";
    public final static String COUNTER_TAG = "counter_tag";
    Button customButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button neButton = (Button) findViewById(R.id.neButton);
        Button baButton = (Button) findViewById(R.id.baButton);
        customButton = (Button) findViewById(R.id.customButton);

        neButton.setOnClickListener(this);
        baButton.setOnClickListener(this);
        customButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String tag;
        if(customButton.equals(button)){
            EditText editText = (EditText) findViewById(R.id.editText);
            tag = String.valueOf(editText.getText());
            Log.d(TAG, "Custom button" + tag);
        }else{
            tag = String.valueOf(button.getText());
            Log.d(TAG, "Normal button" + tag);
        }

        Intent intent = new Intent(this, ClickerActivity.class);
        intent.putExtra(COUNTER_TAG, tag);
        startActivity(intent);
    }
}
