package baitaptonghop;
+
import java.util.Scanner;

public class TaskManager {
    static String[] task = new String[]{"Làm bài tập","Làm bài thực hành"};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("-----------------MENU------------------");
            System.out.println("1. Danh sách tất cả công việc\n" +
                    "2. Thêm mới việc cần làm\n" +
                    "3. Sửa nội dung công việc (nhập vị trí cần sửa)\n" +
                    "4. Xóa việc đã hoàn thành (nhập vị trí cần xóa)\n" +
                    "5. thoát chương trình");
            System.out.println("------Nhập lựa chọn-------");
            byte choice = Byte.parseByte(sc.nextLine());                      // lấy dữ liệu người dùng nhập chuyển than kiểu dl byte
            switch (choice){
                case 1:
                    showAllTask();
                    break;
                case 2:
                    addNewTask();
                    break;
                case 3:
                    editTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập không hợp lệ");
            }
        }
    }
    // chức năng hiển thị danh sách
    public  static  void showAllTask(){
        if (task.length==0){
            System.err.println("Empty List");                          // in ra gì
        }
        else {
            System.out.println("-----Danh sách công việc-----");
            for (int i = 0; i < task.length; i++) {
                System.out.printf("%s . %s\n",i+1,task[i]);
            }
        }
    }
    // thêm mơi cong việc
    public  static  void addNewTask(){
        // tạo mảng mới và copy danh sách mảng cũ vào
        String[] newArray = new String[task.length+1];                   // log newArray ra được không
        for (int i = 0; i < task.length; i++) {
            newArray[i] = task[i];                         // newArray [ "a","b","c",null]
        }
        // thêm giá trị mới vào cuối mảng


        // Nhập giá trị cần thêm
        System.out.println("Hãy nhập công việc mới");
        newArray[task.length] = sc.nextLine();               // đọc thông tin .newArray[task.length] lúc này là phần tử cuôi cùng
        task = newArray;
        System.out.println("thêm mới thành công");
    }


    // sửa theo vị trí
    public static void editTask(){
        // nhập va vị trí cần sửa
        System.out.println("Nhập v trí cần sửa");
        int index = Integer.parseInt(sc.nextLine())-1;                  //
        if(index<0 || index> task.length-1){
            System.err.println("vị trí không hợp lệ");
            return;
        }

        // nếu tồn tại
        // hiển thị ra công việc cũ
        System.out.println("Công việc cũ : "+task[index]);
        System.out.println("-------Nhập công việc mới--------");
        task[index] = sc.nextLine();
        System.out.println("cập nhật thành công");
    }


    // xóa theo vị trí
    public static void deleteTask(){
        // nhập vao vị trí cần xóa
        System.out.println("Nhập v trí cần sửa");
        int index = Integer.parseInt(sc.nextLine())-1;
        if(index<0 || index> task.length-1){
            System.err.println("vị trí không hợp lệ");
            return;
        }

        // nếu tồn tại
        String[] newArray = new String[task.length-1];
        for (int i = 0; i < task.length; i++) {
            if (i>index){
                newArray[i-1] = task[i];
            } else if (i<index) {
                newArray[i] = task[i];
            }
        }

        task = newArray;
        System.out.println("Xóa thành công");
    }
}
