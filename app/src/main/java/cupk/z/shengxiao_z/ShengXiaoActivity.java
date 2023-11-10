package cupk.z.shengxiao_z;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;

public class ShengXiaoActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    ImageView imageView;
    TextView txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shengxiao);

        btn = (Button) findViewById(R.id.btn1);
        imageView = (ImageView) findViewById(R.id.imageView);
        txt = (TextView) findViewById(R.id.txt);

        btn.setOnClickListener(this);

        String Str = getIntent().getStringExtra("zodiac");

        String[] zodiacNames = getResources().getStringArray(R.array.zodiac_name);
        String[] zodiacDescriptions = getResources().getStringArray(R.array.zodiac_desc);
        String[] zodiacImages = getResources().getStringArray(R.array.zodiac_images);

        int index = Arrays.asList(zodiacNames).indexOf(Str);
        if (index != -1) {
            String description = zodiacDescriptions[index];
            String imageName = zodiacImages[index];

            txt.setText(description);

            int imageResId = getResources().getIdentifier(imageName, "drawable", getPackageName());
            if (imageResId != 0) {
                imageView.setImageResource(imageResId);
            }
        }
    }

    @Override
    public void onClick(View view) {
        // 返回MainActivity
        Intent intent = new Intent(ShengXiaoActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
