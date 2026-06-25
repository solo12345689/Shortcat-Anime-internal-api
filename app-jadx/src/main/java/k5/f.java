package k5;

import U4.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends AbstractC5449a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static f f52093A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static f f52094B;

    public static f i0(Class cls) {
        return (f) new f().f(cls);
    }

    public static f j0(j jVar) {
        return (f) new f().g(jVar);
    }

    public static f k0(S4.f fVar) {
        return (f) new f().a0(fVar);
    }

    public static f l0(boolean z10) {
        if (z10) {
            if (f52093A == null) {
                f52093A = (f) ((f) new f().c0(true)).c();
            }
            return f52093A;
        }
        if (f52094B == null) {
            f52094B = (f) ((f) new f().c0(false)).c();
        }
        return f52094B;
    }

    @Override // k5.AbstractC5449a
    public boolean equals(Object obj) {
        return (obj instanceof f) && super.equals(obj);
    }

    @Override // k5.AbstractC5449a
    public int hashCode() {
        return super.hashCode();
    }
}
