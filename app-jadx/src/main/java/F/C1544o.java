package F;

import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.X;
import Y.Y;
import ie.InterfaceC5082a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: F.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1544o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.g f6063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f6064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f6065c = new LinkedHashMap();

    /* JADX INFO: renamed from: F.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f6067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Function2 f6069d;

        /* JADX INFO: renamed from: F.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0065a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1544o f6071a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f6072b;

            /* JADX INFO: renamed from: F.o$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0066a extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f6073a;

                /* JADX INFO: renamed from: F.o$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                public static final class C0067a implements X {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f6074a;

                    public C0067a(a aVar) {
                        this.f6074a = aVar;
                    }

                    @Override // Y.X
                    public void dispose() {
                        this.f6074a.f6069d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0066a(a aVar) {
                    super(1);
                    this.f6073a = aVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public final X invoke(Y y10) {
                    return new C0067a(this.f6073a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0065a(C1544o c1544o, a aVar) {
                super(2);
                this.f6071a = c1544o;
                this.f6072b = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
                return Td.L.f17438a;
            }

            public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
                InterfaceC2425m interfaceC2425m2;
                if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:92)");
                }
                q qVar = (q) this.f6071a.d().invoke();
                int iF = this.f6072b.f();
                if ((iF >= qVar.a() || !AbstractC5504s.c(qVar.d(iF), this.f6072b.g())) && (iF = qVar.c(this.f6072b.g())) != -1) {
                    this.f6072b.f6068c = iF;
                }
                int i11 = iF;
                boolean z10 = i11 != -1;
                C1544o c1544o = this.f6071a;
                a aVar = this.f6072b;
                interfaceC2425m.J(207, Boolean.valueOf(z10));
                boolean zA = interfaceC2425m.a(z10);
                interfaceC2425m.V(-869707859);
                if (z10) {
                    interfaceC2425m.V(-2120139493);
                    interfaceC2425m2 = interfaceC2425m;
                    AbstractC1545p.a(qVar, P.a(c1544o.f6063a), i11, P.a(aVar.g()), interfaceC2425m2, 0);
                    interfaceC2425m2.O();
                } else {
                    interfaceC2425m2 = interfaceC2425m;
                    interfaceC2425m2.f(zA);
                }
                interfaceC2425m2.O();
                interfaceC2425m2.B();
                Object objG = this.f6072b.g();
                boolean zF = interfaceC2425m2.F(this.f6072b);
                a aVar2 = this.f6072b;
                Object objD = interfaceC2425m2.D();
                if (zF || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new C0066a(aVar2);
                    interfaceC2425m2.u(objD);
                }
                AbstractC2393b0.b(objG, (Function1) objD, interfaceC2425m2, 0);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        public a(int i10, Object obj, Object obj2) {
            this.f6066a = obj;
            this.f6067b = obj2;
            this.f6068c = i10;
        }

        private final Function2 c() {
            return g0.i.b(1403994769, true, new C0065a(C1544o.this, this));
        }

        public final Function2 d() {
            Function2 function2 = this.f6069d;
            if (function2 != null) {
                return function2;
            }
            Function2 function2C = c();
            this.f6069d = function2C;
            return function2C;
        }

        public final Object e() {
            return this.f6067b;
        }

        public final int f() {
            return this.f6068c;
        }

        public final Object g() {
            return this.f6066a;
        }
    }

    public C1544o(h0.g gVar, InterfaceC5082a interfaceC5082a) {
        this.f6063a = gVar;
        this.f6064b = interfaceC5082a;
    }

    public final Function2 b(int i10, Object obj, Object obj2) {
        a aVar = (a) this.f6065c.get(obj);
        if (aVar != null && aVar.f() == i10 && AbstractC5504s.c(aVar.e(), obj2)) {
            return aVar.d();
        }
        a aVar2 = new a(i10, obj, obj2);
        this.f6065c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.f6065c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        q qVar = (q) this.f6064b.invoke();
        int iC = qVar.c(obj);
        if (iC != -1) {
            return qVar.f(iC);
        }
        return null;
    }

    public final InterfaceC5082a d() {
        return this.f6064b;
    }
}
