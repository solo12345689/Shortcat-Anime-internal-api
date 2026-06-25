package Ud;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: Ud.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2280v {
    public static List a(List builder) {
        AbstractC5504s.h(builder, "builder");
        return ((Vd.b) builder).A();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        AbstractC5504s.h(objArr, "<this>");
        if (z10 && AbstractC5504s.c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new Vd.b(0, 1, null);
    }

    public static List d(int i10) {
        return new Vd.b(i10);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC5504s.g(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] f(int i10, Object[] array) {
        AbstractC5504s.h(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
