public class Text2<R> {
    R obj;
    public Text2(R obj){
        this.obj = obj;
    }

    public R get(){
        return obj;
    }
    public static void main(String args[]){
        Text2<String> tt = new Text2<String>(new String ("Rashmi"));
        String name = tt.get();
        Text2<StringBuffer> tf = new Text2<StringBuffer>(new StringBuffer("java Technocart"));
        StringBuffer oname = tf.get();
        System.out.println("My Mentor is : "+name+"       My Organizatrion name is : "+oname);
    }
}
