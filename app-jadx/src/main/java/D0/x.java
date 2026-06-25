package d0;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final Object[] g(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC2273n.r(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC2273n.m(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC2273n.r(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC2273n.m(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC2273n.r(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC2273n.m(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i10, int i11, t tVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC2273n.r(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC2273n.m(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = tVar;
        AbstractC2273n.m(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }

    public static final Object[] k(Object[] objArr, int i10, int i11, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        AbstractC2273n.m(objArrCopyOf, objArrCopyOf, i10 + 2, i10 + 1, objArr.length);
        AbstractC2273n.m(objArrCopyOf, objArrCopyOf, i11 + 2, i11, i10);
        objArrCopyOf[i11] = obj;
        objArrCopyOf[i11 + 1] = obj2;
        return objArrCopyOf;
    }
}
