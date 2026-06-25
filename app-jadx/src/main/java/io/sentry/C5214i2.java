package io.sentry;

/* JADX INFO: renamed from: io.sentry.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5214i2 implements InterfaceC5249p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5249p2 f50738a;

    public C5214i2() {
        if (a()) {
            this.f50738a = new C5200f3();
        } else {
            this.f50738a = new C5275s3();
        }
    }

    private static boolean a() {
        return io.sentry.util.y.c() && io.sentry.util.y.b();
    }

    @Override // io.sentry.InterfaceC5249p2
    public AbstractC5244o2 now() {
        return this.f50738a.now();
    }
}
