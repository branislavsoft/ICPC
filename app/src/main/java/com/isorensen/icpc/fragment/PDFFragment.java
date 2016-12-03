package com.isorensen.icpc.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.isorensen.icpc.R;
import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static java.lang.String.format;
/**
 * A simple {@link Fragment} subclass.
 */
public class PDFFragment extends Fragment implements OnPageChangeListener {

    View pdf_view;
    String path;
    String title;
    PDFView pdfView;
    int pageNumber;
    TextView title_view;
    ImageButton upload_button;

    public static final String MyPREFERENCES = "Landscap" ;
    public static final String status = "status";
    SharedPreferences sharedpreferences;

    public PDFFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        path=getArguments().getString("details");
        title=getArguments().getString("title");
        Log.d("pdf",path);
        pageNumber=1;
//        getActivity().getApplicationContext().getAssets().open("glossario.xml")
        pdf_view=inflater.inflate(R.layout.fragment_pdf, container, false);


        sharedpreferences = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(status, "pdf");
        editor.commit();


        pdfView=(PDFView)pdf_view.findViewById(R.id.pdfview);
        title_view=(TextView)pdf_view.findViewById(R.id.pdf_details_textView);
        upload_button=(ImageButton)pdf_view.findViewById(R.id.upload_imageButton);
        title_view.setText(title);
        pdfView.fromAsset(path)
                .defaultPage(1)
                .onPageChange(this)
                .load();

        upload_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sharefile();
            }
        });
        return pdf_view;
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
//        pageNumber = page;
//        setTitle(format("%s %s / %s", path, page, pageCount));
    }

//    share file:

    private void Sharefile()
    {
        AssetManager assetManager = getActivity().getApplicationContext().getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getActivity().getApplicationContext().getFilesDir(), path);
        try
        {
            in = assetManager.open(path);
            out = getActivity().getApplicationContext().openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setDataAndType(
                Uri.parse("file://" + getActivity().getApplicationContext().getFilesDir() + "/"+path),
                "application/pdf");

        startActivity(intent);





//        intentShareFile.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+myFilePath));
//
//        intentShareFile.putExtra(Intent.EXTRA_SUBJECT,
//                "Sharing File...");
//        intentShareFile.putExtra(Intent.EXTRA_TEXT, "Sharing File...");
//
//        startActivity(Intent.createChooser(intentShareFile, "Share File"));




    }

    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }
}
