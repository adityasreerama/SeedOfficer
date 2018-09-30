package in.edu.rvce.seedofficer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RSP2 extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),RSP3.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsp2);
        Spinner dropdown9 = findViewById(R.id.spinner9);
        String[] items9 = new String[]{"Sufficiently equipped", "Partially Equipped", "Serious Shortage"};
        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items9);
        dropdown9.setAdapter(adapter9);
        Spinner dropdown10 = findViewById(R.id.spinner10);
        String[] items10 = new String[]{"From Government cocoon markets", "Directly from registered seed cocoon producers", "Directly from unregistered seed rearers"};
        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items10);
        dropdown10.setAdapter(adapter10);
    }
}
