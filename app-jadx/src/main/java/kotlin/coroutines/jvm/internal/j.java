package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends a {
    public j(Zd.e eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != Zd.j.f23275a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // Zd.e
    public Zd.i getContext() {
        return Zd.j.f23275a;
    }
}
