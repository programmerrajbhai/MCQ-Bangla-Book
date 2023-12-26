package com.soft.mcqbanglabook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FulerBibago extends AppCompatActivity implements View.OnClickListener {



    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    //==============

    int score= 0;
    int totalQuestion = Fuler_bibaho_QNA.myQuestion.length;
    int currentQuestionIndex= 0;

    String selectedAnswer= "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuler_bibago);




        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);


        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);



        totalQuestionsTextView.setText("Total Question:"+totalQuestion);

        LoadNewQuestion();








    }


    private void LoadNewQuestion (){



        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }


    /*    questionTextView.setText(BoiPora_QNA.myQuestion[currentQuestionIndex]);
        ansA.setText(BoiPora_QNA.myChoices[currentQuestionIndex][0]);
        ansB.setText(BoiPora_QNA.myChoices[currentQuestionIndex][1]);
        ansC.setText(BoiPora_QNA.myChoices[currentQuestionIndex][2]);
        ansD.setText(BoiPora_QNA.myChoices[currentQuestionIndex][3]);

*/

        questionTextView.setText(Fuler_bibaho_QNA.myQuestion[currentQuestionIndex]);
        ansA.setText(Fuler_bibaho_QNA.myChoices[currentQuestionIndex][0]);
        ansB.setText(Fuler_bibaho_QNA.myChoices[currentQuestionIndex][1]);
        ansC.setText(Fuler_bibaho_QNA.myChoices[currentQuestionIndex][2]);
        ansD.setText(Fuler_bibaho_QNA.myChoices[currentQuestionIndex][3]);


    }


    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(Fuler_bibaho_QNA.myCorrectAnswer[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            LoadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }

    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();


    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        LoadNewQuestion();
    }


}