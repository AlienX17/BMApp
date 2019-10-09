package com.example.bmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

/* todo: Review
*   Layout
*       ✓ App contains at least 4 lists of relevant attractions for a location
*       ✓ User can navigate between lists using a central screen.
*       ✓ Each list item contains information about a location.
*       ✓ Each list item contains information about a location.
*       × At least one list includes pictures of the location.
*           The ClubsFragment is the only fragment that has proper images. Change the other so that
*           they don't show an image at all.
*       × The code adheres to all of the following best practices:
*           ✓ Text sizes are defined in sp
*           × Lengths are defined in dp
*           ✓ Padding and margin is used appropriately, such that the views are not crammed up
*             against each other.
*       Bonus: You used the tools namespace in xml layouts. Awesome.
*   Functionality
*       ✓ App contains a custom object for storing location information.
*       ✓ App uses a custom adapter to populate the layout with views based on instances of the
*         custom class.
*       ✓ All strings are stored in the strings.xml resource file.
*       ✓ All images are stored as drawables.
*       ✓ The code runs without errors.
*   Code Readability
*       ✓ Code is easily readable such that a fellow programmer can understand the purpose of the
*         app.
*       × All variables, methods, and resource IDs are descriptively named such that another
*         developer reading the code can easily understand their function.
*           word_list.xml is not properly named.
*       × The code is properly formatted:
*          × No unnecessary blank lines
*          ✓ No unused variables or methods
*          ✓ No commented out code
*          × The code also has proper indentation when defining variables and methods.
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout restaurants = findViewById(R.id.restaurants_category);

        restaurants.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent restaurantsIntent = new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(restaurantsIntent);

            }
        });
    }

    public void openMuseumsList(View view){
        Intent i = new Intent(this, MuseumsActivity.class);
        startActivity(i);
    }

    public void openClubsList(View view){
        Intent i = new Intent(this, ClubsActivity.class);
        startActivity(i);
    }

    public void openParksList(View view){
        Intent i = new Intent(this, ParksActivity.class);
        startActivity(i);
    }
}
