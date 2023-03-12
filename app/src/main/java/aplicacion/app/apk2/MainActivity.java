package aplicacion.app.apk2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
    }

    public void Mayor(View view) {
        string n1 = et1.getText().toString();
        string n2 = et2.getText().toString();

        int k1 = Integer.parseInt(n1);
        int k2 = Integer.parseInt(n2);

        if(k1 > k2){
            Toast.makeText(this, "El mayor numero es" + k1, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "El mayor numero es" + k2, Toast.LENGTH_SHORT).show();
                    

        }


    }
    public void Menor(View view){
        string n1 = et1.getText().toString();
        string n2 = et2.getText().toString();

        int k1 = Integer.parseInt(n1);
        int k2 = Integer.parseInt(n2);

        if (k1 < k2){

            Toast.makeText(this, "El menor es " + k1, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "El menor es " + k2, Toast.LENGTH_SHORT).show();
        }

    }

}