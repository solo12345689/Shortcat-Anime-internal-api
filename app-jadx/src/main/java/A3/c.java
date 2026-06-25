package A3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f224f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f226h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f233o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f219a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f220b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f221c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f222d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f223e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f225g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f227i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f228j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f229k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f230l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f231m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f232n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f234p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f235q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f229k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f227i) {
            return this.f226h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f235q;
    }

    public int c() {
        if (this.f225g) {
            return this.f224f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f223e;
    }

    public float e() {
        return this.f233o;
    }

    public int f() {
        return this.f232n;
    }

    public int g() {
        return this.f234p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f219a.isEmpty() && this.f220b.isEmpty() && this.f221c.isEmpty() && this.f222d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f219a, str, 1073741824), this.f220b, str2, 2), this.f222d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f221c)) {
            return 0;
        }
        return iB + (this.f221c.size() * 4);
    }

    public int i() {
        int i10 = this.f230l;
        if (i10 == -1 && this.f231m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f231m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f227i;
    }

    public boolean k() {
        return this.f225g;
    }

    public boolean l() {
        return this.f228j == 1;
    }

    public boolean m() {
        return this.f229k == 1;
    }

    public c n(int i10) {
        this.f226h = i10;
        this.f227i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f230l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f235q = z10;
        return this;
    }

    public c q(int i10) {
        this.f224f = i10;
        this.f225g = true;
        return this;
    }

    public c r(String str) {
        this.f223e = str == null ? null : O9.c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f233o = f10;
        return this;
    }

    public c t(int i10) {
        this.f232n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f231m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f234p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f221c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f219a = str;
    }

    public void y(String str) {
        this.f220b = str;
    }

    public void z(String str) {
        this.f222d = str;
    }
}
