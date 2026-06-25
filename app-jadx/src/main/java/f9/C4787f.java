package f9;

/* JADX INFO: renamed from: f9.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C4787f extends H {

    /* JADX INFO: renamed from: c */
    private final i f46971c;

    C4787f(i iVar, int i10) {
        super(iVar.size(), i10);
        this.f46971c = iVar;
    }

    @Override // f9.H
    protected final Object b(int i10) {
        return this.f46971c.get(i10);
    }
}
