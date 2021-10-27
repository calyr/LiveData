package app.bo.com.ucb.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var AddButton: Button
    lateinit var CounterTextView: TextView
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddButton = findViewById(R.id.add_button)
        CounterTextView = findViewById(R.id.counter_text_view)

        AddButton.setOnClickListener {
            counter++
            CounterTextView.text = counter.toString()
        }
    }
}