package com.example.quotetheday;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button shareButton;
    private Button favoriteButton;
    private Button nextQuoteButton;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        shareButton = findViewById(R.id.shareButton);
        favoriteButton = findViewById(R.id.favoriteButton);
        nextQuoteButton = findViewById(R.id.nextQuoteButton);
        // Add this line
        Button viewFavoritesButton = findViewById(R.id.viewFavoritesButton); // Add this line

        preferences = getPreferences(MODE_PRIVATE);

        // Load a random quote on app launch
        displayRandomQuote();

        // Set click listeners
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareQuote();
            }
        });

        favoriteButton.setOnClickListener(view -> addToFavorites());

        nextQuoteButton.setOnClickListener(view -> {
            displayRandomQuote(); // Show the next quote on button click
        });

        viewFavoritesButton.setOnClickListener(view -> {
            viewFavorites(); // Call the viewFavorites method when the "View Favorites" button is clicked
        });
    }

    private void displayRandomQuote() {
        String randomQuote = QuoteGenerator.getRandomQuote();
        quoteTextView.setText(randomQuote);
    }

    @SuppressLint("QueryPermissionsNeeded")
    private void shareQuote() {
        String currentQuote = quoteTextView.getText().toString();

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, currentQuote);

        if (shareIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(shareIntent, "Share using"));
        } else {
            Toast.makeText(this, "No app found to handle the share action", Toast.LENGTH_SHORT).show();
        }
    }

    // Inside MainActivity.java

    private void addToFavorites() {
        String currentQuote = quoteTextView.getText().toString();

        // Get the existing favorites
        String favoritesString = preferences.getString("favorites", "");

        // Check if the current quote is not in favorites
        if (!favoritesString.contains(currentQuote)) {
            // Add the current quote to favorites
            favoritesString += currentQuote + ",";
            // Save the updated favorites
            preferences.edit().putString("favorites", favoritesString).apply();
            Toast.makeText(this, "Added to favorites", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Already in favorites", Toast.LENGTH_SHORT).show();
        }
    }





    private void viewFavorites() {
        // Launch the FavoritesActivity
        Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }
}
