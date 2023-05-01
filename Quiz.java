public class Quiz {

  public static void main(String[] args) {

    // Question 1
	  MultipleChoiceQuestion question = new MultipleChoiceQuestion("What word is spelled incorrectly in every single dictionary?",
    "Mississippi",
    "Incorrectly",
    "Jewelry",
    "Acquiesce",
    "Mischievous","b");
	question.check();
    // Question 2    
	MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What country has the highest life expectancy?",
    "United States of America",
    "Hong Kong",
    "United Kingdom",
    "Spain",
    "Tanzania","B");
	question1.check();
    // Question 3
    MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is the most common surname in the United States?",
    "Venus",
    "Anderson",
    "Smith",
    "Wilson",
    "Jones",
    "c");
    question2.check();
    question2.showResults();
    
  }
}