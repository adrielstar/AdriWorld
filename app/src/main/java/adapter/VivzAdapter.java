package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import activity.Information;
import ga.adrielwalter.adriworld.R;

/**
 * Created by Adriel on 10/30/2015.
 */
public class VivzAdapter extends RecyclerView.Adapter<VivzAdapter.MyVieHolder> {

    private LayoutInflater inflater;

    List<Information> data = Collections.emptyList();
    public VivzAdapter(Context context, List<Information> data){
        inflater = LayoutInflater.from(context);

        this.data = data;
    }

    @Override
    public MyVieHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.custom_row, parent, false);
        MyVieHolder holder = new MyVieHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyVieHolder holder, int position) {

        Information current = data.get(position);

        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyVieHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView icon;

        public MyVieHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);

        }
    }
}
