/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author tonoy
 */
public class RegisterAccount extends login {
    private LocalDate birthday ;
    private String question,answer ;

    public RegisterAccount(String username, String password,LocalDate birthday, String question, String answer ) {
        super(username, password);
        this.birthday = birthday;
        this.question = question;
        this.answer = answer;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "RegisterAccount{" + "birthday=" + birthday + ", question=" + question + ", answer=" + answer + '}';
    }

   
    
    
}
