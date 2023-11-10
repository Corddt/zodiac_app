package cupk.z.shengxiao_z;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button btn;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.x_sipnner);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = spinner.getSelectedItem().toString();
                Intent intent = new Intent(MainActivity.this, cupk.z.shengxiao_z.ShengXiaoActivity.class);
                intent.putExtra("zodiac", str);
                startActivity(intent);
            }
        });

        Log.d(TAG, "onCreate completed");
    }
}
