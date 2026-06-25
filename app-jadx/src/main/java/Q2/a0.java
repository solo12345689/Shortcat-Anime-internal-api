package q2;

import P9.AbstractC2011u;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import t2.AbstractC6614a;
import t2.AbstractC6622i;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: f */
    private static final String f56700f = t2.a0.H0(0);

    /* JADX INFO: renamed from: g */
    private static final String f56701g = t2.a0.H0(1);

    /* JADX INFO: renamed from: a */
    public final int f56702a;

    /* JADX INFO: renamed from: b */
    public final String f56703b;

    /* JADX INFO: renamed from: c */
    public final int f56704c;

    /* JADX INFO: renamed from: d */
    private final C6109x[] f56705d;

    /* JADX INFO: renamed from: e */
    private int f56706e;

    public a0(C6109x... c6109xArr) {
        this("", c6109xArr);
    }

    public static a0 b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f56700f);
        return new a0(bundle.getString(f56701g, ""), (C6109x[]) (parcelableArrayList == null ? AbstractC2011u.A() : AbstractC6622i.d(new O9.f() { // from class: q2.Z
            @Override // O9.f
            public final Object apply(Object obj) {
                return C6109x.e((Bundle) obj);
            }
        }, parcelableArrayList)).toArray(new C6109x[0]));
    }

    private static void e(String str, String str2, String str3, int i10) {
        AbstractC6635w.e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String f(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int g(int i10) {
        return i10 | 16384;
    }

    private void i() {
        String strF = f(this.f56705d[0].f57011d);
        int iG = g(this.f56705d[0].f57013f);
        int i10 = 1;
        while (true) {
            C6109x[] c6109xArr = this.f56705d;
            if (i10 >= c6109xArr.length) {
                return;
            }
            if (!strF.equals(f(c6109xArr[i10].f57011d))) {
                C6109x[] c6109xArr2 = this.f56705d;
                e("languages", c6109xArr2[0].f57011d, c6109xArr2[i10].f57011d, i10);
                return;
            } else {
                if (iG != g(this.f56705d[i10].f57013f)) {
                    e("role flags", Integer.toBinaryString(this.f56705d[0].f57013f), Integer.toBinaryString(this.f56705d[i10].f57013f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public a0 a(String str) {
        return new a0(str, this.f56705d);
    }

    public C6109x c(int i10) {
        return this.f56705d[i10];
    }

    public int d(C6109x c6109x) {
        int i10 = 0;
        while (true) {
            C6109x[] c6109xArr = this.f56705d;
            if (i10 >= c6109xArr.length) {
                return -1;
            }
            if (c6109x == c6109xArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f56703b.equals(a0Var.f56703b) && Arrays.equals(this.f56705d, a0Var.f56705d)) {
                return true;
            }
        }
        return false;
    }

    public Bundle h() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f56705d.length);
        for (C6109x c6109x : this.f56705d) {
            arrayList.add(c6109x.k());
        }
        bundle.putParcelableArrayList(f56700f, arrayList);
        bundle.putString(f56701g, this.f56703b);
        return bundle;
    }

    public int hashCode() {
        if (this.f56706e == 0) {
            this.f56706e = ((527 + this.f56703b.hashCode()) * 31) + Arrays.hashCode(this.f56705d);
        }
        return this.f56706e;
    }

    public String toString() {
        return this.f56703b + ": " + Arrays.toString(this.f56705d);
    }

    public a0(String str, C6109x... c6109xArr) {
        AbstractC6614a.a(c6109xArr.length > 0);
        this.f56703b = str;
        this.f56705d = c6109xArr;
        this.f56702a = c6109xArr.length;
        int iK = AbstractC6079K.k(c6109xArr[0].f57022o);
        this.f56704c = iK == -1 ? AbstractC6079K.k(c6109xArr[0].f57021n) : iK;
        i();
    }
}
