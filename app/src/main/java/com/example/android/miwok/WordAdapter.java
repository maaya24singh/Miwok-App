package com.example.android.miwok;

import android.app.Activity;
import android.provider.UserDictionary;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorId;
    public WordAdapter(Activity context, ArrayList<Word> addWord, int colorid){
        super(context, 0, addWord);
        colorId = colorid;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);

        ImageView iconview = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.has_image()){
            iconview.setImageResource(currentWord.getImage());
        }
        else{
            iconview.setVisibility(View.GONE);
        }

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);

        miwokTextView.setText(currentWord.getMiwokTranslate());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text);

        defaultTextView.setText(currentWord.getDefaultTranslate());

        View textcontainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorId);
        textcontainer.setBackgroundColor(color);

        return listItemView;
    }
}
