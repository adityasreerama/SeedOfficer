package in.edu.rvce.seedofficer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RSP3 extends AppCompatActivity {
    public void fun(View v)
    {
        Intent intent = new Intent(getApplicationContext(),RSP4.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsp3);
        Spinner dropdown11 = findViewById(R.id.spinner11);
        String[] items11 = new String[]{"Registered CRCs", "Farmers", "Non-registered CRCs"};
        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items11);
        dropdown11.setAdapter(adapter11);
        Spinner dropdown12 = findViewById(R.id.spinner12);
        String[] items12 = new String[]{"Regularly tested", "Randomly tested", "Not practiced"};
        ArrayAdapter<String> adapter12 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items12);
        dropdown12.setAdapter(adapter12);
    }
}
