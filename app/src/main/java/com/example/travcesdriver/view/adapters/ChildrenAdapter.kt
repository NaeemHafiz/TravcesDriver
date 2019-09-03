package com.example.travcesdriver.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.travcesdriver.R
import com.example.travcesdriver.data.remote.travces.model.data.GetChildrenData
import com.example.travcesdriver.view.fragments.dashboard.HomeFragment


class ChildrenAdapter(
    var context: Context,
    var childrenList: List<GetChildrenData>,
    var callback: HomeFragment
) :
    RecyclerView.Adapter<ChildrenAdapter.ViewHolder>() {

    override fun onCreateViewHolder(container: ViewGroup, i: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.row_item_children_list,
                container,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, i: Int) = holder.bind(i)

    override fun getItemCount(): Int = 5

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //        var tvChildName = itemView.findViewById(R.id.tvchildname) as TextView
//        var tvpickuplocation = itemView.findViewById(R.id.tvpicklocation) as TextView
//        var tvdroplocation = itemView.findViewById(R.id.tvdroplocation) as TextView
//        var btnpick = itemView.findViewById(R.id.btnpick) as Button
//        var btndrop = itemView.findViewById(R.id.btndrop) as Button
        var cvItem = itemView.findViewById(R.id.cvitemClick) as CardView

        fun bind(pos: Int) {
//            tvChildName.text = childrenList[pos].fname + " " + childrenList[pos].lname
//            tvpickuplocation.text = "Pickup Location: " + childrenList[pos].pickup_location
//            tvdroplocation.text = "Drop Location: " + childrenList[pos].drop_location
            initClickListeners()
        }

        private fun initClickListeners() {
            cvItem.setOnClickListener {
                callback.onItemClicked(adapterPosition)

            }
        }
    }

    interface Callback {
        fun onItemClicked(pos: Int)
        fun onDeleteClicked(pos: Int)
        fun oncvItemClicked(pos: Int)
    }
}