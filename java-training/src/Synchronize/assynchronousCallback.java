/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Synchronize;

/**
 *
 * @author leanh
 */
interface OnGeekEventListener {


    void onGeekEvent();
}

public class assynchronousCallback {

    private OnGeekEventListener mListener; 

    public void registerOnGeekEventListener(OnGeekEventListener mListener)
    {
        this.mListener = mListener;
    }

    public void doGeekStuff()
    {
        new Thread(new Runnable() {
            public void run()
            {
                System.out.println("Performing operation in Asynchronous Task");
                if (mListener != null) {
                    mListener.onGeekEvent();
                }
            }
        }).start();
    }
    public static void main(String[] args)
    {

        assynchronousCallback obj = new assynchronousCallback();
        OnGeekEventListener mListener = new A();
        obj.registerOnGeekEventListener(mListener);
        obj.doGeekStuff();
    }
}

class A implements OnGeekEventListener {

    @Override
    public void onGeekEvent()
    {
        System.out.println("Performing callback after Asynchronous Task");
    }
}