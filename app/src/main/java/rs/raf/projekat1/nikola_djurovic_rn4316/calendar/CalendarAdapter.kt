package rs.raf.projekat1.nikola_djurovic_rn4316.calendar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import rs.raf.projekat1.nikola_djurovic_rn4316.R

class CalendarAdapter(
    private val daysOfMonth: Array<String>,
//    private val onItemClick: OnItemClickListener
) :
    RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder>() {

    class CalendarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvDayOfMonth: TextView = itemView.findViewById(R.id.tvCell)
        var onItemClick: (() -> Unit)? = null

        init {
            tvDayOfMonth
            itemView.setOnClickListener {
                this.onItemClick?.invoke()
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CalendarViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.layout_calendar_cell, viewGroup, false)

//        val layoutParams: ViewGroup.LayoutParams = view.layoutParams
//        layoutParams.height = (viewGroup.height * 0.16666667).toInt()

        return CalendarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.tvDayOfMonth.text = daysOfMonth[position]
    }

    override fun getItemCount(): Int = daysOfMonth.size

//    fun onItemClickListener{
//        onItemClickListener.onItemClick(daysOfMonth)
//        //  Hmmmmmmmm?
//    }

}
