package org.example;

public class Student {
    //  private Writer writer = new Pen(); Manual Object Declaration

    private Writer writer; // Using Spring

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public  void writeExam(){
        writer.write();
    }
}
