package com.isorensen.icpc.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.isorensen.icpc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IcbcHelpFragment extends Fragment {
    View help_view;
    TextView email_textview;
    TextView loadsite_textview;

    public static final String MyPREFERENCES = "Landscap" ;
    public static final String status = "status";
    SharedPreferences sharedpreferences;

    public IcbcHelpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        help_view=inflater.inflate(R.layout.fragment_icbc_help, container, false);

        sharedpreferences = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(status, "help");
        editor.commit();

        email_textview=(TextView)help_view.findViewById(R.id.emailtextView);
        loadsite_textview=(TextView)help_view.findViewById(R.id.demaintextView);
        email_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"info@isorensen.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "info@isorensen.com");
                i.putExtra(Intent.EXTRA_TEXT   , "iCPC Full Version");
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getActivity(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }




            }
        });

        loadsite_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "http://isorensen.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        return help_view;
    }

}
