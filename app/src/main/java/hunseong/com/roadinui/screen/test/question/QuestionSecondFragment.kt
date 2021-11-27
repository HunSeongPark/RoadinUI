package hunseong.com.roadinui.screen.test.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import hunseong.com.roadinui.R
import hunseong.com.roadinui.databinding.FragmentQuestionFirstBinding
import hunseong.com.roadinui.databinding.FragmentQuestionSecondBinding

class QuestionSecondFragment : Fragment() {

    private lateinit var binding: FragmentQuestionSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionSecondBinding.inflate(LayoutInflater.from(context),container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.cancelBtn.setOnClickListener {
            findNavController().navigate(QuestionSecondFragmentDirections.questionSecondToMain())
        }

        binding.firstAnswer.setOnClickListener {
            findNavController().navigate(QuestionSecondFragmentDirections.questionSecondToThird())
        }
        binding.secondAnswer.setOnClickListener {
            findNavController().navigate(QuestionSecondFragmentDirections.questionSecondToThird())
        }
        binding.thirdAnswer.setOnClickListener {
            findNavController().navigate(QuestionSecondFragmentDirections.questionSecondToThird())
        }
        binding.fourthAnswer.setOnClickListener {
            findNavController().navigate(QuestionSecondFragmentDirections.questionSecondToThird())
        }
    }
}