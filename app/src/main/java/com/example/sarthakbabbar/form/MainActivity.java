package com.example.sarthakbabbar.form;

import android.content.Intent;
import android.graphics.Color;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.id.text1;
import static com.example.sarthakbabbar.form.R.id.parent;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton male,female;
    String item;

    String[] con = {"India", "New Zealand","Italy","France"};
    String[] occupation = {"Student", "Business", "Government Job", "Executive", "Media"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1=(EditText)findViewById(R.id.fn);
        final EditText et2=(EditText)findViewById(R.id.ln);

        radioGroup = (RadioGroup) findViewById(R.id.gender);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);


        final EditText et4=(EditText)findViewById(R.id.pass);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,occupation);
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.oc);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.RED);


        final EditText et6=(EditText)findViewById(R.id.oc);

        Button b=(Button)findViewById(R.id.register);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Second.class);
                intent.putExtra("fn",et1.getText().toString());
                intent.putExtra("ln",et2.getText().toString());
                int selectedId = radioGroup.getCheckedRadioButtonId();
                    if(selectedId == male.getId()) {
                        intent.putExtra("gender","male");
                    } else if(selectedId == female.getId()) {
                        intent.putExtra("gender","Female");
                    }
                //intent.putExtra("gender",rb.getText().toString());
                intent.putExtra("pass",et4.getText().toString());
                intent.putExtra("country",item);
                intent.putExtra("oc",et6.getText().toString());

                startActivity(intent);
            }
        });

        Button r=(Button)findViewById(R.id.reset);
        r.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                radioGroup.clearCheck();
                et4.setText("");
                //spinner.setSelection(0);
                et6.setText("");

            }
        });
    }
}
