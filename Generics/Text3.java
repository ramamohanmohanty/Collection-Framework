public class Text3<R,P> {
    R obj1;
    P obj2;

    public Text3(R obj1, P obj2){
        this.obj1= obj1;
        this.obj2 = obj2;
    }

    void Dispay(){
        System.out.println("My Mentor is : "+obj1+"      My Organization is : "+obj2);
    }

    public static void main(String args[]){
        Text3<String,StringBuffer> tt = new Text3<String,StringBuffer>(new String("Rashmi Sir "),new StringBuffer("Java Technocrat"));
        tt.Dispay(); 
    }
}
