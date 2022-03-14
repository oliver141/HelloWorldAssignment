import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class HelloWorldinprocessing_ extends PApplet {
  public void setup() {
println ("Hello World");
String firstSentence = "You said Hello";
println (firstSentence);

char x = '!';
String a = "you";
String b = "said";
String c = "hello";
String space = " ";
println (a+space+b+space+c+x);
println (a, b, c+x);
//println(a, b, a+x); //Second Method of Concatenation
//
char z ='.';
char y =',';
String d = "Oliver";
String e = "Johnson";
String f = "Counts";
String ten = "10";
String h = "by";
String one = "1";
int two = 1;
print(d+z+space+e+space+f+space+g+space+ten+y+space+h+space+one+z, "\n");
println("\t\t\t", d+z, e, f, g, ten+y, h, PApplet.parseInt(one)+two+z);
println("One Plus two is", one+two);
    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "HelloWorldinprocessing_" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
