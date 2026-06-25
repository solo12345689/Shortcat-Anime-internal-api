package B4;

import B4.b;
import G4.h;
import G4.j;
import Zd.e;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import v4.InterfaceC6843b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f1553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f1554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f1556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final H4.h f1557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC6843b f1558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1559g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f1562c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1564e;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1562c = obj;
            this.f1564e |= Integer.MIN_VALUE;
            return c.this.g(null, this);
        }
    }

    public c(h hVar, List list, int i10, h hVar2, H4.h hVar3, InterfaceC6843b interfaceC6843b, boolean z10) {
        this.f1553a = hVar;
        this.f1554b = list;
        this.f1555c = i10;
        this.f1556d = hVar2;
        this.f1557e = hVar3;
        this.f1558f = interfaceC6843b;
        this.f1559g = z10;
    }

    private final void a(h hVar, b bVar) {
        if (hVar.l() != this.f1553a.l()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
        }
        if (hVar.m() == j.f7352a) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        if (hVar.M() != this.f1553a.M()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
        }
        if (hVar.z() != this.f1553a.z()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (hVar.K() == this.f1553a.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final c b(int i10, h hVar, H4.h hVar2) {
        return new c(this.f1553a, this.f1554b, i10, hVar, hVar2, this.f1558f, this.f1559g);
    }

    static /* synthetic */ c d(c cVar, int i10, h hVar, H4.h hVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f1555c;
        }
        if ((i11 & 2) != 0) {
            hVar = cVar.c();
        }
        if ((i11 & 4) != 0) {
            hVar2 = cVar.getSize();
        }
        return cVar.b(i10, hVar, hVar2);
    }

    @Override // B4.b.a
    public h c() {
        return this.f1556d;
    }

    public final InterfaceC6843b e() {
        return this.f1558f;
    }

    public final boolean f() {
        return this.f1559g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(G4.h r11, Zd.e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof B4.c.a
            if (r0 == 0) goto L13
            r0 = r12
            B4.c$a r0 = (B4.c.a) r0
            int r1 = r0.f1564e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1564e = r1
            goto L18
        L13:
            B4.c$a r0 = new B4.c$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f1562c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f1564e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.f1561b
            B4.b r11 = (B4.b) r11
            java.lang.Object r0 = r0.f1560a
            B4.c r0 = (B4.c) r0
            Td.v.b(r12)
            r4 = r10
            goto L75
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            Td.v.b(r12)
            int r12 = r10.f1555c
            if (r12 <= 0) goto L4d
            java.util.List r2 = r10.f1554b
            int r12 = r12 - r3
            java.lang.Object r12 = r2.get(r12)
            B4.b r12 = (B4.b) r12
            r10.a(r11, r12)
        L4d:
            java.util.List r12 = r10.f1554b
            int r2 = r10.f1555c
            java.lang.Object r12 = r12.get(r2)
            B4.b r12 = (B4.b) r12
            int r2 = r10.f1555c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r6 = r11
            B4.c r11 = d(r4, r5, r6, r7, r8, r9)
            r0.f1560a = r4
            r0.f1561b = r12
            r0.f1564e = r3
            java.lang.Object r11 = r12.intercept(r11, r0)
            if (r11 != r1) goto L71
            return r1
        L71:
            r0 = r12
            r12 = r11
            r11 = r0
            r0 = r4
        L75:
            G4.i r12 = (G4.i) r12
            G4.h r1 = r12.b()
            r0.a(r1, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.c.g(G4.h, Zd.e):java.lang.Object");
    }

    @Override // B4.b.a
    public H4.h getSize() {
        return this.f1557e;
    }
}
