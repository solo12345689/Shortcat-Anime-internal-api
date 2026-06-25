package t;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6702a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class j0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f60085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f60086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f60087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f60088d;

    public j0() {
        this(0, 1, null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f60088d;
        if (i11 != 0 && i10 <= this.f60086b[i11 - 1]) {
            j(i10, obj);
            return;
        }
        if (this.f60085a && i11 >= this.f60086b.length) {
            k0.e(this);
        }
        int i12 = this.f60088d;
        if (i12 >= this.f60086b.length) {
            int iE = AbstractC6702a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f60086b, iE);
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f60086b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60087c, iE);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f60087c = objArrCopyOf;
        }
        this.f60086b[i12] = i10;
        this.f60087c[i12] = obj;
        this.f60088d = i12 + 1;
    }

    public void c() {
        int i10 = this.f60088d;
        Object[] objArr = this.f60087c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f60088d = 0;
        this.f60085a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC5504s.f(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j0 j0Var = (j0) objClone;
        j0Var.f60086b = (int[]) this.f60086b.clone();
        j0Var.f60087c = (Object[]) this.f60087c.clone();
        return j0Var;
    }

    public boolean e(int i10) {
        return g(i10) >= 0;
    }

    public Object f(int i10) {
        return k0.c(this, i10);
    }

    public int g(int i10) {
        if (this.f60085a) {
            k0.e(this);
        }
        return AbstractC6702a.a(this.f60086b, this.f60088d, i10);
    }

    public int h(Object obj) {
        if (this.f60085a) {
            k0.e(this);
        }
        int i10 = this.f60088d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f60087c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int i(int i10) {
        if (this.f60085a) {
            k0.e(this);
        }
        return this.f60086b[i10];
    }

    public void j(int i10, Object obj) {
        int iA = AbstractC6702a.a(this.f60086b, this.f60088d, i10);
        if (iA >= 0) {
            this.f60087c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f60088d && this.f60087c[i11] == k0.f60090a) {
            this.f60086b[i11] = i10;
            this.f60087c[i11] = obj;
            return;
        }
        if (this.f60085a && this.f60088d >= this.f60086b.length) {
            k0.e(this);
            i11 = ~AbstractC6702a.a(this.f60086b, this.f60088d, i10);
        }
        int i12 = this.f60088d;
        if (i12 >= this.f60086b.length) {
            int iE = AbstractC6702a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f60086b, iE);
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f60086b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60087c, iE);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f60087c = objArrCopyOf;
        }
        int i13 = this.f60088d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f60086b;
            int i14 = i11 + 1;
            AbstractC2273n.k(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f60087c;
            AbstractC2273n.m(objArr, objArr, i14, i11, this.f60088d);
        }
        this.f60086b[i11] = i10;
        this.f60087c[i11] = obj;
        this.f60088d++;
    }

    public void k(int i10) {
        k0.d(this, i10);
    }

    public int m() {
        if (this.f60085a) {
            k0.e(this);
        }
        return this.f60088d;
    }

    public Object n(int i10) {
        if (this.f60085a) {
            k0.e(this);
        }
        Object[] objArr = this.f60087c;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        C6556f c6556f = C6556f.f60059a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f60088d * 28);
        sb2.append('{');
        int i10 = this.f60088d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i11));
            sb2.append('=');
            Object objN = n(i11);
            if (objN != this) {
                sb2.append(objN);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public j0(int i10) {
        if (i10 == 0) {
            this.f60086b = AbstractC6702a.f61093a;
            this.f60087c = AbstractC6702a.f61095c;
        } else {
            int iE = AbstractC6702a.e(i10);
            this.f60086b = new int[iE];
            this.f60087c = new Object[iE];
        }
    }

    public /* synthetic */ j0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
