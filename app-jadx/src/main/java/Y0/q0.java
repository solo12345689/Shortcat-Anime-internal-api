package Y0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2485u f22714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f22715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f22718e;

    public /* synthetic */ q0(AbstractC2485u abstractC2485u, L l10, int i10, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2485u, l10, i10, i11, obj);
    }

    public static /* synthetic */ q0 b(q0 q0Var, AbstractC2485u abstractC2485u, L l10, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            abstractC2485u = q0Var.f22714a;
        }
        if ((i12 & 2) != 0) {
            l10 = q0Var.f22715b;
        }
        if ((i12 & 4) != 0) {
            i10 = q0Var.f22716c;
        }
        if ((i12 & 8) != 0) {
            i11 = q0Var.f22717d;
        }
        if ((i12 & 16) != 0) {
            obj = q0Var.f22718e;
        }
        Object obj3 = obj;
        int i13 = i10;
        return q0Var.a(abstractC2485u, l10, i13, i11, obj3);
    }

    public final q0 a(AbstractC2485u abstractC2485u, L l10, int i10, int i11, Object obj) {
        return new q0(abstractC2485u, l10, i10, i11, obj, null);
    }

    public final AbstractC2485u c() {
        return this.f22714a;
    }

    public final int d() {
        return this.f22716c;
    }

    public final int e() {
        return this.f22717d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return AbstractC5504s.c(this.f22714a, q0Var.f22714a) && AbstractC5504s.c(this.f22715b, q0Var.f22715b) && H.f(this.f22716c, q0Var.f22716c) && I.h(this.f22717d, q0Var.f22717d) && AbstractC5504s.c(this.f22718e, q0Var.f22718e);
    }

    public final L f() {
        return this.f22715b;
    }

    public int hashCode() {
        AbstractC2485u abstractC2485u = this.f22714a;
        int iHashCode = (((((((abstractC2485u == null ? 0 : abstractC2485u.hashCode()) * 31) + this.f22715b.hashCode()) * 31) + H.g(this.f22716c)) * 31) + I.i(this.f22717d)) * 31;
        Object obj = this.f22718e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f22714a + ", fontWeight=" + this.f22715b + ", fontStyle=" + ((Object) H.h(this.f22716c)) + ", fontSynthesis=" + ((Object) I.l(this.f22717d)) + ", resourceLoaderCacheKey=" + this.f22718e + ')';
    }

    private q0(AbstractC2485u abstractC2485u, L l10, int i10, int i11, Object obj) {
        this.f22714a = abstractC2485u;
        this.f22715b = l10;
        this.f22716c = i10;
        this.f22717d = i11;
        this.f22718e = obj;
    }
}
