package Lf;

import Td.AbstractC2156g;
import java.util.Iterator;

/* JADX INFO: renamed from: Lf.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1900g {
    public static final void a(Zd.i iVar, Throwable th2) {
        Iterator it = AbstractC1899f.a().iterator();
        while (it.hasNext()) {
            try {
                ((Gf.L) it.next()).z(iVar, th2);
            } catch (Throwable th3) {
                AbstractC1899f.b(Gf.M.b(th2, th3));
            }
        }
        try {
            AbstractC2156g.a(th2, new C1901h(iVar));
        } catch (Throwable unused) {
        }
        AbstractC1899f.b(th2);
    }
}
