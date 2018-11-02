package com.hp.hp.myapplicationnav;


import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fraglist extends Fragment {
   //declare arraylists used and widgets
    TextView txt;
    ArrayList<String> fine;
    TextView nums;
    //int []imageid;
    //int[] nm = {2134567890,9867543218,9745682124,8124568062,7012367850,8281476906,9764321678,"9876512345};
    //int[] images = {R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.d4, R.mipmap.d4, R.mipmap.d6, R.mipmap.d4, R.mipmap.ic_launcher_round, R.mipmap.d5, R.mipmap.d4};
    String[] nm;
ListView lv;
    public Fraglist() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fraglist, container, false);

       //create a view object to inflate layout holding list view
        View v = inflater.inflate
                (R.layout.fragment_fraglist,container,false);
//txt=v.findViewById(R.id.tv1);
//nums=v.findViewById(R.id.tv2);
        //connect widgets with view object created
lv=v.findViewById(R.id.lv);
       //add data to array lists
        nm = new String[]{"9999999990", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "2134567890", "9867543218", "9745682124", "8124568062", "7012367850", "8281476906", "9764321678", "9876512345"};

        fine = new ArrayList<String>();

        fine.add("A");
        fine.add("B");
        fine.add("C");
        fine.add("D");
        fine.add("E");
        fine.add("F");
        fine.add("G");
        fine.add("H");
        fine.add("I");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");
        fine.add("J");

//set adapter to list view . create inner class for using adapter which extends baseadapter afrer on created view
        adapt adp = new adapt();
       //set adapter
        lv.setAdapter(adp);
//set o list click listenerr
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent cl = new Intent(Intent.ACTION_CALL);
//                //cl.setData(Uri.parse("name: ",+lst[position]));
//                cl.setData(Uri.parse("tel:  " + nm[position]));
//                cl.putExtra("fine", fine);
//                cl.putExtra("num", nm[position]);
//
//                if (ActivityCompat.checkSelfPermission( getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    //    ActivityCompat#requestPermissions
//                    // here to request the missing permissions, and then overriding
//                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                    //                                          int[] grantResults)
//                    // to handle the case where the user grants the permission. See the documentation
//                    // for ActivityCompat#requestPermissions for more details.
//                    return;
//                }
//                startActivity(cl);
                //getting data which has been clicked
                //if arrarlist get with .get(position)
                //if array get with[position]
                Toast.makeText(getContext(), fine.get(position)+nm[position], Toast.LENGTH_SHORT).show();
           }
        });
//return view obj
        return v;
    }
//creating inner classs and implement methods
    class adapt extends BaseAdapter{
        LayoutInflater inflate;

        @Override
        public int getCount() {
            //return size of arraylist
            return fine.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           // inflate = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          //create view object
            View v = convertView;
//inflate layout for custom list layout
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list, null);
            //connect widgets of the custom layout
            txt=(TextView)v.findViewById(R.id.tv1);
            nums=(TextView)v.findViewById(R.id.tv2);
            //set text to the widgets with position
            nums.setText(nm[position]);
            txt.setText(fine.get(position));
return v;

        }
    }


}