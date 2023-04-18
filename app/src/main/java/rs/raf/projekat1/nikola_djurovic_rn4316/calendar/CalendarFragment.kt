package rs.raf.projekat1.nikola_djurovic_rn4316.calendar

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import rs.raf.projekat1.nikola_djurovic_rn4316.R
import rs.raf.projekat1.nikola_djurovic_rn4316.databinding.ActivityMainBinding
import java.time.LocalDate
import java.time.YearMonth
import java.time.format.DateTimeFormatter

class CalendarFragment : Fragment() {

    private lateinit var binding: CalendarFragment

//    private var tvMonthYear: TextView? = binding.view?.findViewById(R.id.tvMonthDate)
//    var calendarRecyclerView: RecyclerView? = view?.findViewById(R.id.rvCalendar)!!
    lateinit var selectedDate: LocalDate


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        initWidgets()
//        selectedDate = LocalDate.now()
//        setMonthView(selectedDate)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calendar, container, false)
    }

    /*@RequiresApi(Build.VERSION_CODES.O)
    private fun setMonthView(date: LocalDate) {
        tvMonthYear = monthYearFormatter(date)
    }*/

    /*@RequiresApi(Build.VERSION_CODES.O)
    fun daysInMonthArray(date: LocalDate): Array<List<String>> {
        val daysInMonthArray: Array<List<String>> = emptyArray()
        val yearMonth = YearMonth.from(date)

        val daysInMonth = yearMonth.lengthOfMonth()

        val firstOfMonth = selectedDate.withDayOfMonth(1)
        val dayOfWeek = firstOfMonth.dayOfWeek.value

        var i = 1
        while (i <= 42) {
            if (i <= dayOfWeek || i > daysInMonth + dayOfWeek) {
                daysInMonthArray[i] = listOf("")
            } else {
                daysInMonthArray[i] = listOf((i + dayOfWeek).toString())
            }
            i++
        }

        return daysInMonthArray
    }*/

    @RequiresApi(Build.VERSION_CODES.O)
    private fun monthYearFormatter(date: LocalDate): String {
        val formatter = DateTimeFormatter.ofPattern("MMMM yyyy")
        return date.format(formatter)
    }

    /*fun initWidgets() {
//        calendarRecyclerView.
//        tvMonthYear =
    }*/

    companion object {
        @JvmStatic
        fun newInstance() =
            CalendarFragment().apply {
                arguments = Bundle()
            }
    }
}
