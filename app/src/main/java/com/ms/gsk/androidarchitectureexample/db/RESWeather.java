package com.ms.gsk.androidarchitectureexample.db;

import com.compa.gsk.http.ResBase;

import java.util.ArrayList;

/**
 * 날씨 API 응답 클래스
 *
 *<blockquote>
 *       <pre>
 *
 * Response :
 *      {@code state - 성공 / 실패}
 *      {@code msg - 메세지}
 *
 *      {@code yyyy - 년도}
 *      {@code mm - 월}
 *      {@code dd - 일}
 *      {@code week - 요일}
 *
 *      {@link WeatherInfo} weather_info - 날씨 정보
 *      ArrayList {@link TimeStatus} time_status - 시간별 날씨
 *      {@link AirStatus} air_status - 공기 오염도 정보
 *      weather_ment - 날씨 멘트 (기상청제공)
 *      uv_status - 자외선 지수
 *
 *        </pre>
 * </blockquote>
 *
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-07-13 오후 6:10
 */
public class RESWeather extends ResBase {
    public String yyyy;
    public String mm;
    public String dd;
    public String week;
    public WeatherInfo weather_info;
    public ArrayList<TimeStatus> time_status;
    public AirStatus air_status;
    public String weather_ment;
    public String uv_status;

    @Override
    public String toString() {
        return "RESWeather{" +
                "state='" + state + '\'' +
                ", msg='" + msg + '\'' +
                ", yyyy='" + yyyy + '\'' +
                ", mm='" + mm + '\'' +
                ", dd='" + dd + '\'' +
                ", week='" + week + '\'' +
                ", weather_info=" + weather_info +
                ", time_status=" + time_status +
                ", air_status=" + air_status +
                ", weather_ment='" + weather_ment + '\'' +
                ", uv_status='" + uv_status + '\'' +
                '}';
    }
}
