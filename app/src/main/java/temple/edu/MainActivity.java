package temple.edu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.NamePerson);  //final is to acceess the inner class
        final EditText email = findViewById(R.id.emaiID);
        final EditText password = findViewById(R.id.PasswordID);
        final EditText confPass = findViewById(R.id.PasswordConfirmation);
        Button   saveButton = findViewById(R.id.Save);


        View.OnClickListener viewOut = new View.OnClickListener() {  //creating a viewLisn
            @Override
            public void onClick(View v) {
            String personName = name.getText().toString();   //get the value and convert to string
            String personEmail = email.getText().toString();
            String personPassword = password.getText().toString();
            String personConfgPassword = confPass.getText().toString();

                if(personName.equals("") || personEmail.equals("") || personPassword.equals("") || personConfgPassword.equals("")){
                    Toast display = Toast.makeText(MainActivity.this, "Try to enter all the fields", Toast.LENGTH_SHORT);
                    display.show();
                }else if(!(personPassword.equals(personConfgPassword))){
                        Toast error = Toast.makeText(MainActivity.this, "Password does not match!", Toast.LENGTH_SHORT);
                        error.show();
                }else{
                    Toast welcome= Toast.makeText(MainActivity.this, "Welocme, " + personName + " to the SignUpForm App", Toast.LENGTH_SHORT);
                    welcome.show();  //This display wleoming the user
                }


            }
        };


    saveButton.setOnClickListener(viewOut);


    }
}
