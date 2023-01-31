package com.example.practica6pmdmalbertocalero.ui.series;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practica6pmdmalbertocalero.R;
import com.example.practica6pmdmalbertocalero.Series;
import com.example.practica6pmdmalbertocalero.SeriesAdapter;
import com.example.practica6pmdmalbertocalero.databinding.FragmentSeriesBinding;
import java.util.ArrayList;
import java.util.List;

public class SeriesFragment extends Fragment {

    private SeriesViewModel seriesViewModel;
    private FragmentSeriesBinding binding;

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        seriesViewModel = new ViewModelProvider(this).get(SeriesViewModel.class);

        binding = FragmentSeriesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        List items = new ArrayList();

        items.add(new Series(R.drawable.breakingbad, getString(R.string.breakingBad), getString(R.string.directorBreakingBad), getString(R.string.repartoBreakingBad), 5, getString(R.string.sinopsisBreakingBad), 5));
        items.add(new Series(R.drawable.mrrobot, getString(R.string.mrRobot), getString(R.string.directorMrRobot), getString(R.string.repartoMrRobot), 5, getString(R.string.sinopsisMrRobot), 4));
        items.add(new Series(R.drawable.peakyblinders, getString(R.string.peakyBlinders), getString(R.string.directorPeakyBlinders), getString(R.string.repartoPeakyBlinders), 4, getString(R.string.sinopsisPeakyBlinders), 6));
        items.add(new Series(R.drawable.prisonbreak, getString(R.string.prisonBreak), getString(R.string.directorPrisonBreak), getString(R.string.repartoPrisonBreak), 4, getString(R.string.sinopsisPrisonBreak), 5));
        items.add(new Series(R.drawable.strangerthings, getString(R.string.strangerThings), getString(R.string.directorStrangerThings), getString(R.string.repartoStrangerThings), 4, getString(R.string.sinopsisStrangerThings), 4));

        recycler = (RecyclerView) binding.recyclerSeries;
        recycler.setHasFixedSize(true);

        lManager = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(lManager);

        adapter = new SeriesAdapter(items);
        recycler.setAdapter(adapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}