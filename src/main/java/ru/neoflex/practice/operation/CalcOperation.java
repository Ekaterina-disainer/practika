package ru.neoflex.practice.db.operation;

import jakarta.persistence.*;

@Entity
public class CalcOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String operation;
    private double num1;
    private double num2;
    private double result;

    public CalcOperation(String operation, double num1, double num2, double result) {

        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public CalcOperation() {}

    public long getId() {return id;}

    public String getOperation() { return operation; }
    public void setOperation(String operation) {this.operation = operation;}

    public double getNum1() {return num1;}
    public void setNum1(double num1) {this.num1 = num1;}

    public double getNum2() {return num2;}
    public void setNum2(double num2) {this.num2 = num2;}

    public double getResult() {return result;}
    public void setResult(double result) {this.result = result;}
}
