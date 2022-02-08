package com.example.sample.test.line;

public class LineApp {
    static String LINE_TITLE = "라인앱";
    int num1;
    String opcode;
    int num2;

    public String lin(int num1, String opcode, int num2) {
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int res = 0;

        switch(opcode){
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }

        String result = String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, res);

        return result;
    }
}

