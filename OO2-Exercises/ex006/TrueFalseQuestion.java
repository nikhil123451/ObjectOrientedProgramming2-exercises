public class TrueFalseQuestion extends Question{
	public String getText() {
		return "Answer True or False: " + super.getText();
	}
	
	public boolean checkAnswer(String answer) {
		String formattedAnswer = "";
		
		if (answer.toLowerCase().equals("f")) {
			formattedAnswer = "false";
		} else if (answer.toLowerCase().equals("t")) {
			formattedAnswer = "true";
		} else {
			formattedAnswer = answer.toLowerCase();
		}
		
		return formattedAnswer.equals(super.getAnswer());
	}
}
