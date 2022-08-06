package com.example.quiz;

public class Helper {
    private Question[] questions = new Question[5];


    public Helper() {
        questions[0] = new Question("How many states are there in USA?",
                new String[]{"40", "50", "10"},
                new int[]{1}
        );
        questions[1] = new Question("Who is the best football player?",
                new String[]{"Ronaldo", "David Warner", "Jordan"},
                new int[]{0}
        );
        questions[2] = new Question("What are the programming languages used in android studio? (multiple answers)",
                new String[]{"Java", "Kotlin",
                        "React"},
                new int[]{0, 1}
        );
        questions[3] = new Question("Which is the largest state to USA?",
                new String[]{"Alaska",
                        "Texas", "California"},
                new int[]{0}
        );
        questions[4] = new Question("When is the independence day celebrated?",
                new String[]{"June 4", "July 10", "July 4"},
                new int[]{2}
        );

    }

    public Question[] getQuestions() {
        return questions;
    }
}

