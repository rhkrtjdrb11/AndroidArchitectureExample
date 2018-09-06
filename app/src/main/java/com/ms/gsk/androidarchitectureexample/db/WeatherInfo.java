package com.ms.gsk.androidarchitectureexample.db;

/**
 * 날씨 정보 클래스
 *
 *<blockquote>
 *       <pre>
 *
 * Response :
 *      {@code temperature - 현재온도}
 *      {@code status - 1-맑음, 2-구름 조금, 3-구름 많음, 4-흐림, 5-비, 6-비/눈, 7-눈}
 *      {@code min_temperature - 최저온도}
 *      {@code max_temperature - 최고온도}
 *      {@code comment - 날씨 코멘트(내부생성)}
 *
 *        </pre>
 * </blockquote>
 *
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-07-13 오후 6:15
 */
public class WeatherInfo {
    public String temperature;
    public String status;
    public String min_temperature;
    public String max_temperature;
    public String comment;

    public String getTableName(){
        return "weather_info";
    }

    public String[] getColumnNames(){
        return new String[]{
                "temperature",
                "status",
                "min_temperature",
                "max_temperature",
                "comment",
                "weather_ment",
                "uv_status"
        };
    }

    public Object[] getValueParams(String weather_ment, String uv_status){
        return new Object[]{
                temperature,
                status,
                min_temperature,
                max_temperature,
                comment,
                weather_ment,
                uv_status
        };
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "temperature='" + temperature + '\'' +
                ", status='" + status + '\'' +
                ", min_temperature='" + min_temperature + '\'' +
                ", max_temperature='" + max_temperature + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
