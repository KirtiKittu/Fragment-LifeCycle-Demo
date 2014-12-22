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


public class Fragment2 extends Fragment implements View.OnClickListener {

    Button btn;
    TextView text;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("XYZ", "On create View Fragment 2");
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.i("XYZ", "On View Created Fragment 2");
        super.onViewCreated(view, savedInstanceState);
        btn = (Button) view.findViewById(R.id.button3);
        text=(TextView)view.findViewById(R.id.itxt);
        //Receiving Data from fragment
        Bundle bundle = getArguments();

        String myString = bundle.getString("address");
        text.setText(myString);
        btn.setOnClickListener(this);
        setHasOptionsMenu(true);


    }

    @Override
    public void onAttach(Activity activity) {
        Log.i("XYZ", "On attach Fragment 2");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("XYZ", "On Create Fragment 2");
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("XYZ", "On Activity Created Fragment 2");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("XYZ", "On Start Fragment 2");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("XYZ", "On Resume Fragment 2");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("XYZ", "On Pause Fragment 2");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("XYZ", "On save instance State Fragment 2");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i("XYZ", "On stop Fragment 2");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("XYZ", "On Destroy View Fragment 2");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("XYZ", "On Destroy Fragment 2");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("XYZ", "On Detach Fragment 2");
        super.onDetach();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3: {
                // Open up new fragment on click of button
                Fragment3 fragobj1 = new Fragment3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack("Frag2");
                ft.replace(R.id.fragment_container, fragobj1);
                ft.commit();

            }
        }

    }

}