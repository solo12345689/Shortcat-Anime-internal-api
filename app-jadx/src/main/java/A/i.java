package A;

import Td.L;
import i1.C5015h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.K;
import oe.AbstractC5874j;
import w.C6902h;
import w.InterfaceC6904i;
import w.InterfaceC6921z;
import z.InterfaceC7255B;
import z.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f74a = C5015h.n(400);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f75a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f76b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f77c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f78d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f78d = obj;
            this.f79e |= Integer.MIN_VALUE;
            return i.f(null, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f80a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f81b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f82c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f83d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, K k10, u uVar, Function1 function1) {
            super(1);
            this.f80a = f10;
            this.f81b = k10;
            this.f82c = uVar;
            this.f83d = function1;
        }

        public final void a(C6902h c6902h) {
            if (Math.abs(((Number) c6902h.e()).floatValue()) < Math.abs(this.f80a)) {
                i.g(c6902h, this.f82c, this.f83d, ((Number) c6902h.e()).floatValue() - this.f81b.f52256a);
                this.f81b.f52256a = ((Number) c6902h.e()).floatValue();
                return;
            }
            float fJ = i.j(((Number) c6902h.e()).floatValue(), this.f80a);
            i.g(c6902h, this.f82c, this.f83d, fJ - this.f81b.f52256a);
            c6902h.a();
            this.f81b.f52256a = fJ;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6902h) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f84a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f85b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f86c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f88e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f89f;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f88e = obj;
            this.f89f |= Integer.MIN_VALUE;
            return i.h(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f90a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f91b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f92c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f93d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, K k10, u uVar, Function1 function1) {
            super(1);
            this.f90a = f10;
            this.f91b = k10;
            this.f92c = uVar;
            this.f93d = function1;
        }

        public final void a(C6902h c6902h) {
            float fJ = i.j(((Number) c6902h.e()).floatValue(), this.f90a);
            float f10 = fJ - this.f91b.f52256a;
            float fA = this.f92c.a(f10);
            this.f93d.invoke(Float.valueOf(fA));
            if (Math.abs(f10 - fA) > 0.5f || fJ != ((Number) c6902h.e()).floatValue()) {
                c6902h.a();
            }
            this.f91b.f52256a += fA;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6902h) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(z.u r5, float r6, w.C6907k r7, w.InterfaceC6921z r8, kotlin.jvm.functions.Function1 r9, Zd.e r10) {
        /*
            boolean r0 = r10 instanceof A.i.a
            if (r0 == 0) goto L13
            r0 = r10
            A.i$a r0 = (A.i.a) r0
            int r1 = r0.f79e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79e = r1
            goto L18
        L13:
            A.i$a r0 = new A.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f78d
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f79e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.f75a
            java.lang.Object r5 = r0.f77c
            kotlin.jvm.internal.K r5 = (kotlin.jvm.internal.K) r5
            java.lang.Object r7 = r0.f76b
            w.k r7 = (w.C6907k) r7
            Td.v.b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            Td.v.b(r10)
            kotlin.jvm.internal.K r10 = new kotlin.jvm.internal.K
            r10.<init>()
            java.lang.Object r2 = r7.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            A.i$b r4 = new A.i$b
            r4.<init>(r6, r10, r5, r9)
            r0.f76b = r7
            r0.f77c = r10
            r0.f75a = r6
            r0.f79e = r3
            java.lang.Object r5 = w.m0.g(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            A.a r8 = new A.a
            float r5 = r5.f52256a
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.f(z.u, float, w.k, w.z, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C6902h c6902h, u uVar, Function1 function1, float f10) {
        float fA = uVar.a(f10);
        function1.invoke(Float.valueOf(fA));
        if (Math.abs(f10 - fA) > 0.5f) {
            c6902h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(z.u r20, float r21, float r22, w.C6907k r23, w.InterfaceC6904i r24, kotlin.jvm.functions.Function1 r25, Zd.e r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof A.i.c
            if (r1 == 0) goto L16
            r1 = r0
            A.i$c r1 = (A.i.c) r1
            int r2 = r1.f89f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f89f = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            A.i$c r1 = new A.i$c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f88e
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r7.f89f
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.f85b
            float r2 = r7.f84a
            java.lang.Object r3 = r7.f87d
            kotlin.jvm.internal.K r3 = (kotlin.jvm.internal.K) r3
            java.lang.Object r4 = r7.f86c
            w.k r4 = (w.C6907k) r4
            Td.v.b(r0)
            r9 = r2
            r10 = r4
            goto L95
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            Td.v.b(r0)
            kotlin.jvm.internal.K r0 = new kotlin.jvm.internal.K
            r0.<init>()
            java.lang.Object r2 = r23.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.c(r21)
            java.lang.Object r4 = r23.p()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L6a
            r4 = r3
            goto L6b
        L6a:
            r4 = 0
        L6b:
            r5 = r4 ^ 1
            A.i$d r6 = new A.i$d
            r4 = r20
            r9 = r22
            r10 = r25
            r6.<init>(r9, r0, r4, r10)
            r4 = r23
            r7.f86c = r4
            r7.f87d = r0
            r9 = r21
            r7.f84a = r9
            r7.f85b = r8
            r7.f89f = r3
            r3 = r2
            r2 = r4
            r4 = r24
            java.lang.Object r3 = w.m0.i(r2, r3, r4, r5, r6, r7)
            if (r3 != r1) goto L91
            return r1
        L91:
            r10 = r23
            r3 = r0
            r1 = r8
        L95:
            java.lang.Object r0 = r10.p()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r12 = j(r0, r1)
            A.a r0 = new A.a
            float r1 = r3.f52256a
            float r9 = r9 - r1
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.c(r9)
            r18 = 29
            r19 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            w.k r2 = w.AbstractC6908l.g(r10, r11, r12, r13, r15, r17, r18, r19)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.h(z.u, float, float, w.k, w.i, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(u uVar, float f10, float f11, A.b bVar, Function1 function1, Zd.e eVar) {
        return bVar.a(uVar, kotlin.coroutines.jvm.internal.b.c(f10), kotlin.coroutines.jvm.internal.b.c(f11), function1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? AbstractC5874j.h(f10, f11) : AbstractC5874j.d(f10, f11);
    }

    public static final float k() {
        return f74a;
    }

    public static final InterfaceC7255B l(j jVar, InterfaceC6921z interfaceC6921z, InterfaceC6904i interfaceC6904i) {
        return new h(jVar, interfaceC6921z, interfaceC6904i);
    }
}
