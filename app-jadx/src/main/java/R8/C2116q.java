package R8;

/* JADX INFO: renamed from: R8.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2116q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C2116q f15351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f15352c = new r(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f15353a;

    private C2116q() {
    }

    public static synchronized C2116q b() {
        try {
            if (f15351b == null) {
                f15351b = new C2116q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f15351b;
    }

    public r a() {
        return this.f15353a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f15353a = f15352c;
            return;
        }
        r rVar2 = this.f15353a;
        if (rVar2 == null || rVar2.i() < rVar.i()) {
            this.f15353a = rVar;
        }
    }
}
