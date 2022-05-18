package fr.maif.demo;

public class MultilineStrings {
    public static void main( String[] args ) {
        String json = "{\n" +
                "  \"foo\": 1,\n" +
                "  \"bar\": \"baz\"\n" +
                "}";

        String better = """
                {
                  "foo": 1,
                  "bar": "baz"
                }""";

        System.out.println(json);
        System.out.println("###################");
        System.out.println(better);
        System.out.println("###################");

        // TODO parler du indent
    }
}
