package P9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class P extends AbstractC2013w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f13615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final P f13616i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f13617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f13618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f13619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f13620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f13621g;

    static {
        Object[] objArr = new Object[0];
        f13615h = objArr;
        f13616i = new P(objArr, 0, objArr, 0, 0);
    }

    P(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f13617c = objArr;
        this.f13618d = i10;
        this.f13619e = objArr2;
        this.f13620f = i11;
        this.f13621g = i12;
    }

    @Override // P9.AbstractC2009s
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f13617c, 0, objArr, i10, this.f13621g);
        return i10 + this.f13621g;
    }

    @Override // P9.AbstractC2009s, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f13619e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = AbstractC2008q.c(obj);
        while (true) {
            int i10 = iC & this.f13620f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // P9.AbstractC2009s
    Object[] d() {
        return this.f13617c;
    }

    @Override // P9.AbstractC2009s
    int e() {
        return this.f13621g;
    }

    @Override // P9.AbstractC2009s
    int f() {
        return 0;
    }

    @Override // P9.AbstractC2013w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f13618d;
    }

    @Override // P9.AbstractC2009s
    boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public X iterator() {
        return b().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f13621g;
    }

    @Override // P9.AbstractC2013w
    AbstractC2011u x() {
        return AbstractC2011u.s(this.f13617c, this.f13621g);
    }

    @Override // P9.AbstractC2013w
    boolean y() {
        return true;
    }
}
