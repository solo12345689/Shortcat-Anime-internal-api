package o2;

import Gf.C1608f0;
import Gf.X0;
import Td.s;
import Zd.i;
import Zd.j;

/* JADX INFO: renamed from: o2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5804c {
    public static final C5803b a() {
        i iVarB2;
        try {
            iVarB2 = C1608f0.c().b2();
        } catch (s unused) {
            iVarB2 = j.f23275a;
        } catch (IllegalStateException unused2) {
            iVarB2 = j.f23275a;
        }
        return new C5803b(iVarB2.w(X0.b(null, 1, null)));
    }
}
