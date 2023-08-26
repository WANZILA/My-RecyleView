package ug.ac.myrecyleview.data

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ug.ac.myrecyleview.DetailsActivity
import ug.ac.myrecyleview.R

//if var  makes the list to be accessed inside the class
class ActivityAdapter(val context: Context, var list: ArrayList<ActivityModel>): RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    class ActivityViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.image)
        val name =  itemView.findViewById<TextView>(R.id.activity_name)
        val time = itemView.findViewById<TextView>(R.id.activity_time)

        val card = itemView.findViewById<CardView>(R.id.card_view)
    }
    //enables us to create viewHilder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null, false)
        return ActivityViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    //enables us to connect the view to data
    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.name.text= list[position].activityName
        holder.time.text = list[position].activityTime

        holder.card.setOnClickListener{
            var intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("image", list[position].image)
            intent.putExtra("activityName", list[position].activityName  )
            context.startActivity(intent)
        }
    }
}