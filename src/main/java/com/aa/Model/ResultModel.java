package com.aa.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultModel {
    private int score;
    private int totalQuestions;
    
    
    public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTotalQuestions() {
		return totalQuestions;
	}
	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	public ResultModel(int score, int totalQuestions) {
		super();
		this.score = score;
		this.totalQuestions = totalQuestions;
	}

 
}
