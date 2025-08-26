public class StringReplace {
    public String interpret(String command) {
        // Replace "()" with "o"
        String s = command.replace("()", "o");
        // Replace "(al)" with "al"
        String s1 = s.replace("(al)", "al");
        return s1;
    }

    // Main method to test
    public static void main(String[] args) {
        StringReplace sol = new StringReplace();

        String command1 = "G()(al)";
        System.out.println(sol.interpret(command1)); // "Goal"

        String command2 = "G()()()()(al)";
        System.out.println(sol.interpret(command2)); // "Gooooal"

        String command3 = "(al)G(al)()()G";
        System.out.println(sol.interpret(command3)); // "alGalooG"
    }
}
