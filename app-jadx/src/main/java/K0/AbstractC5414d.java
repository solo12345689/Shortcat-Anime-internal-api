package k0;

import Td.AbstractC2156g;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: k0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5414d {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r9
  0x0034: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:5:0x0021, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.AbstractC5414d.a(java.lang.StringBuilder, java.util.List):void");
    }

    public static final Throwable b(Throwable th2, InterfaceC5082a interfaceC5082a) {
        c(th2, interfaceC5082a);
        return th2;
    }

    public static final boolean c(Throwable th2, InterfaceC5082a interfaceC5082a) {
        C5423m c5423m;
        List listB = AbstractC2156g.b(th2);
        boolean z10 = false;
        if (listB == null || !listB.isEmpty()) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof C5423m) {
                    return false;
                }
            }
        }
        try {
            List list = (List) interfaceC5082a.invoke();
            boolean zIsEmpty = list.isEmpty();
            z10 = !zIsEmpty;
            c5423m = !zIsEmpty ? new C5423m(list) : null;
        } catch (Throwable th3) {
            c5423m = th3;
        }
        if (c5423m != null) {
            AbstractC2156g.a(th2, c5423m);
        }
        return z10;
    }
}
