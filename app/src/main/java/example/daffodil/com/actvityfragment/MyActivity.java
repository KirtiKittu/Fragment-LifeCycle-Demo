package example.daffodil.com.actvityfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MyActivity extends  Activity  {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("XYZ", "On Create Activity");
        setContentView(R.layout.activity_my);

            // get an instance of FragmentTransaction from your Activity
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            //add a fragment
            Fragment1 fragobj = new Fragment1();
            ft.add(R.id.fragment_container,fragobj);
            ft.addToBackStack("Frag0");
            ft.commit();

        }
    @Override
    protected void onStart() {
        Log.e("XYZ", "On start Activity");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("XYZ", "On Resume Activity");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e("XYZ", "On Restart Activity");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Log.e("XYZ", "On Stop Activity");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("XYZ", "On Destroy Activity");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:

                //Toast on settings tab , if selected
                toast= Toast.makeText(getApplicationContext(), "Menu is selected ", Toast.LENGTH_LONG);
                toast.show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
     }
}




