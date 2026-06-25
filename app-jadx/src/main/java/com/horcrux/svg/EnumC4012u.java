package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC4012u {
    OVER("over"),
    IN("in"),
    OUT("out"),
    ATOP("atop"),
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f43894h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43896a;

    static {
        for (EnumC4012u enumC4012u : values()) {
            f43894h.put(enumC4012u.f43896a, enumC4012u);
        }
    }

    EnumC4012u(String str) {
        this.f43896a = str;
    }

    static EnumC4012u b(String str) {
        Map map = f43894h;
        if (map.containsKey(str)) {
            return (EnumC4012u) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43896a;
    }
}
