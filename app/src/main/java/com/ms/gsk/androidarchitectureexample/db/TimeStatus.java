package com.ms.gsk.androidarchitectureexample.db;

/**
 * 시간별 날씨 정보 클래스
 *
 *<blockquote>
 *       <pre>
 *
 * Response :
 *      {@code time - 예보시간(3시간 간격)}
 *      {@code status - 1-맑음, 2-구름 조금, 3-구름 많음, 4-흐림, 5-비, 6-비/눈, 7-눈}
 *
 *        </pre>
 * </blockquote>
 *
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-07-13 오후 6:16
 */
public class TimeStatus {
    public String time;
    public String status;

    public String getTableName(){
        return "time_status";
    }

    public String[] getColumnNames(){
        return new String[]{
                "time",
                "status"
        };
    }

    public Object[] getValueParams(){
        return new Object[]{
                time,
                status
        };
    }

    @Override
    public String toString() {
        return "TimeStatus{" +
                "time='" + time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
