package com.isorensen.icpc.Adapter;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.isorensen.icpc.MainActivity;
import com.isorensen.icpc.Model.Book;
import com.isorensen.icpc.R;

import java.util.List;

/**
 * Created by gari on 24/09/16.
 */
public class DocumentAdapter extends RecyclerView.Adapter<DocumentAdapter.ContactViewHolder> {

    private List<Book> booklist;
//    Activity activity;

    MainActivity mainActivity;
    public DocumentAdapter(List<Book> booklist, Activity activity) {
        this.booklist = booklist;
        this.mainActivity = (MainActivity) activity;
    }

    @Override
    public int getItemCount() {
        return booklist.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, final int i) {
        final Book ci = booklist.get(i);

        if (ci.flagstring!=null){
            contactViewHolder.layout.setBackgroundColor(Color.parseColor("#E0E0E0"));
            contactViewHolder.arrow_imageview.setImageDrawable(null);
            contactViewHolder.details_textview.setText("");
            contactViewHolder.tile_textview.setText("");
            contactViewHolder.sub_title_textview.setText(ci.description);
        }
        else {
            contactViewHolder.tile_textview.setText(ci.tile);
            contactViewHolder.details_textview.setText(ci.description);
            contactViewHolder.layout.setBackgroundColor(Color.parseColor("#FAFAFA"));
            contactViewHolder.sub_title_textview.setText("");
        }


        contactViewHolder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.ReplaceFramgent(2,ci.tile,ci.pdfpath);
            }
        });

    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.document_layout, viewGroup, false);



        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView tile_textview;
        protected RelativeLayout layout;
        protected TextView details_textview;
        protected ImageView arrow_imageview;
        protected TextView sub_title_textview;

        public ContactViewHolder(View v) {
            super(v);
            sub_title_textview=(TextView)v.findViewById(R.id.sub_title_textView);
            tile_textview=(TextView)v.findViewById(R.id.title_document_textView);
            details_textview=(TextView)v.findViewById(R.id.details_document_textView);
            arrow_imageview=(ImageView)v.findViewById(R.id.arrow_imageView);
            layout = (RelativeLayout) v.findViewById(R.id.pdf_layout);
        }
    }
}
