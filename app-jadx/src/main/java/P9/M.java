package P9;

import P9.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class M extends r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final M f13592j = new M();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f13593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f13594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f13595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int f13596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient M f13597i;

    private M() {
        this.f13593e = null;
        this.f13594f = new Object[0];
        this.f13595g = 0;
        this.f13596h = 0;
        this.f13597i = this;
    }

    @Override // P9.AbstractC2012v
    AbstractC2013w e() {
        return new O.a(this, this.f13594f, this.f13595g, this.f13596h);
    }

    @Override // P9.AbstractC2012v
    AbstractC2013w f() {
        return new O.b(this, new O.c(this.f13594f, this.f13595g, this.f13596h));
    }

    @Override // P9.AbstractC2012v, java.util.Map
    public Object get(Object obj) {
        Object objW = O.w(this.f13593e, this.f13594f, this.f13596h, this.f13595g, obj);
        if (objW == null) {
            return null;
        }
        return objW;
    }

    @Override // P9.AbstractC2012v
    boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f13596h;
    }

    @Override // P9.r
    public r u() {
        return this.f13597i;
    }

    M(Object[] objArr, int i10) {
        this.f13594f = objArr;
        this.f13596h = i10;
        this.f13595g = 0;
        int iT = i10 >= 2 ? AbstractC2013w.t(i10) : 0;
        this.f13593e = O.v(objArr, i10, iT, 0);
        this.f13597i = new M(O.v(objArr, i10, iT, 1), objArr, i10, this);
    }

    private M(Object obj, Object[] objArr, int i10, M m10) {
        this.f13593e = obj;
        this.f13594f = objArr;
        this.f13595g = 1;
        this.f13596h = i10;
        this.f13597i = m10;
    }
}
