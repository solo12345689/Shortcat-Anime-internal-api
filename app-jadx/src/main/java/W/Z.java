package w;

import Zd.i;
import ae.AbstractC2605b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f62432a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    private final Pf.a f62433b = Pf.g.b(false, 1, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final W f62434a;

        /* JADX INFO: renamed from: b */
        private final Gf.C0 f62435b;

        public a(W w10, Gf.C0 c02) {
            this.f62434a = w10;
            this.f62435b = c02;
        }

        public final boolean a(a aVar) {
            return this.f62434a.compareTo(aVar.f62434a) >= 0;
        }

        public final void b() {
            this.f62435b.k(new X());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f62436a;

        /* JADX INFO: renamed from: b */
        Object f62437b;

        /* JADX INFO: renamed from: c */
        Object f62438c;

        /* JADX INFO: renamed from: d */
        int f62439d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Object f62440e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ W f62441f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Z f62442g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Function1 f62443h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(W w10, Z z10, Function1 function1, Zd.e eVar) {
            super(2, eVar);
            this.f62441f = w10;
            this.f62442g = z10;
            this.f62443h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f62441f, this.f62442g, this.f62443h, eVar);
            bVar.f62440e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Pf.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Pf.a aVar;
            a aVar2;
            Z z10;
            Function1 function1;
            Throwable th2;
            Z z11;
            a aVar3;
            Pf.a aVar4;
            Object objF = AbstractC2605b.f();
            ?? r12 = this.f62439d;
            try {
                try {
                    if (r12 == 0) {
                        Td.v.b(obj);
                        Gf.O o10 = (Gf.O) this.f62440e;
                        W w10 = this.f62441f;
                        i.b bVarL = o10.getCoroutineContext().l(Gf.C0.f7490K);
                        AbstractC5504s.e(bVarL);
                        a aVar5 = new a(w10, (Gf.C0) bVarL);
                        this.f62442g.f(aVar5);
                        aVar = this.f62442g.f62433b;
                        Function1 function12 = this.f62443h;
                        Z z12 = this.f62442g;
                        this.f62440e = aVar5;
                        this.f62436a = aVar;
                        this.f62437b = function12;
                        this.f62438c = z12;
                        this.f62439d = 1;
                        if (aVar.c(null, this) != objF) {
                            aVar2 = aVar5;
                            z10 = z12;
                            function1 = function12;
                        }
                        return objF;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z11 = (Z) this.f62437b;
                        aVar4 = (Pf.a) this.f62436a;
                        aVar3 = (a) this.f62440e;
                        try {
                            Td.v.b(obj);
                            Y.a(z11.f62432a, aVar3, null);
                            aVar4.e(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            Y.a(z11.f62432a, aVar3, null);
                            throw th2;
                        }
                    }
                    z10 = (Z) this.f62438c;
                    function1 = (Function1) this.f62437b;
                    Pf.a aVar6 = (Pf.a) this.f62436a;
                    aVar2 = (a) this.f62440e;
                    Td.v.b(obj);
                    aVar = aVar6;
                    this.f62440e = aVar2;
                    this.f62436a = aVar;
                    this.f62437b = z10;
                    this.f62438c = null;
                    this.f62439d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objF) {
                        z11 = z10;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        Y.a(z11.f62432a, aVar3, null);
                        aVar4.e(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    z11 = z10;
                    aVar3 = aVar2;
                    Y.a(z11.f62432a, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.e(null);
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object e(Z z10, W w10, Function1 function1, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w10 = W.Default;
        }
        return z10.d(w10, function1, eVar);
    }

    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f62432a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!Y.a(this.f62432a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(W w10, Function1 function1, Zd.e eVar) {
        return Gf.P.e(new b(w10, this, function1, null), eVar);
    }
}
