package com.example.quotetheday;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashSet;
import java.util.Set;

public class FavoritesActivity extends AppCompatActivity {

    private TextView favoritesTextView;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        favoritesTextView = findViewById(R.id.favoritesTextView);

        // Initialize SharedPreferences
        preferences = getPreferences(MODE_PRIVATE);

        // Load and display favorite quotes
        displayFavoriteQuotes();
    }

    private void displayFavoriteQuotes() {
        // Retrieve favorite quotes from SharedPreferences
        Set<String> favoritesSet = preferences.getStringSet("favorites", new HashSet<>());

        // Log the retrieved favorites
        Log.d("Favorites", "Retrieved Favorites: " + favoritesSet);

        // Check if there are favorite quotes to display
        StringBuilder favoritesBuilder = new StringBuilder();

        for (String favorite : favoritesSet) {
            favoritesBuilder.append(favorite).append("\n");
        }
        // Log the retrieved favorites
        Log.d("Favorites", "Retrieved Favorites: " + favoritesSet);
        // Display favorite quotes in the TextView
        if (favoritesBuilder.length() > 0) {
            favoritesTextView.setText(favoritesBuilder.toString().trim());
        } else {
            favoritesTextView.setText("No favorite quotes yet");
        }
    }

}
