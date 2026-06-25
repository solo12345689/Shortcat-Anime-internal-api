package S9;

import O9.n;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f16012d = new e(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f16013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f16014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16015c;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e b(int[] iArr) {
        return iArr.length == 0 ? f16012d : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public static e g() {
        return f16012d;
    }

    public static e h(int i10) {
        return new e(new int[]{i10});
    }

    public static e i(int i10, int i11) {
        return new e(new int[]{i10, i11});
    }

    public static e j(int i10, int i11, int i12) {
        return new e(new int[]{i10, i11, i12});
    }

    public boolean a(int i10) {
        return d(i10) >= 0;
    }

    public int c(int i10) {
        n.h(i10, f());
        return this.f16013a[this.f16014b + i10];
    }

    public int d(int i10) {
        for (int i11 = this.f16014b; i11 < this.f16015c; i11++) {
            if (this.f16013a[i11] == i10) {
                return i11 - this.f16014b;
            }
        }
        return -1;
    }

    public boolean e() {
        return this.f16015c == this.f16014b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (f() != eVar.f()) {
            return false;
        }
        for (int i10 = 0; i10 < f(); i10++) {
            if (c(i10) != eVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return this.f16015c - this.f16014b;
    }

    public int hashCode() {
        int iJ = 1;
        for (int i10 = this.f16014b; i10 < this.f16015c; i10++) {
            iJ = (iJ * 31) + f.j(this.f16013a[i10]);
        }
        return iJ;
    }

    public int[] k() {
        return Arrays.copyOfRange(this.f16013a, this.f16014b, this.f16015c);
    }

    public String toString() {
        if (e()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(f() * 5);
        sb2.append('[');
        sb2.append(this.f16013a[this.f16014b]);
        int i10 = this.f16014b;
        while (true) {
            i10++;
            if (i10 >= this.f16015c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f16013a[i10]);
        }
    }

    private e(int[] iArr, int i10, int i11) {
        this.f16013a = iArr;
        this.f16014b = i10;
        this.f16015c = i11;
    }
}
