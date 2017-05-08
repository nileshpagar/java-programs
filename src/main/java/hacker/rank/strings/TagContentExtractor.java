package hacker.rank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Nilesh Pagar on 5/8/2017.
 */
public class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            List<String> lines = parse(line);
            lines.forEach(System.out::println);
            testCases--;
        }
    }

    public static List<String> parse(String line) {

        List<String> output = new ArrayList<>();
        Stack<String> tagsStack = new Stack<>();

        StringBuilder startTag = null;
        StringBuilder endTag = null;
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '<' && line.length() > i+1 && line.charAt(i+1) != '/'){
                startTag = new StringBuilder();
                content = null;
                endTag = null;
            } else if (line.charAt(i) == '>'){
                if (startTag != null && !"".equals(startTag.toString())) {
                    tagsStack.push(startTag.toString());
                    startTag = null;
                    content = new StringBuilder();
                }
                if (endTag != null && !"".equals(endTag.toString())) {
                    if (tagsStack.peek().equals(endTag.toString())) {
                        if (content!= null && !"".equals(content.toString()))
                            output.add(content.toString());
                        tagsStack.pop();
                    }
                    content = null;
                    endTag = null;
                }
            } else if (line.charAt(i) == '<' && line.length() > i+1 && line.charAt(i+1) == '/') {
                endTag = new StringBuilder();
            }

            if (line.charAt(i) != '<' && line.charAt(i) != '>' && line.charAt(i) != '/') {
                if (startTag != null && content == null) {
                    startTag.append(line.charAt(i));
                }
                if (endTag != null) {
                    endTag.append(line.charAt(i));
                }
                if (content != null && startTag == null && endTag == null) {
                    content.append(line.charAt(i));
                }
            }
        }

        if (output.size() == 0) {
            output.add("None");
        }
        return output;
    }

}
