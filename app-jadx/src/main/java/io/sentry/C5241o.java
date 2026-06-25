package io.sentry;

/* JADX INFO: renamed from: io.sentry.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5241o implements InterfaceC5177b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f50877a = new ThreadLocal();

    /* JADX INFO: renamed from: io.sentry.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC5192e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC5114a0 f50878a;

        a(InterfaceC5114a0 interfaceC5114a0) {
            this.f50878a = interfaceC5114a0;
        }

        @Override // io.sentry.InterfaceC5192e0, java.lang.AutoCloseable
        public void close() {
            C5241o.f50877a.set(this.f50878a);
        }
    }

    @Override // io.sentry.InterfaceC5177b0
    public InterfaceC5192e0 b(InterfaceC5114a0 interfaceC5114a0) {
        InterfaceC5114a0 interfaceC5114a02 = get();
        f50877a.set(interfaceC5114a0);
        return new a(interfaceC5114a02);
    }

    @Override // io.sentry.InterfaceC5177b0
    public void close() {
        f50877a.remove();
    }

    @Override // io.sentry.InterfaceC5177b0
    public InterfaceC5114a0 get() {
        return (InterfaceC5114a0) f50877a.get();
    }

    @Override // io.sentry.InterfaceC5177b0
    public void a() {
    }
}
