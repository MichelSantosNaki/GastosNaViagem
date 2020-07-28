package micheldev.com.gastosnaviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_calcular.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id==R.id.btn_calcular){
            calculate()
        }
    }

    private  fun calculate(){
        val distance = editDistanceTotal.text.toString().toFloat()
        val preco = editPreco.text.toString().toFloat()
        val autonomy = editAutonomia.text.toString().toFloat()

        val totalPay = (distance/autonomy)*preco

        textPrecoLitro.text = "R$${"%.2f".format(totalPay)}"
    }
}




