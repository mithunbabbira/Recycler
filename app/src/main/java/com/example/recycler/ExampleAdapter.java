package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {


    //6.2
    private ArrayList<ExampleItem>mExampleList;


// should do according to the order
    //1
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{



        //4
        public ImageView imageView;
        public TextView textView;



       //2
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);



            //4 with other 4
            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);

        }
    }

    //6.1
    public ExampleAdapter(ArrayList<ExampleItem>exampleList){ mExampleList = exampleList;}

    // step 3 generate the method(rigth click > generate and select 3 methods

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        //5
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        //7
        ExampleItem currentItem = mExampleList.get(i);
        exampleViewHolder.imageView.setImageResource(currentItem.getmImageRessource());
        exampleViewHolder.textView.setText(currentItem.getmText());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}
