package com.example.lx.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    private TextView mTextView;
    private View mView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.fragment_1, container, false);
        mTextView=(TextView) mView.findViewById(R.id.text1);
        return mView;
    }
//此方法在Fragment中

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden){
            //Fragment隐藏时调用
            Toast.makeText(getActivity(),"隐藏fragment 1",Toast.LENGTH_SHORT).show();
        }else {
            //Fragment显示时调用
            mTextView.setText("显示fragment 1");
        }

    }
}
