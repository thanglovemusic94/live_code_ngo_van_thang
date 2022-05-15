package com.ngovanthang.quiz_api.constaint;

public enum TypeQuestion {
    DUNG_SAI(DoKho.Constant.DE),
    NHIEU_LUA_CHON(DoKho.Constant.TRUNG_BINH);

    private final int code;

    TypeQuestion(final int code) {
        this.code = code;
    }

    public final int getCode() {
        return this.code;
    }

    public static TypeQuestion valueOf(int code) {
        for (TypeQuestion type : TypeQuestion.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }

        throw new IllegalArgumentException(DoKho.class.getName() + " does not have value with code: " + code);
    }

    public static class Constant {
        public static final int DUNG_SAI = 4;
        public static final int NHIEU_LUA_CHON = 5;

    }
}
