package F;

import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.U1;
import Y.X;
import Y.Y;
import Y.h2;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5009b;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f6085a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f6086b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f6087c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ h2 f6088d;

        /* JADX INFO: renamed from: F.t$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0068a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.d f6089a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1544o f6090b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ androidx.compose.ui.layout.C f6091c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ N f6092d;

            /* JADX INFO: renamed from: F.t$a$a$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0069a implements X {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ androidx.compose.foundation.lazy.layout.d f6093a;

                public C0069a(androidx.compose.foundation.lazy.layout.d dVar) {
                    this.f6093a = dVar;
                }

                @Override // Y.X
                public void dispose() {
                    this.f6093a.f(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0068a(androidx.compose.foundation.lazy.layout.d dVar, C1544o c1544o, androidx.compose.ui.layout.C c10, N n10) {
                super(1);
                this.f6089a = dVar;
                this.f6090b = c1544o;
                this.f6091c = c10;
                this.f6092d = n10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final X invoke(Y y10) {
                this.f6089a.f(new androidx.compose.foundation.lazy.layout.h(this.f6090b, this.f6091c, this.f6092d));
                return new C0069a(this.f6089a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1544o f6094a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Function2 f6095b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C1544o c1544o, Function2 function2) {
                super(2);
                this.f6094a = c1544o;
                this.f6095b = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m4invoke0kLqBqw((I0.P) obj, ((C5009b) obj2).r());
            }

            /* JADX INFO: renamed from: invoke-0kLqBqw */
            public final I0.C m4invoke0kLqBqw(I0.P p10, long j10) {
                return (I0.C) this.f6095b.invoke(new v(this.f6094a, p10), C5009b.a(j10));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ h2 f6096a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h2 h2Var) {
                super(0);
                this.f6096a = h2Var;
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a */
            public final q invoke() {
                return (q) ((InterfaceC5082a) this.f6096a.getValue()).invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.lazy.layout.d dVar, androidx.compose.ui.e eVar, Function2 function2, h2 h2Var) {
            super(3);
            this.f6085a = dVar;
            this.f6086b = eVar;
            this.f6087c = function2;
            this.f6088d = h2Var;
        }

        public final void a(h0.g gVar, InterfaceC2425m interfaceC2425m, int i10) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1488997347, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
            }
            h2 h2Var = this.f6088d;
            Object objD = interfaceC2425m.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = new C1544o(gVar, new c(h2Var));
                interfaceC2425m.u(objD);
            }
            C1544o c1544o = (C1544o) objD;
            Object objD2 = interfaceC2425m.D();
            if (objD2 == aVar.a()) {
                objD2 = new androidx.compose.ui.layout.C(new s(c1544o));
                interfaceC2425m.u(objD2);
            }
            androidx.compose.ui.layout.C c10 = (androidx.compose.ui.layout.C) objD2;
            if (this.f6085a != null) {
                interfaceC2425m.V(205264983);
                N nD = this.f6085a.d();
                if (nD == null) {
                    interfaceC2425m.V(6622915);
                    nD = O.a(interfaceC2425m, 0);
                } else {
                    interfaceC2425m.V(6621830);
                }
                interfaceC2425m.O();
                Object obj = this.f6085a;
                Object[] objArr = {obj, c1544o, c10, nD};
                boolean zU = interfaceC2425m.U(obj) | interfaceC2425m.F(c1544o) | interfaceC2425m.F(c10) | interfaceC2425m.F(nD);
                androidx.compose.foundation.lazy.layout.d dVar = this.f6085a;
                Object objD3 = interfaceC2425m.D();
                if (zU || objD3 == aVar.a()) {
                    objD3 = new C0068a(dVar, c1544o, c10, nD);
                    interfaceC2425m.u(objD3);
                }
                AbstractC2393b0.c(objArr, (Function1) objD3, interfaceC2425m, 0);
                interfaceC2425m.O();
            } else {
                interfaceC2425m.V(205858881);
                interfaceC2425m.O();
            }
            androidx.compose.ui.e eVarB = androidx.compose.foundation.lazy.layout.e.b(this.f6086b, this.f6085a);
            boolean zU2 = interfaceC2425m.U(c1544o) | interfaceC2425m.U(this.f6087c);
            Function2 function2 = this.f6087c;
            Object objD4 = interfaceC2425m.D();
            if (zU2 || objD4 == aVar.a()) {
                objD4 = new b(c1544o, function2);
                interfaceC2425m.u(objD4);
            }
            androidx.compose.ui.layout.B.b(c10, eVarB, (Function2) objD4, interfaceC2425m, androidx.compose.ui.layout.C.f26871f, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((h0.g) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5082a f6097a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f6098b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f6099c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f6100d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f6101e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f6102f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5082a interfaceC5082a, androidx.compose.ui.e eVar, androidx.compose.foundation.lazy.layout.d dVar, Function2 function2, int i10, int i11) {
            super(2);
            this.f6097a = interfaceC5082a;
            this.f6098b = eVar;
            this.f6099c = dVar;
            this.f6100d = function2;
            this.f6101e = i10;
            this.f6102f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            t.a(this.f6097a, this.f6098b, this.f6099c, this.f6100d, interfaceC2425m, AbstractC2409g1.a(this.f6101e | 1), this.f6102f);
        }
    }

    public static final void a(InterfaceC5082a interfaceC5082a, androidx.compose.ui.e eVar, androidx.compose.foundation.lazy.layout.d dVar, Function2 function2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.F(interfaceC5082a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.U(dVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (i14 != 0) {
                dVar = null;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2002163445, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            E.a(g0.i.d(-1488997347, true, new a(dVar, eVar, function2, U1.o(interfaceC5082a, interfaceC2425mG, i12 & 14)), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        androidx.compose.foundation.lazy.layout.d dVar2 = dVar;
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(interfaceC5082a, eVar2, dVar2, function2, i10, i11));
        }
    }
}
