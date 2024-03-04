package getter;
import java.util.*;
public class t {
	public static void main(String[] args) {
 Car car = new Car();
   car.work();
  }
} 
class Car {
  Tanku tanku = new Tanku("動物名：ライオン","体長：2.1m","速度：80km/h");
  public void work(){
       System.out.println(tanku.getGas());
       System.out.println(tanku.getGas2());
       System.out.println(tanku.getGas3());
  }
}
 class Tanku {
 private String name;
 private String category;
 private String type;
 public Tanku(String name, String category, String type){
    this.name = name;
    this.category = category;
    this.type = type;
       
 }
 public String getGas(){
   return this.name;
 } 
 public String getGas2(){
   return this.category;
 } 
 public String getGas3(){
   return this.type;
 } 
  
 }

