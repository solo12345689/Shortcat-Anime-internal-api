package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C3 implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49089b;

    public C3(String str, String str2) {
        this.f49088a = str;
        this.f49089b = str2;
    }

    private AbstractC5219j2 c(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.C().i() == null) {
            abstractC5219j2.C().x(new io.sentry.protocol.z());
        }
        io.sentry.protocol.z zVarI = abstractC5219j2.C().i();
        if (zVarI != null && zVarI.d() == null && zVarI.e() == null) {
            zVarI.f(this.f49089b);
            zVarI.h(this.f49088a);
        }
        return abstractC5219j2;
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, H h10) {
        return (V2) c(v22);
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E g(io.sentry.protocol.E e10, H h10) {
        return (io.sentry.protocol.E) c(e10);
    }

    public C3() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
