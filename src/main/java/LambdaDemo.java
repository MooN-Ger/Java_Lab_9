import java.util.List;

public class LambdaDemo {
    public static final Func1<String, Integer> func1 = s -> s.length();
    public static final Func1<String, Character> func2 = s -> {
        if(s == null || s.length() == 0){
            return null;
        }
        else{
            return s.charAt(0);
        }
    };
    public static final Func1<String, Boolean> func3 = s -> !s.contains(" ");
    public static final Func1<String, Integer> func4 = s -> s.split(",").length;
    public static final Func1<Human, Integer> func5 = human -> human.getAge();
    public static final Func2<Human, Human> func6 = (human1, human2) -> human1.getSurname().equals(human2.getSurname());
    public static final Func1<Human, String> func7 = human -> String.join(" ", human.getSurname(), human.getName(), human.getPatronymic());
    public static final Func1<Human, Human> func8 = human -> new Human(human.getSurname(), human.getName(), human.getPatronymic(), human.getAge()+1, human.getGender());
    public static final Func2<List<Human>, Integer> func9 = (humanList, maxAge) -> humanList.stream().allMatch(human -> human.getAge() < maxAge);
}
