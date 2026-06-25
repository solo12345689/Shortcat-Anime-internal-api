package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum f0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f43792g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43794a;

    static {
        for (f0 f0Var : values()) {
            f43792g.put(f0Var.f43794a, f0Var);
        }
    }

    f0(String str) {
        this.f43794a = str;
    }

    static f0 b(String str) {
        Map map = f43792g;
        if (map.containsKey(str)) {
            return (f0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43794a;
    }
}
