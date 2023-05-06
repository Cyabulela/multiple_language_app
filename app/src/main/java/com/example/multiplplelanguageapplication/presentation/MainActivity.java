package com.example.multiplplelanguageapplication.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.example.multiplplelanguageapplication.R;
import com.example.multiplplelanguageapplication.databinding.ActivityMainBinding;
import com.example.multiplplelanguageapplication.domain.LanguageSetUp;

public class MainActivity extends AppCompactActivityWithMenu {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUp = new LanguageSetUp(this);
        language = setUp.getLanguage();
        setToolBarName();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setText();
        binding.onNextScreen.setOnClickListener(event -> {
            Intent intent = new Intent(this , SecondInterface.class);
            startActivity(intent);
            finish();
        });
    }

    private void setText() {
        switch (language) {
            case English:
                binding.firstInterfaceText.setText(R.string.english_first_screen_text);
                binding.onNextScreen.setText(R.string.english_button);
                break;
            case IsiZulu:
                binding.firstInterfaceText.setText(R.string.zulu_first_screen_text);
                binding.onNextScreen.setText(R.string.zulu_button);
                break;
            case Afrikaans:
                binding.firstInterfaceText.setText(R.string.afrikaans_first_screen_text);
                binding.onNextScreen.setText(R.string.afrikaans_button);
                break;
        }
    }

}