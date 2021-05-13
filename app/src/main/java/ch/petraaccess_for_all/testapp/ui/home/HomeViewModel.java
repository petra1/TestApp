package ch.petraaccess_for_all.testapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import ch.petraaccess_for_all.testapp.R;


public class HomeViewModel extends ViewModel {

    private final MutableLiveData<Integer> mText;


    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.welcome);
    }



    public LiveData<Integer> getText() {
        return mText;
    }
}