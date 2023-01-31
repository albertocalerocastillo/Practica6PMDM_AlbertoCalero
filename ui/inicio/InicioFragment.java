package com.example.practica6pmdmalbertocalero.ui.inicio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.practica6pmdmalbertocalero.R;
import com.example.practica6pmdmalbertocalero.databinding.FragmentInicioBinding;

public class InicioFragment extends Fragment {
    private InicioViewModel inicioViewModel;
    private FragmentInicioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        inicioViewModel = new ViewModelProvider(this).get(InicioViewModel.class);
        binding = FragmentInicioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.txtInicio;
        inicioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(R.string.menu_inicio);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}