package Test;

import Model.ReadFile;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        ReadFile rd = new ReadFile();
        ArrayList <String> testArr = new ArrayList<>();
        testArr = rd.returnPostFix();
        String line = testArr.get(0);
        System.out.println(line);
    }
}