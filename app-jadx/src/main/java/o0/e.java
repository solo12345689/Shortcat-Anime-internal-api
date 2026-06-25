package o0;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import K0.AbstractC1796k;
import K0.H0;
import K0.I0;
import K0.J0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final boolean d(d dVar, long j10) {
        if (!dVar.getNode().isAttached()) {
            return false;
        }
        InterfaceC1690p interfaceC1690pX = AbstractC1796k.n(dVar).x();
        if (!interfaceC1690pX.b()) {
            return false;
        }
        long jE = AbstractC1691q.e(interfaceC1690pX);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fL1 = ((int) (dVar.L1() >> 32)) + fIntBitsToFloat;
        float fL12 = ((int) (dVar.L1() & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fL1) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fL12) {
                return true;
            }
        }
        return false;
    }

    public static final void e(f fVar, b bVar) {
        fVar.X0(bVar);
        fVar.v0(bVar);
    }

    public static final void f(I0 i02, Function1 function1) {
        if (function1.invoke(i02) != H0.f10420a) {
            return;
        }
        J0.f(i02, function1);
    }
}
