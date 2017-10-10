package com.example.vinnycius.firebaseappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseRefencia = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseRefencia.child("usuarios");
    private DatabaseReference produtoRefencia = databaseRefencia.child("produtos");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario usuario = new Usuario();
        usuario.setNome("Vinnycius");
        usuario.setSobrenome("Amancio");
        usuario.setIdade(24);
        usuario.setSexo("Masculino");

        Produto produto = new Produto();
        produto.setCor("Rosa");
        produto.setDescricao("iPhone 6s plus");
        produto.setFabricante("Apple");

        usuarioReferencia.child("003").setValue( usuario);

        produtoRefencia.child("001").setValue(produto);
    }
}
