package vcmsa.ci.quizzapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizzActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quizz)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvQuestions = findViewById<TextView>(R.id.tvQuestions)
        val rbtngAnswers = findViewById<RadioGroup>(R.id.rbtngAnswers)
        val btnNext = findViewById<Button>(R.id.btnNext)

        val historyquestions = arrayOf(
            "Nelson Mandela was the president in 1994",
            "The Great Wall of China is visible from space",
            "World War I ended in 1918",
            "The Cold War was a physical war",
            "The Berlin Wall fell in 1990"
        )
        val historyanswers = arrayOf(
          arrayOf("A: True", "B: False", "C: None of the above"),
                  arrayOf("A: True", "B: False", "C: None of the above") ,
            arrayOf("A: True", "B: False", "C: None of the above"),
            arrayOf("A: True", "B: False", "C: None of the above"),
            arrayOf("A: True", "B: False", "C: None of the above")
        )
        var useranswers = arrayOfNulls<String>(5)

        val correctanswers = arrayOf(
            "A: True",
            "B: False",
            "A: True",
            "B: False",
            "B: False"

        )
        var counter = 0
        btnNext.performClick()
        btnNext.setOnClickListener {
            rbtngAnswers.clearCheck()
             if (counter < 5) {
                 tvQuestions.text = historyquestions[counter]
                 for (i in 0 until rbtngAnswers.childCount) {
                     val radioButton = rbtngAnswers.getChildAt(i) as RadioButton
                     radioButton.text = historyanswers[counter][i]

                 }
                 val selectedoption = rbtngAnswers.checkedRadioButtonId
                 if (selectedoption != -1) {
                     val selectedRbtn = findViewById<RadioButton>(selectedoption)
                     
                 }

             }
        }

    }
}