package com.example.TV_Remind_Me;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by DanielMaclin on 6/2/2014.
 */
public class Registration extends Activity {
    String collection_name;
    EditText collection_view;
    TextView invalid_format;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        //Allowing the button to transfer the user to the library creation screen
        Button collectionButton = (Button) findViewById(R.id.Collectionbutton);
        collection_view = (EditText) findViewById(R.id.collectionTxtView);
        invalid_format = (TextView) findViewById(R.id.invalidFormat);

        collectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checks to see if the name is of a valid format (not empty, etc.)
                if(collection_view.getText().toString().isEmpty()) {
                    invalid_format.setVisibility(View.VISIBLE);
                }
                else {
                    collection_name = collection_view.getText().toString();
//                Intent newProfile = new Intent(this, newProfile.class);
//                startActivity(newProfile);
                }
            }
        });
    }
}