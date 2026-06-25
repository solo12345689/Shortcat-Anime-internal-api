package androidx.compose.foundation.gestures;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.foundation.gestures.a;
import i1.y;
import ie.InterfaceC5096o;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import x.EnumC6992L;
import z.k;
import z.m;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.compose.foundation.gestures.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private m f25956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q f25957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC5096o f25959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC5096o f25960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25961q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f25964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f25965d;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0448a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f25966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f25967b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0448a(k kVar, c cVar) {
                super(1);
                this.f25966a = kVar;
                this.f25967b = cVar;
            }

            public final void a(a.b bVar) {
                this.f25966a.a(z.l.j(this.f25967b.l2(bVar.a()), this.f25967b.f25957m));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, c cVar, Zd.e eVar) {
            super(2, eVar);
            this.f25964c = function2;
            this.f25965d = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Zd.e eVar) {
            return ((a) create(kVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f25964c, this.f25965d, eVar);
            aVar.f25963b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25962a;
            if (i10 == 0) {
                v.b(obj);
                k kVar = (k) this.f25963b;
                Function2 function2 = this.f25964c;
                C0448a c0448a = new C0448a(kVar, this.f25965d);
                this.f25962a = 1;
                if (function2.invoke(c0448a, this) == objF) {
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
        int f25968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25969b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f25971d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Zd.e eVar) {
            super(2, eVar);
            this.f25971d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = c.this.new b(this.f25971d, eVar);
            bVar.f25969b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25968a;
            if (i10 == 0) {
                v.b(obj);
                O o10 = (O) this.f25969b;
                InterfaceC5096o interfaceC5096o = c.this.f25959o;
                C6224f c6224fD = C6224f.d(this.f25971d);
                this.f25968a = 1;
                if (interfaceC5096o.invoke(o10, c6224fD, this) == objF) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0449c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25973b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f25975d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0449c(long j10, Zd.e eVar) {
            super(2, eVar);
            this.f25975d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            C0449c c0449c = c.this.new C0449c(this.f25975d, eVar);
            c0449c.f25973b = obj;
            return c0449c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0449c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25972a;
            if (i10 == 0) {
                v.b(obj);
                O o10 = (O) this.f25973b;
                InterfaceC5096o interfaceC5096o = c.this.f25960p;
                Float fC = kotlin.coroutines.jvm.internal.b.c(z.l.k(c.this.k2(this.f25975d), c.this.f25957m));
                this.f25972a = 1;
                if (interfaceC5096o.invoke(o10, fC, this) == objF) {
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

    public c(m mVar, Function1 function1, q qVar, boolean z10, B.m mVar2, boolean z11, InterfaceC5096o interfaceC5096o, InterfaceC5096o interfaceC5096o2, boolean z12) {
        super(function1, z10, mVar2, qVar);
        this.f25956l = mVar;
        this.f25957m = qVar;
        this.f25958n = z11;
        this.f25959o = interfaceC5096o;
        this.f25960p = interfaceC5096o2;
        this.f25961q = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k2(long j10) {
        return y.m(j10, this.f25961q ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long l2(long j10) {
        return C6224f.r(j10, this.f25961q ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object T1(Function2 function2, Zd.e eVar) {
        Object objA = this.f25956l.a(EnumC6992L.UserInput, new a(function2, this, null), eVar);
        return objA == AbstractC2605b.f() ? objA : L.f17438a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public void X1(long j10) {
        if (!isAttached() || AbstractC5504s.c(this.f25959o, z.l.f65401a)) {
            return;
        }
        AbstractC1617k.d(getCoroutineScope(), null, null, new b(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public void Y1(long j10) {
        if (!isAttached() || AbstractC5504s.c(this.f25960p, z.l.f65402b)) {
            return;
        }
        AbstractC1617k.d(getCoroutineScope(), null, null, new C0449c(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public boolean c2() {
        return this.f25958n;
    }

    public final void m2(m mVar, Function1 function1, q qVar, boolean z10, B.m mVar2, boolean z11, InterfaceC5096o interfaceC5096o, InterfaceC5096o interfaceC5096o2, boolean z12) {
        boolean z13;
        boolean z14 = true;
        if (AbstractC5504s.c(this.f25956l, mVar)) {
            z13 = false;
        } else {
            this.f25956l = mVar;
            z13 = true;
        }
        if (this.f25957m != qVar) {
            this.f25957m = qVar;
            z13 = true;
        }
        if (this.f25961q != z12) {
            this.f25961q = z12;
        } else {
            z14 = z13;
        }
        this.f25959o = interfaceC5096o;
        this.f25960p = interfaceC5096o2;
        this.f25958n = z11;
        e2(function1, z10, mVar2, qVar, z14);
    }
}
