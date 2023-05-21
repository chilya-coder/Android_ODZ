package it_school.sumdu.edu.booklibrarysqlite;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;


public class RateFragment extends Fragment {


    private static final int YES = 0;
    private static final int NO = 1;

    public RateFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.fragment_review,
                container, false);
        final RadioGroup radioGroup = rootView.findViewById(R.id.radio_group);


        radioGroup.setOnCheckedChangeListener(
                (group, checkedId) -> {
                    View radioButton = radioGroup.findViewById(checkedId);
                    int index = radioGroup.indexOfChild(radioButton);
                    TextView textView =
                            rootView.findViewById(R.id.fragment_header);
                    switch (index) {
                        case YES:
                            textView.setText(R.string.yes_message);
                            break;
                        case NO:
                            textView.setText(R.string.no_message);
                            break;
                        default:
                            break;
                    }
                });

        return rootView;
    }

    public static RateFragment newInstance() {
        return new RateFragment();
    }
}
