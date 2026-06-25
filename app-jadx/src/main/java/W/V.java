package w;

import Y.b2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class V extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y.C0 f62426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y.C0 f62427c;

    public V(Object obj) {
        super(null);
        this.f62426b = b2.e(obj, null, 2, null);
        this.f62427c = b2.e(obj, null, 2, null);
    }

    @Override // w.q0
    public Object a() {
        return this.f62426b.getValue();
    }

    @Override // w.q0
    public void c(Object obj) {
        this.f62426b.setValue(obj);
    }

    @Override // w.q0
    public void f() {
    }

    @Override // w.q0
    public void e(o0 o0Var) {
    }
}
