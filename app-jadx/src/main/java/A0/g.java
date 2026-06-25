package a0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6550P;
import t.Q;
import t.d0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final void a(C6550P c6550p, Object obj, Object obj2) {
        int iN = c6550p.n(obj);
        boolean z10 = iN < 0;
        Object obj3 = z10 ? null : c6550p.f60045c[iN];
        if (obj3 != null) {
            if (obj3 instanceof Q) {
                AbstractC5504s.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((Q) obj3).h(obj2);
            } else if (obj3 != obj2) {
                Q q10 = new Q(0, 1, null);
                AbstractC5504s.f(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                q10.h(obj3);
                q10.h(obj2);
                obj2 = q10;
            }
            obj2 = obj3;
        }
        if (!z10) {
            c6550p.f60045c[iN] = obj2;
            return;
        }
        int i10 = ~iN;
        c6550p.f60044b[i10] = obj;
        c6550p.f60045c[i10] = obj2;
    }

    public static final void b(C6550P c6550p) {
        c6550p.k();
    }

    public static /* synthetic */ C6550P d(C6550P c6550p, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            c6550p = d0.b();
        }
        return c(c6550p);
    }

    public static final boolean e(C6550P c6550p, Object obj) {
        return c6550p.c(obj);
    }

    public static final int f(C6550P c6550p) {
        return c6550p.g();
    }

    public static final boolean g(C6550P c6550p, Object obj, Object obj2) {
        Object objE = c6550p.e(obj);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof Q)) {
            if (!AbstractC5504s.c(objE, obj2)) {
                return false;
            }
            c6550p.u(obj);
            return true;
        }
        Q q10 = (Q) objE;
        boolean zY = q10.y(obj2);
        if (zY && q10.d()) {
            c6550p.u(obj);
        }
        return zY;
    }

    public static final void h(C6550P c6550p, Object obj) {
        boolean zD;
        long[] jArr = c6550p.f60043a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = c6550p.f60044b[i13];
                        Object obj3 = c6550p.f60045c[i13];
                        if (obj3 instanceof Q) {
                            AbstractC5504s.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            Q q10 = (Q) obj3;
                            q10.y(obj);
                            zD = q10.d();
                        } else {
                            zD = obj3 == obj;
                        }
                        if (zD) {
                            c6550p.v(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void i(C6550P c6550p, Object obj, Object obj2) {
        c6550p.x(obj, obj2);
    }

    public static C6550P c(C6550P c6550p) {
        return c6550p;
    }
}
