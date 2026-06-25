package T1;

import Jf.InterfaceC1742e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jf.u f16968a;

    public l() {
        H h10 = H.f16788b;
        AbstractC5504s.f(h10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f16968a = Jf.K.a(h10);
    }

    public final D a() {
        return (D) this.f16968a.getValue();
    }

    public final InterfaceC1742e b() {
        return this.f16968a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T1.D c(T1.D r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.AbstractC5504s.h(r6, r0)
            Jf.u r0 = r5.f16968a
        L7:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            T1.D r2 = (T1.D) r2
            boolean r3 = r2 instanceof T1.x
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            T1.H r3 = T1.H.f16788b
            boolean r3 = kotlin.jvm.internal.AbstractC5504s.c(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof T1.C2142f
            if (r3 == 0) goto L2d
            int r3 = r6.a()
            int r4 = r2.a()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof T1.r
            if (r3 == 0) goto L38
        L31:
            boolean r1 = r0.f(r1, r2)
            if (r1 == 0) goto L7
            return r2
        L38:
            Td.r r6 = new Td.r
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.l.c(T1.D):T1.D");
    }
}
