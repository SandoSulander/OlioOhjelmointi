package store.catsocket.olioohjelmointi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // this.testMethod();

        text = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);


        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void afterTextChanged(Editable s) {
                String newText = editText.getText().toString();

                text.setText(newText);
            }
        });
    }

  /*  public void changeTextButton(View v) {

        String newText = editText.getText().toString();

        if (newText.equals("")){
            System.out.println("Hello world!");
            text.setText("Hello world!");
        } else{
            text.setText(newText);
        }
    }*/

}

