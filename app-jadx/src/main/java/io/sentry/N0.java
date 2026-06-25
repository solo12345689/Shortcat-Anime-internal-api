package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class N0 implements ILogger {

    /* JADX INFO: renamed from: a */
    private static final N0 f49255a = new N0();

    private N0() {
    }

    public static N0 e() {
        return f49255a;
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC5215i3 enumC5215i3) {
        return false;
    }

    @Override // io.sentry.ILogger
    public void b(EnumC5215i3 enumC5215i3, String str, Throwable th2) {
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5215i3 enumC5215i3, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void a(EnumC5215i3 enumC5215i3, Throwable th2, String str, Object... objArr) {
    }
}
