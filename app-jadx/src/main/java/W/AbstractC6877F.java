package w;

/* JADX INFO: renamed from: w.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6877F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC6875D f62353a = new C6919x(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC6875D f62354b = new C6919x(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC6875D f62355c = new C6919x(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC6875D f62356d = new InterfaceC6875D() { // from class: w.E
        @Override // w.InterfaceC6875D
        public final float a(float f10) {
            return AbstractC6877F.b(f10);
        }
    };

    public static final InterfaceC6875D c() {
        return f62355c;
    }

    public static final InterfaceC6875D d() {
        return f62353a;
    }

    public static final InterfaceC6875D e() {
        return f62356d;
    }

    public static final InterfaceC6875D f() {
        return f62354b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f10) {
        return f10;
    }
}
