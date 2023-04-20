package rs.raf.projekat1.nikola_djurovic_rn4316.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rs.raf.projekat1.nikola_djurovic_rn4316.MainActivity
import rs.raf.projekat1.nikola_djurovic_rn4316.R
import rs.raf.projekat1.nikola_djurovic_rn4316.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val password: String = "pass123"
    private val email: String = "student@raf.rs"
    private val username: String = "Nikola"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail: EditText = findViewById(R.id.etEmailLogin)
        val etPasswordLogin: EditText = findViewById(R.id.etPasswordLogin)
        val etUser: EditText = findViewById<EditText?>(R.id.etUsernameLogin)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {

            val intentLogin = Intent(this, MainActivity::class.java)

            if (etPasswordLogin.text.toString() == password &&
                etEmail.text.toString() == email && etUser.text.toString() == username
            ) {
                startActivity(intentLogin)
                finish()
            } else {
                Toast.makeText(
                    applicationContext,
                    resources.getText(R.string.login_failed),
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }
}
