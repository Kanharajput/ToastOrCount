package com.example.toastcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView get_show_count;
    private int tapped_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get_show_count = (TextView)findViewById(R.id.show_count);
    }

    public void countOn(View view) {
        tapped_count++;
        if(get_show_count != null){
            get_show_count.setText(Integer.toString(tapped_count));
        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
}