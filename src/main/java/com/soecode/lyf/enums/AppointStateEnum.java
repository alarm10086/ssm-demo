package com.soecode.lyf.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum AppointStateEnum {

    SUCCESS(1, "预约成功"),
    NO_NUMBER(0, "库存不足"),
    REPEAT_APPOINT(-1, "重复预约"),
    INNER_ERROR(-2, "系统异常");

    private final int state;

    private final String stateInfo;

    AppointStateEnum(final int state, final String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static AppointStateEnum stateOf(final int index) {
        for (final AppointStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
