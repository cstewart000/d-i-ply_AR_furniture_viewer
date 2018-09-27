package com.google.ar.sceneform.samples.hellosceneform.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.ar.sceneform.samples.hellosceneform.MainActivity;
import com.google.ar.sceneform.samples.hellosceneform.R;

import java.util.Objects;

public class FragmentHome extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        ImageView imgLeftIcon=view.findViewById(R.id.imgLeftIcon);
        imgLeftIcon.setOnClickListener(view1 -> ((MainActivity) Objects.requireNonNull(getActivity())).openOrCloseDrawer());
    }
}
