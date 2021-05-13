package ch.petraaccess_for_all.testapp.ui.home;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ResourceBundle;

import ch.petraaccess_for_all.testapp.R;


public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;


    public HomeViewModel() {
        mText = new MutableLiveData<> ();
            
        mText.setValue(content().getResources().getString(R.string.welcome));
    }



    public LiveData<String> getText() {
        return mText;
    }
}