package z;

import Gf.O;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import ae.AbstractC2605b;
import androidx.compose.foundation.gestures.DraggableElement;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5096o f65401a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final InterfaceC5096o f65402b = new b(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        int f65403a;

        a(Zd.e eVar) {
            super(3, eVar);
        }

        public final Object a(O o10, long j10, Zd.e eVar) {
            return new a(eVar).invokeSuspend(L.f17438a);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((O) obj, ((C6224f) obj2).u(), (Zd.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f65403a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        int f65404a;

        b(Zd.e eVar) {
            super(3, eVar);
        }

        public final Object a(O o10, float f10, Zd.e eVar) {
            return new b(eVar).invokeSuspend(L.f17438a);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((O) obj, ((Number) obj2).floatValue(), (Zd.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f65404a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ h2 f65405a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h2 h2Var) {
            super(1);
            this.f65405a = h2Var;
        }

        public final void a(float f10) {
            ((Function1) this.f65405a.getValue()).invoke(Float.valueOf(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return L.f17438a;
        }
    }

    public static final m a(Function1 function1) {
        return new C7265g(function1);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, m mVar, q qVar, boolean z10, B.m mVar2, boolean z11, InterfaceC5096o interfaceC5096o, InterfaceC5096o interfaceC5096o2, boolean z12) {
        return eVar.then(new DraggableElement(mVar, qVar, z10, mVar2, z11, interfaceC5096o, interfaceC5096o2, z12));
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, m mVar, q qVar, boolean z10, B.m mVar2, boolean z11, InterfaceC5096o interfaceC5096o, InterfaceC5096o interfaceC5096o2, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            mVar2 = null;
        }
        return g(eVar, mVar, qVar, z13, mVar2, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? f65401a : interfaceC5096o, (i10 & 64) != 0 ? f65402b : interfaceC5096o2, (i10 & 128) != 0 ? false : z12);
    }

    public static final m i(Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        h2 h2VarO = U1.o(function1, interfaceC2425m, i10 & 14);
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = a(new c(h2VarO));
            interfaceC2425m.u(objD);
        }
        m mVar = (m) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return mVar;
    }

    public static final float j(long j10, q qVar) {
        return qVar == q.Vertical ? C6224f.n(j10) : C6224f.m(j10);
    }

    public static final float k(long j10, q qVar) {
        return qVar == q.Vertical ? i1.y.i(j10) : i1.y.h(j10);
    }

    public static final long l(long j10) {
        return i1.z.a(Float.isNaN(i1.y.h(j10)) ? 0.0f : i1.y.h(j10), Float.isNaN(i1.y.i(j10)) ? 0.0f : i1.y.i(j10));
    }
}
