package com.android.weightunitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText weightEditText;
    private RadioButton kgToGramRadioButton;
    private RadioButton gramToKgRadioButton;
    private RadioButton mgToGramRadioButton;
    private RadioButton gramToMgRadioButton;
    private RadioButton kgToMgRadioButton;
    private RadioButton mgToKgRadioButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = findViewById(R.id.weight_edit_text);
        kgToGramRadioButton = findViewById(R.id.kg_to_gram_radio_button);
        gramToKgRadioButton = findViewById(R.id.gram_to_kg_radio_button);
        mgToGramRadioButton = findViewById(R.id.mg_to_gram_radio_button);
        gramToMgRadioButton = findViewById(R.id.gram_to_mg_radio_button);
        kgToMgRadioButton = findViewById(R.id.kg_to_mg_radio_button);
        mgToKgRadioButton = findViewById(R.id.mg_to_kg_radio_button);
        resultTextView = findViewById(R.id.result_text_view);

        Button convertButton = findViewById(R.id.convert_button);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(weightEditText.getText().toString());

                if (kgToGramRadioButton.isChecked()) {
                    double result = weight * 1000;
                    resultTextView.setText(String.format("%.2f", result) + " grams");
                }
                else if (gramToKgRadioButton.isChecked()) {
                    double result = weight / 1000;
                    resultTextView.setText(String.format("%.2f", result) + " kilograms");
                }
                else if (mgToGramRadioButton.isChecked()) {
                    double result = weight / 1000;
                    resultTextView.setText(String.format("%.2f", result) + " grams");
                }
                else if (gramToMgRadioButton.isChecked()) {
                    double result = weight * 1000;
                    resultTextView.setText(String.format("%.2f", result) + " milligrams");
                }
                else if (kgToMgRadioButton.isChecked()) {
                    double result = weight * 1000000;
                    resultTextView.setText(String.format("%.2f", result) + " milligrams");
                }
                else if (mgToKgRadioButton.isChecked()) {
                    double result = weight / 1000000;
                    resultTextView.setText(String.format("%.2f", result) + " kilograms");
                }
            }
        });
    }
}
