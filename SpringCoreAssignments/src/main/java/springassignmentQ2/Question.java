package springassignmentQ2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

        public int questionId;
        public String question;
        public List<String> answerlist;
        public Set<String> answerset;
        public Map<Integer,String> answermap;
        public int getQuestionId() {
                return questionId;
        }
        public void setQuestionId(int questionId) {
                this.questionId = questionId;
        }
        public String getQuestion() {
                return question;
        }
        public void setQuestion(String question) {
                this.question = question;
        }
        
        
        public List<String> getAnswerlist() {
                return answerlist;
        }
        public void setAnswerlist(List<String> answerlist) {
                this.answerlist = answerlist;
        }
        public Set<String> getAnswerset() {
                return answerset;
        }
        public void setAnswerset(Set<String> answerset) {
                this.answerset = answerset;
        }
        public Map<Integer, String> getAnswermap() {
                return answermap;
        }
        public void setAnswermap(Map<Integer, String> answermap) {
                this.answermap = answermap;
        }
        public void getanswers() {
                System.out.println("Question Id: "+getQuestionId());
                System.out.println("Question: "+getQuestion());
                System.out.println("Answer in list : "+getAnswerlist());
                System.out.println("Answer in set : "+getAnswerset());
                System.out.println("Answer in map : "+getAnswermap());
                
                
                
        }
}