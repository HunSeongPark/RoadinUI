package hunseong.com.roadinui.screen.test.question

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import hunseong.com.roadinui.R
import hunseong.com.roadinui.databinding.FragmentQuestionFirstBinding

class QuestionFirstFragment : Fragment() {

    private lateinit var binding: FragmentQuestionFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionFirstBinding.inflate(LayoutInflater.from(context),container,false)
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
                view.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
            }
        }

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.cancelBtn.setOnClickListener {
            findNavController().navigate(QuestionFirstFragmentDirections.questionFirstToMain())
        }

        binding.firstAnswer.setOnClickListener {
            findNavController().navigate(QuestionFirstFragmentDirections.questionFirstToSecond())
        }
        binding.secondAnswer.setOnClickListener {
            findNavController().navigate(QuestionFirstFragmentDirections.questionFirstToSecond())
        }
        binding.thirdAnswer.setOnClickListener {
            findNavController().navigate(QuestionFirstFragmentDirections.questionFirstToSecond())
        }
        binding.fourthAnswer.setOnClickListener {
            findNavController().navigate(QuestionFirstFragmentDirections.questionFirstToSecond())
        }
    }
}