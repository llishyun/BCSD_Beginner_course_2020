package com.example.navigationdrawerapp2.ui.menuA;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navigationdrawerapp2.MainActivity;
import com.example.navigationdrawerapp2.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MenuAFragment extends Fragment {




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_menua, container, false);

        final ArrayList<String> items = new ArrayList<>();
        final ListView listView=(ListView)root.findViewById(R.id.nameListView);
        final Button addButton = (Button) root.findViewById(R.id.nameAddButton);
        final EditText editText = (EditText)root.findViewById(R.id.editTextPersonName) ;

        final ArrayAdapter Adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,items);
        listView.setAdapter(Adapter);

        addButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length()!=0){
                    items.add(text);
                    editText.setText("");
                    Adapter.notifyDataSetChanged();
                }

            }
        });
        return root;

    }



}