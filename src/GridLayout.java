import java.awt.*;
class Ex7{
public static void main(String ar[]){
Frame f=new Frame("Grid Layout");
GridLayout g=new GridLayout(5,2);
f.setLayout(g);
Label l1=new Label("enter rollno");
Label l2=new Label("enter name");
Label l3=new Label("enter marks");
Label l4=new Label("enter phonenumber");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
Button b1=new Button("Save");
Button b2=new Button("Cancel");
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(l4);
f.add(t4);
f.add(b1);
f.add(b2);
f.setSize(400,400);
f.setVisible(true);
}
}
