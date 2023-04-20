package rs.raf.projekat1.nikola_djurovic_rn4316

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import rs.raf.projekat1.nikola_djurovic_rn4316.login.LoginActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler(Looper.myLooper()!!)
        handler.postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
//            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            //  TODO: Remove delay
        }, 2000)
    }
}