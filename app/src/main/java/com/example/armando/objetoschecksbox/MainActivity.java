package com.example.armando.objetoschecksbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        TextView textContent = (TextView) findViewById(R.id.textView);
        switch (view.getId()) {
            case R.id.checkbox_milk:
                textContent.setText(checked?"Milk Coffe":"Black as the midnight sky on a moonless night");
                break;
            case R.id.checkbox_sugar:
                textContent.setText(checked?"Sweet":"Keep it bitter");
                break;
        }
    }
}
