package A;

import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.K;
import w.AbstractC6873B;
import w.AbstractC6908l;
import w.C6907k;
import w.InterfaceC6904i;
import w.InterfaceC6921z;
import z.InterfaceC7255B;
import z.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC7255B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f50a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6921z f51b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6904i f52c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0.k f53d = androidx.compose.foundation.gestures.d.e();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f54a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f55b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55b = obj;
            this.f57d |= Integer.MIN_VALUE;
            return h.this.i(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f58a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f59b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f61d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f62e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f63f;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f64a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f65b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, Function1 function1) {
                super(1);
                this.f64a = k10;
                this.f65b = function1;
            }

            public final void a(float f10) {
                K k10 = this.f64a;
                float f11 = k10.f52256a - f10;
                k10.f52256a = f11;
                this.f65b.invoke(Float.valueOf(f11));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: A.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0000b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f66a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f67b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0000b(K k10, Function1 function1) {
                super(1);
                this.f66a = k10;
                this.f67b = function1;
            }

            public final void a(float f10) {
                K k10 = this.f66a;
                float f11 = k10.f52256a - f10;
                k10.f52256a = f11;
                this.f67b.invoke(Float.valueOf(f11));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, Function1 function1, u uVar, Zd.e eVar) {
            super(2, eVar);
            this.f61d = f10;
            this.f62e = function1;
            this.f63f = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return h.this.new b(this.f61d, this.f62e, this.f63f, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K k10;
            Object objL;
            Object objF = AbstractC2605b.f();
            int i10 = this.f59b;
            if (i10 == 0) {
                v.b(obj);
                float fB = h.this.f50a.b(this.f61d, AbstractC6873B.a(h.this.f51b, 0.0f, this.f61d));
                if (Float.isNaN(fB)) {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                k10 = new K();
                float fAbs = Math.abs(fB) * Math.signum(this.f61d);
                k10.f52256a = fAbs;
                this.f62e.invoke(kotlin.coroutines.jvm.internal.b.c(fAbs));
                h hVar = h.this;
                u uVar = this.f63f;
                float f10 = k10.f52256a;
                float f11 = this.f61d;
                C0000b c0000b = new C0000b(k10, this.f62e);
                this.f58a = k10;
                this.f59b = 1;
                objL = hVar.l(uVar, f10, f11, c0000b, this);
                if (objL != objF) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            K k11 = (K) this.f58a;
            v.b(obj);
            k10 = k11;
            objL = obj;
            C6907k c6907k = (C6907k) objL;
            float fA = h.this.f50a.a(((Number) c6907k.p()).floatValue());
            if (Float.isNaN(fA)) {
                throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            k10.f52256a = fA;
            u uVar2 = this.f63f;
            C6907k c6907kG = AbstractC6908l.g(c6907k, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            InterfaceC6904i interfaceC6904i = h.this.f52c;
            a aVar = new a(k10, this.f62e);
            this.f58a = null;
            this.f59b = 2;
            Object objH = i.h(uVar2, fA, fA, c6907kG, interfaceC6904i, aVar, this);
            return objH == objF ? objF : objH;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f68a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f70c;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f68a = obj;
            this.f70c |= Integer.MIN_VALUE;
            return h.this.b(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f71a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f73c;

        d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f71a = obj;
            this.f73c |= Integer.MIN_VALUE;
            return h.this.l(null, 0.0f, 0.0f, null, this);
        }
    }

    public h(j jVar, InterfaceC6921z interfaceC6921z, InterfaceC6904i interfaceC6904i) {
        this.f50a = jVar;
        this.f51b = interfaceC6921z;
        this.f52c = interfaceC6904i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(z.u r11, float r12, kotlin.jvm.functions.Function1 r13, Zd.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof A.h.a
            if (r0 == 0) goto L13
            r0 = r14
            A.h$a r0 = (A.h.a) r0
            int r1 = r0.f57d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57d = r1
            goto L18
        L13:
            A.h$a r0 = new A.h$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f55b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f57d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.f54a
            r13 = r11
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            Td.v.b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            Td.v.b(r14)
            l0.k r14 = r10.f53d
            A.h$b r4 = new A.h$b
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f54a = r7
            r0.f57d = r3
            java.lang.Object r14 = Gf.AbstractC1613i.g(r14, r4, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            r13 = r7
        L51:
            A.a r14 = (A.a) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.b.c(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.i(z.u, float, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    private final boolean j(float f10, float f11) {
        return Math.abs(AbstractC6873B.a(this.f51b, 0.0f, f11)) >= Math.abs(f10);
    }

    private final Object k(u uVar, float f10, float f11, Function1 function1, Zd.e eVar) {
        return i.i(uVar, f10, f11, j(f10, f11) ? new A.c(this.f51b) : new m(this.f52c), function1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(z.u r18, float r19, float r20, kotlin.jvm.functions.Function1 r21, Zd.e r22) {
        /*
            r17 = this;
            r0 = r22
            boolean r1 = r0 instanceof A.h.d
            if (r1 == 0) goto L18
            r1 = r0
            A.h$d r1 = (A.h.d) r1
            int r2 = r1.f73c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f73c = r2
            r2 = r17
        L16:
            r7 = r1
            goto L20
        L18:
            A.h$d r1 = new A.h$d
            r2 = r17
            r1.<init>(r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.f71a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r3 = r7.f73c
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            Td.v.b(r0)
            goto L71
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            Td.v.b(r0)
            float r0 = java.lang.Math.abs(r19)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r20)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r15 = 28
            r16 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r8 = r19
            r9 = r20
            w.k r0 = w.AbstractC6908l.c(r8, r9, r10, r12, r14, r15, r16)
            return r0
        L60:
            r7.f73c = r4
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L71
            return r1
        L71:
            A.a r0 = (A.a) r0
            w.k r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.l(z.u, float, float, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z.InterfaceC7255B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(z.u r5, float r6, kotlin.jvm.functions.Function1 r7, Zd.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof A.h.c
            if (r0 == 0) goto L13
            r0 = r8
            A.h$c r0 = (A.h.c) r0
            int r1 = r0.f70c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70c = r1
            goto L18
        L13:
            A.h$c r0 = new A.h$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f68a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f70c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Td.v.b(r8)
            r0.f70c = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            A.a r8 = (A.a) r8
            java.lang.Object r5 = r8.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            w.k r6 = r8.b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.p()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.b(z.u, float, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (AbstractC5504s.c(hVar.f52c, this.f52c) && AbstractC5504s.c(hVar.f51b, this.f51b) && AbstractC5504s.c(hVar.f50a, this.f50a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f52c.hashCode() * 31) + this.f51b.hashCode()) * 31) + this.f50a.hashCode();
    }
}
