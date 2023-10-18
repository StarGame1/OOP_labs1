
import java.awt.*;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("1");
        BigInteger sum = new BigInteger("0");
        BigInteger multiply = new BigInteger("2");
        for(int i = 0 ; i < 64 ; i++){
            sum = sum.add(x);
            x = x.multiply(multiply);
        }
        System.out.print(sum);
        }
    }
