package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i4 extends T3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final io.sentry.protocol.H f50739t = io.sentry.protocol.H.CUSTOM;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f50740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.H f50741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h4 f50742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f50743s;

    public i4(String str, String str2) {
        this(str, str2, (h4) null);
    }

    public static i4 x(C5310x1 c5310x1) {
        Boolean boolF = c5310x1.f();
        C5186d c5186dA = c5310x1.a();
        return new i4(c5310x1.e(), c5310x1.d(), c5310x1.b(), boolF == null ? null : new h4(boolF, c5186dA.j(), c5310x1.c()), c5186dA);
    }

    public io.sentry.protocol.H A() {
        return this.f50741q;
    }

    public void B(boolean z10) {
        this.f50743s = z10;
    }

    public String y() {
        return this.f50740p;
    }

    public h4 z() {
        return this.f50742r;
    }

    public i4(String str, io.sentry.protocol.H h10, String str2) {
        this(str, h10, str2, null);
    }

    public i4(String str, String str2, h4 h4Var) {
        this(str, io.sentry.protocol.H.CUSTOM, str2, h4Var);
    }

    public i4(String str, io.sentry.protocol.H h10, String str2, h4 h4Var) {
        super(str2);
        this.f50743s = false;
        this.f50740p = (String) io.sentry.util.w.c(str, "name is required");
        this.f50741q = h10;
        u(h4Var);
        this.f49341m = io.sentry.util.H.d(null, h4Var);
    }

    public i4(io.sentry.protocol.x xVar, Y3 y32, Y3 y33, h4 h4Var, C5186d c5186d) {
        super(xVar, y32, "default", y33, null);
        this.f50743s = false;
        this.f50740p = "<unlabeled transaction>";
        this.f50742r = h4Var;
        this.f50741q = f50739t;
        this.f49341m = io.sentry.util.H.d(c5186d, h4Var);
    }
}
