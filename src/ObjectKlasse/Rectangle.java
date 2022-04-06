package ObjectKlasse;

package at.campus02.iwi.pictures;

public class Picture {
    int lenght;
    int width;

    public int totalPixels(){
        return lenght*width;
    }

    public int totalSize(int bytePerPixel){
        return bytePerPixel * totalPixels();
    }

    public void scale(double factor){
        lenght = (int) (lenght * factor);
        width *= factor;
    }

}

App--------------------
     
public class PictureApp {
    public static void main(String[] args) {
      Picture p = new Picture();
      p.width = 200;
      p.lenght = 100;

        System.out.println(p.totalPixels());

        int totalSize = p.totalSize(2);
        System.out.println(totalSize);

        p.scale(0.5);
        System.out.println(p.width + " " + p.lenght
        );
    }
}



public class Rectangle {
        int length;
        int width;

        void insert(int l,int w){
            length=l;
            width=w;
        }

        void calculateArea(){System.out.println(length*width);}

        public static void main(String args[]){
            Rectangle r1=new Rectangle();
            Rectangle r2=new Rectangle();

            r1.insert(11,5);
            r2.insert(3,15);

            r1.calculateArea();
            r2.calculateArea();
        }
    }

