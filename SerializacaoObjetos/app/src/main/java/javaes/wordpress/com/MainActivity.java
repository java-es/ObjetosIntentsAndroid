package javaes.wordpress.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javaes.wordpress.com.modelo.ProdutoParcelable;
import javaes.wordpress.com.modelo.ProdutoSerializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProdutoParcelable = (Button) findViewById(R.id.btnProdutoParcelable);
        btnProdutoParcelable.setOnClickListener(this);

        Button btnProdutoSerializable = (Button) findViewById(R.id.btnProdutoSerializable);
        btnProdutoSerializable.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnProdutoParcelable:
                ProdutoParcelable prdParcelable = new ProdutoParcelable();
                prdParcelable.setId(1);
                prdParcelable.setCodigo("100");
                prdParcelable.setNome("TV");
                prdParcelable.setDescricao("Televisão 32 polegadas.");

                Intent intent = new Intent(this,ProdutoActivity.class);
                intent.putExtra("produtoParcelable",prdParcelable);
                startActivity(intent);
                break;
            case  R.id.btnProdutoSerializable:
                Intent it = new Intent(this,ProdutoActivity.class);
                ProdutoSerializable prdSerializable = new ProdutoSerializable();
                prdSerializable.setId(2);
                prdSerializable.setCodigo("200");
                prdSerializable.setNome("Geladeira");
                prdSerializable.setDescricao("Geladeira Branca");
                it.putExtra("produtoSerializable", prdSerializable);
                startActivity(it);
                break;
        }
    }
}
