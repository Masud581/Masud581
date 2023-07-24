Class Room {
float length;
float breath;l
void getdata(float a,float b)
{
length = a;
beath = b;
}
}
class RoomArea{
public static void main(String[]args){
float area;
Room room1 = new Room();
room1.getdata(15,32);
area = room1.length*room1.breath;
System.out.pritnln("Area ="+area);
 }
}