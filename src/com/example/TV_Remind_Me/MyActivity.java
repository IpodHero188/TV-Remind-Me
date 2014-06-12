package com.example.TV_Remind_Me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.HashMap;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    boolean populatedShows = false; //Checks if the user has any saved shows
    boolean has_list = false;//Checks to see if there is a profile attached
    HashMap <Integer, Integer> tempShowStorage;
    HashMap <Integer, Boolean> tempEpisodeStorage;
    Button MenuButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MenuButton = (Button) findViewById(R.id.Menubutton);

        /*Checks to see that the user has an established profile
           If so, the content is loaded and displayed onto the screen
           if not, a new page will be displayed to register their information
         */

        /*
           Method to load profile here
           Check storage location
           has_profile variable is set to true
         */

        if(has_list){
            /*
                load the tv shows into the gridview
             */
            tempShowStorage = new HashMap<Integer, Integer>();
            tempEpisodeStorage = new HashMap<Integer, Boolean>();

        }
        else{
            //The user does not have a established profile
            Intent registerIntent = new Intent(this, Registration.class);
            startActivity(registerIntent);
        }
    }

    //during inactivity, the data from the hashmaps will be written to the file
    protected void onPause(){

    }
}
