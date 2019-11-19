package com.example.listfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

public class MyListFragment extends ListFragment
{
    private String[] valores = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 8"};
    private OnSelectedItemListener listener;

    @Override
    public void onCreate(Bundle savedInstaceState)
    {
        super.onCreate(savedInstaceState);

        setListAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, valores));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        listener.OnSelectedItemListener(valores[position]);
    }

    @Override
    public void onAttach(@NonNull Context context)
    {
        super.onAttach(context);

        listener = (OnSelectedItemListener)context;
    }
}
