package I0;

import K0.U;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final U a(U u10) {
        K0.J jL1 = u10.L1();
        while (true) {
            K0.J jA0 = jL1.A0();
            if ((jA0 != null ? jA0.j0() : null) == null) {
                U uI2 = jL1.w0().I2();
                AbstractC5504s.e(uI2);
                return uI2;
            }
            K0.J jA02 = jL1.A0();
            K0.J jJ0 = jA02 != null ? jA02.j0() : null;
            AbstractC5504s.e(jJ0);
            if (jJ0.Z0()) {
                jL1 = jL1.A0();
                AbstractC5504s.e(jL1);
            } else {
                K0.J jA03 = jL1.A0();
                AbstractC5504s.e(jA03);
                jL1 = jA03.j0();
                AbstractC5504s.e(jL1);
            }
        }
    }
}
