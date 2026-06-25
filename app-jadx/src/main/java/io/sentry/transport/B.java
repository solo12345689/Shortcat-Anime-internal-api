package io.sentry.transport;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51353a;

        b(int i10) {
            super();
            this.f51353a = i10;
        }

        @Override // io.sentry.transport.B
        public int c() {
            return this.f51353a;
        }

        @Override // io.sentry.transport.B
        public boolean d() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f51354a = new c();

        private c() {
            super();
        }

        @Override // io.sentry.transport.B
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.B
        public boolean d() {
            return true;
        }
    }

    public static B a() {
        return b(-1);
    }

    public static B b(int i10) {
        return new b(i10);
    }

    public static B e() {
        return c.f51354a;
    }

    public abstract int c();

    public abstract boolean d();

    private B() {
    }
}
