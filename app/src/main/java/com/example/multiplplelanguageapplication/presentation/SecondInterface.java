package com.example.multiplplelanguageapplication.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.example.multiplplelanguageapplication.R;
import com.example.multiplplelanguageapplication.databinding.ActivitySecondInterfaceBinding;
import com.example.multiplplelanguageapplication.domain.LanguageSetUp;

public class SecondInterface extends AppCompactActivityWithMenu {

    private ActivitySecondInterfaceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUp = new LanguageSetUp(this);
        language = setUp.getLanguage();
        setToolBarName();
        binding = ActivitySecondInterfaceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setText();
    }

    private void setText() {
        switch (language) {
            case English:binding.secondInterfaceText.setText(R.string.english_second_screen_text);break;
            case Afrikaans:binding.secondInterfaceText.setText(R.string.afrikaans_second_screen_text);break;
            case IsiZulu:binding.secondInterfaceText.setText(R.string.zulu_second_screen_text);break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
        finish();
    }
}