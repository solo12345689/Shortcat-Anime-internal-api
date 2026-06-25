package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC4009r {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f43869f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43871a;

    static {
        for (EnumC4009r enumC4009r : values()) {
            f43869f.put(enumC4009r.f43871a, enumC4009r);
        }
    }

    EnumC4009r(String str) {
        this.f43871a = str;
    }

    static EnumC4009r b(String str) {
        Map map = f43869f;
        if (map.containsKey(str)) {
            return (EnumC4009r) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43871a;
    }
}
