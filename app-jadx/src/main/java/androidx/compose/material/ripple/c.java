package androidx.compose.material.ripple;

import B.k;
import B.o;
import Gf.O;
import K0.AbstractC1807u;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import s0.InterfaceC6389t0;
import t.C6550P;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends RippleNode {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C6550P f26530k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T.e f26532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f26533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o.b f26534d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T.e eVar, c cVar, o.b bVar, Zd.e eVar2) {
            super(2, eVar2);
            this.f26532b = eVar;
            this.f26533c = cVar;
            this.f26534d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f26532b, this.f26533c, this.f26534d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26531a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    T.e eVar = this.f26532b;
                    this.f26531a = 1;
                    if (eVar.d(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                this.f26533c.f26530k.u(this.f26534d);
                AbstractC1807u.a(this.f26533c);
                return L.f17438a;
            } catch (Throwable th2) {
                this.f26533c.f26530k.u(this.f26534d);
                AbstractC1807u.a(this.f26533c);
                throw th2;
            }
        }
    }

    public /* synthetic */ c(k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, z10, f10, interfaceC6389t0, interfaceC5082a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // androidx.compose.material.ripple.RippleNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J1(B.o.b r18, long r19, float r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            t.P r2 = r0.f26530k
            java.lang.Object[] r3 = r2.f60044b
            java.lang.Object[] r4 = r2.f60045c
            long[] r2 = r2.f60043a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L51
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            T.e r13 = (T.e) r13
            B.o$b r14 = (B.o.b) r14
            r13.h()
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L4a:
            if (r10 != r11) goto L51
        L4c:
            if (r7 == r5) goto L51
            int r7 = r7 + 1
            goto L13
        L51:
            boolean r2 = r0.getBounded()
            r3 = 0
            if (r2 == 0) goto L61
            long r4 = r1.a()
            r0.f r2 = r0.C6224f.d(r4)
            goto L62
        L61:
            r2 = r3
        L62:
            T.e r4 = new T.e
            boolean r5 = r0.getBounded()
            r6 = r21
            r4.<init>(r2, r6, r5, r3)
            t.P r2 = r0.f26530k
            r2.x(r1, r4)
            Gf.O r5 = r0.getCoroutineScope()
            androidx.compose.material.ripple.c$a r8 = new androidx.compose.material.ripple.c$a
            r8.<init>(r4, r0, r1, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            Gf.AbstractC1613i.d(r5, r6, r7, r8, r9, r10)
            K0.AbstractC1807u.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.c.J1(B.o$b, long, float):void");
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void K1(InterfaceC6711f interfaceC6711f) {
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        float fD = ((T.d) getRippleAlpha().invoke()).d();
        if (fD == 0.0f) {
            return;
        }
        C6550P c6550p = this.f26530k;
        Object[] objArr = c6550p.f60044b;
        Object[] objArr2 = c6550p.f60045c;
        long[] jArr = c6550p.f60043a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                long j11 = j10;
                int i16 = 0;
                while (i16 < i15) {
                    if ((j11 & 255) < 128) {
                        int i17 = (i13 << 3) + i16;
                        i10 = i16;
                        i11 = i15;
                        i12 = i14;
                        f11 = fD;
                        ((T.e) objArr2[i17]).e(interfaceC6711f, C6385r0.q(N1(), fD, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        i10 = i16;
                        i11 = i15;
                        i12 = i14;
                        f11 = fD;
                    }
                    j11 >>= i12;
                    i16 = i10 + 1;
                    fD = f11;
                    i15 = i11;
                    i14 = i12;
                }
                int i18 = i15;
                f10 = fD;
                if (i18 != i14) {
                    return;
                }
            } else {
                f10 = fD;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            fD = f10;
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void Q1(o.b bVar) {
        T.e eVar = (T.e) this.f26530k.e(bVar);
        if (eVar != null) {
            eVar.h();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        this.f26530k.k();
    }

    private c(k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a) {
        super(kVar, z10, f10, interfaceC6389t0, interfaceC5082a, null);
        this.f26530k = new C6550P(0, 1, null);
    }
}
