package com.ms.gsk.androidarchitectureexample.db;

/**
 * 공기 오염도 정보 클래스
 *
 *<blockquote>
 *       <pre>
 *
 * Response :
 *      {@link CAI} - 통합 대기
 *      {@link O3} - 오존
 *      {@link SO2} - 아황산가스
 *      {@link CO} - 일산화탄소
 *      {@link NO2} - 이산화질소
 *      {@link PM25} - 초미세먼지
 *
 *        </pre>
 * </blockquote>
 *
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-07-13 오후 6:17
 */
public class AirStatus {
    public CAI CAI;
    public O3 O3;
    public SO2 SO2;
    public CO CO;
    public NO2 NO2;
    public PM25 PM25;

    @Override
    public String toString() {
        return "AirStatus{" +
                "CAI=" + CAI +
                ", O3=" + O3 +
                ", SO2=" + SO2 +
                ", CO=" + CO +
                ", NO2=" + NO2 +
                ", PM25=" + PM25 +
                '}';
    }
}
