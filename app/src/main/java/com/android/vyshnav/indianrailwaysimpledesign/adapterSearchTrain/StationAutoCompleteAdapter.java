package com.android.vyshnav.indianrailwaysimpledesign.adapterSearchTrain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain.Station;

import java.util.ArrayList;
import java.util.List;

import io.realm.Case;
import io.realm.Realm;



public class StationAutoCompleteAdapter extends BaseAdapter implements Filterable {

    private Context mContext;
    private Realm mRealm;
    private List<Station> mResult = new ArrayList<>();

    public StationAutoCompleteAdapter(Context context, Realm realm) {
        mContext = context;
        mRealm = realm;
    }

    @Override
    public int getCount() {
        return mResult.size();
    }

    @Override
    public Station getItem(int index) {
        return mResult.get(index);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(android.R.layout.simple_spinner_dropdown_item, parent, false);
        }
        ((TextView) convertView.findViewById(android.R.id.text1)).setText(getItem(position).getName());
        return convertView;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                return null;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                // filter data in UI thread instead of background one because of Realm limitation:
                // the data cannot be passed across threads
                if (constraint != null) {
                    String query = constraint.toString().toLowerCase();
                    mResult = filterCountries(query);
                    notifyDataSetChanged();
                } else {
                    notifyDataSetInvalidated();
                }
            }};
    }

    @NonNull
    private List<Station> filterCountries(String query) {

        return mRealm
                .where(Station.class)
                .beginsWith("name", query,  Case.INSENSITIVE)
                .findAll();
    }

}
