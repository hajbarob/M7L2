public class Main {
    public static void main(String[] args) {
        String s = "vova";
        // -> java check if ve already have "vova"
        // string in StringPool and if we do not have "vova" in StringPool
        // -> java will create string in 19 memory box
        String s1 = new String("vova");
        // -> java check if ve already have "vova"
        // string in StringPool and if we have "vova" in StringPool
        // than s1 reference will refer to same bemory box and same object 19 memory box
        System.out.println(s == s1);
        System.out.println(s == s1);

        String a = "a";
        for(int i = 0; i< 1000; i++) {
            String a2 = a + String.valueOf(i);
            String a3 = a + String.valueOf(i);
            System.out.println("a2 == a3 = " + (a2 == a3));
            System.out.println("a2.equals(a3) = " + a2.equals(a3));
        }
    }
}