package javaes.wordpress.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javaes.wordpress.com.modelo.ProdutoParcelable;
import javaes.wordpress.com.modelo.ProdutoSerializable;

public class ProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        TextView txtNomeProduto = (TextView) findViewById(R.id.txtNomeProduto);

        Intent it = getIntent();
        ProdutoParcelable prdParcelable = it.getParcelableExtra("produtoParcelable");
        ProdutoSerializable prdSerializable = (ProdutoSerializable)it.getSerializableExtra("produtoSerializable");

        if(prdParcelable != null){
            txtNomeProduto.setText(String.format("Nome: %s",prdParcelable.getNome()));
        }
        else {
            if (prdSerializable != null) {
                txtNomeProduto.setText(String.format("Nome: %s", prdSerializable.getNome()));
            } else {
                txtNomeProduto.setText("Não Encontrado");
            }
        }
    }
}
