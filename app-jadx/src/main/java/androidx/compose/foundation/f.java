package androidx.compose.foundation;

import K0.B0;
import K0.v0;
import R0.A;
import R0.C;
import R0.C2099h;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import x.InterfaceC6989I;
import z.AbstractC7254A;
import z.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f extends androidx.compose.foundation.a implements v0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f25856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC5082a f25857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC5082a f25858y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            InterfaceC5082a interfaceC5082a = f.this.f25857x;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final void a(long j10) {
            InterfaceC5082a interfaceC5082a = f.this.f25858y;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6224f) obj).u());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {
        c() {
            super(1);
        }

        public final void a(long j10) {
            InterfaceC5082a interfaceC5082a = f.this.f25857x;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6224f) obj).u());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f25864c;

        d(Zd.e eVar) {
            super(3, eVar);
        }

        public final Object a(r rVar, long j10, Zd.e eVar) {
            d dVar = f.this.new d(eVar);
            dVar.f25863b = rVar;
            dVar.f25864c = j10;
            return dVar.invokeSuspend(L.f17438a);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((r) obj, ((C6224f) obj2).u(), (Zd.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25862a;
            if (i10 == 0) {
                v.b(obj);
                r rVar = (r) this.f25863b;
                long j10 = this.f25864c;
                if (f.this.W1()) {
                    f fVar = f.this;
                    this.f25862a = 1;
                    if (fVar.Y1(rVar, j10, this) == objF) {
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
    static final class e extends AbstractC5506u implements Function1 {
        e() {
            super(1);
        }

        public final void a(long j10) {
            if (f.this.W1()) {
                f.this.X1().invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6224f) obj).u());
            return L.f17438a;
        }
    }

    public /* synthetic */ f(InterfaceC5082a interfaceC5082a, String str, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str2, C2099h c2099h, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5082a, str, interfaceC5082a2, interfaceC5082a3, mVar, interfaceC6989I, z10, str2, c2099h);
    }

    @Override // androidx.compose.foundation.a
    public void Q1(C c10) {
        if (this.f25857x != null) {
            A.w(c10, this.f25856w, new a());
        }
    }

    @Override // androidx.compose.foundation.a
    public Object R1(E0.L l10, Zd.e eVar) {
        Object objI = AbstractC7254A.i(l10, (!W1() || this.f25858y == null) ? null : new b(), (!W1() || this.f25857x == null) ? null : new c(), new d(null), new e(), eVar);
        return objI == AbstractC2605b.f() ? objI : L.f17438a;
    }

    public void f2(InterfaceC5082a interfaceC5082a, String str, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str2, C2099h c2099h) {
        boolean z11;
        if (!AbstractC5504s.c(this.f25856w, str)) {
            this.f25856w = str;
            B0.b(this);
        }
        if ((this.f25857x == null) != (interfaceC5082a2 == null)) {
            T1();
            B0.b(this);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25857x = interfaceC5082a2;
        if ((this.f25858y == null) != (interfaceC5082a3 == null)) {
            z11 = true;
        }
        this.f25858y = interfaceC5082a3;
        boolean z12 = W1() == z10 ? z11 : true;
        c2(mVar, interfaceC6989I, z10, str2, c2099h, interfaceC5082a);
        if (z12) {
            a2();
        }
    }

    private f(InterfaceC5082a interfaceC5082a, String str, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str2, C2099h c2099h) {
        super(mVar, interfaceC6989I, z10, str2, c2099h, interfaceC5082a, null);
        this.f25856w = str;
        this.f25857x = interfaceC5082a2;
        this.f25858y = interfaceC5082a3;
    }
}
