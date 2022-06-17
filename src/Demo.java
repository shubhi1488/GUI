import java.awt.*;
class MyPanel extends Panel{
public void paint(Graphics g){
g.setColor(Color.blue);
g.setFont(new Font("Cooper",1,40));
g.drawString("E-School",30,60);
g.setColor(Color.yellow);
g.drawLine(20,80,300,80);
}
}
class Demo{
Frame f;
MyPanel mb;
Demo(){
f=new Frame();
mb=new MyPanel();
f.add(mb);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String ar[]){
new Demo();
}
}
