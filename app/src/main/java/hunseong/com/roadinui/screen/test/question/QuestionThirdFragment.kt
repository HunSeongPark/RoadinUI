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
import hunseong.com.roadinui.databinding.FragmentQuestionThirdBinding

class QuestionThirdFragment : Fragment() {

    private lateinit var binding: FragmentQuestionThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionThirdBinding.inflate(LayoutInflater.from(context),container,false)
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
            findNavController().navigate(QuestionThirdFragmentDirections.questionThirdToMain())
        }

        binding.firstAnswer.setOnClickListener {
            findNavController().navigate(QuestionThirdFragmentDirections.questionThirdToFourth())
        }
        binding.secondAnswer.setOnClickListener {
            findNavController().navigate(QuestionThirdFragmentDirections.questionThirdToFourth())

        }
        binding.thirdAnswer.setOnClickListener {
            findNavController().navigate(QuestionThirdFragmentDirections.questionThirdToFourth())

        }
        binding.fourthAnswer.setOnClickListener {
            findNavController().navigate(QuestionThirdFragmentDirections.questionThirdToFourth())

        }
    }
}