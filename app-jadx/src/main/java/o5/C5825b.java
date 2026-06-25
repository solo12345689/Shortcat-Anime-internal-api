package o5;

import t.C6551a;
import t.i0;

/* JADX INFO: renamed from: o5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5825b extends C6551a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54528g;

    @Override // t.i0, java.util.Map
    public void clear() {
        this.f54528g = 0;
        super.clear();
    }

    @Override // t.i0
    public void h(i0 i0Var) {
        this.f54528g = 0;
        super.h(i0Var);
    }

    @Override // t.i0, java.util.Map
    public int hashCode() {
        if (this.f54528g == 0) {
            this.f54528g = super.hashCode();
        }
        return this.f54528g;
    }

    @Override // t.i0
    public Object i(int i10) {
        this.f54528g = 0;
        return super.i(i10);
    }

    @Override // t.i0
    public Object j(int i10, Object obj) {
        this.f54528g = 0;
        return super.j(i10, obj);
    }

    @Override // t.i0, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f54528g = 0;
        return super.put(obj, obj2);
    }
}
