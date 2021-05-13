package ch.petraaccess_for_all.testapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/*
 * A simple {@link Fragment} subclass.
 * Use the {@link WebViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WebViewFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WebViewFragment() {
        // Required empty public constructor
    }

     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        if (getArguments () != null) {
            mParam1 = getArguments ().getString (ARG_PARAM1);
            mParam2 = getArguments ().getString (ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate (R.layout.fragment_web_view, container, false);

        Button button1 = (Button) v.findViewById (R.id.button01);
        Button button2 = (Button) v.findViewById (R.id.button02);
        final TextView textView2 = (TextView) v.findViewById (R.id.textView13);
        final TextView textView5 = (TextView) v.findViewById (R.id.textView02);
        final EditText editText1 = (EditText) v.findViewById (R.id.editText4);
        final EditText editText2 = (EditText) v.findViewById (R.id.editText);

        button1.setOnClickListener (
                new Button.OnClickListener () {
                    @Override
                    public void onClick(View view) {
                        textView2.setText (editText1.getText ());
                    }

                    public void onclick(View v) {

                    }
                }
        );

        button2.setOnClickListener (
                new Button.OnClickListener () {
                    @Override
                    public void onClick(View view) {
                        textView5.setText (editText2.getText ());
                        textView5.setContentDescription("your last name ist " + textView5.getText() );
                    }

                    public void onclick(View v) {

                    }

                }

        );


        return v;
    }
}
