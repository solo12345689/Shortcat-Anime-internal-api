package ci;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f33783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o f33784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f33785c = true;

    q(Object obj, o oVar) {
        this.f33783a = obj;
        this.f33784b = oVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f33783a == qVar.f33783a && this.f33784b.equals(qVar.f33784b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f33783a.hashCode() + this.f33784b.f33770f.hashCode();
    }
}
