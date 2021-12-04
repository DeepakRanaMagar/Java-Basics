class   Dimensions{
     int x,y,width,height;

    public Dimensions (int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public Dimensions(int width, int height){
        this(0,0,width,height);
    }

    public Dimensions(){
        this(0,0,1,1);
    }

    public void putData(){
        System.out.println("X-coordinate: "+x+"Y-coordinate: "+y+"Width: "+width+"Height: "+height);
    }
}

class Shape{
    public static void main(String[] args) {
        Dimensions d = new Dimensions(2,1,5,5);
        Dimensions d1= new Dimensions(7,7);
        Dimensions d2= new Dimensions();
        
        d.putData();
        d1.putData();
        d2.putData();


    }

    
}