package com.horcrux.svg;

import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC4010s {
    UNKNOWN("unknown"),
    NORMAL(Constants.NORMAL),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f43878h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43880a;

    static {
        for (EnumC4010s enumC4010s : values()) {
            f43878h.put(enumC4010s.f43880a, enumC4010s);
        }
    }

    EnumC4010s(String str) {
        this.f43880a = str;
    }

    static EnumC4010s b(String str) {
        Map map = f43878h;
        if (map.containsKey(str)) {
            return (EnumC4010s) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43880a;
    }
}
