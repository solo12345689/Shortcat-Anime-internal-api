package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34343a = "name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34344b = "time";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f34345c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f34346d;

    public a(String str) {
        HashMap map = new HashMap();
        this.f34346d = map;
        map.put("name", str);
        map.put(f34344b, String.valueOf(System.currentTimeMillis()));
    }

    public a a(String str, String str2) {
        this.f34346d.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.f34346d.toString() + "]";
    }

    public Map<String, String> a() {
        return this.f34346d;
    }
}
