package rs.raf.projekat1.nikola_djurovic_rn4316.daily_plan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import rs.raf.projekat1.nikola_djurovic_rn4316.R
import rs.raf.projekat1.nikola_djurovic_rn4316.calendar.CalendarFragment
import rs.raf.projekat1.nikola_djurovic_rn4316.databinding.ActivityLoginBinding

class DailyFragment : Fragment() {

    private lateinit var binding: DailyFragment
//    private val btnDaily: Button? = binding.view?.findViewById(R.id.btnDaily)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding.view?.findViewById<Button>(R.id.btnDaily)?.setOnClickListener {
//            Log.e("Djura", "Daily -> pressed!")
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DailyFragment().apply {}
    }
}
