package com.ngovanthang.quiz_api.constaint;

public enum DoKho {
    DE(Constant.DE),
    TRUNG_BINH(Constant.TRUNG_BINH),
    KHO(Constant.KHO);

    private final int code;

    DoKho(final int code) {
        this.code = code;
    }

    public final int getCode() {
        return this.code;
    }

    public static DoKho valueOf(int code) {
        for (DoKho type : DoKho.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }

        throw new IllegalArgumentException(DoKho.class.getName() + " does not have value with code: " + code);
    }

    public static class Constant {
        public static final int DE = 0;
        public static final int TRUNG_BINH = 1;
        public static final int KHO = 2;
    }
}
