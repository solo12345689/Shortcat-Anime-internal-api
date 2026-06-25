package l0;

import Gf.C0;
import Gf.F0;
import Gf.O;
import Gf.P;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0 f52401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f52402b;

        public a(C0 c02, Object obj) {
            this.f52401a = c02;
            this.f52402b = obj;
        }

        public final C0 a() {
            return this.f52401a;
        }

        public final Object b() {
            return this.f52402b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f52405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicReference f52406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f52407e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1, AtomicReference atomicReference, Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f52405c = function1;
            this.f52406d = atomicReference;
            this.f52407e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f52405c, this.f52406d, this.f52407e, eVar);
            bVar.f52404b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            C0 c0A;
            a aVar2;
            Object objF = AbstractC2605b.f();
            int i10 = this.f52403a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    O o10 = (O) this.f52404b;
                    aVar = new a(F0.k(o10.getCoroutineContext()), this.f52405c.invoke(o10));
                    a aVar3 = (a) this.f52406d.getAndSet(aVar);
                    if (aVar3 != null && (c0A = aVar3.a()) != null) {
                        this.f52404b = aVar;
                        this.f52403a = 1;
                        if (F0.g(c0A, this) != objF) {
                        }
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (a) this.f52404b;
                        try {
                            v.b(obj);
                            Y.a(this.f52406d, aVar2, null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            Y.a(this.f52406d, aVar2, null);
                            throw th;
                        }
                    }
                    aVar = (a) this.f52404b;
                    v.b(obj);
                }
                Function2 function2 = this.f52407e;
                Object objB = aVar.b();
                this.f52404b = aVar;
                this.f52403a = 2;
                obj = function2.invoke(objB, this);
                if (obj != objF) {
                    aVar2 = aVar;
                    Y.a(this.f52406d, aVar2, null);
                    return obj;
                }
                return objF;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                Y.a(this.f52406d, aVar2, null);
                throw th;
            }
        }
    }

    public static AtomicReference a() {
        return b(new AtomicReference(null));
    }

    public static final Object c(AtomicReference atomicReference) {
        a aVar = (a) atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final Object d(AtomicReference atomicReference, Function1 function1, Function2 function2, Zd.e eVar) {
        return P.e(new b(function1, atomicReference, function2, null), eVar);
    }

    private static AtomicReference b(AtomicReference atomicReference) {
        return atomicReference;
    }
}
