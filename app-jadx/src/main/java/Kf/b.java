package Kf;

import Jf.I;
import Td.L;
import Td.u;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private d[] f11079a;

    /* JADX INFO: renamed from: b */
    private int f11080b;

    /* JADX INFO: renamed from: c */
    private int f11081c;

    /* JADX INFO: renamed from: d */
    private x f11082d;

    public final I e() {
        x xVar;
        synchronized (this) {
            xVar = this.f11082d;
            if (xVar == null) {
                xVar = new x(this.f11080b);
                this.f11082d = xVar;
            }
        }
        return xVar;
    }

    protected final d g() {
        d dVarI;
        x xVar;
        synchronized (this) {
            try {
                d[] dVarArrJ = this.f11079a;
                if (dVarArrJ == null) {
                    dVarArrJ = j(2);
                    this.f11079a = dVarArrJ;
                } else if (this.f11080b >= dVarArrJ.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrJ, dVarArrJ.length * 2);
                    AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
                    this.f11079a = (d[]) objArrCopyOf;
                    dVarArrJ = (d[]) objArrCopyOf;
                }
                int i10 = this.f11081c;
                do {
                    dVarI = dVarArrJ[i10];
                    if (dVarI == null) {
                        dVarI = i();
                        dVarArrJ[i10] = dVarI;
                    }
                    i10++;
                    if (i10 >= dVarArrJ.length) {
                        i10 = 0;
                    }
                    AbstractC5504s.f(dVarI, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarI.a(this));
                this.f11081c = i10;
                this.f11080b++;
                xVar = this.f11082d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (xVar != null) {
            xVar.Z(1);
        }
        return dVarI;
    }

    protected abstract d i();

    protected abstract d[] j(int i10);

    protected final void k(d dVar) {
        x xVar;
        int i10;
        Zd.e[] eVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f11080b - 1;
                this.f11080b = i11;
                xVar = this.f11082d;
                if (i11 == 0) {
                    this.f11081c = 0;
                }
                AbstractC5504s.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                eVarArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Zd.e eVar : eVarArrB) {
            if (eVar != null) {
                u.a aVar = Td.u.f17466b;
                eVar.resumeWith(Td.u.b(L.f17438a));
            }
        }
        if (xVar != null) {
            xVar.Z(-1);
        }
    }

    protected final int l() {
        return this.f11080b;
    }

    protected final d[] m() {
        return this.f11079a;
    }
}
