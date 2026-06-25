package j2;

import Gf.O;
import Jf.I;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import Td.v;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.Z0;
import Y.h2;
import Zd.e;
import Zd.i;
import Zd.j;
import ae.AbstractC2605b;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.F;
import androidx.lifecycle.r;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: j2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5330a {

    /* JADX INFO: renamed from: j2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0808a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f51598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f51599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2857k f51600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC2857k.b f51601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f51602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1742e f51603f;

        /* JADX INFO: renamed from: j2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0809a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f51604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f51605b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC1742e f51606c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Z0 f51607d;

            /* JADX INFO: renamed from: j2.a$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0810a implements InterfaceC1743f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Z0 f51608a;

                C0810a(Z0 z02) {
                    this.f51608a = z02;
                }

                @Override // Jf.InterfaceC1743f
                public final Object emit(Object obj, e eVar) {
                    this.f51608a.setValue(obj);
                    return L.f17438a;
                }
            }

            /* JADX INFO: renamed from: j2.a$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class b extends l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f51609a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC1742e f51610b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Z0 f51611c;

                /* JADX INFO: renamed from: j2.a$a$a$b$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0811a implements InterfaceC1743f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Z0 f51612a;

                    C0811a(Z0 z02) {
                        this.f51612a = z02;
                    }

                    @Override // Jf.InterfaceC1743f
                    public final Object emit(Object obj, e eVar) {
                        this.f51612a.setValue(obj);
                        return L.f17438a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(InterfaceC1742e interfaceC1742e, Z0 z02, e eVar) {
                    super(2, eVar);
                    this.f51610b = interfaceC1742e;
                    this.f51611c = z02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new b(this.f51610b, this.f51611c, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(O o10, e eVar) {
                    return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f51609a;
                    if (i10 == 0) {
                        v.b(obj);
                        InterfaceC1742e interfaceC1742e = this.f51610b;
                        C0811a c0811a = new C0811a(this.f51611c);
                        this.f51609a = 1;
                        if (interfaceC1742e.collect(c0811a, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    return L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0809a(i iVar, InterfaceC1742e interfaceC1742e, Z0 z02, e eVar) {
                super(2, eVar);
                this.f51605b = iVar;
                this.f51606c = interfaceC1742e;
                this.f51607d = z02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0809a(this.f51605b, this.f51606c, this.f51607d, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, e eVar) {
                return ((C0809a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r7.collect(r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                if (Gf.AbstractC1613i.g(r7, r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r6.f51604a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L17:
                    Td.v.b(r7)
                    goto L4f
                L1b:
                    Td.v.b(r7)
                    Zd.i r7 = r6.f51605b
                    Zd.j r1 = Zd.j.f23275a
                    boolean r7 = kotlin.jvm.internal.AbstractC5504s.c(r7, r1)
                    if (r7 == 0) goto L3a
                    Jf.e r7 = r6.f51606c
                    j2.a$a$a$a r1 = new j2.a$a$a$a
                    Y.Z0 r2 = r6.f51607d
                    r1.<init>(r2)
                    r6.f51604a = r3
                    java.lang.Object r7 = r7.collect(r1, r6)
                    if (r7 != r0) goto L4f
                    goto L4e
                L3a:
                    Zd.i r7 = r6.f51605b
                    j2.a$a$a$b r1 = new j2.a$a$a$b
                    Jf.e r3 = r6.f51606c
                    Y.Z0 r4 = r6.f51607d
                    r5 = 0
                    r1.<init>(r3, r4, r5)
                    r6.f51604a = r2
                    java.lang.Object r7 = Gf.AbstractC1613i.g(r7, r1, r6)
                    if (r7 != r0) goto L4f
                L4e:
                    return r0
                L4f:
                    Td.L r7 = Td.L.f17438a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: j2.AbstractC5330a.C0808a.C0809a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0808a(AbstractC2857k abstractC2857k, AbstractC2857k.b bVar, i iVar, InterfaceC1742e interfaceC1742e, e eVar) {
            super(2, eVar);
            this.f51600c = abstractC2857k;
            this.f51601d = bVar;
            this.f51602e = iVar;
            this.f51603f = interfaceC1742e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Z0 z02, e eVar) {
            return ((C0808a) create(z02, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            C0808a c0808a = new C0808a(this.f51600c, this.f51601d, this.f51602e, this.f51603f, eVar);
            c0808a.f51599b = obj;
            return c0808a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f51598a;
            if (i10 == 0) {
                v.b(obj);
                Z0 z02 = (Z0) this.f51599b;
                AbstractC2857k abstractC2857k = this.f51600c;
                AbstractC2857k.b bVar = this.f51601d;
                C0809a c0809a = new C0809a(this.f51602e, this.f51603f, z02, null);
                this.f51598a = 1;
                if (F.a(abstractC2857k, bVar, c0809a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public static final h2 a(InterfaceC1742e interfaceC1742e, Object obj, AbstractC2857k abstractC2857k, AbstractC2857k.b bVar, i iVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 4) != 0) {
            bVar = AbstractC2857k.b.f30238d;
        }
        AbstractC2857k.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            iVar = j.f23275a;
        }
        i iVar2 = iVar;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {interfaceC1742e, abstractC2857k, bVar2, iVar2};
        boolean zF = interfaceC2425m.F(abstractC2857k) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC2425m.c(bVar2.ordinal())) || (i10 & 3072) == 2048) | interfaceC2425m.F(iVar2) | interfaceC2425m.F(interfaceC1742e);
        Object objD = interfaceC2425m.D();
        if (zF || objD == InterfaceC2425m.f22370a.a()) {
            C0808a c0808a = new C0808a(abstractC2857k, bVar2, iVar2, interfaceC1742e, null);
            interfaceC2425m.u(c0808a);
            objD = c0808a;
        }
        h2 h2VarM = U1.m(obj, objArr, (Function2) objD, interfaceC2425m, (i10 >> 3) & 14);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarM;
    }

    public static final h2 b(I i10, r rVar, AbstractC2857k.b bVar, i iVar, InterfaceC2425m interfaceC2425m, int i11, int i12) {
        if ((i12 & 1) != 0) {
            rVar = (r) interfaceC2425m.n(AbstractC5332c.c());
        }
        if ((i12 & 2) != 0) {
            bVar = AbstractC2857k.b.f30238d;
        }
        AbstractC2857k.b bVar2 = bVar;
        if ((i12 & 4) != 0) {
            iVar = j.f23275a;
        }
        i iVar2 = iVar;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(743249048, i11, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i13 = i11 << 3;
        h2 h2VarA = a(i10, i10.getValue(), rVar.getLifecycle(), bVar2, iVar2, interfaceC2425m, (i11 & 14) | (i13 & 7168) | (i13 & 57344), 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarA;
    }
}
