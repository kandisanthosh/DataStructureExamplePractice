package com.ds.trees.demos;

 class Room  {

    public Room(){
    }
     private String itemsTypeAndName;
     private String itemsCount;

     public Room(String itemsTypeAndName, String itemsCount) {
         this.itemsTypeAndName = itemsTypeAndName;
         this.itemsCount = itemsCount;
     }

     public String getItemsTypeAndName() {
         return itemsTypeAndName;
     }

     public void setItemsTypeAndName(String itemsTypeAndName) {

         this.itemsTypeAndName = itemsTypeAndName;
     }

     public String getItemsCount() {
         return itemsCount;
     }

     public void setItemsCount(String itemsCount) {
         System.out.print(itemsCount);
         this.itemsCount = itemsCount;
     }


}
public class RoomStorage {

    public static void main(String[] args) {
        Room room =new Room("bed","1");
        System.out.println(room.getItemsTypeAndName() +""+room.getItemsCount());
    }

}