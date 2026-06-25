package ae;

import Td.v;
import Zd.e;
import Zd.i;
import ie.InterfaceC5096o;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: renamed from: ae.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2606c {

    /* JADX INFO: renamed from: ae.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends j {

        /* JADX INFO: renamed from: a */
        private int f23937a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f23938b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f23939c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, Function2 function2, Object obj) {
            super(eVar);
            this.f23938b = function2;
            this.f23939c = obj;
            AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f23937a;
            if (i10 == 0) {
                this.f23937a = 1;
                v.b(obj);
                AbstractC5504s.f(this.f23938b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) V.e(this.f23938b, 2)).invoke(this.f23939c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f23937a = 2;
            v.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: ae.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        private int f23940a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f23941b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f23942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, i iVar, Function2 function2, Object obj) {
            super(eVar, iVar);
            this.f23941b = function2;
            this.f23942c = obj;
            AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f23940a;
            if (i10 == 0) {
                this.f23940a = 1;
                v.b(obj);
                AbstractC5504s.f(this.f23941b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) V.e(this.f23941b, 2)).invoke(this.f23942c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f23940a = 2;
            v.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: ae.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0417c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0417c(e eVar) {
            super(eVar);
            AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            v.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: ae.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e eVar, i iVar) {
            super(eVar, iVar);
            AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            v.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(Function2 function2, Object obj, e completion) {
        AbstractC5504s.h(function2, "<this>");
        AbstractC5504s.h(completion, "completion");
        e eVarA = h.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(obj, eVarA);
        }
        i context = eVarA.getContext();
        return context == Zd.j.f23275a ? new a(eVarA, function2, obj) : new b(eVarA, context, function2, obj);
    }

    private static final e b(e eVar) {
        i context = eVar.getContext();
        return context == Zd.j.f23275a ? new C0417c(eVar) : new d(eVar, context);
    }

    public static e c(e eVar) {
        e eVarIntercepted;
        AbstractC5504s.h(eVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = eVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) eVar : null;
        return (dVar == null || (eVarIntercepted = dVar.intercepted()) == null) ? eVar : eVarIntercepted;
    }

    public static Object d(InterfaceC5096o interfaceC5096o, Object obj, Object obj2, e completion) {
        AbstractC5504s.h(interfaceC5096o, "<this>");
        AbstractC5504s.h(completion, "completion");
        return ((InterfaceC5096o) V.e(interfaceC5096o, 3)).invoke(obj, obj2, b(h.a(completion)));
    }

    public static Object e(Function2 function2, Object obj, e completion) {
        AbstractC5504s.h(function2, "<this>");
        AbstractC5504s.h(completion, "completion");
        return ((Function2) V.e(function2, 2)).invoke(obj, b(h.a(completion)));
    }
}
