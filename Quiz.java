public class Quiz {
	public static void main(String[] args) {
		// Question 1
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
			"What word is spelled incorrectly in every single dictionary?", 
			"Mississippi", 
			"Incorrectly", 
			"Jewelry", 
			"Acquiesce", 
			"Mischievous", 
			"b"
		);
		question.check();
		// Question 2    
		question = new MultipleChoiceQuestion(
			"What country has the highest life expectancy?", 
			"United States of America", 
			"Hong Kong", 
			"United Kingdom", 
			"Spain", 
			"Tanzania", 
			"B"
		);
		question.check();
		// Question 3
		question = new MultipleChoiceQuestion(
			"What is the most common surname in the United States?", 
			"Venus", 
			"Anderson", 
			"Smith", 
			"Wilson", 
			"Jones", 
			"c"
		);
		question.check();
		// Question 4
		question = new MultipleChoiceQuestion(
			"What is the largest canyon in the world?", 
			"Verdon Gorge, France", 
			"Grand Canyon, USA", 
			"King’s Canyon, Australia", 
			"Fjaðrárgljúfur Canyon, Iceland", 
			"Antelope Canyon, USA", 
			"B"
		);
		question.check();
		// Question 5
		question = new MultipleChoiceQuestion(
			"How long is the border between the United States and Canada", 
			"3,525 miles", 
			"4,525 miles", 
			"6,525 miles", 
			"5,256 miles", 
			"5,525 miles", 
			"e"
		);
		question.check();
		MultipleChoiceQuestion.showResults();
	}
}