package coml.example.admin.ontap;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

// Chon adapter<VH>
public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.ViewHoder>{
    //khai báo mảng
    private List<SinhVien> sinhVienList;
  // alt+ inser 1 vs im
    public SinhVienAdapter(List<SinhVien> sinhVienList) {
        this.sinhVienList = sinhVienList;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_sinh_vien,parent,false);
        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        SinhVien sv = sinhVienList.get(position);
        holder.tvTen.setText(sv.getTen());

    }

    @Override
    public int getItemCount() {
        return sinhVienList.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder{
        //all +iner 1
        public ImageView imgAnh;
        private CheckBox cbox;
        public TextView tvTen;
        public ViewHoder(View itemView) {
            super(itemView);
            cbox = itemView.findViewById(R.id.cbox);
            imgAnh = itemView.findViewById(R.id.imgAnh);
            tvTen = itemView.findViewById(R.id.tvTen);
        }
    }
}
