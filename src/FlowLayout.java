import java.awt.*;
class Ex5{
public static void main(String ar[]){
Frame f=new Frame("Flow Layout");
Button b1=new Button("Home");
Button b2=new Button("About");
Button b3=new Button("SignOut");
Button b4=new Button("SignIn");
Button b5=new Button("Gallery");
Button b6=new Button("Contact");
FlowLayout f1=new FlowLayout();
f.setLayout(f1);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.setSize(400,400);
f.setVisible(true);
}
}
