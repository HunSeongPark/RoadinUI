package hunseong.com.roadinui.screen.test

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import hunseong.com.roadinui.R
import hunseong.com.roadinui.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private lateinit var binding: FragmentTestBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestBinding.inflate(LayoutInflater.from(context),container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val view = requireActivity().window.decorView

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if(view!=null) {
                view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }
        }

        binding.startBtn.setOnClickListener {
            binding.homeClose.animate().alpha(0f).duration = 1000
            binding.homeOpen.animate().alpha(1f).duration = 1000
            binding.startBtn.isClickable = false

            Handler().postDelayed({
                findNavController().navigate(TestFragmentDirections.menuTestToTestQuestion())
                binding.startBtn.isClickable = true
            }, 1100)
        }


    }
}