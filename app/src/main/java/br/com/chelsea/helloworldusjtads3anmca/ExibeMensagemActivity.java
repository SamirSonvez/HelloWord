package br.com.chelsea.helloworldusjtads3anmca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView mensagemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Aqui inflo a view
        setContentView(R.layout.activity_exibe_mensagem);

        //somente depois faço a busca
        mensagemTextView = findViewById(R.id.mensagemTextView);

        Intent origemIntent = getIntent();

        String mensagem = origemIntent.getStringExtra("mensagem");
        mensagemTextView.setText(mensagem);
    }
}
