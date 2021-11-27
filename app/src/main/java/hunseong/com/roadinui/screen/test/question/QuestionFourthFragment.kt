package hunseong.com.roadinui.screen.test.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import hunseong.com.roadinui.R
import hunseong.com.roadinui.databinding.FragmentQuestionFirstBinding
import hunseong.com.roadinui.databinding.FragmentQuestionFourthBinding
import hunseong.com.roadinui.databinding.FragmentQuestionSecondBinding
import hunseong.com.roadinui.databinding.FragmentQuestionThirdBinding

class QuestionFourthFragment : Fragment() {

    private lateinit var binding: FragmentQuestionFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionFourthBinding.inflate(LayoutInflater.from(context),container,false)
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
            findNavController().navigate(QuestionFourthFragmentDirections.questionFourthToMain())
        }

        binding.firstAnswer.setOnClickListener {
            findNavController().navigate(QuestionFourthFragmentDirections.questionFourthToResult())
        }
        binding.secondAnswer.setOnClickListener {
            findNavController().navigate(QuestionFourthFragmentDirections.questionFourthToResult())

        }
        binding.thirdAnswer.setOnClickListener {
            findNavController().navigate(QuestionFourthFragmentDirections.questionFourthToResult())

        }
        binding.fourthAnswer.setOnClickListener {
            findNavController().navigate(QuestionFourthFragmentDirections.questionFourthToResult())

        }
    }
}