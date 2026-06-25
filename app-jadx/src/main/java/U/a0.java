package U;

import Gf.InterfaceC1623n;
import Td.u;
import Y.C0;
import Y.b2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pf.a f17935a = Pf.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f17936b = b2.e(null, null, 2, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f17937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1623n f17938b;

        public a(d0 d0Var, InterfaceC1623n interfaceC1623n) {
            this.f17937a = d0Var;
            this.f17938b = interfaceC1623n;
        }

        @Override // U.W
        public d0 a() {
            return this.f17937a;
        }

        @Override // U.W
        public void b() {
            if (this.f17938b.b()) {
                InterfaceC1623n interfaceC1623n = this.f17938b;
                u.a aVar = Td.u.f17466b;
                interfaceC1623n.resumeWith(Td.u.b(c0.ActionPerformed));
            }
        }

        @Override // U.W
        public void dismiss() {
            if (this.f17938b.b()) {
                InterfaceC1623n interfaceC1623n = this.f17938b;
                u.a aVar = Td.u.f17466b;
                interfaceC1623n.resumeWith(Td.u.b(c0.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(a(), aVar.a()) && AbstractC5504s.c(this.f17938b, aVar.f17938b);
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f17938b.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f17941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Y f17942d;

        public b(String str, String str2, boolean z10, Y y10) {
            this.f17939a = str;
            this.f17940b = str2;
            this.f17941c = z10;
            this.f17942d = y10;
        }

        @Override // U.d0
        public String a() {
            return this.f17940b;
        }

        @Override // U.d0
        public boolean b() {
            return this.f17941c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(getMessage(), bVar.getMessage()) && AbstractC5504s.c(a(), bVar.a()) && b() == bVar.b() && getDuration() == bVar.getDuration();
        }

        @Override // U.d0
        public Y getDuration() {
            return this.f17942d;
        }

        @Override // U.d0
        public String getMessage() {
            return this.f17939a;
        }

        public int hashCode() {
            int iHashCode = getMessage().hashCode() * 31;
            String strA = a();
            return ((((iHashCode + (strA != null ? strA.hashCode() : 0)) * 31) + Boolean.hashCode(b())) * 31) + getDuration().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f17945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f17947e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17949g;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17947e = obj;
            this.f17949g |= Integer.MIN_VALUE;
            return a0.this.d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(W w10) {
        this.f17936b.setValue(w10);
    }

    public static /* synthetic */ Object f(a0 a0Var, String str, String str2, boolean z10, Y y10, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            y10 = str3 == null ? Y.Short : Y.Indefinite;
        }
        return a0Var.e(str, str3, z11, y10, eVar);
    }

    public final W b() {
        return (W) this.f17936b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(U.d0 r8, Zd.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof U.a0.c
            if (r0 == 0) goto L13
            r0 = r9
            U.a0$c r0 = (U.a0.c) r0
            int r1 = r0.f17949g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17949g = r1
            goto L18
        L13:
            U.a0$c r0 = new U.a0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f17947e
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f17949g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r8 = r0.f17946d
            U.a0$c r8 = (U.a0.c) r8
            java.lang.Object r8 = r0.f17945c
            Pf.a r8 = (Pf.a) r8
            java.lang.Object r1 = r0.f17944b
            U.d0 r1 = (U.d0) r1
            java.lang.Object r0 = r0.f17943a
            U.a0 r0 = (U.a0) r0
            Td.v.b(r9)     // Catch: java.lang.Throwable -> L3e
            goto La9
        L3e:
            r9 = move-exception
            goto Lb2
        L41:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L49:
            java.lang.Object r8 = r0.f17945c
            Pf.a r8 = (Pf.a) r8
            java.lang.Object r2 = r0.f17944b
            U.d0 r2 = (U.d0) r2
            java.lang.Object r6 = r0.f17943a
            U.a0 r6 = (U.a0) r6
            Td.v.b(r9)
            r9 = r8
            r8 = r2
            goto L70
        L5b:
            Td.v.b(r9)
            Pf.a r9 = r7.f17935a
            r0.f17943a = r7
            r0.f17944b = r8
            r0.f17945c = r9
            r0.f17949g = r4
            java.lang.Object r2 = r9.c(r5, r0)
            if (r2 != r1) goto L6f
            goto La4
        L6f:
            r6 = r7
        L70:
            r0.f17943a = r6     // Catch: java.lang.Throwable -> L9c
            r0.f17944b = r8     // Catch: java.lang.Throwable -> L9c
            r0.f17945c = r9     // Catch: java.lang.Throwable -> L9c
            r0.f17946d = r0     // Catch: java.lang.Throwable -> L9c
            r0.f17949g = r3     // Catch: java.lang.Throwable -> L9c
            Gf.p r2 = new Gf.p     // Catch: java.lang.Throwable -> L9c
            Zd.e r3 = ae.AbstractC2605b.c(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9c
            r2.C()     // Catch: java.lang.Throwable -> L9c
            U.a0$a r3 = new U.a0$a     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r8, r2)     // Catch: java.lang.Throwable -> L9c
            a(r6, r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r8 = r2.v()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = ae.AbstractC2605b.f()     // Catch: java.lang.Throwable -> L9c
            if (r8 != r2) goto La2
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L9c
            goto La2
        L9c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto Lb2
        La2:
            if (r8 != r1) goto La5
        La4:
            return r1
        La5:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        La9:
            r0.c(r5)     // Catch: java.lang.Throwable -> Lb0
            r8.e(r5)
            return r9
        Lb0:
            r9 = move-exception
            goto Lb6
        Lb2:
            r0.c(r5)     // Catch: java.lang.Throwable -> Lb0
            throw r9     // Catch: java.lang.Throwable -> Lb0
        Lb6:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U.a0.d(U.d0, Zd.e):java.lang.Object");
    }

    public final Object e(String str, String str2, boolean z10, Y y10, Zd.e eVar) {
        return d(new b(str, str2, z10, y10), eVar);
    }
}
