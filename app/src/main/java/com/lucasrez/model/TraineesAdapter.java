package com.lucasrez.model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lucasrez.recyclerviewproj.R;

import java.util.List;

/**
 * Created by lucasrez on 5/30/16.
 */
public class TraineesAdapter extends RecyclerView.Adapter<TraineesAdapter.TraineeViewHolder> {
    private List<Trainees> traineesList;

    public static class TraineeViewHolder extends RecyclerView.ViewHolder {
        public TextView nome;
        public TextView idade;

        public TraineeViewHolder(View itemView) {
            super(itemView);
            nome = (TextView) itemView.findViewById(R.id.item_trainee_tv_nome);
            idade = (TextView) itemView.findViewById(R.id.item_trainee_tv_idade);
        }
    }

    public TraineesAdapter(List<Trainees> traineesList) {
        this.traineesList = traineesList;
    }

    @Override
    public TraineeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.trainee_item, parent, false);
        return new TraineeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TraineeViewHolder holder, int position) {
        Trainees trainee = traineesList.get(position);
        holder.nome.setText(trainee.getNome());
        holder.idade.setText(trainee.getIdade());
    }

    @Override
    public int getItemCount() {
        return traineesList.size();
    }
}
