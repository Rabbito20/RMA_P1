package rs.raf.projekat1.nikola_djurovic_rn4316.daily_plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import rs.raf.projekat1.nikola_djurovic_rn4316.R

class DailyFragment : Fragment() {

    private lateinit var binding: DailyFragment
//    private val btnDaily: Button? = binding.view?.findViewById(R.id.btnDaily)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
