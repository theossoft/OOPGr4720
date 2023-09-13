package seminars.seminar_3.bullsAndCows;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    private String userInput;
    private Integer bull;
    private Integer cow;
}
