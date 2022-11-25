package Data;

public class Questions {
    String Answer;
    String Choice;
    String Choice1;
    String Prompt;
    String Answer1;

    Questions(String Answer, String Choice, String Choice1, String Prompt) {
        this.Answer = Answer;
        this.Choice = Choice;
        this.Choice1 = Choice1;
        this.Prompt = Prompt;
    }

    Questions(String Answer1) {
        this.Answer1 = Answer1;
    }
}
