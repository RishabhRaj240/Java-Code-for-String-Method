package datatypes;

public class TestString {
    public static void main(String[] args) {
        String name = "Rishabh Raj";
        int length = name.length();
        char c = name.charAt(length - 1);
        String name2 = "Rishabh raj";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

        String str1 = "remote";
        String str2 = "ramote";
        System.out.println('e' + 0);
        System.out.println('a' + 0);
        int i = str2.compareTo(str1);
        System.out.println(i);

        String name3 = "Nikita Sao";
        String newName = name3.replace("Sao", "Chourasia");
        System.out.println(newName);
    }
}
