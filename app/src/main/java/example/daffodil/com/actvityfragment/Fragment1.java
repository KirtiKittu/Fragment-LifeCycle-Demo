package example.daffodil.com.actvityfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment1 extends Fragment implements View.OnClickListener {

    Button btnedit;
    Toast toast;
    Button button;
    TextView addTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("XYZ", "On create View Fragment 1");

        return inflater.inflate(R.layout.fragment_1, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("XYZ", "On View Created Fragment");
        addTextView = (TextView)view.findViewById(R.id.iadd);
        btnedit = (Button) view.findViewById(R.id.btn);
        button = (Button) view.findViewById(R.id.btnFrag);
        button.setOnClickListener(this);
        setHasOptionsMenu(true);
        btnedit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                toast = Toast.makeText(getActivity().getApplicationContext(), "Choose picture to update", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
    @Override
    public void onAttach(Activity activity) {
        Log.i("XYZ", "On attach Fragment 1");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("XYZ", "On Create Fragment 1");
        super.onCreate(savedInstanceState);
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("XYZ", "On Activity Created Fragment 1");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("XYZ", "On Start Fragment 1");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("XYZ", "On Resume Fragment 1");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("XYZ", "On Pause Fragment 1");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("XYZ", "On save instance State Fragment 1");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i("XYZ", "On stop Fragment 1");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("XYZ", "On Destroy View Fragment 1");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("XYZ", "On Destroy Fragment 1");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("XYZ", "On Detach Fragment 1");
        super.onDetach();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFrag: {
                Fragment2 fragobj2 = new Fragment2();

                //Sending data to fragment
                Bundle bundle = new Bundle();
                bundle.putString("address", addTextView.getText().toString());
                fragobj2.setArguments(bundle);

                //Fragment manager get called
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack("Frag1");
                ft.replace(R.id.fragment_container, fragobj2);
                ft.commit();

                     }
               }

        }

    }




