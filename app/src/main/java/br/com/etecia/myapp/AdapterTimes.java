package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdapterTimes extends RecyclerView.Adapter<AdapterTimes.ViewHolder> {

    private Context context;
    private List<Times> lstTimes;

    public AdapterTimes(Context context, List<Times> lstTimes) {

        this.context = context;
        this.lstTimes = lstTimes;

    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_futebol, parent, false);

        return new ViewHolder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.modeloTituloFutebol.setText(lstTimes.get(position).getNome());
        holder.modeloImgFutebol.setImageResource(lstTimes.get(position).getImagemTime());
        holder.modeloDescricaoFutebol.setText(lstTimes.get(position).getLiga());
        holder.modeloImgCopaFutebol.setImageResource(lstTimes.get(position).getImagemCopa());
        holder.modeloTituloCopa.setText(lstTimes.get(position).getCopas());
    }

    @Override

    public int getItemCount(){
        return lstTimes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView modeloCardFutebol;
        ImageView modeloImgFutebol;
        TextView modeloTituloFutebol;

        TextView modeloDescricaoFutebol;

        ImageView modeloImgCopaFutebol;

        TextView modeloTituloCopa;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            modeloTituloFutebol = itemView.findViewById(R.id.modeloTituloFutebol);
            modeloImgFutebol = itemView.findViewById(R.id.modeloImgFutebol);
            modeloCardFutebol = itemView.findViewById(R.id.modeloCardFutebol);
            modeloDescricaoFutebol = itemView.findViewById(R.id.modeloDescricaoFutebol);
            modeloImgCopaFutebol = itemView.findViewById(R.id.modeloImgCopaFutebol);
            modeloTituloCopa = itemView.findViewById(R.id.modeloTituloCopa);
        }
    }
}