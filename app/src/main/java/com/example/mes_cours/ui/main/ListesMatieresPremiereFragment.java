package com.example.mes_cours.ui.main;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mes_cours.R;

public class ListesMatieresPremiereFragment extends Fragment {

    public static ListesMatieresPremiereFragment newInstance() {
        return new ListesMatieresPremiereFragment();
    }

    private ListesMatieresPremiereViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listes_matieres_premiere_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ListesMatieresPremiereViewModel.class);
        // TODO: Use the ViewModel
    }

}