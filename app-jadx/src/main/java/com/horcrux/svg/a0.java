package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum a0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Map f43752r = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43754a;

    static {
        for (a0 a0Var : values()) {
            f43752r.put(a0Var.f43754a, a0Var);
        }
    }

    a0(String str) {
        this.f43754a = str;
    }

    static a0 b(String str) {
        Map map = f43752r;
        if (map.containsKey(str)) {
            return (a0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43754a;
    }
}
