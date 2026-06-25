package t;

import kotlin.jvm.internal.AbstractC5504s;
import u.AbstractC6702a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f60090a = new Object();

    public static final Object c(j0 j0Var, int i10) {
        Object obj;
        AbstractC5504s.h(j0Var, "<this>");
        int iA = AbstractC6702a.a(j0Var.f60086b, j0Var.f60088d, i10);
        if (iA < 0 || (obj = j0Var.f60087c[iA]) == f60090a) {
            return null;
        }
        return obj;
    }

    public static final void d(j0 j0Var, int i10) {
        AbstractC5504s.h(j0Var, "<this>");
        int iA = AbstractC6702a.a(j0Var.f60086b, j0Var.f60088d, i10);
        if (iA >= 0) {
            Object[] objArr = j0Var.f60087c;
            Object obj = objArr[iA];
            Object obj2 = f60090a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                j0Var.f60085a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j0 j0Var) {
        int i10 = j0Var.f60088d;
        int[] iArr = j0Var.f60086b;
        Object[] objArr = j0Var.f60087c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f60090a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        j0Var.f60085a = false;
        j0Var.f60088d = i11;
    }
}
