package lt.vcd.homework9.task1;

public class Main {
    static void main(String[] args) throws Exception {
        OMasyvas<String> words = new OMasyvas<>(3);

        words.set(0, "value1");
        words.set(1, "value2");
        words.set(2, "value3");

        System.out.println(words);
        System.out.println(words.get(1));

        try{words.get(3);}
         catch (Exception e) {System.out.println(e.getMessage());}

    }
}
