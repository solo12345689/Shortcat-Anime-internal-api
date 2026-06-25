package a5;

import U4.v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f23811a;

    public j(Object obj) {
        this.f23811a = o5.k.e(obj);
    }

    @Override // U4.v
    public Class a() {
        return this.f23811a.getClass();
    }

    @Override // U4.v
    public final Object get() {
        return this.f23811a;
    }

    @Override // U4.v
    public final int getSize() {
        return 1;
    }

    @Override // U4.v
    public void recycle() {
    }
}
