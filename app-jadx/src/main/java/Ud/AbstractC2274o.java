package Ud;

import java.lang.reflect.Array;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ud.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC2274o {
    public static final Object[] a(Object[] reference, int i10) {
        AbstractC5504s.h(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
