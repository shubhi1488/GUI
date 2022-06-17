import java.awt.*;
class MyPanel extends Panel{
public void paint(Graphics g){
g.setColor(Color.red);
int x[]={85,141,264,314,259,143};
int y[]={237,152,153,248,330,331};
g.fillPolygon(x,y,6);
}
}
class Program{
Frame f;
MyPanel mb;
Program(){
f=new Frame();
mb=new MyPanel();
f.add(mb);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String ar[]){
new Program();
}
}
