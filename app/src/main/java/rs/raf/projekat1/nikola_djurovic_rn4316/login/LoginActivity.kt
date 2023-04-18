package rs.raf.projekat1.nikola_djurovic_rn4316.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import rs.raf.projekat1.nikola_djurovic_rn4316.MainActivity
import rs.raf.projekat1.nikola_djurovic_rn4316.R

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LoginActivity
//    private val btnLogin: Button? = binding.findViewById(R.id.btnLogin)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /*binding.findViewById<Button>(R.id.btnLogin)?.setOnClickListener {
            //  TODO
            Log.e("Djura", "btnLogin -> Clicked!")
        }*/

         /*
         TODO: For login
          U onClickListener-u:
            val intentLogin = Intent(this, MainActivity::class.java)
            startActivity(intentLogin)
          */
    }
}
