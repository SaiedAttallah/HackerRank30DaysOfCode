package Day21;

public class Printer<T> {
    public static <Element> void printArray(Element[] array) {
        for (Element element : array) {
            System.out.println(element);
        }
    }
}

