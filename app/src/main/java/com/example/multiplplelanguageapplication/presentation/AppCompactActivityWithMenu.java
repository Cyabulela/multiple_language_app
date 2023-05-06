package com.example.multiplplelanguageapplication.presentation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.multiplplelanguageapplication.R;
import com.example.multiplplelanguageapplication.data.Language;
import com.example.multiplplelanguageapplication.domain.LanguageSetUp;

import java.util.Objects;

public abstract class AppCompactActivityWithMenu extends AppCompatActivity {

    protected Language language;
    protected LanguageSetUp setUp;

    public void setToolBarName() {
        Objects.requireNonNull(getSupportActionBar()).setTitle(language.getLanguage());
        getSupportActionBar().setSubtitle("Multiple languages app");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        LanguageSetUp.setLanguage(item.getItemId());
        recreate();
        return true;
    }
}
