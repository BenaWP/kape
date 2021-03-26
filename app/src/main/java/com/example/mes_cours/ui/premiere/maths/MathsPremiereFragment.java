package com.example.mes_cours.ui.premiere.maths;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mes_cours.R;

public class MathsPremiereFragment extends Fragment {

    private MathsPremiereViewModel mViewModel;

    public static MathsPremiereFragment newInstance() {
        return new MathsPremiereFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.maths_premiere_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MathsPremiereViewModel.class);
        // TODO: Use the ViewModel
    }

}