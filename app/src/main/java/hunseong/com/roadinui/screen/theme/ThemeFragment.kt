package hunseong.com.roadinui.screen.theme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import hunseong.com.roadinui.R
import hunseong.com.roadinui.databinding.FragmentMyBinding
import hunseong.com.roadinui.databinding.FragmentThemeBinding

class ThemeFragment : Fragment() {

    private lateinit var binding: FragmentThemeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThemeBinding.inflate(LayoutInflater.from(context),container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}