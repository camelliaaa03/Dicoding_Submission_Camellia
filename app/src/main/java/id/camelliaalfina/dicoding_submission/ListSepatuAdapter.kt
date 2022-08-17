package id.camelliaalfina.dicoding_submission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSepatuAdapter(private val listSepatu: ArrayList<Sepatu>) : RecyclerView.Adapter<ListSepatuAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_sepatu, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val sepatu = listSepatu[position]
        Glide.with(holder.itemView.context)
            .load(sepatu.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = sepatu.name
        holder.tvDetail.text = sepatu.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listSepatu[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listSepatu.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Sepatu)
    }
}