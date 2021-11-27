package hunseong.com.roadinui

import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val window = window
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        initNavigation()
    }

    private fun initNavigation() {
        val navController = findNavController(R.id.main_nav_host)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav).apply {
            setupWithNavController(navController)
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.menu_test, R.id.menu_empty, R.id.menu_my, R.id.menu_theme -> {
                    bottomNav.isVisible = true
                }
                else -> {
                    bottomNav.isGone = true
                }
            }
        }
    }
}