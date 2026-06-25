package L4;

import Gf.InterfaceC1623n;
import Td.L;
import Td.u;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f11268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11270d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11269c = obj;
            this.f11270d |= Integer.MIN_VALUE;
            return g.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f11271a;

        b(InterfaceC1623n interfaceC1623n) {
            this.f11271a = interfaceC1623n;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(androidx.lifecycle.r rVar) {
            InterfaceC1623n interfaceC1623n = this.f11271a;
            u.a aVar = Td.u.f17466b;
            interfaceC1623n.resumeWith(Td.u.b(L.f17438a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.AbstractC2857k r6, Zd.e r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof L4.g.a
            if (r0 == 0) goto L13
            r0 = r7
            L4.g$a r0 = (L4.g.a) r0
            int r1 = r0.f11270d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11270d = r1
            goto L18
        L13:
            L4.g$a r0 = new L4.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11269c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f11270d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f11268b
            kotlin.jvm.internal.N r6 = (kotlin.jvm.internal.N) r6
            java.lang.Object r0 = r0.f11267a
            androidx.lifecycle.k r0 = (androidx.lifecycle.AbstractC2857k) r0
            Td.v.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L8c
        L31:
            r7 = move-exception
            goto L98
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Td.v.b(r7)
            androidx.lifecycle.k$b r7 = r6.getCurrentState()
            androidx.lifecycle.k$b r2 = androidx.lifecycle.AbstractC2857k.b.f30238d
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L4d
            Td.L r6 = Td.L.f17438a
            return r6
        L4d:
            kotlin.jvm.internal.N r7 = new kotlin.jvm.internal.N
            r7.<init>()
            r0.f11267a = r6     // Catch: java.lang.Throwable -> L81
            r0.f11268b = r7     // Catch: java.lang.Throwable -> L81
            r0.f11270d = r3     // Catch: java.lang.Throwable -> L81
            Gf.p r2 = new Gf.p     // Catch: java.lang.Throwable -> L81
            Zd.e r4 = ae.AbstractC2605b.c(r0)     // Catch: java.lang.Throwable -> L81
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L81
            r2.C()     // Catch: java.lang.Throwable -> L81
            L4.g$b r3 = new L4.g$b     // Catch: java.lang.Throwable -> L81
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L81
            r7.f52259a = r3     // Catch: java.lang.Throwable -> L81
            kotlin.jvm.internal.AbstractC5504s.e(r3)     // Catch: java.lang.Throwable -> L81
            androidx.lifecycle.q r3 = (androidx.lifecycle.InterfaceC2863q) r3     // Catch: java.lang.Throwable -> L81
            r6.addObserver(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.v()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = ae.AbstractC2605b.f()     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L87
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L98
        L87:
            if (r2 != r1) goto L8a
            return r1
        L8a:
            r0 = r6
            r6 = r7
        L8c:
            java.lang.Object r6 = r6.f52259a
            androidx.lifecycle.q r6 = (androidx.lifecycle.InterfaceC2863q) r6
            if (r6 == 0) goto L95
            r0.removeObserver(r6)
        L95:
            Td.L r6 = Td.L.f17438a
            return r6
        L98:
            java.lang.Object r6 = r6.f52259a
            androidx.lifecycle.q r6 = (androidx.lifecycle.InterfaceC2863q) r6
            if (r6 == 0) goto La1
            r0.removeObserver(r6)
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.g.a(androidx.lifecycle.k, Zd.e):java.lang.Object");
    }
}
