package com.branislav.icpc.Adapter;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.branislav.icpc.MainActivity;
import com.branislav.icpc.Model.Book;
import com.branislav.icpc.R;

import java.util.List;

/**
 * Created by gari on 24/09/16.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ContactViewHolder> {

    private List<Book> booklist;
//    Activity activity;

    MainActivity mainActivity;
    public CategoryAdapter(List<Book> booklist, Activity activity) {
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
        contactViewHolder.tile_textview.setText(ci.tile);
        contactViewHolder.details_textview.setText(ci.description);
//        if (ci.level.equals("H")){
//
//            contactViewHolder.layout.setBackgroundColor(Color.parseColor("#F44336"));
//        }

        contactViewHolder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.ReplaceFramgent(1,ci.tile,ci.description);
            }
        });

    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_layout, viewGroup, false);



        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView tile_textview;
        protected RelativeLayout layout;
        protected TextView details_textview;

        public ContactViewHolder(View v) {
            super(v);
            tile_textview=(TextView)v.findViewById(R.id.title_textView);
            details_textview=(TextView)v.findViewById(R.id.details_textView);
            layout = (RelativeLayout) v.findViewById(R.id.book_layout);
        }
    }
}
