package K0;

import I0.AbstractC1675a;
import i1.C5021n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC1776a {
    public S(InterfaceC1778b interfaceC1778b) {
        super(interfaceC1778b, null);
    }

    @Override // K0.AbstractC1776a
    protected long d(AbstractC1785e0 abstractC1785e0, long j10) {
        U uI2 = abstractC1785e0.I2();
        AbstractC5504s.e(uI2);
        long jP1 = uI2.P1();
        return C6224f.q(C6224f.e((((long) Float.floatToRawIntBits(C5021n.k(jP1))) << 32) | (((long) Float.floatToRawIntBits(C5021n.l(jP1))) & 4294967295L)), j10);
    }

    @Override // K0.AbstractC1776a
    protected Map e(AbstractC1785e0 abstractC1785e0) {
        U uI2 = abstractC1785e0.I2();
        AbstractC5504s.e(uI2);
        return uI2.M1().z();
    }

    @Override // K0.AbstractC1776a
    protected int i(AbstractC1785e0 abstractC1785e0, AbstractC1675a abstractC1675a) {
        U uI2 = abstractC1785e0.I2();
        AbstractC5504s.e(uI2);
        return uI2.N(abstractC1675a);
    }
}
