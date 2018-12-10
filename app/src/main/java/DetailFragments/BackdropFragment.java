package DetailFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.saraalaswad.moviebox.R;
import com.squareup.picasso.Picasso;

public class BackdropFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.backdrop, container, false);
        return view;
    }

    public void set_backdrop(String url) {
        ImageView view = (ImageView) getView().findViewById(R.id.movie_backdrop);
        Picasso.get()
                .load(url)
                .into(view);
    }



}