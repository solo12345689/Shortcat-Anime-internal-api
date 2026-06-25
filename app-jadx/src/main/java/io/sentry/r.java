package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f51171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f51172b;

    public r(C5322z3 c5322z3, ILogger iLogger) {
        this.f51171a = (C5322z3) io.sentry.util.w.c(c5322z3, "SentryOptions is required.");
        this.f51172b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(EnumC5215i3 enumC5215i3, Throwable th2, String str, Object... objArr) {
        if (this.f51172b == null || !d(enumC5215i3)) {
            return;
        }
        this.f51172b.a(enumC5215i3, th2, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void b(EnumC5215i3 enumC5215i3, String str, Throwable th2) {
        if (this.f51172b == null || !d(enumC5215i3)) {
            return;
        }
        this.f51172b.b(enumC5215i3, str, th2);
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5215i3 enumC5215i3, String str, Object... objArr) {
        if (this.f51172b == null || !d(enumC5215i3)) {
            return;
        }
        this.f51172b.c(enumC5215i3, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC5215i3 enumC5215i3) {
        return enumC5215i3 != null && this.f51171a.isDebug() && enumC5215i3.ordinal() >= this.f51171a.getDiagnosticLevel().ordinal();
    }
}
