package store.catsocket.olioohjelmointi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // this.testMethod();

        text = (TextView) findViewById(R.id.textView);
    }

    public void testMethod(View v){

        System.out.println("Hello World!");
        text.setText("Moi maailma!");
    }
}
