package com.branislav.icpc.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.branislav.icpc.Adapter.CategoryAdapter;
import com.branislav.icpc.Adapter.DocumentAdapter;
import com.branislav.icpc.Model.Book;
import com.branislav.icpc.Model.Data;
import com.branislav.icpc.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class IcpcListFragment extends Fragment {
    Data data;
    View documet_view;
    RecyclerView document_list;
    ArrayList<Book> document;
    public IcpcListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        data=new Data();
        documet_view=inflater.inflate(R.layout.fragment_icpc_list, container, false);
        document_list=(RecyclerView)documet_view.findViewById(R.id.document_list);
        document_list.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        document_list.setLayoutManager(llm);
        DocumentAdapter ca = new DocumentAdapter(data.DocumentList(),getActivity());
        document_list.setAdapter(ca);

        return documet_view;
    }

}
