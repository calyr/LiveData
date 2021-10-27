package app.bo.com.ucb.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer

class LiveDataActivity : AppCompatActivity() {

    lateinit var addBtn: Button
    lateinit var counterTv: TextView
    var counter = 0

    lateinit var liveDataString: LiveDataString
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        addBtn = findViewById(R.id.add_btn)
        counterTv = findViewById(R.id.counter_tv)

        liveDataString = LiveDataString()

        liveDataString.cadena.observe(this, Observer(::updateUi) )

        addBtn.setOnClickListener {
            counter++
            liveDataString.cambiarValor(counter.toString())
        }

    }

    fun updateUi(valor: String) {
        counterTv.text = valor
    }

}