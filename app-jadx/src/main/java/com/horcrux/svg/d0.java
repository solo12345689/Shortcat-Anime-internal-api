package com.horcrux.svg;

import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum d0 {
    Normal(Constants.NORMAL),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f43778o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43780a;

    static {
        for (d0 d0Var : values()) {
            f43778o.put(d0Var.f43780a, d0Var);
        }
    }

    d0(String str) {
        this.f43780a = str;
    }

    static d0 b(String str) {
        return (d0) f43778o.get(str);
    }

    static boolean c(String str) {
        return f43778o.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43780a;
    }
}
