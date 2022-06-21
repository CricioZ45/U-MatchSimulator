package plat.CC.u_matchsimulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import plat.CC.u_matchsimulator.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}