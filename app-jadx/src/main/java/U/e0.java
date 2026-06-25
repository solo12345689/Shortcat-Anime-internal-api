package U;

import E0.V;
import K0.InterfaceC1788g;
import Y.AbstractC2394b1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.C2397c1;
import Y.InterfaceC2425m;
import Y.m2;
import ae.AbstractC2605b;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AbstractC2739w0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5015h;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5912g;
import s0.AbstractC6338a1;
import s0.C6385r0;
import s0.E1;
import s0.t1;
import x.AbstractC7007e;
import x.C7009g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f18279a = Y.H.h(null, a.f18280a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f18280a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C5015h.h(m50invokeD9Ej5fM());
        }

        /* JADX INFO: renamed from: invoke-D9Ej5fM */
        public final float m50invokeD9Ej5fM() {
            return C5015h.n(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f18281a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ E1 f18282b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f18283c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ float f18284d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C7009g f18285e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ float f18286f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Function2 f18287g;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final a f18288a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((R0.C) obj);
                return Td.L.f17438a;
            }

            public final void invoke(R0.C c10) {
                R0.A.T(c10, true);
            }
        }

        /* JADX INFO: renamed from: U.e0$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0314b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f18289a;

            C0314b(Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0314b(eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(E0.L l10, Zd.e eVar) {
                return ((C0314b) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f18289a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, E1 e12, long j10, float f10, C7009g c7009g, float f11, Function2 function2) {
            super(2);
            this.f18281a = eVar;
            this.f18282b = e12;
            this.f18283c = j10;
            this.f18284d = f10;
            this.f18285e = c7009g;
            this.f18286f = f11;
            this.f18287g = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-70914509, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
            }
            androidx.compose.ui.e eVarThen = R0.r.e(e0.e(this.f18281a, this.f18282b, e0.f(this.f18283c, this.f18284d, interfaceC2425m, 0), this.f18285e, ((InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())).l1(this.f18286f)), false, a.f18288a).then(new SuspendPointerInputElement(Td.L.f17438a, null, null, new V.a(new C0314b(null)), 6, null));
            Function2 function2 = this.f18287g;
            I0.B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), true);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            Y.I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarThen);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            function2.invoke(interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f18290a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ E1 f18291b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f18292c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ float f18293d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C7009g f18294e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ B.m f18295f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ boolean f18296g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ InterfaceC5082a f18297h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ float f18298i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ Function2 f18299j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, E1 e12, long j10, float f10, C7009g c7009g, B.m mVar, boolean z10, InterfaceC5082a interfaceC5082a, float f11, Function2 function2) {
            super(2);
            this.f18290a = eVar;
            this.f18291b = e12;
            this.f18292c = j10;
            this.f18293d = f10;
            this.f18294e = c7009g;
            this.f18295f = mVar;
            this.f18296g = z10;
            this.f18297h = interfaceC5082a;
            this.f18298i = f11;
            this.f18299j = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1279702876, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
            }
            androidx.compose.ui.e eVarB = androidx.compose.foundation.d.b(e0.e(C.b(this.f18290a), this.f18291b, e0.f(this.f18292c, this.f18293d, interfaceC2425m, 0), this.f18294e, ((InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())).l1(this.f18298i)), this.f18295f, androidx.compose.material3.a.d(false, 0.0f, 0L, interfaceC2425m, 0, 7), this.f18296g, null, null, this.f18297h, 24, null);
            Function2 function2 = this.f18299j;
            I0.B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), true);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            Y.I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarB);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            function2.invoke(interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public static final void a(androidx.compose.ui.e eVar, E1 e12, long j10, long j11, float f10, float f11, C7009g c7009g, Function2 function2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 1) != 0) {
            eVar = androidx.compose.ui.e.f26613a;
        }
        if ((i11 & 2) != 0) {
            e12 = t1.a();
        }
        if ((i11 & 4) != 0) {
            j10 = D.f17597a.a(interfaceC2425m, 6).H();
        }
        if ((i11 & 8) != 0) {
            j11 = AbstractC2176m.c(j10, interfaceC2425m, (i10 >> 6) & 14);
        }
        if ((i11 & 16) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i11 & 32) != 0) {
            f11 = C5015h.n(0);
        }
        if ((i11 & 64) != 0) {
            c7009g = null;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        AbstractC2394b1 abstractC2394b1 = f18279a;
        float fN = C5015h.n(((C5015h) interfaceC2425m.n(abstractC2394b1)).t() + f10);
        Y.H.d(new C2397c1[]{AbstractC2181s.a().d(C6385r0.m(j11)), abstractC2394b1.d(C5015h.h(fN))}, g0.i.d(-70914509, true, new b(eVar, e12, j10, fN, c7009g, f11, function2), interfaceC2425m, 54), interfaceC2425m, C2397c1.f22274i | 48);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final void b(InterfaceC5082a interfaceC5082a, androidx.compose.ui.e eVar, boolean z10, E1 e12, long j10, long j11, float f10, float f11, C7009g c7009g, B.m mVar, Function2 function2, InterfaceC2425m interfaceC2425m, int i10, int i11, int i12) {
        androidx.compose.ui.e eVar2 = (i12 & 2) != 0 ? androidx.compose.ui.e.f26613a : eVar;
        boolean z11 = (i12 & 4) != 0 ? true : z10;
        E1 e1A = (i12 & 8) != 0 ? t1.a() : e12;
        long jH = (i12 & 16) != 0 ? D.f17597a.a(interfaceC2425m, 6).H() : j10;
        long jC = (i12 & 32) != 0 ? AbstractC2176m.c(jH, interfaceC2425m, (i10 >> 12) & 14) : j11;
        float fN = (i12 & 64) != 0 ? C5015h.n(0) : f10;
        float fN2 = (i12 & 128) != 0 ? C5015h.n(0) : f11;
        C7009g c7009g2 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : c7009g;
        B.m mVar2 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? mVar : null;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        AbstractC2394b1 abstractC2394b1 = f18279a;
        float fN3 = C5015h.n(((C5015h) interfaceC2425m.n(abstractC2394b1)).t() + fN);
        Y.H.d(new C2397c1[]{AbstractC2181s.a().d(C6385r0.m(jC)), abstractC2394b1.d(C5015h.h(fN3))}, g0.i.d(1279702876, true, new c(eVar2, e1A, jH, fN3, c7009g2, mVar2, z11, interfaceC5082a, fN2, function2), interfaceC2425m, 54), interfaceC2425m, C2397c1.f22274i | 48);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, E1 e12, long j10, C7009g c7009g, float f10) {
        E1 e13;
        androidx.compose.ui.e eVarB;
        if (f10 > 0.0f) {
            e13 = e12;
            eVarB = androidx.compose.ui.graphics.f.b(androidx.compose.ui.e.f26613a, (131067 & 1) != 0 ? 1.0f : 0.0f, (131067 & 2) != 0 ? 1.0f : 0.0f, (131067 & 4) == 0 ? 0.0f : 1.0f, (131067 & 8) != 0 ? 0.0f : 0.0f, (131067 & 16) != 0 ? 0.0f : 0.0f, (131067 & 32) != 0 ? 0.0f : f10, (131067 & 64) != 0 ? 0.0f : 0.0f, (131067 & 128) != 0 ? 0.0f : 0.0f, (131067 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 ? 0.0f : 0.0f, (131067 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 8.0f : 0.0f, (131067 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? androidx.compose.ui.graphics.j.f26818b.a() : 0L, (131067 & 2048) != 0 ? t1.a() : e13, (131067 & 4096) != 0 ? false : false, (131067 & 8192) != 0 ? null : null, (131067 & 16384) != 0 ? AbstractC6338a1.a() : 0L, (32768 & 131067) != 0 ? AbstractC6338a1.a() : 0L, (131067 & 65536) != 0 ? androidx.compose.ui.graphics.e.f26765b.a() : 0);
        } else {
            e13 = e12;
            eVarB = androidx.compose.ui.e.f26613a;
        }
        return AbstractC5912g.a(androidx.compose.foundation.b.c(eVar.then(eVarB).then(c7009g != null ? AbstractC7007e.e(androidx.compose.ui.e.f26613a, c7009g, e13) : androidx.compose.ui.e.f26613a), j10, e13), e13);
    }

    public static final long f(long j10, float f10, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jA = AbstractC2176m.a(D.f17597a.a(interfaceC2425m, 6), j10, f10, interfaceC2425m, (i10 << 3) & 1008);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return jA;
    }
}
