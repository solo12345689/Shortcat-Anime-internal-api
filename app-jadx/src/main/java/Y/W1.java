package Y;

import Y.InterfaceC2425m;
import ae.AbstractC2605b;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class W1 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f22232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f22233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0 f22234d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, C0 c02, Zd.e eVar) {
            super(2, eVar);
            this.f22233c = function2;
            this.f22234d = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f22233c, this.f22234d, eVar);
            aVar.f22232b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f22231a;
            if (i10 == 0) {
                Td.v.b(obj);
                Gf.O o10 = (Gf.O) this.f22232b;
                Function2 function2 = this.f22233c;
                C2391a1 c2391a1 = new C2391a1(this.f22234d, o10.getCoroutineContext());
                this.f22231a = 1;
                if (function2.invoke(c2391a1, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f22236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f22237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0 f22238d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function2 function2, C0 c02, Zd.e eVar) {
            super(2, eVar);
            this.f22237c = function2;
            this.f22238d = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f22237c, this.f22238d, eVar);
            bVar.f22236b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f22235a;
            if (i10 == 0) {
                Td.v.b(obj);
                Gf.O o10 = (Gf.O) this.f22236b;
                Function2 function2 = this.f22237c;
                C2391a1 c2391a1 = new C2391a1(this.f22238d, o10.getCoroutineContext());
                this.f22235a = 1;
                if (function2.invoke(c2391a1, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f22240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f22241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0 f22242d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function2 function2, C0 c02, Zd.e eVar) {
            super(2, eVar);
            this.f22241c = function2;
            this.f22242d = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = new c(this.f22241c, this.f22242d, eVar);
            cVar.f22240b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f22239a;
            if (i10 == 0) {
                Td.v.b(obj);
                Gf.O o10 = (Gf.O) this.f22240b;
                Function2 function2 = this.f22241c;
                C2391a1 c2391a1 = new C2391a1(this.f22242d, o10.getCoroutineContext());
                this.f22239a = 1;
                if (function2.invoke(c2391a1, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    public static final h2 a(Object obj, Object obj2, Object obj3, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = b2.e(obj, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        boolean zF = interfaceC2425m.F(function2);
        Object objD2 = interfaceC2425m.D();
        if (zF || objD2 == aVar.a()) {
            objD2 = new b(function2, c02, null);
            interfaceC2425m.u(objD2);
        }
        AbstractC2393b0.d(obj2, obj3, (Function2) objD2, interfaceC2425m, (i10 >> 3) & 126);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c02;
    }

    public static final h2 b(Object obj, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = b2.e(obj, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        Td.L l10 = Td.L.f17438a;
        boolean zF = interfaceC2425m.F(function2);
        Object objD2 = interfaceC2425m.D();
        if (zF || objD2 == aVar.a()) {
            objD2 = new a(function2, c02, null);
            interfaceC2425m.u(objD2);
        }
        AbstractC2393b0.e(l10, (Function2) objD2, interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c02;
    }

    public static final h2 c(Object obj, Object[] objArr, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(490154582, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = b2.e(obj, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zF = interfaceC2425m.F(function2);
        Object objD2 = interfaceC2425m.D();
        if (zF || objD2 == aVar.a()) {
            objD2 = new c(function2, c02, null);
            interfaceC2425m.u(objD2);
        }
        AbstractC2393b0.f(objArrCopyOf, (Function2) objD2, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c02;
    }
}
