package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {

    public WordAdaptor (Activity context, ArrayList<Word> word) {
        super(context, 0, word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miowkText = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miowkText.setText(currentWord.getMiwokTranslation());

        TextView defaultText = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultText.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
