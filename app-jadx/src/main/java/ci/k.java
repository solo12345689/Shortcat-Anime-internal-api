package ci;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f33759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f33760b;

    k() {
    }

    synchronized void a(j jVar) {
        try {
            if (jVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            j jVar2 = this.f33760b;
            if (jVar2 != null) {
                jVar2.f33758c = jVar;
                this.f33760b = jVar;
            } else {
                if (this.f33759a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f33760b = jVar;
                this.f33759a = jVar;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized j b() {
        j jVar;
        jVar = this.f33759a;
        if (jVar != null) {
            j jVar2 = jVar.f33758c;
            this.f33759a = jVar2;
            if (jVar2 == null) {
                this.f33760b = null;
            }
        }
        return jVar;
    }

    synchronized j c(int i10) {
        try {
            if (this.f33759a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b();
    }
}
