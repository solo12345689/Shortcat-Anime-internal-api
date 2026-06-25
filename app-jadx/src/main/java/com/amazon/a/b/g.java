package com.amazon.a.b;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34773a = "license";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34774b = "customerId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34775c = "deviceId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f34778f;

    public g(Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        if (map == null) {
            throw com.amazon.a.a.n.a.a.g.d();
        }
        this.f34776d = a(f34773a, map);
        this.f34777e = a(f34774b, map);
        this.f34778f = a(f34775c, map);
    }

    private String a(String str, Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        String str2 = map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    public String b() {
        return this.f34778f;
    }

    public String c() {
        return this.f34776d;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f34777e;
    }
}
