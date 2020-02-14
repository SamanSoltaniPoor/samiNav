package com.hamyarandroid.saminav;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class SamiNavBtn extends LinearLayout{


    private ImageView vIcon;
    private TextView vTitle;
    private Context context;





    public SamiNavBtn(Context context)
    {
        super(context);
        this.context = context;
        initViews(0);
    }

    public SamiNavBtn(Context context, int view)
    {
        super(context);
        this.context = context;
        initViews(view);
    }



    private void initViews(int view)
    {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == 0) inflater.inflate(R.layout.residemenu_item, this);
        else inflater.inflate(view, this);

        vIcon =  findViewById(R.id.icon);
        vTitle = findViewById(R.id.title);
    }



    public void setLayoutRTL()
    {
        this.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }
    public void setLayoutLTR()
    {
        this.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
    }




    public void setIcon(int icon){
        vIcon.setImageResource(icon);
    }


    public void setTitle(int title){
        vTitle.setText(title);
    }
    public void setTitle(String title){
        vTitle.setText(title);
    }





}
