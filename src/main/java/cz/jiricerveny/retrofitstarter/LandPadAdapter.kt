package cz.jiricerveny.retrofitstarter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class LandPadAdapter(val landPads: List<Result>): RecyclerView.Adapter<LandPadsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandPadsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return LandPadsViewHolder(view)
    }

    override fun getItemCount(): Int = landPads.size

    override fun onBindViewHolder(holder: LandPadsViewHolder, position: Int) {
        return holder.bind(landPads[position])
    }

}

class LandPadsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val name: TextView = itemView.findViewById(R.id.item_name)
    private val id: TextView = itemView.findViewById(R.id.item_id)
    private val status: TextView = itemView.findViewById(R.id.item_status)
    private val successful: TextView = itemView.findViewById(R.id.item_successful)
    private val landings: TextView = itemView.findViewById(R.id.item_landings)
    private val percentage: TextView = itemView.findViewById(R.id.item_percentage)
    private val location: TextView = itemView.findViewById(R.id.item_location)
    private val details: TextView = itemView.findViewById(R.id.item_details)

    fun bind(landPad: Result){
        name.text = landPad.full_name
        id.text = landPad.id
        status.text = landPad.status
        successful.text = landPad.successful_landings.toString()
        landings.text = landPad.attempted_landings.toString()
        percentage.text = ((landPad.successful_landings * 100) / landPad.attempted_landings).toString()
        location.text = landPad.location.name
        details.text = landPad.details
    }
}