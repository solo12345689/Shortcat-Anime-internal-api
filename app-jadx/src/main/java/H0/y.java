package h0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v f47586a = e(new Function2() { // from class: h0.w
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return y.c((z) obj, obj2);
        }
    }, new Function1() { // from class: h0.x
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return y.d(obj);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f47587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f47588b;

        a(Function2 function2, Function1 function1) {
            this.f47587a = function2;
            this.f47588b = function1;
        }

        @Override // h0.v
        public Object a(z zVar, Object obj) {
            return this.f47587a.invoke(zVar, obj);
        }

        @Override // h0.v
        public Object b(Object obj) {
            return this.f47588b.invoke(obj);
        }
    }

    public static final v e(Function2 function2, Function1 function1) {
        return new a(function2, function1);
    }

    public static final v f() {
        v vVar = f47586a;
        AbstractC5504s.f(vVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(z zVar, Object obj) {
        return obj;
    }
}
