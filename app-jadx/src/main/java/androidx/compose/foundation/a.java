package androidx.compose.foundation;

import B.o;
import E0.AbstractC1310u;
import E0.C1307q;
import E0.EnumC1308s;
import E0.V;
import E0.X;
import Gf.AbstractC1617k;
import Gf.O;
import Gf.P;
import Gf.Z;
import K0.A0;
import K0.AbstractC1800m;
import K0.I0;
import K0.InterfaceC1794j;
import K0.v0;
import R0.A;
import R0.C;
import R0.C2099h;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.view.KeyEvent;
import i1.AbstractC5026s;
import i1.C5021n;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.InterfaceC6058d;
import r0.AbstractC6225g;
import r0.C6224f;
import x.AbstractC7013k;
import x.C7026x;
import x.C7028z;
import x.InterfaceC6989I;
import z.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC1800m implements v0, C0.e, InterfaceC6058d, A0, I0 {

    /* JADX INFO: renamed from: u */
    public static final C0439a f25761u = new C0439a(null);

    /* JADX INFO: renamed from: v */
    public static final int f25762v = 8;

    /* JADX INFO: renamed from: c */
    private B.m f25763c;

    /* JADX INFO: renamed from: d */
    private InterfaceC6989I f25764d;

    /* JADX INFO: renamed from: e */
    private String f25765e;

    /* JADX INFO: renamed from: f */
    private C2099h f25766f;

    /* JADX INFO: renamed from: g */
    private boolean f25767g;

    /* JADX INFO: renamed from: h */
    private InterfaceC5082a f25768h;

    /* JADX INFO: renamed from: i */
    private final boolean f25769i;

    /* JADX INFO: renamed from: j */
    private final C7026x f25770j;

    /* JADX INFO: renamed from: k */
    private final C7028z f25771k;

    /* JADX INFO: renamed from: l */
    private X f25772l;

    /* JADX INFO: renamed from: m */
    private InterfaceC1794j f25773m;

    /* JADX INFO: renamed from: n */
    private o.b f25774n;

    /* JADX INFO: renamed from: o */
    private B.g f25775o;

    /* JADX INFO: renamed from: p */
    private final Map f25776p;

    /* JADX INFO: renamed from: q */
    private long f25777q;

    /* JADX INFO: renamed from: r */
    private B.m f25778r;

    /* JADX INFO: renamed from: s */
    private boolean f25779s;

    /* JADX INFO: renamed from: t */
    private final Object f25780t;

    /* JADX INFO: renamed from: androidx.compose.foundation.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0439a {
        public /* synthetic */ C0439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0439a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            a.this.X1().invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25782a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ B.m f25783b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ B.g f25784c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(B.m mVar, B.g gVar, Zd.e eVar) {
            super(2, eVar);
            this.f25783b = mVar;
            this.f25784c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new c(this.f25783b, this.f25784c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25782a;
            if (i10 == 0) {
                v.b(obj);
                B.m mVar = this.f25783b;
                B.g gVar = this.f25784c;
                this.f25782a = 1;
                if (mVar.c(gVar, this) == objF) {
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
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25785a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ B.m f25786b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ B.h f25787c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B.m mVar, B.h hVar, Zd.e eVar) {
            super(2, eVar);
            this.f25786b = mVar;
            this.f25787c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new d(this.f25786b, this.f25787c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25785a;
            if (i10 == 0) {
                v.b(obj);
                B.m mVar = this.f25786b;
                B.h hVar = this.f25787c;
                this.f25785a = 1;
                if (mVar.c(hVar, this) == objF) {
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
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        boolean f25788a;

        /* JADX INFO: renamed from: b */
        int f25789b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f25790c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ r f25791d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f25792e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ B.m f25793f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ a f25794g;

        /* JADX INFO: renamed from: androidx.compose.foundation.a$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0440a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            Object f25795a;

            /* JADX INFO: renamed from: b */
            int f25796b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ a f25797c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ long f25798d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ B.m f25799e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0440a(a aVar, long j10, B.m mVar, Zd.e eVar) {
                super(2, eVar);
                this.f25797c = aVar;
                this.f25798d = j10;
                this.f25799e = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0440a(this.f25797c, this.f25798d, this.f25799e, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0440a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                o.b bVar;
                Object objF = AbstractC2605b.f();
                int i10 = this.f25796b;
                if (i10 == 0) {
                    v.b(obj);
                    if (this.f25797c.S1()) {
                        long jA = AbstractC7013k.a();
                        this.f25796b = 1;
                        if (Z.a(jA, this) != objF) {
                        }
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (o.b) this.f25795a;
                        v.b(obj);
                        this.f25797c.f25774n = bVar;
                        return L.f17438a;
                    }
                    v.b(obj);
                }
                o.b bVar2 = new o.b(this.f25798d, null);
                B.m mVar = this.f25799e;
                this.f25795a = bVar2;
                this.f25796b = 2;
                if (mVar.c(bVar2, this) != objF) {
                    bVar = bVar2;
                    this.f25797c.f25774n = bVar;
                    return L.f17438a;
                }
                return objF;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r rVar, long j10, B.m mVar, a aVar, Zd.e eVar) {
            super(2, eVar);
            this.f25791d = rVar;
            this.f25792e = j10;
            this.f25793f = mVar;
            this.f25794g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            e eVar2 = new e(this.f25791d, this.f25792e, this.f25793f, this.f25794g, eVar);
            eVar2.f25790c = obj;
            return eVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x00ab, code lost:
        
            if (r3.c(r2, r16) != r1) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x00cd, code lost:
        
            if (r4.c(r5, r16) == r1) goto L85;
         */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25800a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ o.b f25802c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o.b bVar, Zd.e eVar) {
            super(2, eVar);
            this.f25802c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new f(this.f25802c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25800a;
            if (i10 == 0) {
                v.b(obj);
                B.m mVar = a.this.f25763c;
                if (mVar != null) {
                    o.b bVar = this.f25802c;
                    this.f25800a = 1;
                    if (mVar.c(bVar, this) == objF) {
                        return objF;
                    }
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
    static final class g extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25803a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ o.b f25805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(o.b bVar, Zd.e eVar) {
            super(2, eVar);
            this.f25805c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new g(this.f25805c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((g) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25803a;
            if (i10 == 0) {
                v.b(obj);
                B.m mVar = a.this.f25763c;
                if (mVar != null) {
                    o.c cVar = new o.c(this.f25805c);
                    this.f25803a = 1;
                    if (mVar.c(cVar, this) == objF) {
                        return objF;
                    }
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
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25806a;

        h(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new h(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((h) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f25806a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            a.this.U1();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25808a;

        i(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new i(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((i) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f25808a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            a.this.V1();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25810a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f25811b;

        j(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            j jVar = a.this.new j(eVar);
            jVar.f25811b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, Zd.e eVar) {
            return ((j) create(l10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25810a;
            if (i10 == 0) {
                v.b(obj);
                E0.L l10 = (E0.L) this.f25811b;
                a aVar = a.this;
                this.f25810a = 1;
                if (aVar.R1(l10, this) == objF) {
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

    public /* synthetic */ a(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, interfaceC6989I, z10, str, c2099h, interfaceC5082a);
    }

    public final boolean S1() {
        return androidx.compose.foundation.d.g(this) || AbstractC7013k.c(this);
    }

    public final void U1() {
        if (this.f25775o == null) {
            B.g gVar = new B.g();
            B.m mVar = this.f25763c;
            if (mVar != null) {
                AbstractC1617k.d(getCoroutineScope(), null, null, new c(mVar, gVar, null), 3, null);
            }
            this.f25775o = gVar;
        }
    }

    public final void V1() {
        B.g gVar = this.f25775o;
        if (gVar != null) {
            B.h hVar = new B.h(gVar);
            B.m mVar = this.f25763c;
            if (mVar != null) {
                AbstractC1617k.d(getCoroutineScope(), null, null, new d(mVar, hVar, null), 3, null);
            }
            this.f25775o = null;
        }
    }

    private final void Z1() {
        InterfaceC6989I interfaceC6989I;
        if (this.f25773m == null && (interfaceC6989I = this.f25764d) != null) {
            if (this.f25763c == null) {
                this.f25763c = B.l.a();
            }
            this.f25771k.K1(this.f25763c);
            B.m mVar = this.f25763c;
            AbstractC5504s.e(mVar);
            InterfaceC1794j interfaceC1794jA = interfaceC6989I.a(mVar);
            E1(interfaceC1794jA);
            this.f25773m = interfaceC1794jA;
        }
    }

    private final boolean b2() {
        return this.f25778r == null && this.f25764d != null;
    }

    @Override // K0.I0
    public Object B() {
        return this.f25780t;
    }

    @Override // C0.e
    public final boolean E0(KeyEvent keyEvent) {
        return false;
    }

    public abstract Object R1(E0.L l10, Zd.e eVar);

    @Override // K0.v0
    public final void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        long jB = AbstractC5026s.b(j10);
        this.f25777q = AbstractC6225g.a(C5021n.k(jB), C5021n.l(jB));
        Z1();
        if (this.f25767g && enumC1308s == EnumC1308s.f4179b) {
            int iF = c1307q.f();
            AbstractC1310u.a aVar = AbstractC1310u.f4183a;
            if (AbstractC1310u.i(iF, aVar.a())) {
                AbstractC1617k.d(getCoroutineScope(), null, null, new h(null), 3, null);
            } else if (AbstractC1310u.i(iF, aVar.b())) {
                AbstractC1617k.d(getCoroutineScope(), null, null, new i(null), 3, null);
            }
        }
        if (this.f25772l == null) {
            this.f25772l = (X) E1(V.a(new j(null)));
        }
        X x10 = this.f25772l;
        if (x10 != null) {
            x10.S(c1307q, enumC1308s, j10);
        }
    }

    @Override // C0.e
    public final boolean T0(KeyEvent keyEvent) {
        Z1();
        if (this.f25767g && AbstractC7013k.f(keyEvent)) {
            if (this.f25776p.containsKey(C0.a.o(C0.d.a(keyEvent)))) {
                return false;
            }
            o.b bVar = new o.b(this.f25777q, null);
            this.f25776p.put(C0.a.o(C0.d.a(keyEvent)), bVar);
            if (this.f25763c != null) {
                AbstractC1617k.d(getCoroutineScope(), null, null, new f(bVar, null), 3, null);
            }
            return true;
        }
        if (!this.f25767g || !AbstractC7013k.b(keyEvent)) {
            return false;
        }
        o.b bVar2 = (o.b) this.f25776p.remove(C0.a.o(C0.d.a(keyEvent)));
        if (bVar2 != null && this.f25763c != null) {
            AbstractC1617k.d(getCoroutineScope(), null, null, new g(bVar2, null), 3, null);
        }
        this.f25768h.invoke();
        return true;
    }

    protected final void T1() {
        B.m mVar = this.f25763c;
        if (mVar != null) {
            o.b bVar = this.f25774n;
            if (bVar != null) {
                mVar.a(new o.a(bVar));
            }
            B.g gVar = this.f25775o;
            if (gVar != null) {
                mVar.a(new B.h(gVar));
            }
            Iterator it = this.f25776p.values().iterator();
            while (it.hasNext()) {
                mVar.a(new o.a((o.b) it.next()));
            }
        }
        this.f25774n = null;
        this.f25775o = null;
        this.f25776p.clear();
    }

    @Override // q0.InterfaceC6058d
    public final void W0(q0.n nVar) {
        if (nVar.a()) {
            Z1();
        }
        if (this.f25767g) {
            this.f25771k.W0(nVar);
        }
    }

    protected final boolean W1() {
        return this.f25767g;
    }

    protected final InterfaceC5082a X1() {
        return this.f25768h;
    }

    @Override // K0.A0
    public final void Y(C c10) {
        C2099h c2099h = this.f25766f;
        if (c2099h != null) {
            AbstractC5504s.e(c2099h);
            A.c0(c10, c2099h.p());
        }
        A.s(c10, this.f25765e, new b());
        if (this.f25767g) {
            this.f25771k.Y(c10);
        } else {
            A.h(c10);
        }
        Q1(c10);
    }

    protected final Object Y1(r rVar, long j10, Zd.e eVar) {
        Object objE;
        B.m mVar = this.f25763c;
        return (mVar == null || (objE = P.e(new e(rVar, j10, mVar, this, null), eVar)) != AbstractC2605b.f()) ? L.f17438a : objE;
    }

    @Override // K0.v0
    public final void a1() {
        B.g gVar;
        B.m mVar = this.f25763c;
        if (mVar != null && (gVar = this.f25775o) != null) {
            mVar.a(new B.h(gVar));
        }
        this.f25775o = null;
        X x10 = this.f25772l;
        if (x10 != null) {
            x10.a1();
        }
    }

    protected final L a2() {
        X x10 = this.f25772l;
        if (x10 == null) {
            return null;
        }
        x10.C0();
        return L.f17438a;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void c2(B.m r3, x.InterfaceC6989I r4, boolean r5, java.lang.String r6, R0.C2099h r7, ie.InterfaceC5082a r8) {
        /*
            r2 = this;
            B.m r0 = r2.f25778r
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.T1()
            r2.f25778r = r3
            r2.f25763c = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            x.I r0 = r2.f25764d
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r4)
            if (r0 != 0) goto L1e
            r2.f25764d = r4
            r3 = r1
        L1e:
            boolean r4 = r2.f25767g
            if (r4 == r5) goto L41
            if (r5 == 0) goto L2f
            x.x r4 = r2.f25770j
            r2.E1(r4)
            x.z r4 = r2.f25771k
            r2.E1(r4)
            goto L3c
        L2f:
            x.x r4 = r2.f25770j
            r2.H1(r4)
            x.z r4 = r2.f25771k
            r2.H1(r4)
            r2.T1()
        L3c:
            K0.B0.b(r2)
            r2.f25767g = r5
        L41:
            java.lang.String r4 = r2.f25765e
            boolean r4 = kotlin.jvm.internal.AbstractC5504s.c(r4, r6)
            if (r4 != 0) goto L4e
            r2.f25765e = r6
            K0.B0.b(r2)
        L4e:
            R0.h r4 = r2.f25766f
            boolean r4 = kotlin.jvm.internal.AbstractC5504s.c(r4, r7)
            if (r4 != 0) goto L5b
            r2.f25766f = r7
            K0.B0.b(r2)
        L5b:
            r2.f25768h = r8
            boolean r4 = r2.f25779s
            boolean r5 = r2.b2()
            if (r4 == r5) goto L72
            boolean r4 = r2.b2()
            r2.f25779s = r4
            if (r4 != 0) goto L72
            K0.j r4 = r2.f25773m
            if (r4 != 0) goto L72
            goto L73
        L72:
            r1 = r3
        L73:
            if (r1 == 0) goto L88
            K0.j r3 = r2.f25773m
            if (r3 != 0) goto L7d
            boolean r4 = r2.f25779s
            if (r4 != 0) goto L88
        L7d:
            if (r3 == 0) goto L82
            r2.H1(r3)
        L82:
            r3 = 0
            r2.f25773m = r3
            r2.Z1()
        L88:
            x.z r3 = r2.f25771k
            B.m r4 = r2.f25763c
            r3.K1(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.c2(B.m, x.I, boolean, java.lang.String, R0.h, ie.a):void");
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return this.f25769i;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        if (!this.f25779s) {
            Z1();
        }
        if (this.f25767g) {
            E1(this.f25770j);
            E1(this.f25771k);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        T1();
        if (this.f25778r == null) {
            this.f25763c = null;
        }
        InterfaceC1794j interfaceC1794j = this.f25773m;
        if (interfaceC1794j != null) {
            H1(interfaceC1794j);
        }
        this.f25773m = null;
    }

    @Override // K0.A0
    public final boolean z1() {
        return true;
    }

    private a(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        this.f25763c = mVar;
        this.f25764d = interfaceC6989I;
        this.f25765e = str;
        this.f25766f = c2099h;
        this.f25767g = z10;
        this.f25768h = interfaceC5082a;
        this.f25770j = new C7026x();
        this.f25771k = new C7028z(this.f25763c);
        this.f25776p = new LinkedHashMap();
        this.f25777q = C6224f.f58329b.c();
        this.f25778r = this.f25763c;
        this.f25779s = b2();
        this.f25780t = f25761u;
    }

    public void Q1(C c10) {
    }
}
