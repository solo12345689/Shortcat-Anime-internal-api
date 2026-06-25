package I0;

import K0.AbstractC1785e0;
import r0.C6224f;
import r0.C6226h;

/* JADX INFO: renamed from: I0.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1691q {
    public static final C6226h a(InterfaceC1690p interfaceC1690p) {
        C6226h c6226hV;
        InterfaceC1690p interfaceC1690pX0 = interfaceC1690p.x0();
        return (interfaceC1690pX0 == null || (c6226hV = InterfaceC1690p.V(interfaceC1690pX0, interfaceC1690p, false, 2, null)) == null) ? new C6226h(0.0f, 0.0f, (int) (interfaceC1690p.a() >> 32), (int) (interfaceC1690p.a() & 4294967295L)) : c6226hV;
    }

    public static final C6226h b(InterfaceC1690p interfaceC1690p) {
        return InterfaceC1690p.V(d(interfaceC1690p), interfaceC1690p, false, 2, null);
    }

    public static final C6226h c(InterfaceC1690p interfaceC1690p) {
        InterfaceC1690p interfaceC1690pD = d(interfaceC1690p);
        float fA = (int) (interfaceC1690pD.a() >> 32);
        float fA2 = (int) (interfaceC1690pD.a() & 4294967295L);
        C6226h c6226hV = InterfaceC1690p.V(interfaceC1690pD, interfaceC1690p, false, 2, null);
        float fI = c6226hV.i();
        if (fI < 0.0f) {
            fI = 0.0f;
        }
        if (fI > fA) {
            fI = fA;
        }
        float fL = c6226hV.l();
        if (fL < 0.0f) {
            fL = 0.0f;
        }
        if (fL > fA2) {
            fL = fA2;
        }
        float fJ = c6226hV.j();
        if (fJ < 0.0f) {
            fJ = 0.0f;
        }
        if (fJ <= fA) {
            fA = fJ;
        }
        float fE = c6226hV.e();
        float f10 = fE >= 0.0f ? fE : 0.0f;
        if (f10 <= fA2) {
            fA2 = f10;
        }
        if (fI == fA || fL == fA2) {
            return C6226h.f58334e.a();
        }
        long jC0 = interfaceC1690pD.c0(C6224f.e((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fL)) & 4294967295L)));
        long jC02 = interfaceC1690pD.c0(C6224f.e((((long) Float.floatToRawIntBits(fL)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA)) << 32)));
        long jC03 = interfaceC1690pD.c0(C6224f.e((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L)));
        long jC04 = interfaceC1690pD.c0(C6224f.e((((long) Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fI)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC02 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC04 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC03 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jC0 & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jC02 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jC04 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jC03 & 4294967295L));
        return new C6226h(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final InterfaceC1690p d(InterfaceC1690p interfaceC1690p) {
        InterfaceC1690p interfaceC1690p2;
        InterfaceC1690p interfaceC1690pX0 = interfaceC1690p.x0();
        while (true) {
            InterfaceC1690p interfaceC1690p3 = interfaceC1690pX0;
            interfaceC1690p2 = interfaceC1690p;
            interfaceC1690p = interfaceC1690p3;
            if (interfaceC1690p == null) {
                break;
            }
            interfaceC1690pX0 = interfaceC1690p.x0();
        }
        AbstractC1785e0 abstractC1785e0 = interfaceC1690p2 instanceof AbstractC1785e0 ? (AbstractC1785e0) interfaceC1690p2 : null;
        if (abstractC1785e0 == null) {
            return interfaceC1690p2;
        }
        AbstractC1785e0 abstractC1785e0P2 = abstractC1785e0.P2();
        while (true) {
            AbstractC1785e0 abstractC1785e02 = abstractC1785e0P2;
            AbstractC1785e0 abstractC1785e03 = abstractC1785e0;
            abstractC1785e0 = abstractC1785e02;
            if (abstractC1785e0 == null) {
                return abstractC1785e03;
            }
            abstractC1785e0P2 = abstractC1785e0.P2();
        }
    }

    public static final long e(InterfaceC1690p interfaceC1690p) {
        return interfaceC1690p.E0(C6224f.f58329b.c());
    }

    public static final long f(InterfaceC1690p interfaceC1690p) {
        return interfaceC1690p.c0(C6224f.f58329b.c());
    }

    public static final long g(InterfaceC1690p interfaceC1690p) {
        return interfaceC1690p.B(C6224f.f58329b.c());
    }
}
