package Ud;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ud.q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2276q extends AbstractC2275p {

    /* JADX INFO: renamed from: Ud.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2263d implements RandomAccess {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int[] f19519b;

        a(int[] iArr) {
            this.f19519b = iArr;
        }

        public boolean H(int i10) {
            return AbstractC2277s.P(this.f19519b, i10);
        }

        @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return H(((Number) obj).intValue());
            }
            return false;
        }

        @Override // Ud.AbstractC2261b
        public int d() {
            return this.f19519b.length;
        }

        @Override // Ud.AbstractC2263d, java.util.List
        /* JADX INFO: renamed from: f */
        public Integer get(int i10) {
            return Integer.valueOf(this.f19519b[i10]);
        }

        public int i(int i10) {
            return AbstractC2277s.l0(this.f19519b, i10);
        }

        @Override // Ud.AbstractC2263d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return i(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // Ud.AbstractC2261b, java.util.Collection
        public boolean isEmpty() {
            return this.f19519b.length == 0;
        }

        public int l(int i10) {
            return AbstractC2277s.A0(this.f19519b, i10);
        }

        @Override // Ud.AbstractC2263d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return l(((Number) obj).intValue());
            }
            return -1;
        }
    }

    public static byte[] A(byte[] bArr, byte[] elements) {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC5504s.h(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        AbstractC5504s.e(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] B(int[] iArr, int i10) {
        AbstractC5504s.h(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        AbstractC5504s.e(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] C(int[] iArr, int[] elements) {
        AbstractC5504s.h(iArr, "<this>");
        AbstractC5504s.h(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        AbstractC5504s.e(iArrCopyOf);
        return iArrCopyOf;
    }

    public static Object[] D(Object[] objArr, Object obj) {
        AbstractC5504s.h(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        AbstractC5504s.e(objArrCopyOf);
        return objArrCopyOf;
    }

    public static Object[] E(Object[] objArr, Object[] elements) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        AbstractC5504s.e(objArrCopyOf);
        return objArrCopyOf;
    }

    public static void F(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void G(int[] iArr, int i10, int i11) {
        AbstractC5504s.h(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    public static final void H(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static void I(Object[] objArr, Comparator comparator) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void J(Object[] objArr, Comparator comparator, int i10, int i11) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    public static List d(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        return new a(iArr);
    }

    public static List e(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        List listA = AbstractC2278t.a(objArr);
        AbstractC5504s.g(listA, "asList(...)");
        return listA;
    }

    public static final int f(float[] fArr, float f10, int i10, int i11) {
        AbstractC5504s.h(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int g(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return f(fArr, f10, i10, i11);
    }

    public static byte[] h(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static char[] i(char[] cArr, char[] destination, int i10, int i11, int i12) {
        AbstractC5504s.h(cArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static float[] j(float[] fArr, float[] destination, int i10, int i11, int i12) {
        AbstractC5504s.h(fArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] k(int[] iArr, int[] destination, int i10, int i11, int i12) {
        AbstractC5504s.h(iArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] l(long[] jArr, long[] destination, int i10, int i11, int i12) {
        AbstractC5504s.h(jArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static Object[] m(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] n(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return h(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] o(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return j(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] p(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return k(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ long[] q(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return l(jArr, jArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] r(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] s(byte[] bArr, int i10, int i11) {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC2274o.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC5504s.g(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] t(Object[] objArr, int i10, int i11) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC2274o.b(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC5504s.g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void u(int[] iArr, int i10, int i11, int i12) {
        AbstractC5504s.h(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static void v(long[] jArr, long j10, int i10, int i11) {
        AbstractC5504s.h(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static void w(Object[] objArr, Object obj, int i10, int i11) {
        AbstractC5504s.h(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void x(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        u(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void y(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        v(jArr, j10, i10, i11);
    }

    public static /* synthetic */ void z(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        w(objArr, obj, i10, i11);
    }
}
