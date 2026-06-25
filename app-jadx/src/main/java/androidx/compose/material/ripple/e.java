package androidx.compose.material.ripple;

import B.g;
import B.h;
import B.j;
import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6230l;
import s0.AbstractC6384q0;
import s0.C6385r0;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;
import w.AbstractC6890b;
import w.C6888a;
import w.InterfaceC6904i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f26539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6888a f26540c = AbstractC6890b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f26541d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f26542e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26543a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f26545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6904i f26546d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, InterfaceC6904i interfaceC6904i, Zd.e eVar) {
            super(2, eVar);
            this.f26545c = f10;
            this.f26546d = interfaceC6904i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return e.this.new a(this.f26545c, this.f26546d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26543a;
            if (i10 == 0) {
                v.b(obj);
                C6888a c6888a = e.this.f26540c;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.f26545c);
                InterfaceC6904i interfaceC6904i = this.f26546d;
                this.f26543a = 1;
                if (C6888a.f(c6888a, fC, interfaceC6904i, null, null, this, 12, null) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26547a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6904i f26549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6904i interfaceC6904i, Zd.e eVar) {
            super(2, eVar);
            this.f26549c = interfaceC6904i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return e.this.new b(this.f26549c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26547a;
            if (i10 == 0) {
                v.b(obj);
                C6888a c6888a = e.this.f26540c;
                Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                InterfaceC6904i interfaceC6904i = this.f26549c;
                this.f26547a = 1;
                if (C6888a.f(c6888a, fC, interfaceC6904i, null, null, this, 12, null) == objF) {
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

    public e(boolean z10, InterfaceC5082a interfaceC5082a) {
        this.f26538a = z10;
        this.f26539b = interfaceC5082a;
    }

    public final void b(InterfaceC6711f interfaceC6711f, float f10, long j10) {
        float fFloatValue = ((Number) this.f26540c.m()).floatValue();
        if (fFloatValue > 0.0f) {
            long jQ = C6385r0.q(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.f26538a) {
                InterfaceC6711f.e0(interfaceC6711f, jQ, f10, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fI = C6230l.i(interfaceC6711f.f());
            float fG = C6230l.g(interfaceC6711f.f());
            int iB = AbstractC6384q0.f58976a.b();
            InterfaceC6709d interfaceC6709dN1 = interfaceC6711f.n1();
            long jF = interfaceC6709dN1.f();
            interfaceC6709dN1.b().p();
            interfaceC6709dN1.a().c(0.0f, 0.0f, fI, fG, iB);
            InterfaceC6711f.e0(interfaceC6711f, jQ, f10, 0L, 0.0f, null, null, 0, 124, null);
            interfaceC6709dN1.b().k();
            interfaceC6709dN1.e(jF);
        }
    }

    public final void c(j jVar, O o10) {
        boolean z10 = jVar instanceof g;
        if (z10) {
            this.f26541d.add(jVar);
        } else if (jVar instanceof h) {
            this.f26541d.remove(((h) jVar).a());
        } else if (jVar instanceof B.d) {
            this.f26541d.add(jVar);
        } else if (jVar instanceof B.e) {
            this.f26541d.remove(((B.e) jVar).a());
        } else if (jVar instanceof B.b) {
            this.f26541d.add(jVar);
        } else if (jVar instanceof B.c) {
            this.f26541d.remove(((B.c) jVar).a());
        } else if (!(jVar instanceof B.a)) {
            return;
        } else {
            this.f26541d.remove(((B.a) jVar).a());
        }
        j jVar2 = (j) AbstractC2279u.A0(this.f26541d);
        if (AbstractC5504s.c(this.f26542e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            T.d dVar = (T.d) this.f26539b.invoke();
            AbstractC1617k.d(o10, null, null, new a(z10 ? dVar.c() : jVar instanceof B.d ? dVar.b() : jVar instanceof B.b ? dVar.a() : 0.0f, T.l.d(jVar2), null), 3, null);
        } else {
            AbstractC1617k.d(o10, null, null, new b(T.l.e(this.f26542e), null), 3, null);
        }
        this.f26542e = jVar2;
    }
}
