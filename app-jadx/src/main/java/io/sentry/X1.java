package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class X1 implements W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U1 f49380a;

    public X1(U1 u12) {
        this.f49380a = (U1) io.sentry.util.w.c(u12, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.W1
    public T1 c(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        io.sentry.util.w.c(c5322z3, "SentryOptions is required");
        String strA = this.f49380a.a();
        if (strA != null && d(strA, c5322z3.getLogger())) {
            return a(new B(interfaceC5114a0, c5322z3.getSerializer(), c5322z3.getLogger(), c5322z3.getFlushTimeoutMillis(), c5322z3.getMaxQueueSize()), strA, c5322z3.getLogger());
        }
        c5322z3.getLogger().c(EnumC5215i3.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }
}
