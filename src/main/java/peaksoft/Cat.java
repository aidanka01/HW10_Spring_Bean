package peaksoft;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Cat {
    @Value("Mossi")
    private String name;
    @Value("white")
    private String color;
    @Value("2")
    private int age;
}
