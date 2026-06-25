package h0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4893b {
    public static final v b(final Function2 function2, Function1 function1) {
        Function2 function22 = new Function2() { // from class: h0.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC4893b.c(function2, (z) obj, obj2);
            }
        };
        AbstractC5504s.f(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return y.e(function22, (Function1) V.e(function1, 1));
    }

    public static final Object c(Function2 function2, z zVar, Object obj) {
        List list = (List) function2.invoke(zVar, obj);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            if (obj2 != null && !zVar.a(obj2)) {
                throw new IllegalArgumentException(("item at index " + i10 + " can't be saved: " + obj2).toString());
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }
}
