package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC4011t {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f43885f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43887a;

    static {
        for (EnumC4011t enumC4011t : values()) {
            f43885f.put(enumC4011t.f43887a, enumC4011t);
        }
    }

    EnumC4011t(String str) {
        this.f43887a = str;
    }

    static EnumC4011t b(String str) {
        Map map = f43885f;
        if (map.containsKey(str)) {
            return (EnumC4011t) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43887a;
    }
}
