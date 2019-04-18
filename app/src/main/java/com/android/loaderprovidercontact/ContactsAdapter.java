package com.android.loaderprovidercontact;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactsAdapter extends CursorAdapter {
    private LayoutInflater mInflater;
    public ContactsAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
        mInflater =LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return super.getCount();

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View view=null;
        viewHolder holder=null;
        if(view==null)
        {
            view =mInflater.inflate(R.layout.itemcontacts,null);
            holder=new viewHolder();
            holder.txtTen=(TextView) view.findViewById(R.id.ten);
            holder.txtSdt=(TextView) view.findViewById(R.id.sdt);
            view.setTag(holder);
        }else{
            holder = (viewHolder) view.getTag();
        }

        String ten = cursor.getString(cursor.getColumnIndex(ContactsContract.Data.DISPLAY_NAME));
        String sdt = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
        holder.txtTen.setText(ten);
        holder.txtSdt.setText(sdt);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

    }
    public static class viewHolder{
        TextView txtTen;
        TextView txtSdt;
    }
}
