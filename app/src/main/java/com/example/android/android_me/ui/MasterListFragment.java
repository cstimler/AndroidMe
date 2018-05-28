package com.example.android.android_me.ui;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;



import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class MasterListFragment extends Fragment {
    GridView gridView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_master_list, container, false);
        // setContentView(R.layout.fragment_master_list);
        MasterListAdapter masterListAdapter = new MasterListAdapter(view.getContext(), AndroidImageAssets.getAll());
        gridView = (GridView) view.findViewById(R.id.fragment_view);
        gridView.setAdapter(masterListAdapter);
        return view;
    }

}
/* {
    public class MasterListAdapter extends BaseAdapter {
           private Context mContext;
           private List<Integer> mBodyParts;
        public MasterListAdapter(Context context, List<Integer> bodyParts){

        }
    }

}
*/