package com.example.nh.books;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;



import java.util.ArrayList;




public class bookadapter extends RecyclerView.Adapter<bookadapter.MyViewHolder> {
    ArrayList<book> books;
    book book;
    Context context;

    public bookadapter(ArrayList<book> books,Context context){
        this.books=books;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row,parent,false);
        MyViewHolder holder=new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        book=books.get(position);
        holder.textView.setText(book.getName());
        holder.textView1.setText(book.getAuthor());
        holder.img.setImageResource(book.getImg());
        holder.rate.setRating(book.getRate());

    }

    @Override
    public int getItemCount() {
        return  books.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView1;
        ImageView img;
        RatingBar rate ;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txt1);
            textView1=itemView.findViewById(R.id.txt2);
            img=itemView.findViewById(R.id.img1);
            rate=itemView.findViewById(R.id.rate);

        }
    }
}



