package com.example.mes_cours.ui.premiere;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.mes_cours.R;
import com.example.mes_cours.activities.MainActivity;

import java.util.ArrayList;

public class ListesMatieresPremiereFragment extends Fragment {

    public static ListesMatieresPremiereFragment newInstance() {
        return new ListesMatieresPremiereFragment();
    }

    private ListesMatieresPremiereViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View listesMatieresPremiereFragment = inflater.inflate(R.layout.listes_matieres_premiere_fragment, container, false);
        return listesMatieresPremiereFragment;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ListesMatieresPremiereViewModel.class);
        // TODO: Use the ViewModel
    }

}