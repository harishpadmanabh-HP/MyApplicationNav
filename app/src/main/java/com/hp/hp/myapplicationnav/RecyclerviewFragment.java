package com.hp.hp.myapplicationnav;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.support.constraint.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerviewFragment extends Fragment {

    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mImageurls=new ArrayList<>();
    View v;
    RecyclerView  recyclerView;
    public RecyclerviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         v = inflater.inflate
                (R.layout.fragment_fraglist,container,false);
recyclerView=v.findViewById(R.id.recyclerview);
        initImageBitmaps();


        return v;
    }

    private void initImageBitmaps() {
        Log.d(TAG,"prepare bitmaps");
        mImageurls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageurls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageurls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageurls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageurls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageurls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageurls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageurls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageurls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");

        mImageurls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageurls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageurls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageurls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageurls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageurls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageurls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageurls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageurls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");
        mImageurls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageurls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageurls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageurls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageurls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageurls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageurls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageurls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageurls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");


//27.
        initRecyclerView();
    }
    //22.fn for recyclerview

    private void initRecyclerView(){
        Log.e("rrrrrrrrrrrrr","RECYCLERVIEW INIT>>>>>");
        //23 connect recycler view
     //   RecyclerView recyclerView=v.findViewById(R.id.recyclerview);
        //24.make adapter for recycler view . the previously made class recyclerviewadapter object to connect tht class to RV
        //pass params to the class with context,and arraylist elements created here for data
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(getContext(),mNames,mImageurls);
        //25.set our adapter to our RV
        recyclerView.setAdapter(adapter);
        //26.set layoutmanager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //27.call init recyclerview fn in initbitmaps to connect recyclerview and the data

    }
public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>{
    public RecyclerViewAdapter(Context mContext, ArrayList<String> mImages, ArrayList<String> mImagenames) {
        this.mImagenames = mImagenames;
        this.mImages = mImages;
        this.mContext = mContext;
    }

    private ArrayList<String> mImagenames = new ArrayList<>();
    private ArrayList<String> mImages=new ArrayList<>();
    private Context mContext;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutlistitem,parent,false);
        //12.pass view to viewholder
        ViewHolder holder=new ViewHolder(view);
        //13.return viewholder
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,"onbindviewholder called.......");
        //15. image using glide.takes context.type of img as bitmap,load image in tht uri,into target holder.image
        //image widget for each list
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
        //16.set text to viewholder textview of list item.
        holder.imagename.setText(mImagenames.get(position));

        //17.onclick for list item
        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onclick hit...."+mImagenames.get(position));
                Toast.makeText(mContext,mImagenames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImagenames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            CircleImageView image;
            TextView imagename;
            RelativeLayout parentlayout;
            public ViewHolder(View itemView) {
                super(itemView);
                image=itemView.findViewById(R.id.image);
                imagename=itemView.findViewById(R.id.imagename);
                parentlayout=itemView.findViewById(R.id.parentlayout);

            }
        }
}

    }


