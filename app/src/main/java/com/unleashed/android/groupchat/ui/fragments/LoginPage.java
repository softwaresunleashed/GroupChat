package com.unleashed.android.groupchat.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.unleashed.android.groupchat.R;


public class LoginPage extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_SECTION_NUMBER = "section_number";


    private Button btnJoin;
    private EditText txtName;
    private EditText txtPhNum;




    public static LoginPage newInstance(int section) {
        LoginPage fragment = new LoginPage();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, section);
        fragment.setArguments(args);
        return fragment;
    }

    public LoginPage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_login_page, container, false);

        btnJoin = (Button)rootView.findViewById(R.id.btnJoin);
        txtName = (EditText)rootView.findViewById(R.id.name);
        //txtPhNum= (EditText)rootView.findViewById(R.id.phnum);

        // Hiding the action bar
        //((ActionBarActivity)getActivity()).getSupportActionBar().hide();

        btnJoin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (txtName.getText().toString().trim().length() > 0) {

                    String name = txtName.getText().toString().trim();
                    //String phone = txtPhNum.getText().toString().trim();

                    // Go to next step only when both Screen Name and Phone Numbers are entered.
                    if(name != "" /* && phone != ""  */){

                        // Code to mode to another tab.
                        ViewPager viewPager = (ViewPager) getActivity().findViewById(R.id.pager);


//                    Intent intent = new Intent(ChatWindow.this,
//                            MainActivity.class);
//                    intent.putExtra("name", name);
//
//                    startActivity(intent);

                        viewPager.setCurrentItem(1, true);





                    }


                } else {
                    Toast.makeText(rootView.getContext(),
                            "Please enter your name", Toast.LENGTH_LONG).show();
                }
            }
        });


        return rootView;

    }


}
