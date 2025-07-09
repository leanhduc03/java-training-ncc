/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Synchronize;

interface OnGeekEventListener {

    void onGeekEvent();
}

public class synchronousCallback {

    private OnGeekEventListener mListener;

    public void registerOnGeekEventListener(OnGeekEventListener mListener)
    {
        this.mListener = mListener;
    }

    public void doGeekStuff()
    {
        System.out.println("Performing callback before synchronous Task");
        if (this.mListener != null) {
            mListener.onGeekEvent();
        }
    }

    public static void main(String[] args)
    {
        synchronousCallback obj = new synchronousCallback();
        OnGeekEventListener mListener = new A();
        obj.registerOnGeekEventListener(mListener);
        obj.doGeekStuff();
    }
}

class A implements OnGeekEventListener {

    @Override
    public void onGeekEvent()
    {
        System.out.println("Performing callback after synchronous Task");
    }
}
