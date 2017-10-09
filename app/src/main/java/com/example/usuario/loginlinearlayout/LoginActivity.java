package com.example.usuario.loginlinearlayout;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Juan Manuel Diaz Ortiz
 * @version v0.1
 * @use
 *
 * */
public class LoginActivity extends AppCompatActivity {

    private TextView txvSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.txvSingUp.setPaintFlags(this.txvSingUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}
