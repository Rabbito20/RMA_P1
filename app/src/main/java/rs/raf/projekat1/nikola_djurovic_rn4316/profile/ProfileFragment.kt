package rs.raf.projekat1.nikola_djurovic_rn4316.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import rs.raf.projekat1.nikola_djurovic_rn4316.R

class ProfileFragment : Fragment() {

    //    private lateinit var binding: FragmentProfileBinding
//    private var btnPassChange: Button? = binding.btnChangePassword
    private var view: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = FragmentProfileBinding.inflate(layoutInflater)
//        view = binding.root
//        setContentView(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        btnPassChange?.setOnClickListener {
//            Log.e("Djura", "Change password clicked!")
//        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
