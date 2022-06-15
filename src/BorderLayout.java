import java.awt.*;
class Ex4{
public static void main(String ar[]){
Frame f=new Frame("New frame");
TextArea t=new TextArea();
Button b=new Button("click");
Choice c=new Choice();
c.add("India");
c.add("America");
c.add("Nepal");
c.add("Russia");
c.add("Ukraine");
List l=new List();
l.add("Home");
l.add("about");
l.add("contact");
l.add("Gallery");
Font ft=new Font("Arial",2,34);
t.setFont(ft);
t.setBackground(Color.Yellow);
t.setForeground(Color.red);
f.add(b,BorderLayout.SOUTH);
f.add(c,BorderLayout.NORTH);
f.add(l,BorderLayout.WEST);
f.add(t);
f.setSize(400,400);
f.setVisible(true);
}
}
