package Jf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface E {

    /* JADX INFO: renamed from: a */
    public static final a f9525a = a.f9526a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f9526a = new a();

        /* JADX INFO: renamed from: b */
        private static final E f9527b = new F();

        /* JADX INFO: renamed from: c */
        private static final E f9528c = new G();

        private a() {
        }

        public static /* synthetic */ E b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final E a(long j10, long j11) {
            return new H(j10, j11);
        }

        public final E c() {
            return f9527b;
        }

        public final E d() {
            return f9528c;
        }
    }

    InterfaceC1742e a(I i10);
}
