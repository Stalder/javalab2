package main;

import main.markdown.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph(Collections.singletonList(
            new Strong(Arrays.asList(
                new Text("1"),
                new Strikeout(Arrays.asList(
                    new Text("2"),
                    new Emphasis(Arrays.asList(
                        new Text("3"),
                        new Text("4")
                    )),
                    new Text("5")
                )),
                new Text("6")
            ))
        ));

        System.out.println(paragraph.toString());
    }
}