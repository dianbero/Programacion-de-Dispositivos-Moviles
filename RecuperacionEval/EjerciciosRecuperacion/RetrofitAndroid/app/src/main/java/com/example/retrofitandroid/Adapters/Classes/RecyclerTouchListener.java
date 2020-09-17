package com.example.retrofitandroid.Adapters.Classes;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitandroid.Adapters.Interfaces.ClickListener;
import com.example.retrofitandroid.ViewModels.MainActivityVM;

public class RecyclerTouchListener /*extends GestureDetector.SimpleOnGestureListener*/ implements RecyclerView.OnItemTouchListener {
    //Private Attributes
    private ClickListener clickListener;
    private GestureDetector gestureDetector;
    private MainActivityVM vm;


//    @Override
//    public boolean onSingleTapUp(MotionEvent e) {
////        return super.onSingleTapUp(e);
//        return true;
//    }

    public RecyclerTouchListener(Context context, ClickListener clickListener, MainActivityVM vm) {

        this.clickListener = clickListener;
        this.vm = vm;

        gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return super.onSingleTapUp(e);
            }
        });

    }

    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
        //Creo que obtiene el elemento seleccionado, a partir de la positición de dónde se ha hecho click
        View child = rv.findChildViewUnder(e.getX(), e.getY());
        //Si todos los elementos son correctos, le pasa al listener la vista y la posición del elemento seleccionado
        if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
            clickListener.onClick(child, rv.getChildAdapterPosition(child));
//            vm.setElementPosition(rv.getChildAdapterPosition(child));
        }

        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
