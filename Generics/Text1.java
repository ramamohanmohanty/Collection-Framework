public class Text1 {
	Object obj;
	public Text1(Object obj){
		this.obj = obj;
		}
	public Object get(){
		return obj;
		}
	public static void main(String args[]){
		Text1 tt = new Text1(new String("Rashmi"));
			String name = (String) tt.get();
		Text1 t1 = new Text1(new StringBuffer("Java Technocrat"));
			StringBuffer oname = (StringBuffer)t1.get();
		System.out.println("Name of the Mentor is : "+name+"    Name of Organization is : "+oname);
		}
	} 