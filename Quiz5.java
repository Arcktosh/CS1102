public class Quiz5 {
	public static void main(String[] args) {
		// Question 1
		Question question = new MultipleChoiceQuestion("What word is spelled incorrectly in every single dictionary?",
				"Mississippi", "Incorrectly", "Jewelry", "Acquiesce", "Mischievous", "b");
		question.check();
		// Question 2
		question = new MultipleChoiceQuestion("What country has the highest life expectancy?",
				"United States of America", "Hong Kong", "United Kingdom", "Spain", "Tanzania", "B");
		question.check();
		// Question 3
		question = new MultipleChoiceQuestion("What is the most common surname in the United States?", "Venus",
				"Anderson", "Smith", "Wilson", "Jones", "c");
		question.check();
		// Question 4
		question = new MultipleChoiceQuestion("What is the largest canyon in the world?", "Verdon Gorge, France",
				"Grand Canyon, USA", "King’s Canyon, Australia", "Fjaðrárgljúfur Canyon, Iceland",
				"Antelope Canyon, USA", "B");
		question.check();
		// Question 5
		question = new MultipleChoiceQuestion("How long is the border between the United States and Canada",
				"3,525 miles", "4,525 miles", "6,525 miles", "5,256 miles", "5,525 miles", "e");
		question.check();
		// True/False Questions
		// Question 6
		question = new TrueFalseQuestion("The capital city of Japan is Tokyo.", "TRUE");
		question.check();
		// Question 7
		question = new TrueFalseQuestion("The human brain is the largest organ in the body.", "FALSE");
		question.check();
		// Question 8
		question = new TrueFalseQuestion("The Sahara Desert is the largest desert in the world.", "FALSE");
		question.check();
		// Question 9
		question = new TrueFalseQuestion("Light travels faster than sound.", "TRUE");
		question.check();
		// Question 10
		question = new TrueFalseQuestion("The Great Wall of China is visible from the Moon.", "FALSE");
		question.check();
		Question.showResults();
	}
}