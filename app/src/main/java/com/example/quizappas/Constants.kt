package com.example.quizappas

import java.util.ArrayList


object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answer"







    fun getQuestions():ArrayList<questions>{
        val questionlist=ArrayList<questions>()
        var que1=questions(
            1,"What is the name of this car ?",R.drawable.quiz_lambo,
            "Ferrari","lamborghini","Aston martin",
            "BMW",2
        )
        questionlist.add(que1)
        var que2=questions(
            2,"WHICH BIKE IS IT  ?",R.drawable.quiz_h2r,
            "TVS Apache RR310","KTM RC 390","Kawasaki Ninja 650",
            "Kawasaki Ninja H2 R",4
        )
        questionlist.add(que2)
        var que3=questions(
            3,"Who is the CEO of this company ?",R.drawable.quiz_buffet,
            "Mark Zuckerberg","Elon Musk","Warren Buffett",
            "Jeff Bezos",3
        )
        questionlist.add(que3)
        var que4=questions(
            4,"GUESS THE NAME OF THIS ACTOR ?",R.drawable.quiz_jhoonydeep,
            "Johnny Depp","Shah Rukh Khan","Dwayne Johnson",
            "Robert Downey Jr.",1
        )
        questionlist.add(que4)

        var que6=questions(
            6,"WHICH COUNTRY FLAG IS IT ?",R.drawable.quiz_southafrica,
            "AMERICA","INDIA","PARIS",
            "SOUTH AFRICA",4
        )
        questionlist.add(que6)
        var que7=questions(
            7,"WHAT IS HER NAME ?",R.drawable.quiz_gigihadid,
            "GIGI HADID","SELENA GOMEZ","TAYLOR SWIFT",
            "BELLA HADID",1
        )
        questionlist.add(que7)
        var que8=questions(
            8,"WHICH COUNTRY FLAG IS IT ?",R.drawable.quiz_nigeria,
            "Brazil","Nigeria","Portugal",
            "Qatar",1
        )
        questionlist.add(que8)
        var que9=questions(
            9,"WHICH SHOE IS THIS  ?",R.drawable.quiz_jordanuniversityblue,
            "Nike Cortez Shoes.","Nike Air Force 1 Shoes","NIKE AIR JORDAN",
            "Nike Blazer Shoes",1
        )
        questionlist.add(que9)



        return questionlist


    }
}