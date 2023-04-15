package rs.raf.projekat1.nikola_djurovic_rn4316

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import rs.raf.projekat1.nikola_djurovic_rn4316.calendar.CalendarFragment
import rs.raf.projekat1.nikola_djurovic_rn4316.daily_plan.DailyFragment
import rs.raf.projekat1.nikola_djurovic_rn4316.databinding.ActivityMainBinding
import rs.raf.projekat1.nikola_djurovic_rn4316.profile.ProfileFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        replaceFragment(CalendarFragment())

        binding.bottomNavView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.bottom_calendar -> replaceFragment(CalendarFragment())
                R.id.bottom_dailyPlan -> replaceFragment(DailyFragment())
                R.id.bottom_profile -> replaceFragment(ProfileFragment())

                else -> {}
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.flMain, fragment)

        fragmentTransaction.commit()
    }
}