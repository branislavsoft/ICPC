package com.isorensen.icpc.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import com.isorensen.icpc.Adapter.CategoryAdapter;
import com.isorensen.icpc.InforActivity;
import com.isorensen.icpc.Model.Book;
import com.isorensen.icpc.R;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import info.hoang8f.android.segmented.SegmentedGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class IcpcCategoryFragment extends Fragment implements RadioGroup.OnCheckedChangeListener{

    View category_View;
    ImageButton infor_button;
    SegmentedGroup grout_button_historical;
    EditText search_edittext;
    RecyclerView booklist_list;
    XmlPullParserFactory pullParserFactory;
    ArrayList<Book> products;
    String searchflag_string;


    public static final String MyPREFERENCES = "Landscap" ;
    public static final String status = "status";
    SharedPreferences sharedpreferences;



    public IcpcCategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        products = null;
        searchflag_string="";
        category_View=inflater.inflate(R.layout.fragment_icpc_category, container, false);


        sharedpreferences = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(status, "category");
        editor.commit();



        infor_button=(ImageButton)category_View.findViewById(R.id.infore_imageButton);
        grout_button_historical=(SegmentedGroup)category_View.findViewById(R.id.segment_view);
        search_edittext=(EditText)category_View.findViewById(R.id.search_editText);
        booklist_list=(RecyclerView)category_View.findViewById(R.id.category_list);
//        load book date
        booklist_list.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        booklist_list.setLayoutManager(llm);
        try {
            pullParserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = pullParserFactory.newPullParser();

            InputStream in_s = getActivity().getApplicationContext().getAssets().open("glossario.xml");
            if (in_s == null)
            {
                Log.d("in_s", "null");
            }
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in_s, null);
            if (parser != null)
            {
                parseXML(parser);
            }
            else
            {
                Log.d("parse", "null");
            }

        } catch (XmlPullParserException e) {

            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        infor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), InforActivity.class);
                startActivity(intent);
            }
        });



        search_edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


//                    char ch = s.charAt(count);
                    search_gloras(s.toString());




            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
            }
            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
        grout_button_historical.setOnCheckedChangeListener(this);



        return category_View;
    }

    public void search_gloras(String searchkey){
        Log.d("searechkey",searchkey);
        Log.d("searchkey_list",Integer.toString(products.size()));
        ArrayList<Book> bookslist=new ArrayList<Book>();
        if(searchkey.equals("")){
            CategoryAdapter ca = new CategoryAdapter(products,getActivity());
            booklist_list.setAdapter(ca);
        }
        else {
            if (searchflag_string.equals("")){


                for (int i=0;i<products.size();i++){

                    if (products.get(i).tile.toLowerCase().contains(searchkey.toLowerCase())){

                        Book book=new Book();
                        book.tile=products.get(i).tile;
                        book.description=products.get(i).description;
                        bookslist.add(book);
                        CategoryAdapter ca = new CategoryAdapter(bookslist,getActivity());
                        booklist_list.setAdapter(ca);
                    }
                    else {
                        CategoryAdapter ca = new CategoryAdapter(bookslist,getActivity());
                        booklist_list.setAdapter(ca);
                    }


                }



            }
            else {



                if (searchflag_string.equals("terms")){


                    for (int i=0;i<products.size();i++){

                        if (products.get(i).tile.toLowerCase().contains(searchkey.toLowerCase())){

                            Book book=new Book();
                            book.tile=products.get(i).tile;
                            book.description=products.get(i).description;
                            bookslist.add(book);
                            CategoryAdapter ca = new CategoryAdapter(bookslist,getActivity());
                            booklist_list.setAdapter(ca);
                        }
                        else {
                            CategoryAdapter ca = new CategoryAdapter(bookslist,getActivity());
                            booklist_list.setAdapter(ca);
                        }


                    }


                }
                else if (searchflag_string.equals("content")){


                    for (int i=0;i<products.size();i++){

                        if (products.get(i).description.toLowerCase().contains(searchkey.toLowerCase())){

                            Book book=new Book();
                            book.tile=products.get(i).tile;
                            book.description=products.get(i).description;
                            bookslist.add(book);
                            CategoryAdapter ca = new CategoryAdapter(bookslist,getActivity());
                            booklist_list.setAdapter(ca);
                        }
                        else {
                            CategoryAdapter ca = new CategoryAdapter(bookslist,getActivity());
                            booklist_list.setAdapter(ca);
                        }


                    }


                }



            }





        }






    }


    private void parseXML(XmlPullParser parser) throws XmlPullParserException,IOException
    {

        int eventType = parser.getEventType();
        Book currentProduct = null;

        while (eventType != XmlPullParser.END_DOCUMENT){
            String name = null;
            switch (eventType){
                case XmlPullParser.START_DOCUMENT:
                    products = new ArrayList();
                    break;
                case XmlPullParser.START_TAG:
                    name = parser.getName();
                    if (name.equalsIgnoreCase("item")){
                        currentProduct = new Book();
                    } else if (currentProduct != null){
                        if (name.equalsIgnoreCase("key")){
                            currentProduct.tile = parser.nextText();
                        } else if (name.equals("string")){
                            currentProduct.description = parser.nextText();
                        }

                    }
                    break;
                case XmlPullParser.END_TAG:
                    name = parser.getName();
                    if (name.equalsIgnoreCase("item") && currentProduct != null){
                        products.add(currentProduct);
                    }
            }
            eventType = parser.next();
        }
        Log.d("work_result array",products.toString());
        CategoryAdapter ca = new CategoryAdapter(products,getActivity());
        booklist_list.setAdapter(ca);

//        printProducts(products);
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {


        switch (checkedId) {
            case R.id.term_group_button:
                searchflag_string="terms";
                break;
            case R.id.contente_group_button:
                searchflag_string="content";
                break;

            default:
                // Nothing to do
        }

    }
}
