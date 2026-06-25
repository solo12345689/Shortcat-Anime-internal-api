package io.sentry;

/* JADX INFO: renamed from: io.sentry.x1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5310x1 {

    /* JADX INFO: renamed from: a */
    private io.sentry.protocol.x f51550a;

    /* JADX INFO: renamed from: b */
    private Y3 f51551b;

    /* JADX INFO: renamed from: c */
    private Y3 f51552c;

    /* JADX INFO: renamed from: d */
    private Boolean f51553d;

    /* JADX INFO: renamed from: e */
    private final C5186d f51554e;

    public C5310x1() {
        this(new io.sentry.protocol.x(), new Y3(), null, null, null);
    }

    public C5186d a() {
        return this.f51554e;
    }

    public Y3 b() {
        return this.f51552c;
    }

    public Double c() {
        Double dI = this.f51554e.i();
        return Double.valueOf(dI == null ? 0.0d : dI.doubleValue());
    }

    public Y3 d() {
        return this.f51551b;
    }

    public io.sentry.protocol.x e() {
        return this.f51550a;
    }

    public Boolean f() {
        return this.f51553d;
    }

    public T3 g() {
        T3 t32 = new T3(this.f51550a, this.f51551b, "default", null, null);
        t32.t("auto");
        return t32;
    }

    public f4 h() {
        return this.f51554e.J();
    }

    public C5310x1(C5310x1 c5310x1) {
        this(c5310x1.e(), c5310x1.d(), c5310x1.b(), c5310x1.a(), c5310x1.f());
    }

    public C5310x1(io.sentry.protocol.x xVar, Y3 y32, Y3 y33, C5186d c5186d, Boolean bool) {
        this.f51550a = xVar;
        this.f51551b = y32;
        this.f51552c = y33;
        this.f51554e = io.sentry.util.H.e(c5186d, bool, null, null);
        this.f51553d = bool;
    }
}
