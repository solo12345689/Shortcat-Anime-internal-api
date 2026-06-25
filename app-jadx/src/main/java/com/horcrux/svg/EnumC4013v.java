package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC4013v {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f43899d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43901a;

    static {
        for (EnumC4013v enumC4013v : values()) {
            f43899d.put(enumC4013v.f43901a, enumC4013v);
        }
    }

    EnumC4013v(String str) {
        this.f43901a = str;
    }

    static EnumC4013v b(String str) {
        Map map = f43899d;
        if (map.containsKey(str)) {
            return (EnumC4013v) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43901a;
    }
}
