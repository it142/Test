package www.kat.com.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by katerina on 5/9/2017.
 */

public class PlaceholderFragment extends Fragment{

    public PlaceholderFragment(){

    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public void onStart(){
        super.onStart();
        fetchMerchants();
    }

    private void fetchMerchants(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

    }

}
