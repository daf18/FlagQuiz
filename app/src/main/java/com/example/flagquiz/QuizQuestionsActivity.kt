package com.example.flagquiz

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int = 1
    private var mQuestionsList:ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    private var progressBar : ProgressBar? = null
    private var tvProgress : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne:TextView? = null
    private var tvOptionTwo:TextView? = null
    private var tvOptionThree:TextView? = null
    private var tvOptionFour:TextView? = null
    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        tvOptionOne = findViewById(R.id.tvOptionOne)
        tvOptionTwo = findViewById(R.id.tvOptionTwo)
        tvOptionThree = findViewById(R.id.tvOptionThree)
        tvOptionFour = findViewById(R.id.tvOptionFour)
        btnSubmit = findViewById(R.id.btnSubmit)
//we can call 'this' because class implements OnClick listener
        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

       mQuestionsList = Constants.getQuestions()

        setQuestion()


    }

    private fun setQuestion() {

        val question: Question = mQuestionsList!![mCurrentPosition - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition / ${progressBar?.max}"
        tvQuestion?.text = question.queststion
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if (mCurrentPosition == mQuestionsList!!.size){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "SUBMIT"
        }
    }
    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0,it)
        }
        tvOptionTwo?.let {
            options.add(1,it)
        }
        tvOptionThree?.let {
            options.add(2,it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }
        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            //we add this so we can edit it when an option is selected
            option.typeface = Typeface.DEFAULT
            option.background =ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }
private fun selectedOptionView(tv:TextView, selectedOptionNum: Int){
    defaultOptionsView()
    mSelectedOptionPosition = selectedOptionNum
    tv.setTextColor(Color.parseColor("#363A43"))
    tv.setTypeface(tv.typeface,Typeface.BOLD)
    tv.background=ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
}
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tvOptionOne -> {
                tvOptionOne?.let {
                    //change the appearance of selected option and change the selectedOptionNum
                    selectedOptionView(it,1)
                }
            }
            R.id.tvOptionTwo -> {
                tvOptionTwo?.let {
                    //change the appearance of selected option and change the selectedOptionNum
                    selectedOptionView(it,2)
                }
            }
            R.id.tvOptionThree -> {
                tvOptionThree?.let {
                    //change the appearance of selected option and change the selectedOptionNum
                    selectedOptionView(it,3)
                }
            }
            R.id.tvOptionFour -> {
                tvOptionFour?.let {
                    //change the appearance of selected option and change the selectedOptionNum
                    selectedOptionView(it,4)
                }
            }
            R.id.btnSubmit -> {
                //TODO: implement btn submit
            }
        }
    }
}