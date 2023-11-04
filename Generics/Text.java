public class Text implements Data {
    @Override

    public void showMessage(String msg){
        System.out.println("Message is : "+msg);
    }

    public static void main(String args[]){
        Text tt = new Text();
        tt.display();
        Data.show();
        tt.showMessage("I Love Java Technocrat");
    }
}
