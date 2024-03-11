package org.example.kttkpmtuan4;

import jdepend.xmlui.JDepend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintWriter;

@SpringBootApplication
public class KttkpmTuan4Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(KttkpmTuan4Application.class, args);
        JDepend depend = new JDepend(new PrintWriter("reports/report.xml"));
        depend.addDirectory("T:\\kttkpmTuan4\\Library-Assistant");
        depend.analyze();
        System.out.println("done");
    }
}
