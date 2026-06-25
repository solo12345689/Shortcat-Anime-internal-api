package e9;

/* JADX INFO: renamed from: e9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4662e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC4659b f45819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile InterfaceC4659b f45820b;

    static {
        C4661d c4661d = new C4661d(null);
        f45819a = c4661d;
        f45820b = c4661d;
    }

    public static InterfaceC4659b a() {
        return f45820b;
    }
}
