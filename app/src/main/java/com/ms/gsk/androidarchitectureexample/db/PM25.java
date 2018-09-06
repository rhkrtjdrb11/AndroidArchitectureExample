package com.ms.gsk.androidarchitectureexample.db;


/**
 * 초미세먼지 수치 응답 클래스
 *
 *<blockquote>
 *       <pre>
 *
 * Response :
 *      {@code grade - 등급}
 *      {@code value - 수치}
 *
 *        </pre>
 * </blockquote>
 *
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-07-16 오전 11:29
 */
public class PM25 {
    public String grade;
    public String value;

    public String getTableName(){
        return "pm25";
    }

    public String[] getColumnNames(){
        return new String[]{
                "grade",
                "value"
        };
    }

    public Object[] getValueParams(){
        return new Object[]{
                grade,
                value
        };
    }

    @Override
    public String toString() {
        return "CAI{" +
                "grade='" + grade + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
