package vcmsa.ci.quizzapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtUsername = findViewById<EditText>(R.id.edtUsername)
        val btnStart = findViewById<Button>(R.id.btnStart)

        val username = edtUsername.text.toString()


            btnStart.setOnClickListener {
                val intent = Intent(this, QuizzActivity::class.java).putExtra("username", username)
                startActivity(intent)
                finish()
            }
    }

}