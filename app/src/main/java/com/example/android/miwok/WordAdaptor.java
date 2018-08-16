package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {

    public WordAdaptor (Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the word object located at the given position in the list
        Word currentWord = getItem(position);

        // find the miwok text by ID
        TextView miowkText = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // set the text in TextView to the stored miwok word in the word item
        miowkText.setText(currentWord.getMiwokTranslation());

        // find the default text by ID
        TextView defaultText = (TextView) listItemView.findViewById(R.id.default_text_view);

        // set the text in TextView to the stored default word in the word item
        defaultText.setText(currentWord.getDefaultTranslation());

        // find the ImageView by id
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        // check if the image resource is initialized
        if(currentWord.hasImage()) {

            // set the image in the layout
            image.setImageResource(currentWord.getImageResourceID());
            
            // make ImageView visible
            image.setVisibility(View.VISIBLE);
        }

        else {
            // set the ImageView to gone
            image.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
