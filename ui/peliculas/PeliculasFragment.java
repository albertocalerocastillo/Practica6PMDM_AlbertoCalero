package com.example.practica6pmdmalbertocalero.ui.peliculas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practica6pmdmalbertocalero.Peliculas;
import com.example.practica6pmdmalbertocalero.PeliculasAdapter;
import com.example.practica6pmdmalbertocalero.R;
import com.example.practica6pmdmalbertocalero.databinding.FragmentPeliculasBinding;
import java.util.ArrayList;
import java.util.List;

public class PeliculasFragment extends Fragment {

    private PeliculasViewModel peliculasViewModel;
    private FragmentPeliculasBinding binding;
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    List items = new ArrayList();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        peliculasViewModel = new ViewModelProvider(this).get(PeliculasViewModel.class);
        binding = FragmentPeliculasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        items.add(new Peliculas(R.drawable.spiderman, getString(R.string.spiderman), getString(R.string.directorSpiderman), getString(R.string.repartoSpiderman), 5, getString(R.string.sinopsisSpiderman), 0));
        items.add(new Peliculas(R.drawable.inception, getString(R.string.inception), getString(R.string.directorInception), getString(R.string.repartoInception), 5, getString(R.string.sinopsisInception), 0));
        items.add(new Peliculas(R.drawable.renacido, getString(R.string.renacido), getString(R.string.directorInception), getString(R.string.repartoInception), 5, getString(R.string.sinopsisInception), 0));
        items.add(new Peliculas(R.drawable.joker, getString(R.string.joker), getString(R.string.directorJoker), getString(R.string.repartoJoker), 5, getString(R.string.sinopsisJoker), 0));
        items.add(new Peliculas(R.drawable.saw, getString(R.string.saw), getString(R.string.directorSaw), getString(R.string.repartoSaw), 3, getString(R.string.sinopsisSaw), 0));
        recycler = (RecyclerView) binding.recyclerPeliculas;
        recycler.setHasFixedSize(true);
        lManager = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(lManager);
        adapter = new PeliculasAdapter(items);
        {
        }
        recycler.setAdapter(adapter);
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}