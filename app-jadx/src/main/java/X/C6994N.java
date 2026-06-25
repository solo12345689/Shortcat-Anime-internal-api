package x;

import Gf.C0;
import Zd.i;
import ae.AbstractC2605b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: x.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6994N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f63272a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pf.a f63273b = Pf.g.b(false, 1, null);

    /* JADX INFO: renamed from: x.N$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC6992L f63274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0 f63275b;

        public a(EnumC6992L enumC6992L, C0 c02) {
            this.f63274a = enumC6992L;
            this.f63275b = c02;
        }

        public final boolean a(a aVar) {
            return this.f63274a.compareTo(aVar.f63274a) >= 0;
        }

        public final void b() {
            this.f63275b.k(new C6993M());
        }
    }

    /* JADX INFO: renamed from: x.N$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f63276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f63277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f63278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f63279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f63281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6992L f63282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ C6994N f63283h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f63284i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f63285j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC6992L enumC6992L, C6994N c6994n, Function2 function2, Object obj, Zd.e eVar) {
            super(2, eVar);
            this.f63282g = enumC6992L;
            this.f63283h = c6994n;
            this.f63284i = function2;
            this.f63285j = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f63282g, this.f63283h, this.f63284i, this.f63285j, eVar);
            bVar.f63281f = obj;
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
            Function2 function2;
            a aVar2;
            C6994N c6994n;
            Object obj2;
            Throwable th2;
            C6994N c6994n2;
            a aVar3;
            Pf.a aVar4;
            Object objF = AbstractC2605b.f();
            ?? r12 = this.f63280e;
            try {
                try {
                    if (r12 == 0) {
                        Td.v.b(obj);
                        Gf.O o10 = (Gf.O) this.f63281f;
                        EnumC6992L enumC6992L = this.f63282g;
                        i.b bVarL = o10.getCoroutineContext().l(C0.f7490K);
                        AbstractC5504s.e(bVarL);
                        a aVar5 = new a(enumC6992L, (C0) bVarL);
                        this.f63283h.e(aVar5);
                        aVar = this.f63283h.f63273b;
                        function2 = this.f63284i;
                        Object obj3 = this.f63285j;
                        C6994N c6994n3 = this.f63283h;
                        this.f63281f = aVar5;
                        this.f63276a = aVar;
                        this.f63277b = function2;
                        this.f63278c = obj3;
                        this.f63279d = c6994n3;
                        this.f63280e = 1;
                        if (aVar.c(null, this) != objF) {
                            aVar2 = aVar5;
                            c6994n = c6994n3;
                            obj2 = obj3;
                        }
                        return objF;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6994n2 = (C6994N) this.f63277b;
                        aVar4 = (Pf.a) this.f63276a;
                        aVar3 = (a) this.f63281f;
                        try {
                            Td.v.b(obj);
                            w.Y.a(c6994n2.f63272a, aVar3, null);
                            aVar4.e(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            w.Y.a(c6994n2.f63272a, aVar3, null);
                            throw th2;
                        }
                    }
                    c6994n = (C6994N) this.f63279d;
                    obj2 = this.f63278c;
                    function2 = (Function2) this.f63277b;
                    Pf.a aVar6 = (Pf.a) this.f63276a;
                    aVar2 = (a) this.f63281f;
                    Td.v.b(obj);
                    aVar = aVar6;
                    this.f63281f = aVar2;
                    this.f63276a = aVar;
                    this.f63277b = c6994n;
                    this.f63278c = null;
                    this.f63279d = null;
                    this.f63280e = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != objF) {
                        c6994n2 = c6994n;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        w.Y.a(c6994n2.f63272a, aVar3, null);
                        aVar4.e(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c6994n2 = c6994n;
                    aVar3 = aVar2;
                    w.Y.a(c6994n2.f63272a, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.e(null);
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f63272a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!w.Y.a(this.f63272a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(Object obj, EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
        return Gf.P.e(new b(enumC6992L, this, function2, obj, null), eVar);
    }
}
