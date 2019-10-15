package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  String parsedText ="";
    private List<String>  listFinal  = new ArrayList<>();
    private RecyclerView  recyclerView ;
    private Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView  = findViewById(R.id.recycler);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        InputStream ins = getResources().openRawResource(
                getResources().getIdentifier("nitin",
                        "raw", getPackageName()));

         try{
             PdfReader  reader  = new PdfReader(ins);
             int n = reader.getNumberOfPages();
             for (int i = 0; i <n ; i++) {
                 parsedText   = parsedText+ PdfTextExtractor.getTextFromPage(reader, i+1).trim()+"\n"; //Extracting the content from the different pages
             }

             reader.close();

             //System.out.println(isValidPhoneNumber(parsedText));
            // System.out.println(parsedText);

           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);
           //  System.out.println(parsedText);


             parsedText = parsedText.replaceAll("[^-?0-9]+", " ");
             System.out.println(Arrays.asList(parsedText.trim().split(" ")));
             //System.out.println(parsedText);
             List<String>  list  = Arrays.asList(parsedText.trim().split(" "));

             for(int i =0 ; i<list.size(); i++ ){

                 if((list.get(i).length())==10){
                     System.out.println(list.get(i));
                     listFinal.add(list.get(i));
                 }

             }
         }
         catch (Exception ee){

         }


         findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 mAdapter  = new Adapter(getApplicationContext() ,listFinal);
                 recyclerView.setAdapter(mAdapter);
             }
         });

    }


































































}
