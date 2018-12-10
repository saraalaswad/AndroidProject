package DetailFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saraalaswad.moviebox.R;
import com.squareup.picasso.Picasso;

public class PopularityFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.popularity_fragment, container, false);
        return view;
    }

    public void set_popularity(String url) {
        TextView view = (TextView) getView().findViewById(R.id.movie_popularity);
    }



}