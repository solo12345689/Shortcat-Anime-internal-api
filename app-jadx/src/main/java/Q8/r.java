package Q8;

import P8.a;
import R8.AbstractC2115p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a */
    private final O8.c[] f14504a;

    /* JADX INFO: renamed from: b */
    private final boolean f14505b;

    /* JADX INFO: renamed from: c */
    private final int f14506c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        private InterfaceC2066n f14507a;

        /* JADX INFO: renamed from: c */
        private O8.c[] f14509c;

        /* JADX INFO: renamed from: b */
        private boolean f14508b = true;

        /* JADX INFO: renamed from: d */
        private int f14510d = 0;

        /* synthetic */ a(X x10) {
        }

        public r a() {
            AbstractC2115p.b(this.f14507a != null, "execute parameter required");
            return new W(this, this.f14509c, this.f14508b, this.f14510d);
        }

        public a b(InterfaceC2066n interfaceC2066n) {
            this.f14507a = interfaceC2066n;
            return this;
        }

        public a c(boolean z10) {
            this.f14508b = z10;
            return this;
        }

        public a d(O8.c... cVarArr) {
            this.f14509c = cVarArr;
            return this;
        }

        public a e(int i10) {
            this.f14510d = i10;
            return this;
        }
    }

    protected r(O8.c[] cVarArr, boolean z10, int i10) {
        this.f14504a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f14505b = z11;
        this.f14506c = i10;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, n9.j jVar);

    public boolean c() {
        return this.f14505b;
    }

    public final int d() {
        return this.f14506c;
    }

    public final O8.c[] e() {
        return this.f14504a;
    }
}
