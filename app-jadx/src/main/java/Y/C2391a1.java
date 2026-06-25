package Y;

/* JADX INFO: renamed from: Y.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2391a1 implements Z0, C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0 f22269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zd.i f22270b;

    public C2391a1(C0 c02, Zd.i iVar) {
        this.f22269a = c02;
        this.f22270b = iVar;
    }

    @Override // Gf.O
    public Zd.i getCoroutineContext() {
        return this.f22270b;
    }

    @Override // Y.C0, Y.h2
    public Object getValue() {
        return this.f22269a.getValue();
    }

    @Override // Y.C0
    public void setValue(Object obj) {
        this.f22269a.setValue(obj);
    }
}
