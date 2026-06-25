package t;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6702a;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6573x implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f60141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f60142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f60143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f60144d;

    public C6573x() {
        this(0, 1, null);
    }

    public void a() {
        int i10 = this.f60144d;
        Object[] objArr = this.f60143c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f60144d = 0;
        this.f60141a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6573x clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC5504s.f(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C6573x c6573x = (C6573x) objClone;
        c6573x.f60142b = (long[]) this.f60142b.clone();
        c6573x.f60143c = (Object[]) this.f60143c.clone();
        return c6573x;
    }

    public boolean d(long j10) {
        return f(j10) >= 0;
    }

    public Object e(long j10) {
        int iB = AbstractC6702a.b(this.f60142b, this.f60144d, j10);
        if (iB < 0 || this.f60143c[iB] == AbstractC6574y.f60145a) {
            return null;
        }
        return this.f60143c[iB];
    }

    public int f(long j10) {
        if (this.f60141a) {
            int i10 = this.f60144d;
            long[] jArr = this.f60142b;
            Object[] objArr = this.f60143c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC6574y.f60145a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f60141a = false;
            this.f60144d = i11;
        }
        return AbstractC6702a.b(this.f60142b, this.f60144d, j10);
    }

    public boolean g() {
        return m() == 0;
    }

    public long h(int i10) {
        if (!(i10 >= 0 && i10 < this.f60144d)) {
            AbstractC6705d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f60141a) {
            int i11 = this.f60144d;
            long[] jArr = this.f60142b;
            Object[] objArr = this.f60143c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC6574y.f60145a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f60141a = false;
            this.f60144d = i12;
        }
        return this.f60142b[i10];
    }

    public void i(long j10, Object obj) {
        int iB = AbstractC6702a.b(this.f60142b, this.f60144d, j10);
        if (iB >= 0) {
            this.f60143c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f60144d && this.f60143c[i10] == AbstractC6574y.f60145a) {
            this.f60142b[i10] = j10;
            this.f60143c[i10] = obj;
            return;
        }
        if (this.f60141a) {
            int i11 = this.f60144d;
            long[] jArr = this.f60142b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f60143c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != AbstractC6574y.f60145a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f60141a = false;
                this.f60144d = i12;
                i10 = ~AbstractC6702a.b(this.f60142b, i12, j10);
            }
        }
        int i14 = this.f60144d;
        if (i14 >= this.f60142b.length) {
            int iF = AbstractC6702a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f60142b, iF);
            AbstractC5504s.g(jArrCopyOf, "copyOf(...)");
            this.f60142b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60143c, iF);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f60143c = objArrCopyOf;
        }
        int i15 = this.f60144d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f60142b;
            int i16 = i10 + 1;
            AbstractC2273n.l(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f60143c;
            AbstractC2273n.m(objArr2, objArr2, i16, i10, this.f60144d);
        }
        this.f60142b[i10] = j10;
        this.f60143c[i10] = obj;
        this.f60144d++;
    }

    public void j(long j10) {
        int iB = AbstractC6702a.b(this.f60142b, this.f60144d, j10);
        if (iB < 0 || this.f60143c[iB] == AbstractC6574y.f60145a) {
            return;
        }
        this.f60143c[iB] = AbstractC6574y.f60145a;
        this.f60141a = true;
    }

    public void k(int i10) {
        if (this.f60143c[i10] != AbstractC6574y.f60145a) {
            this.f60143c[i10] = AbstractC6574y.f60145a;
            this.f60141a = true;
        }
    }

    public int m() {
        if (this.f60141a) {
            int i10 = this.f60144d;
            long[] jArr = this.f60142b;
            Object[] objArr = this.f60143c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC6574y.f60145a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f60141a = false;
            this.f60144d = i11;
        }
        return this.f60144d;
    }

    public Object n(int i10) {
        if (!(i10 >= 0 && i10 < this.f60144d)) {
            AbstractC6705d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f60141a) {
            int i11 = this.f60144d;
            long[] jArr = this.f60142b;
            Object[] objArr = this.f60143c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC6574y.f60145a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f60141a = false;
            this.f60144d = i12;
        }
        return this.f60143c[i10];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f60144d * 28);
        sb2.append('{');
        int i10 = this.f60144d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i11));
            sb2.append('=');
            Object objN = n(i11);
            if (objN != sb2) {
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

    public C6573x(int i10) {
        if (i10 == 0) {
            this.f60142b = AbstractC6702a.f61094b;
            this.f60143c = AbstractC6702a.f61095c;
        } else {
            int iF = AbstractC6702a.f(i10);
            this.f60142b = new long[iF];
            this.f60143c = new Object[iF];
        }
    }

    public /* synthetic */ C6573x(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
