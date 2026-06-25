package Kf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class w implements Zd.e, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zd.e f11134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zd.i f11135b;

    public w(Zd.e eVar, Zd.i iVar) {
        this.f11134a = eVar;
        this.f11135b = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Zd.e eVar = this.f11134a;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // Zd.e
    public Zd.i getContext() {
        return this.f11135b;
    }

    @Override // Zd.e
    public void resumeWith(Object obj) {
        this.f11134a.resumeWith(obj);
    }
}
