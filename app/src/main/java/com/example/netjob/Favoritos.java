package com.example.netjob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;

import com.example.netjob.Model.Favorito;

import java.util.ArrayList;
import java.util.List;

import com.example.netjob.databinding.ActivityFavoritosBinding;


public class Favoritos extends AppCompatActivity {

    ActivityFavoritosBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        binding = ActivityFavoritosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Favorito> favoritos = new ArrayList<>();

        favoritos.add(new Favorito("Albañil", "Prueba 2", R.drawable.albaniles));
        favoritos.add(new Favorito("Fontanero", "Prueba 2", R.drawable.albaniles));
        favoritos.add(new Favorito("Mecanico", "Prueba 2", R.drawable.albaniles));
        favoritos.add(new Favorito("Plumero", "Prueba 2", R.drawable.albaniles));
        favoritos.add(new Favorito("Cocinero", "Prueba 2", R.drawable.albaniles));
        favoritos.add(new Favorito("Profesor", "Prueba 2", R.drawable.albaniles));

        FavoritoAdapter gridAdapter = new FavoritoAdapter(Favoritos.this, R.layout.favorito, favoritos);
        binding.favoritos.setAdapter(gridAdapter);
        binding.favoritos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
        public void BtnHome(View view) {
            Intent intent = new Intent(this, Home.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }

        public void BtnBuzon(View view) {
            Intent intent = new Intent(this, Buzon.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }

        public void BtnBuscar(View view) {
            Intent intent = new Intent(this, ListaServicios.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }

        public void BtnFavoritos(View view) {
            Intent intent = new Intent(this, Favoritos.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }

        public void BtnPerfil(View view) {
            Intent intent = new Intent(this, PerfilPropio.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }


