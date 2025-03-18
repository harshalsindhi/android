package com.example.contextmenu;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class activity_second extends AppCompatActivity {
    TextView tvReceivedMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvReceivedMessage = findViewById(R.id.tvReceivedMessage);
        // Getting the Intent that started this activity
        String message = getIntent().getStringExtra("message_key");
        // Displaying the received message
        tvReceivedMessage.setText("Received Message: " + message);
    }
}
