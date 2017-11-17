package com.android.vyshnav.indianrailwaysimpledesign.adapterSearchTrain;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.android.vyshnav.indianrailwaysimpledesign.MainActivity;
import com.android.vyshnav.indianrailwaysimpledesign.R;
import com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain.Train;

import java.util.ArrayList;

import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;


public class SearchResultsDataAdapter extends RealmRecyclerViewAdapter<Train,SearchResultsDataAdapter.ViewHolder> {
    private OrderedRealmCollection<Train> al_trains;
    private final MainActivity activity;


    public SearchResultsDataAdapter(MainActivity activity, OrderedRealmCollection<Train> al_trains) {
        super(activity ,al_trains, true);
        this.al_trains = al_trains;
        this.activity = activity;

    }

    @Override
    public SearchResultsDataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_results_card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SearchResultsDataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_TrainNumber.setText(al_trains.get(i).getNumber());
        viewHolder.tv_TrainName.setText(al_trains.get(i).getName());
        viewHolder.tv_DestArrivalTime.setText(al_trains.get(i).getDestArrivalTime());
        viewHolder.tv_SrcDeptTime.setText(al_trains.get(i).getSrcDepartureTime());
        viewHolder.tv_TravelTime.setText(al_trains.get(i).getTravelTime());

        if(al_trains.get(i).getClasses().get(0).getAvailable().equals("Y"))
            viewHolder.tv_FC.setText("FC");
        else viewHolder.tv_FC.setText(" ");

        if(al_trains.get(i).getClasses().get(1).getAvailable().equals("Y"))
            viewHolder.tv_3E.setText("3E");
        else viewHolder.tv_3E.setText(" ");

        if(al_trains.get(i).getClasses().get(2).getAvailable().equals("Y"))
            viewHolder.tv_CC.setText("CC");
        else viewHolder.tv_CC.setText(" ");

        if(al_trains.get(i).getClasses().get(3).getAvailable().equals("Y"))
            viewHolder.tv_SL.setText("SL");
        else viewHolder.tv_SL.setText(" ");

        if(al_trains.get(i).getClasses().get(4).getAvailable().equals("Y"))
            viewHolder.tv_2S.setText("2S");
        else viewHolder.tv_2S.setText(" ");

        if(al_trains.get(i).getClasses().get(5).getAvailable().equals("Y"))
            viewHolder.tv_2A.setText("2A");
        else viewHolder.tv_2A.setText(" ");

        if(al_trains.get(i).getClasses().get(6).getAvailable().equals("Y"))
            viewHolder.tv_3A.setText("3A");
        else viewHolder.tv_3A.setText(" ");

        if(al_trains.get(i).getClasses().get(7).getAvailable().equals("Y"))
            viewHolder.tv_1A.setText("1A");
        else viewHolder.tv_1A.setText(" ");



        if(al_trains.get(i).getDays().get(0).getRuns().equals("Y"))
            viewHolder.tv_M.setText("M");
        else viewHolder.tv_M.setText("-");

        if(al_trains.get(i).getDays().get(1).getRuns().equals("Y"))
            viewHolder.tv_Tu.setText("Tu");
        else viewHolder.tv_Tu.setText("-");

        if(al_trains.get(i).getDays().get(2).getRuns().equals("Y"))
            viewHolder.tv_W.setText("W");
        else viewHolder.tv_W.setText("-");

        if(al_trains.get(i).getDays().get(3).getRuns().equals("Y"))
            viewHolder.tv_Th.setText("Th");
        else viewHolder.tv_Th.setText("-");

        if(al_trains.get(i).getDays().get(4).getRuns().equals("Y"))
            viewHolder.tv_F.setText("F");
        else viewHolder.tv_F.setText("-");

        if(al_trains.get(i).getDays().get(5).getRuns().equals("Y"))
            viewHolder.tv_Sa.setText("Sa");
        else viewHolder.tv_Sa.setText("-");

        if(al_trains.get(i).getDays().get(6).getRuns().equals("Y"))
            viewHolder.tv_Su.setText("Su");
        else viewHolder.tv_Su.setText("-");


    }

    @Override
    public int getItemCount() {
        return al_trains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_TrainNumber, tv_TrainName,tv_DestArrivalTime,tv_SrcDeptTime,tv_TravelTime,tv_M,tv_Tu,tv_W,tv_Th,tv_F,tv_Sa,tv_Su,tv_FC,tv_3E,tv_CC,tv_SL,tv_2S,tv_2A,tv_3A,tv_1A;
        public ViewHolder(View view) {
            super(view);

            tv_TrainNumber = (TextView)view.findViewById(R.id.tv_TrainNumber);
            tv_TrainName = (TextView)view.findViewById(R.id.tv_TrainName);
            tv_DestArrivalTime = (TextView)view.findViewById(R.id.tv_ArrivalTime);
            tv_SrcDeptTime = (TextView)view.findViewById(R.id.tv_DeptTime);
            tv_TravelTime = (TextView)view.findViewById(R.id.tv_TravelTime);

            tv_FC = (TextView)view.findViewById(R.id.tv_FC);
            tv_3E = (TextView)view.findViewById(R.id.tv_3E);
            tv_CC = (TextView)view.findViewById(R.id.tv_CC);
            tv_SL = (TextView)view.findViewById(R.id.tv_SL);
            tv_2S = (TextView)view.findViewById(R.id.tv_2S);
            tv_2A = (TextView)view.findViewById(R.id.tv_2A);
            tv_3A = (TextView)view.findViewById(R.id.tv_3A);
            tv_1A = (TextView)view.findViewById(R.id.tv_1A);


            tv_M = (TextView)view.findViewById(R.id.tv_M);
            tv_Tu = (TextView)view.findViewById(R.id.tv_Tu);
            tv_W = (TextView)view.findViewById(R.id.tv_W);
            tv_Th = (TextView)view.findViewById(R.id.tv_Th);
            tv_F = (TextView)view.findViewById(R.id.tv_F);
            tv_Sa = (TextView)view.findViewById(R.id.tv_Sa);
            tv_Su = (TextView)view.findViewById(R.id.tv_Su);

        }
    }

}
