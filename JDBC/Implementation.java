import java.util.*;
import java.lang.reflect.*;
    class Text implements MarkerJt {
      
    }
    public class Implementation {
        Object obj;
        HashMap map = new HashMap<>();
        public Object createObject(Class c){
            String name = c.getCanonicalName();
            System.out.println(name);
            try{
                Constructor cc = c.getDeclaredConstructor();
                System.out.println(cc);
                cc.setAccessible(true);
                if(!map.containsKey(cc)){
                    obj = c.newInstance();
                    if(obj instanceof MarkerJt){
                        map.put(name,obj);
                    }
                    return obj;
                }else{
                    obj = map.get(name);
                    return obj;
                }
            }catch(Exception ee){
                return null;
            }
        }
        public static void main(String[] args) {
            Implementation fd = new Implementation();
            Text tt = (Text)fd.createObject(Text.class);
            Text aa = (Text)fd.createObject(Text.class);
            System.out.println(tt.hashCode()+"\t"+aa.hashCode());
            if(tt.equals(aa)){
                System.out.println("Single Object");
            }else{
                System.out.println("Different Object");
            }
        }
    }
