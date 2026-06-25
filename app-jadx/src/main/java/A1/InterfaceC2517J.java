package a1;

/* JADX INFO: renamed from: a1.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2517J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23518a = a.f23519a;

    int a(int i10);

    int b(int i10);

    /* JADX INFO: renamed from: a1.J$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f23519a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final InterfaceC2517J f23520b = new C0411a();

        private a() {
        }

        public final InterfaceC2517J a() {
            return f23520b;
        }

        /* JADX INFO: renamed from: a1.J$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0411a implements InterfaceC2517J {
            C0411a() {
            }

            @Override // a1.InterfaceC2517J
            public int a(int i10) {
                return i10;
            }

            @Override // a1.InterfaceC2517J
            public int b(int i10) {
                return i10;
            }
        }
    }
}
