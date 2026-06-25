package com.amazon.a.a.n.a.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends com.amazon.a.a.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34487a = "EMPTY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34488b = "MISSING_FIELD";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f34489c = 1;

    private g(String str, String str2) {
        super("MALFORMED_RESPONSE", str, str2);
    }

    public static final g a(String str) {
        return new g(f34488b, str);
    }

    public static final g d() {
        return new g(f34487a, null);
    }
}
