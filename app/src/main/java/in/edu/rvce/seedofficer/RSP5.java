package in.edu.rvce.seedofficer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RSP5 extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),RSP6.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsp5);
        Spinner dropdown17 = findViewById(R.id.spinner17);
        String[] items17 = new String[]{"Pebrine detected", "Pebrine not detected"};
        ArrayAdapter<String> adapter17 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items17);
        dropdown17.setAdapter(adapter17);

    }
}
