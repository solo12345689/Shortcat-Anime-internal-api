package E;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface C {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3796a = new a();

        a() {
            super(1);
        }

        public final Void a(int i10) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void b(C c10, int i10, Function1 function1, Function2 function2, Function1 function12, ie.p pVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        if ((i11 & 8) != 0) {
            function12 = a.f3796a;
        }
        c10.e(i10, function1, function2, function12, pVar);
    }

    void e(int i10, Function1 function1, Function2 function2, Function1 function12, ie.p pVar);
}
