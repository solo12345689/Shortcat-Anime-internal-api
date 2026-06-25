package q2;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import q2.C6071C;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6087b {

    /* JADX INFO: renamed from: g */
    public static final C6087b f56707g = new C6087b(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h */
    private static final a f56708h = new a(0).l(0);

    /* JADX INFO: renamed from: i */
    private static final String f56709i = t2.a0.H0(1);

    /* JADX INFO: renamed from: j */
    private static final String f56710j = t2.a0.H0(2);

    /* JADX INFO: renamed from: k */
    private static final String f56711k = t2.a0.H0(3);

    /* JADX INFO: renamed from: l */
    private static final String f56712l = t2.a0.H0(4);

    /* JADX INFO: renamed from: a */
    public final Object f56713a;

    /* JADX INFO: renamed from: b */
    public final int f56714b;

    /* JADX INFO: renamed from: c */
    public final long f56715c;

    /* JADX INFO: renamed from: d */
    public final long f56716d;

    /* JADX INFO: renamed from: e */
    public final int f56717e;

    /* JADX INFO: renamed from: f */
    private final a[] f56718f;

    /* JADX INFO: renamed from: q2.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: l */
        private static final String f56719l = t2.a0.H0(0);

        /* JADX INFO: renamed from: m */
        private static final String f56720m = t2.a0.H0(1);

        /* JADX INFO: renamed from: n */
        private static final String f56721n = t2.a0.H0(2);

        /* JADX INFO: renamed from: o */
        private static final String f56722o = t2.a0.H0(3);

        /* JADX INFO: renamed from: p */
        private static final String f56723p = t2.a0.H0(4);

        /* JADX INFO: renamed from: q */
        private static final String f56724q = t2.a0.H0(5);

        /* JADX INFO: renamed from: r */
        private static final String f56725r = t2.a0.H0(6);

        /* JADX INFO: renamed from: s */
        private static final String f56726s = t2.a0.H0(7);

        /* JADX INFO: renamed from: t */
        static final String f56727t = t2.a0.H0(8);

        /* JADX INFO: renamed from: u */
        static final String f56728u = t2.a0.H0(9);

        /* JADX INFO: renamed from: v */
        static final String f56729v = t2.a0.H0(10);

        /* JADX INFO: renamed from: a */
        public final long f56730a;

        /* JADX INFO: renamed from: b */
        public final int f56731b;

        /* JADX INFO: renamed from: c */
        public final int f56732c;

        /* JADX INFO: renamed from: d */
        public final Uri[] f56733d;

        /* JADX INFO: renamed from: e */
        public final C6071C[] f56734e;

        /* JADX INFO: renamed from: f */
        public final int[] f56735f;

        /* JADX INFO: renamed from: g */
        public final long[] f56736g;

        /* JADX INFO: renamed from: h */
        public final String[] f56737h;

        /* JADX INFO: renamed from: i */
        public final long f56738i;

        /* JADX INFO: renamed from: j */
        public final boolean f56739j;

        /* JADX INFO: renamed from: k */
        public final boolean f56740k;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new C6071C[0], new long[0], 0L, false, new String[0], false);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static a c(Bundle bundle) {
            long j10 = bundle.getLong(f56719l);
            int i10 = bundle.getInt(f56720m);
            int i11 = bundle.getInt(f56726s);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f56721n);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f56727t);
            int[] intArray = bundle.getIntArray(f56722o);
            long[] longArray = bundle.getLongArray(f56723p);
            long j11 = bundle.getLong(f56724q);
            boolean z10 = bundle.getBoolean(f56725r);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f56728u);
            boolean z11 = bundle.getBoolean(f56729v);
            if (intArray == null) {
                intArray = new int[0];
            }
            C6071C[] c6071cArrF = f(parcelableArrayList2, parcelableArrayList);
            if (longArray == null) {
                longArray = new long[0];
            }
            String[] strArr = new String[0];
            if (stringArrayList != null) {
                strArr = (String[]) stringArrayList.toArray(strArr);
            }
            return new a(j10, i10, i11, intArray, c6071cArrF, longArray, j11, z10, strArr, z11);
        }

        private ArrayList e() {
            ArrayList arrayList = new ArrayList();
            C6071C[] c6071cArr = this.f56734e;
            int length = c6071cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                C6071C c6071c = c6071cArr[i10];
                arrayList.add(c6071c == null ? null : c6071c.g());
            }
            return arrayList;
        }

        private static C6071C[] f(ArrayList arrayList, ArrayList arrayList2) {
            int i10 = 0;
            if (arrayList != null) {
                C6071C[] c6071cArr = new C6071C[arrayList.size()];
                while (i10 < arrayList.size()) {
                    Bundle bundle = (Bundle) arrayList.get(i10);
                    c6071cArr[i10] = bundle == null ? null : C6071C.b(bundle);
                    i10++;
                }
                return c6071cArr;
            }
            if (arrayList2 == null) {
                return new C6071C[0];
            }
            C6071C[] c6071cArr2 = new C6071C[arrayList2.size()];
            while (i10 < arrayList2.size()) {
                Uri uri = (Uri) arrayList2.get(i10);
                c6071cArr2[i10] = uri == null ? null : C6071C.c(uri);
                i10++;
            }
            return c6071cArr2;
        }

        public int d() {
            return g(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f56730a == aVar.f56730a && this.f56731b == aVar.f56731b && this.f56732c == aVar.f56732c && Arrays.equals(this.f56734e, aVar.f56734e) && Arrays.equals(this.f56735f, aVar.f56735f) && Arrays.equals(this.f56736g, aVar.f56736g) && this.f56738i == aVar.f56738i && this.f56739j == aVar.f56739j && Arrays.equals(this.f56737h, aVar.f56737h) && this.f56740k == aVar.f56740k) {
                    return true;
                }
            }
            return false;
        }

        public int g(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f56735f;
                if (i12 >= iArr.length || this.f56739j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean h() {
            if (this.f56731b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f56731b; i10++) {
                int i11 = this.f56735f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f56731b * 31) + this.f56732c) * 31;
            long j10 = this.f56730a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f56734e)) * 31) + Arrays.hashCode(this.f56735f)) * 31) + Arrays.hashCode(this.f56736g)) * 31;
            long j11 = this.f56738i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f56739j ? 1 : 0)) * 31) + Arrays.hashCode(this.f56737h)) * 31) + (this.f56740k ? 1 : 0);
        }

        public boolean i() {
            return this.f56740k && this.f56730a == Long.MIN_VALUE && this.f56731b == -1;
        }

        public boolean j() {
            return this.f56731b == -1 || d() < this.f56731b;
        }

        public Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putLong(f56719l, this.f56730a);
            bundle.putInt(f56720m, this.f56731b);
            bundle.putInt(f56726s, this.f56732c);
            bundle.putParcelableArrayList(f56721n, new ArrayList<>(Arrays.asList(this.f56733d)));
            bundle.putParcelableArrayList(f56727t, e());
            bundle.putIntArray(f56722o, this.f56735f);
            bundle.putLongArray(f56723p, this.f56736g);
            bundle.putLong(f56724q, this.f56738i);
            bundle.putBoolean(f56725r, this.f56739j);
            bundle.putStringArrayList(f56728u, new ArrayList<>(Arrays.asList(this.f56737h)));
            bundle.putBoolean(f56729v, this.f56740k);
            return bundle;
        }

        public a l(int i10) {
            int[] iArrB = b(this.f56735f, i10);
            long[] jArrA = a(this.f56736g, i10);
            return new a(this.f56730a, i10, this.f56732c, iArrB, (C6071C[]) Arrays.copyOf(this.f56734e, i10), jArrA, this.f56738i, this.f56739j, (String[]) Arrays.copyOf(this.f56737h, i10), this.f56740k);
        }

        private a(long j10, int i10, int i11, int[] iArr, C6071C[] c6071cArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            AbstractC6614a.a(iArr.length == c6071cArr.length);
            this.f56730a = j10;
            this.f56731b = i10;
            this.f56732c = i11;
            this.f56735f = iArr;
            this.f56734e = c6071cArr;
            this.f56736g = jArr;
            this.f56738i = j11;
            this.f56739j = z10;
            this.f56733d = new Uri[c6071cArr.length];
            while (true) {
                Uri[] uriArr = this.f56733d;
                if (i12 >= uriArr.length) {
                    this.f56737h = strArr;
                    this.f56740k = z11;
                    return;
                } else {
                    C6071C c6071c = c6071cArr[i12];
                    uriArr[i12] = c6071c == null ? null : ((C6071C.h) AbstractC6614a.e(c6071c.f56328b)).f56429a;
                    i12++;
                }
            }
        }
    }

    private C6087b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f56713a = obj;
        this.f56715c = j10;
        this.f56716d = j11;
        this.f56714b = aVarArr.length + i10;
        this.f56718f = aVarArr;
        this.f56717e = i10;
    }

    public static C6087b a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f56709i);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.c((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        String str = f56710j;
        C6087b c6087b = f56707g;
        return new C6087b(null, aVarArr, bundle.getLong(str, c6087b.f56715c), bundle.getLong(f56711k, c6087b.f56716d), bundle.getInt(f56712l, c6087b.f56717e));
    }

    private boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a aVarB = b(i10);
        long j12 = aVarB.f56730a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || aVarB.i() || j10 < j11 : j10 < j12;
    }

    public a b(int i10) {
        int i11 = this.f56717e;
        return i10 < i11 ? f56708h : this.f56718f[i10 - i11];
    }

    public int c(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f56717e;
            while (i10 < this.f56714b && ((b(i10).f56730a != Long.MIN_VALUE && b(i10).f56730a <= j10) || !b(i10).j())) {
                i10++;
            }
            if (i10 < this.f56714b && (j11 == -9223372036854775807L || b(i10).f56730a <= j11)) {
                return i10;
            }
        }
        return -1;
    }

    public int d(long j10, long j11) {
        int i10 = this.f56714b - 1;
        int i11 = i10 - (e(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!f(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !b(i11).h()) {
            return -1;
        }
        return i11;
    }

    public boolean e(int i10) {
        return i10 == this.f56714b - 1 && b(i10).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6087b.class == obj.getClass()) {
            C6087b c6087b = (C6087b) obj;
            if (Objects.equals(this.f56713a, c6087b.f56713a) && this.f56714b == c6087b.f56714b && this.f56715c == c6087b.f56715c && this.f56716d == c6087b.f56716d && this.f56717e == c6087b.f56717e && Arrays.equals(this.f56718f, c6087b.f56718f)) {
                return true;
            }
        }
        return false;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f56718f) {
            arrayList.add(aVar.k());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f56709i, arrayList);
        }
        long j10 = this.f56715c;
        C6087b c6087b = f56707g;
        if (j10 != c6087b.f56715c) {
            bundle.putLong(f56710j, j10);
        }
        long j11 = this.f56716d;
        if (j11 != c6087b.f56716d) {
            bundle.putLong(f56711k, j11);
        }
        int i10 = this.f56717e;
        if (i10 != c6087b.f56717e) {
            bundle.putInt(f56712l, i10);
        }
        return bundle;
    }

    public int hashCode() {
        int i10 = this.f56714b * 31;
        Object obj = this.f56713a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f56715c)) * 31) + ((int) this.f56716d)) * 31) + this.f56717e) * 31) + Arrays.hashCode(this.f56718f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f56713a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f56715c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f56718f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f56718f[i10].f56730a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f56718f[i10].f56735f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f56718f[i10].f56735f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f56718f[i10].f56736g[i11]);
                sb2.append(')');
                if (i11 < this.f56718f[i10].f56735f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f56718f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
