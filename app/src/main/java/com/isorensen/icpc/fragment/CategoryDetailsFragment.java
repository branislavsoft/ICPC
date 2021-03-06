package com.isorensen.icpc.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.isorensen.icpc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryDetailsFragment extends Fragment {

    TextView title_textview;
    TextView details_textview;
    TextView subtile_textview;
    ImageButton contact_imagebutton;
    ImageButton back_imagebutton;
    String title_string;
    String sub_string;
    String detils_string;
    View CategoryDetailsView;


    public static final String MyPREFERENCES = "Landscap" ;
    public static final String status = "status";
    SharedPreferences sharedpreferences;

    public CategoryDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        if(getArguments().getString("title")!=null&&getArguments().getString("details")!=null){
//            title_string = getArguments().getString("title");
//            detils_string = getArguments().getString("details");
//        }
//        else {
            SharedPreferences prefs = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            title_string = prefs.getString("title", null);
            detils_string=prefs.getString("details", null);
//        }


        CategoryDetailsView=inflater.inflate(R.layout.fragment_category_details, container, false);

        sharedpreferences = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(status, "details");
        editor.commit();


        title_textview=(TextView)CategoryDetailsView.findViewById(R.id.details_title_textView);
        //subtile_textview=(TextView)CategoryDetailsView.findViewById(R.id.sub_title_textView);
        details_textview=(TextView)CategoryDetailsView.findViewById(R.id.description_textView);
        contact_imagebutton=(ImageButton)CategoryDetailsView.findViewById(R.id.contact_imageButton);
        back_imagebutton=(ImageButton)CategoryDetailsView.findViewById(R.id.back_details_imageButton);
        back_imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, new IcpcCategoryFragment()).commit();

            }
        });
        contact_imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"recipient@example.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, title_string);
                i.putExtra(Intent.EXTRA_TEXT   , detils_string);
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getActivity(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });
        title_textview.setText(title_string);
        //subtile_textview.setText(sub_string);
        details_textview.setText(detils_string);
        return CategoryDetailsView;
    }

}
