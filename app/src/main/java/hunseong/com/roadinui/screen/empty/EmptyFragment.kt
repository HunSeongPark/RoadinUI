package hunseong.com.roadinui.screen.empty

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import hunseong.com.roadinui.R
import hunseong.com.roadinui.databinding.FragmentEmptyBinding
import hunseong.com.roadinui.databinding.FragmentTestBinding

class EmptyFragment : Fragment() {

    private lateinit var binding: FragmentEmptyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmptyBinding.inflate(LayoutInflater.from(context),container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}