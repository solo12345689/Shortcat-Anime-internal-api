package P9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class N extends AbstractC2011u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AbstractC2011u f13598e = new N(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f13599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f13600d;

    N(Object[] objArr, int i10) {
        this.f13599c = objArr;
        this.f13600d = i10;
    }

    @Override // P9.AbstractC2011u, P9.AbstractC2009s
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f13599c, 0, objArr, i10, this.f13600d);
        return i10 + this.f13600d;
    }

    @Override // P9.AbstractC2009s
    Object[] d() {
        return this.f13599c;
    }

    @Override // P9.AbstractC2009s
    int e() {
        return this.f13600d;
    }

    @Override // P9.AbstractC2009s
    int f() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i10) {
        O9.n.h(i10, this.f13600d);
        Object obj = this.f13599c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // P9.AbstractC2009s
    boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13600d;
    }
}
