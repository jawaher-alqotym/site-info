package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int[] ImgesfoSite={R.drawable.mirrir,R.drawable.mirrir,R.drawable.mirrir,R.drawable.mirrir,R.drawable.mirrir,R.drawable.mirrir};
    String [] Name={"Ali","Anna","Jawaher","Atheer","Hayat","Ali"};
    String [] comint={"good... me and my fimaily liked it!","Not bad... but not that great","i liked it it was fun ","good!","love it","good... me and my fimaily liked it!"};
    String[] SiteInfo={"Open space", "camping" ,"Ampel visipilty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// for commint
        ListView LIST1=(ListView)findViewById(R.id.LVcomint);
        Coustom CoustomAdapter=new Coustom();
        LIST1.setAdapter(CoustomAdapter);

// for info
        ListView LIST2=(ListView)findViewById(R.id.LView_info);
        CoustomInfo CoustomAdapter2=new CoustomInfo();
        LIST2.setAdapter(CoustomAdapter2);


// for add to history feed




// for pic
        ImageSlider imageSlider= findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel( "https://images.app.goo.gl/Jg8TWhCn5S8Udeze6" ));
        slideModels.add(new SlideModel( "https://images.app.goo.gl/ZSeLVrZokq6kttSZ7" ));
        slideModels.add(new SlideModel( "https://images.app.goo.gl/NyJV1wR7tiAdZyFE8" ));
        imageSlider.setImageList( slideModels,true);

    }

    private void AddToFeed(View v) {

       // write the nedid code to input all info into the tabel

    }

    class Coustom extends BaseAdapter{

        @Override
        public int getCount() {
            return ImgesfoSite.length;
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
            convertView =getLayoutInflater().inflate(R.layout.coustoumlist,null);

            ImageView imge=(ImageView)convertView.findViewById(R.id.imageViewForSit);
            TextView textView_name=(TextView)convertView.findViewById(R.id.textView_name);
            TextView textView_comm=(TextView)convertView.findViewById(R.id.textView_comm);

            imge.setImageResource(ImgesfoSite[position]);
            textView_name.setText(Name[position]);
            textView_comm.setText(comint[position]);

            return convertView;
        }

    }
    class CoustomInfo extends BaseAdapter{
        @Override
        public int getCount() {
            return SiteInfo.length;
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
            convertView =getLayoutInflater().inflate(R.layout.coustomforinfo,null);
            TextView textView_info=(TextView)convertView.findViewById(R.id.textView_infos);
            textView_info.setText(SiteInfo[position]);


            return convertView;
        }
    }
}