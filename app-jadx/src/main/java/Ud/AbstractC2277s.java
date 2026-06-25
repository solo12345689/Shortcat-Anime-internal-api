package Ud;

import ie.InterfaceC5082a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: renamed from: Ud.s */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2277s extends AbstractC2276q {

    /* JADX INFO: renamed from: Ud.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterable, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object[] f19521a;

        public a(Object[] objArr) {
            this.f19521a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC5489c.a(this.f19521a);
        }
    }

    /* JADX INFO: renamed from: Ud.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Cf.i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object[] f19522a;

        public b(Object[] objArr) {
            this.f19522a = objArr;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return AbstractC5489c.a(this.f19522a);
        }
    }

    public static final int A0(int[] iArr, int i10) {
        AbstractC5504s.h(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static int B0(Object[] objArr, Object obj) {
        AbstractC5504s.h(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (AbstractC5504s.c(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static Object C0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static Comparable D0(Comparable[] comparableArr) {
        AbstractC5504s.h(comparableArr, "<this>");
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        int iF0 = f0(comparableArr);
        int i10 = 1;
        if (1 <= iF0) {
            while (true) {
                Comparable comparable2 = comparableArr[i10];
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
                if (i10 == iF0) {
                    break;
                }
                i10++;
            }
        }
        return comparable;
    }

    public static Object[] E0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + objArr + com.amazon.a.a.o.c.a.b.f34706a);
            }
        }
        return objArr;
    }

    public static List F0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        if (objArr.length == 0) {
            return AbstractC2281w.m();
        }
        List listE1 = e1(objArr);
        D.Z(listE1);
        return listE1;
    }

    public static char G0(char[] cArr) {
        AbstractC5504s.h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object H0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object I0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Object[] J0(Object[] objArr, Comparator comparator) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        AbstractC2276q.I(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static List K0(Object[] objArr, Comparator comparator) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        return AbstractC2276q.e(J0(objArr, comparator));
    }

    public static Iterable L(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return objArr.length == 0 ? AbstractC2281w.m() : new a(objArr);
    }

    public static List L0(Object[] objArr, int i10) {
        AbstractC5504s.h(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC2281w.m();
        }
        if (i10 >= objArr.length) {
            return V0(objArr);
        }
        if (i10 == 1) {
            return AbstractC2280v.e(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    public static Cf.i M(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return objArr.length == 0 ? Cf.l.i() : new b(objArr);
    }

    public static final List M0(Object[] objArr, int i10) {
        AbstractC5504s.h(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC2281w.m();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return V0(objArr);
        }
        if (i10 == 1) {
            return AbstractC2280v.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static boolean N(byte[] bArr, byte b10) {
        AbstractC5504s.h(bArr, "<this>");
        return j0(bArr, b10) >= 0;
    }

    public static final Collection N0(int[] iArr, Collection destination) {
        AbstractC5504s.h(iArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    public static boolean O(char[] cArr, char c10) {
        AbstractC5504s.h(cArr, "<this>");
        return k0(cArr, c10) >= 0;
    }

    public static final Collection O0(Object[] objArr, Collection destination) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static boolean P(int[] iArr, int i10) {
        AbstractC5504s.h(iArr, "<this>");
        return l0(iArr, i10) >= 0;
    }

    public static List P0(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? Y0(bArr) : AbstractC2280v.e(Byte.valueOf(bArr[0])) : AbstractC2281w.m();
    }

    public static boolean Q(long[] jArr, long j10) {
        AbstractC5504s.h(jArr, "<this>");
        return m0(jArr, j10) >= 0;
    }

    public static List Q0(char[] cArr) {
        AbstractC5504s.h(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? Z0(cArr) : AbstractC2280v.e(Character.valueOf(cArr[0])) : AbstractC2281w.m();
    }

    public static boolean R(Object[] objArr, Object obj) {
        AbstractC5504s.h(objArr, "<this>");
        return n0(objArr, obj) >= 0;
    }

    public static List R0(double[] dArr) {
        AbstractC5504s.h(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? a1(dArr) : AbstractC2280v.e(Double.valueOf(dArr[0])) : AbstractC2281w.m();
    }

    public static boolean S(short[] sArr, short s10) {
        AbstractC5504s.h(sArr, "<this>");
        return o0(sArr, s10) >= 0;
    }

    public static List S0(float[] fArr) {
        AbstractC5504s.h(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? b1(fArr) : AbstractC2280v.e(Float.valueOf(fArr[0])) : AbstractC2281w.m();
    }

    public static List T(Object[] objArr, int i10) {
        AbstractC5504s.h(objArr, "<this>");
        if (i10 >= 0) {
            return M0(objArr, AbstractC5874j.e(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List T0(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? c1(iArr) : AbstractC2280v.e(Integer.valueOf(iArr[0])) : AbstractC2281w.m();
    }

    public static List U(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return (List) V(objArr, new ArrayList());
    }

    public static List U0(long[] jArr) {
        AbstractC5504s.h(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? d1(jArr) : AbstractC2280v.e(Long.valueOf(jArr[0])) : AbstractC2281w.m();
    }

    public static final Collection V(Object[] objArr, Collection destination) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static List V0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? e1(objArr) : AbstractC2280v.e(objArr[0]) : AbstractC2281w.m();
    }

    public static int W(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List W0(short[] sArr) {
        AbstractC5504s.h(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? f1(sArr) : AbstractC2280v.e(Short.valueOf(sArr[0])) : AbstractC2281w.m();
    }

    public static Object X(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List X0(boolean[] zArr) {
        AbstractC5504s.h(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? g1(zArr) : AbstractC2280v.e(Boolean.valueOf(zArr[0])) : AbstractC2281w.m();
    }

    public static Object Y(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final List Y0(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static C5870f Z(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        return new C5870f(0, c0(bArr));
    }

    public static final List Z0(char[] cArr) {
        AbstractC5504s.h(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static C5870f a0(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        return new C5870f(0, d0(iArr));
    }

    public static final List a1(double[] dArr) {
        AbstractC5504s.h(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static C5870f b0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return new C5870f(0, f0(objArr));
    }

    public static final List b1(float[] fArr) {
        AbstractC5504s.h(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final int c0(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        return bArr.length - 1;
    }

    public static final List c1(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static int d0(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final List d1(long[] jArr) {
        AbstractC5504s.h(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static int e0(long[] jArr) {
        AbstractC5504s.h(jArr, "<this>");
        return jArr.length - 1;
    }

    public static List e1(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return new ArrayList(AbstractC2281w.h(objArr));
    }

    public static int f0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final List f1(short[] sArr) {
        AbstractC5504s.h(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static Double g0(double[] dArr, int i10) {
        AbstractC5504s.h(dArr, "<this>");
        if (i10 < 0 || i10 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static final List g1(boolean[] zArr) {
        AbstractC5504s.h(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static Integer h0(int[] iArr, int i10) {
        AbstractC5504s.h(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static Set h1(int[] iArr) {
        AbstractC5504s.h(iArr, "<this>");
        return (Set) N0(iArr, new LinkedHashSet(U.e(iArr.length)));
    }

    public static Object i0(Object[] objArr, int i10) {
        AbstractC5504s.h(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static Set i1(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) O0(objArr, new LinkedHashSet(U.e(objArr.length))) : b0.c(objArr[0]) : c0.d();
    }

    public static final int j0(byte[] bArr, byte b10) {
        AbstractC5504s.h(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static Iterable j1(final Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        return new M(new InterfaceC5082a() { // from class: Ud.r
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return AbstractC2277s.k1(objArr);
            }
        });
    }

    public static final int k0(char[] cArr, char c10) {
        AbstractC5504s.h(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final Iterator k1(Object[] objArr) {
        return AbstractC5489c.a(objArr);
    }

    public static final int l0(int[] iArr, int i10) {
        AbstractC5504s.h(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static List l1(int[] iArr, Object[] other) {
        AbstractC5504s.h(iArr, "<this>");
        AbstractC5504s.h(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            arrayList.add(Td.z.a(Integer.valueOf(i11), other[i10]));
        }
        return arrayList;
    }

    public static final int m0(long[] jArr, long j10) {
        AbstractC5504s.h(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static List m1(Object[] objArr, Iterable other) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(other, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2282x.x(other, 10), length));
        int i10 = 0;
        for (Object obj : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(Td.z.a(objArr[i10], obj));
            i10++;
        }
        return arrayList;
    }

    public static int n0(Object[] objArr, Object obj) {
        AbstractC5504s.h(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (AbstractC5504s.c(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List n1(Object[] objArr, Object[] other) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(Td.z.a(objArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static final int o0(short[] sArr, short s10) {
        AbstractC5504s.h(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final Appendable p0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC5504s.h(buffer, "buffer");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable q0(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC5504s.h(iArr, "<this>");
        AbstractC5504s.h(buffer, "buffer");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable r0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(buffer, "buffer");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Df.r.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String t0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        return ((StringBuilder) p0(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static final String u0(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC5504s.h(iArr, "<this>");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        return ((StringBuilder) q0(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static final String v0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        return ((StringBuilder) r0(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String w0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return t0(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static /* synthetic */ String x0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return u0(iArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static /* synthetic */ String y0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return v0(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static Object z0(Object[] objArr) {
        AbstractC5504s.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[f0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
