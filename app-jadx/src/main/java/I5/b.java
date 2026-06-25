package I5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements e {
    @Override // I5.e
    public void a(c cVar) {
        boolean zIsFinished = cVar.isFinished();
        try {
            f(cVar);
        } finally {
            if (zIsFinished) {
                cVar.close();
            }
        }
    }

    @Override // I5.e
    public void c(c cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    protected abstract void e(c cVar);

    protected abstract void f(c cVar);

    @Override // I5.e
    public void b(c cVar) {
    }

    @Override // I5.e
    public void d(c cVar) {
    }
}
