package t;

import Ud.AbstractC2273n;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6702a;
import u.AbstractC6705d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class i0 {

    /* JADX INFO: renamed from: a */
    private int[] f60077a;

    /* JADX INFO: renamed from: b */
    private Object[] f60078b;

    /* JADX INFO: renamed from: c */
    private int f60079c;

    public i0() {
        this(0, 1, null);
    }

    private final int d(Object obj, int i10) {
        int i11 = this.f60079c;
        if (i11 == 0) {
            return -1;
        }
        int iA = AbstractC6702a.a(this.f60077a, i11, i10);
        if (iA < 0 || AbstractC5504s.c(obj, this.f60078b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f60077a[i12] == i10) {
            if (AbstractC5504s.c(obj, this.f60078b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f60077a[i13] == i10; i13--) {
            if (AbstractC5504s.c(obj, this.f60078b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int f() {
        int i10 = this.f60079c;
        if (i10 == 0) {
            return -1;
        }
        int iA = AbstractC6702a.a(this.f60077a, i10, 0);
        if (iA < 0 || this.f60078b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f60077a[i11] == 0) {
            if (this.f60078b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f60077a[i12] == 0; i12--) {
            if (this.f60078b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(Object obj) {
        int i10 = this.f60079c * 2;
        Object[] objArr = this.f60078b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (AbstractC5504s.c(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f60079c;
        int[] iArr = this.f60077a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f60077a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60078b, i10 * 2);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f60078b = objArrCopyOf;
        }
        if (this.f60079c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f60079c > 0) {
            this.f60077a = AbstractC6702a.f61093a;
            this.f60078b = AbstractC6702a.f61095c;
            this.f60079c = 0;
        }
        if (this.f60079c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i0) {
                if (size() != ((i0) obj).size()) {
                    return false;
                }
                i0 i0Var = (i0) obj;
                int i10 = this.f60079c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objK = k(i11);
                    Object obj2 = i0Var.get(objG);
                    if (objK == null) {
                        if (obj2 != null || !i0Var.containsKey(objG)) {
                            return false;
                        }
                    } else if (!AbstractC5504s.c(objK, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f60079c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objK2 = k(i13);
                Object obj3 = ((Map) obj).get(objG2);
                if (objK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!AbstractC5504s.c(objK2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f60079c) {
            z10 = true;
        }
        if (!z10) {
            AbstractC6705d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f60078b[i10 << 1];
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f60078b[(iE << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f60078b[(iE << 1) + 1] : obj2;
    }

    public void h(i0 map) {
        AbstractC5504s.h(map, "map");
        int i10 = map.f60079c;
        b(this.f60079c + i10);
        if (this.f60079c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.g(i11), map.k(i11));
            }
        } else if (i10 > 0) {
            AbstractC2273n.k(map.f60077a, this.f60077a, 0, 0, i10);
            AbstractC2273n.m(map.f60078b, this.f60078b, 0, 0, i10 << 1);
            this.f60079c = i10;
        }
    }

    public int hashCode() {
        int[] iArr = this.f60077a;
        Object[] objArr = this.f60078b;
        int i10 = this.f60079c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10) {
        if (!(i10 >= 0 && i10 < this.f60079c)) {
            AbstractC6705d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f60078b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f60079c;
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f60077a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC2273n.k(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f60078b;
                AbstractC2273n.m(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f60078b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f60077a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60078b, i16 << 1);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f60078b = objArrCopyOf;
            if (i12 != this.f60079c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                AbstractC2273n.k(iArr, this.f60077a, 0, 0, i10);
                AbstractC2273n.m(objArr, this.f60078b, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                AbstractC2273n.k(iArr, this.f60077a, i10, i17, i12);
                AbstractC2273n.m(objArr, this.f60078b, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f60079c) {
            throw new ConcurrentModificationException();
        }
        this.f60079c = i13;
        return obj;
    }

    public boolean isEmpty() {
        return this.f60079c <= 0;
    }

    public Object j(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f60079c) {
            z10 = true;
        }
        if (!z10) {
            AbstractC6705d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f60078b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object k(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f60079c) {
            z10 = true;
        }
        if (!z10) {
            AbstractC6705d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f60078b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f60079c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iD = obj != null ? d(obj, iHashCode) : f();
        if (iD >= 0) {
            int i11 = (iD << 1) + 1;
            Object[] objArr = this.f60078b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iD;
        int[] iArr = this.f60077a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f60077a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60078b, i13 << 1);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f60078b = objArrCopyOf;
            if (i10 != this.f60079c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f60077a;
            int i14 = i12 + 1;
            AbstractC2273n.k(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f60078b;
            AbstractC2273n.m(objArr2, objArr2, i14 << 1, i12 << 1, this.f60079c << 1);
        }
        int i15 = this.f60079c;
        if (i10 == i15) {
            int[] iArr3 = this.f60077a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f60078b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f60079c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return j(iE, obj2);
        }
        return null;
    }

    public int size() {
        return this.f60079c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f60079c * 28);
        sb2.append('{');
        int i10 = this.f60079c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objG = g(i11);
            if (objG != sb2) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objK = k(i11);
            if (objK != sb2) {
                sb2.append(objK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public i0(int i10) {
        this.f60077a = i10 == 0 ? AbstractC6702a.f61093a : new int[i10];
        this.f60078b = i10 == 0 ? AbstractC6702a.f61095c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !AbstractC5504s.c(obj2, k(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !AbstractC5504s.c(obj2, k(iE))) {
            return false;
        }
        j(iE, obj3);
        return true;
    }

    public /* synthetic */ i0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public i0(i0 i0Var) {
        this(0, 1, null);
        if (i0Var != null) {
            h(i0Var);
        }
    }
}
