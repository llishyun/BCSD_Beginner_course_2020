package com.example.navigationdrawerapp2.ui.menuB;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navigationdrawerapp2.R;

public class MenuBFragment extends Fragment {

    private int a;
    private int where = 0;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menub, container, false);

        final Button button1 = (Button) root.findViewById(R.id.button1);
        final Button button2 = (Button) root.findViewById(R.id.button2);
        final Button button3 = (Button) root.findViewById(R.id.button3);
        final Button button4 = (Button) root.findViewById(R.id.button4);
        final Button button5 = (Button) root.findViewById(R.id.button5);
        final Button button6 = (Button) root.findViewById(R.id.button6);
        final Button button7 = (Button) root.findViewById(R.id.button7);
        final Button button8 = (Button) root.findViewById(R.id.button8);
        final Button button9 = (Button) root.findViewById(R.id.button9);
        final Button button0 = (Button) root.findViewById(R.id.button0);
        final Button buttonadd = (Button) root.findViewById(R.id.buttonPlus);
        final Button buttondel = (Button) root.findViewById(R.id.buttonMinus);
        final Button buttonmul = (Button) root.findViewById(R.id.buttonMultiply);
        final Button buttondiv = (Button) root.findViewById(R.id.buttonDiv);
        final Button buttonresult = (Button) root.findViewById(R.id.resultButton);
        final Button buttonclear=(Button)root.findViewById(R.id.clearButton);

        final EditText edit = (EditText)root.findViewById(R.id.editTextResult);

        View.OnClickListener cl=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==button1){
                    edit.setText(edit.getText().toString()+1);
                }
                else if(v==button2){
                    edit.setText(edit.getText().toString()+2);
                }
                else if(v==button3){
                    edit.setText(edit.getText().toString()+3);
                }
                else if(v==button4){
                    edit.setText(edit.getText().toString()+4);
                }
                else if(v==button5){
                    edit.setText(edit.getText().toString()+5);
                }
                else if(v==button6){
                    edit.setText(edit.getText().toString()+6);
                }
                else if(v==button7){
                    edit.setText(edit.getText().toString()+7);
                }
                else if(v==button8){
                    edit.setText(edit.getText().toString()+8);
                }
                else if(v==button9){
                    edit.setText(edit.getText().toString()+9);
                }
                else if(v==button0){
                    edit.setText(edit.getText().toString()+0);
                }

                else if(v==buttonadd){
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where =1;
                }

                else if(v==buttondel){
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where =2;
                }

                else if(v==buttonmul){
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where =3;
                }

                else if(v==buttondiv){
                    a = Integer.parseInt(edit.getText().toString().trim());
                    edit.setText("");
                    where =4;
                }


                else if(v==buttonresult){

                    //더하기
                    if(where==1){
                        a = a + Integer.parseInt(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }
                    //빼기
                    else if(where==2){
                        a = a - Integer.valueOf(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }
                    //곱하기
                    else if(where==3){
                        a = a * Integer.valueOf(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }
                    //나누기
                    else if(where==4){
                        a = a / Integer.valueOf(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }

                }
                else if(v==buttonclear){
                    edit.setText("");
                }
            }
        };

        button1.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        button3.setOnClickListener(cl);
        button4.setOnClickListener(cl);
        button5.setOnClickListener(cl);
        button6.setOnClickListener(cl);
        button7.setOnClickListener(cl);
        button8.setOnClickListener(cl);
        button9.setOnClickListener(cl);
        button0.setOnClickListener(cl);
        buttonadd.setOnClickListener(cl);
        buttondel.setOnClickListener(cl);
        buttonmul.setOnClickListener(cl);
        buttondiv.setOnClickListener(cl);
        buttonresult.setOnClickListener(cl);
        buttonclear.setOnClickListener(cl);

        return root;
    }


}