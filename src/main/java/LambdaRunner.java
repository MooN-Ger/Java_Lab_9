public class LambdaRunner {

    public static <T, R> R method(Func1<T, R> f, T t){
        return f.do1(t);
    }

    public static <T, R> boolean method(Func2<T, R> f, T t, R r){
        return f.do2(t, r);
    }
}
