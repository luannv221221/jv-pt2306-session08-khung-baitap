package ra.entity;

import ra.itf.IStudent;

public class Student implements IStudent {
    private String studentId;
    private String studentName;
    // viet tiep
    @Override
    public void inputData() {
        // nhap thong tin cua sinh
    }

    @Override
    public void displayData() {
        // hien thij thong tin sinh vien
    }


}
