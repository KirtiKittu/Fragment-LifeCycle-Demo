package example.daffodil.com.actvityfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment3 extends Fragment implements View.OnClickListener {


Button btnback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("XYZ", "On create View Fragment 3");
        return inflater.inflate(R.layout.fragment_3, container, false);


    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.i("XYZ", "On View Created Fragment 3");
        super.onViewCreated(view, savedInstanceState);
        btnback = (Button) view.findViewById(R.id.buttonback);
        btnback.setOnClickListener(this);
        setHasOptionsMenu(true);

    }

    @Override
    public void onClick(View view) {
        FragmentManager fm=getActivity().getFragmentManager();
        fm.popBackStack ("Frag1", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
    @Override
    public void onAttach(Activity activity) {
        Log.i("XYZ", "On attach Fragment 3");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("XYZ", "On Create Fragment 3");
        super.onCreate(savedInstanceState);
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("XYZ", "On Activity Created Fragment 3");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("XYZ", "On Start Fragment 3");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("XYZ", "On Resume Fragment 3");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("XYZ", "On Pause Fragment 3");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("XYZ", "On save instance State Fragment 3");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i("XYZ", "On stop Fragment 3");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("XYZ", "On Destroy View Fragment 3");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("XYZ", "On Destroy Fragment 3");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("XYZ", "On Detach Fragment 3");
        super.onDetach();
    }


}
