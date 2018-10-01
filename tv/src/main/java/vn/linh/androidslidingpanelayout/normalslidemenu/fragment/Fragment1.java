package vn.linh.androidslidingpanelayout.normalslidemenu.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import vn.linh.androidslidingpanelayout.R;

public class Fragment1 extends Fragment {

    public static Fragment1 newInstance() {
         Bundle args = new Bundle();
         Fragment1 fragment = new Fragment1();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        return view;
    }
}
