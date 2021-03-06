package uburti.luca.udacitycapstone;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.DayViewHolder> {
    Calendar calendar;

    public DayAdapter() {
        calendar = Calendar.getInstance();
    }

    @NonNull
    @Override
    public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.day_item, parent, false);
        return new DayViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DayViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        DayViewHolder(View v){
            super(v);
            tv=v.findViewById(R.id.day_item_date_tv);
        }
    }
}
