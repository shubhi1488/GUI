import java.awt.*;
class Ex6{
public static void main(String ar[]){
Frame f=new Frame("Sample Layout");
TextArea t=new TextArea();
Button b1=new Button("Save");
Button b2=new Button("Cancel");
Panel p=new Panel();
p.add(b1);
p.add(b2);
f.add(t);
f.add(p,BorderLayout.SOUTH);
f.setSize(400,400);
f.setVisible(true);
}
}
