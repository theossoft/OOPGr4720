package homeWorks.hw_3;

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

    @Override
    public String toString() {
        return "Вы ввели: " + userInput +
                ", Быков: " + bull +
                ", Коров: " + cow;
    }
}
