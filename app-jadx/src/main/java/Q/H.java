package Q;

import E0.C1307q;
import K.C1758h;
import U0.W0;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.InterfaceC2733t0;
import i1.AbstractC5026s;
import i1.C5018k;
import i1.C5025r;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import x.AbstractC6991K;
import x.InterfaceC7002W;
import y.AbstractC7188j;
import y.C7185g;
import y.C7187i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ F f14042a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7187i f14043b;

        /* JADX INFO: renamed from: Q.H$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0229a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C7187i f14044a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ F f14045b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0229a(C7187i c7187i, F f10) {
                super(0);
                this.f14044a = c7187i;
                this.f14045b = f10;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m35invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m35invoke() {
                this.f14045b.s();
                AbstractC7188j.a(this.f14044a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C7187i f14046a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ F f14047b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C7187i c7187i, F f10) {
                super(0);
                this.f14046a = c7187i;
                this.f14047b = f10;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m36invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m36invoke() {
                this.f14047b.o(false);
                AbstractC7188j.a(this.f14046a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C7187i f14048a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ F f14049b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C7187i c7187i, F f10) {
                super(0);
                this.f14048a = c7187i;
                this.f14049b = f10;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m37invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m37invoke() {
                this.f14049b.T();
                AbstractC7188j.a(this.f14048a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C7187i f14050a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ F f14051b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C7187i c7187i, F f10) {
                super(0);
                this.f14050a = c7187i;
                this.f14051b = f10;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m38invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m38invoke() {
                this.f14051b.U();
                AbstractC7188j.a(this.f14050a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F f10, C7187i c7187i) {
            super(1);
            this.f14042a = f10;
            this.f14043b = c7187i;
        }

        public final void a(C7185g c7185g) {
            InterfaceC2733t0 interfaceC2733t0Y;
            this.f14042a.P();
            boolean zH = W0.h(this.f14042a.O().k());
            C7185g.d(c7185g, new C1758h(K.G.Cut), null, !zH && this.f14042a.D(), null, new C0229a(this.f14043b, this.f14042a), 10, null);
            C7185g.d(c7185g, new C1758h(K.G.Copy), null, !zH, null, new b(this.f14043b, this.f14042a), 10, null);
            C7185g.d(c7185g, new C1758h(K.G.Paste), null, this.f14042a.D() && (interfaceC2733t0Y = this.f14042a.y()) != null && interfaceC2733t0Y.b(), null, new c(this.f14043b, this.f14042a), 10, null);
            C7185g.d(c7185g, new C1758h(K.G.SelectAll), null, W0.j(this.f14042a.O().k()) != this.f14042a.O().l().length(), null, new d(this.f14043b, this.f14042a), 10, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7185g) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ F f14052a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ F f14053a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C0 f14054b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(F f10, C0 c02) {
                super(0);
                this.f14053a = f10;
                this.f14054b = c02;
            }

            public final long a() {
                return G.b(this.f14053a, b.e(this.f14054b));
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                return C6224f.d(a());
            }
        }

        /* JADX INFO: renamed from: Q.H$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0230b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5011d f14055a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C0 f14056b;

            /* JADX INFO: renamed from: Q.H$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class a extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ InterfaceC5082a f14057a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InterfaceC5082a interfaceC5082a) {
                    super(1);
                    this.f14057a = interfaceC5082a;
                }

                public final long a(InterfaceC5011d interfaceC5011d) {
                    return ((C6224f) this.f14057a.invoke()).u();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return C6224f.d(a((InterfaceC5011d) obj));
                }
            }

            /* JADX INFO: renamed from: Q.H$b$b$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0231b extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ InterfaceC5011d f14058a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C0 f14059b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0231b(InterfaceC5011d interfaceC5011d, C0 c02) {
                    super(1);
                    this.f14058a = interfaceC5011d;
                    this.f14059b = c02;
                }

                public final void a(long j10) {
                    C0 c02 = this.f14059b;
                    InterfaceC5011d interfaceC5011d = this.f14058a;
                    b.f(c02, AbstractC5026s.a(interfaceC5011d.s0(C5018k.h(j10)), interfaceC5011d.s0(C5018k.g(j10))));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C5018k) obj).k());
                    return Td.L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0230b(InterfaceC5011d interfaceC5011d, C0 c02) {
                super(1);
                this.f14055a = interfaceC5011d;
                this.f14056b = c02;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a */
            public final androidx.compose.ui.e invoke(InterfaceC5082a interfaceC5082a) {
                return AbstractC6991K.f(androidx.compose.ui.e.f26613a, new a(interfaceC5082a), null, new C0231b(this.f14055a, this.f14056b), 0.0f, true, 0L, 0.0f, 0.0f, false, InterfaceC7002W.f63292a.a(), 490, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(F f10) {
            super(3);
            this.f14052a = f10;
        }

        public static final long e(C0 c02) {
            return ((C5025r) c02.getValue()).j();
        }

        public static final void f(C0 c02, long j10) {
            c02.setValue(C5025r.b(j10));
        }

        public final androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(1980580247);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)");
            }
            InterfaceC5011d interfaceC5011d = (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e());
            Object objD = interfaceC2425m.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = b2.e(C5025r.b(C5025r.f48570b.a()), null, 2, null);
                interfaceC2425m.u(objD);
            }
            C0 c02 = (C0) objD;
            boolean zF = interfaceC2425m.F(this.f14052a);
            F f10 = this.f14052a;
            Object objD2 = interfaceC2425m.D();
            if (zF || objD2 == aVar.a()) {
                objD2 = new a(f10, c02);
                interfaceC2425m.u(objD2);
            }
            InterfaceC5082a interfaceC5082a = (InterfaceC5082a) objD2;
            boolean zU = interfaceC2425m.U(interfaceC5011d);
            Object objD3 = interfaceC2425m.D();
            if (zU || objD3 == aVar.a()) {
                objD3 = new C0230b(interfaceC5011d, c02);
                interfaceC2425m.u(objD3);
            }
            androidx.compose.ui.e eVarD = y.d(eVar, interfaceC5082a, (Function1) objD3);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarD;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final Function1 a(F f10, C7187i c7187i) {
        return new a(f10, c7187i);
    }

    public static final boolean b(C1307q c1307q) {
        return false;
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, F f10) {
        return !AbstractC6991K.d(0, 1, null) ? eVar : androidx.compose.ui.c.c(eVar, null, new b(f10), 1, null);
    }
}
