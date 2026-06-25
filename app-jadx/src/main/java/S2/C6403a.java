package s2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: s2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6403a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f59046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f59047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f59048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f59049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f59050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f59051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f59052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f59053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f59054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f59055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f59056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f59057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f59058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f59059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f59060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f59061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f59062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f59063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C6403a f59038s = new b().o("").a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f59039t = a0.H0(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f59040u = a0.H0(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f59041v = a0.H0(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f59042w = a0.H0(2);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f59043x = a0.H0(3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f59044y = a0.H0(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f59045z = a0.H0(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f59025A = a0.H0(5);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f59026B = a0.H0(6);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f59027C = a0.H0(7);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f59028D = a0.H0(8);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f59029E = a0.H0(9);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f59030F = a0.H0(10);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f59031G = a0.H0(11);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f59032H = a0.H0(12);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final String f59033I = a0.H0(13);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String f59034J = a0.H0(14);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final String f59035K = a0.H0(15);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final String f59036L = a0.H0(16);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f59037M = a0.H0(19);

    /* JADX INFO: renamed from: s2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f59064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f59065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f59066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f59067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f59068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f59069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f59070g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f59071h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f59072i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f59073j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f59074k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f59075l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f59076m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f59077n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f59078o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f59079p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f59080q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f59081r;

        public C6403a a() {
            return new C6403a(this.f59064a, this.f59066c, this.f59067d, this.f59065b, this.f59068e, this.f59069f, this.f59070g, this.f59071h, this.f59072i, this.f59073j, this.f59074k, this.f59075l, this.f59076m, this.f59077n, this.f59078o, this.f59079p, this.f59080q, this.f59081r);
        }

        public b b() {
            this.f59077n = false;
            return this;
        }

        public int c() {
            return this.f59070g;
        }

        public int d() {
            return this.f59072i;
        }

        public CharSequence e() {
            return this.f59064a;
        }

        public b f(Bitmap bitmap) {
            this.f59065b = bitmap;
            this.f59064a = null;
            return this;
        }

        public b g(float f10) {
            this.f59076m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f59068e = f10;
            this.f59069f = i10;
            return this;
        }

        public b i(int i10) {
            this.f59070g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f59067d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f59071h = f10;
            return this;
        }

        public b l(int i10) {
            this.f59072i = i10;
            return this;
        }

        public b m(float f10) {
            this.f59080q = f10;
            return this;
        }

        public b n(float f10) {
            this.f59075l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f59064a = charSequence;
            this.f59065b = null;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f59066c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f59074k = f10;
            this.f59073j = i10;
            return this;
        }

        public b r(int i10) {
            this.f59079p = i10;
            return this;
        }

        public b s(int i10) {
            this.f59078o = i10;
            this.f59077n = true;
            return this;
        }

        public b t(int i10) {
            this.f59081r = i10;
            return this;
        }

        public b() {
            this.f59064a = null;
            this.f59065b = null;
            this.f59066c = null;
            this.f59067d = null;
            this.f59068e = -3.4028235E38f;
            this.f59069f = Integer.MIN_VALUE;
            this.f59070g = Integer.MIN_VALUE;
            this.f59071h = -3.4028235E38f;
            this.f59072i = Integer.MIN_VALUE;
            this.f59073j = Integer.MIN_VALUE;
            this.f59074k = -3.4028235E38f;
            this.f59075l = -3.4028235E38f;
            this.f59076m = -3.4028235E38f;
            this.f59077n = false;
            this.f59078o = -16777216;
            this.f59079p = Integer.MIN_VALUE;
        }

        private b(C6403a c6403a) {
            this.f59064a = c6403a.f59046a;
            this.f59065b = c6403a.f59049d;
            this.f59066c = c6403a.f59047b;
            this.f59067d = c6403a.f59048c;
            this.f59068e = c6403a.f59050e;
            this.f59069f = c6403a.f59051f;
            this.f59070g = c6403a.f59052g;
            this.f59071h = c6403a.f59053h;
            this.f59072i = c6403a.f59054i;
            this.f59073j = c6403a.f59059n;
            this.f59074k = c6403a.f59060o;
            this.f59075l = c6403a.f59055j;
            this.f59076m = c6403a.f59056k;
            this.f59077n = c6403a.f59057l;
            this.f59078o = c6403a.f59058m;
            this.f59079p = c6403a.f59061p;
            this.f59080q = c6403a.f59062q;
            this.f59081r = c6403a.f59063r;
        }
    }

    public static C6403a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f59039t);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f59040u);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    AbstractC6408f.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f59041v);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f59042w);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f59043x);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f59044y);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f59045z;
        if (bundle.containsKey(str)) {
            String str2 = f59025A;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f59026B;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f59027C;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f59028D;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f59030F;
        if (bundle.containsKey(str6)) {
            String str7 = f59029E;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f59031G;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f59032H;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f59033I;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f59034J, false)) {
            bVar.b();
        }
        String str11 = f59035K;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f59036L;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        String str13 = f59037M;
        if (bundle.containsKey(str13)) {
            bVar.t(bundle.getInt(str13));
        }
        return bVar.a();
    }

    private Bundle d() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f59046a;
        if (charSequence != null) {
            bundle.putCharSequence(f59039t, charSequence);
            CharSequence charSequence2 = this.f59046a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = AbstractC6408f.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f59040u, arrayListA);
                }
            }
        }
        bundle.putSerializable(f59041v, this.f59047b);
        bundle.putSerializable(f59042w, this.f59048c);
        bundle.putFloat(f59045z, this.f59050e);
        bundle.putInt(f59025A, this.f59051f);
        bundle.putInt(f59026B, this.f59052g);
        bundle.putFloat(f59027C, this.f59053h);
        bundle.putInt(f59028D, this.f59054i);
        bundle.putInt(f59029E, this.f59059n);
        bundle.putFloat(f59030F, this.f59060o);
        bundle.putFloat(f59031G, this.f59055j);
        bundle.putFloat(f59032H, this.f59056k);
        bundle.putBoolean(f59034J, this.f59057l);
        bundle.putInt(f59033I, this.f59058m);
        bundle.putInt(f59035K, this.f59061p);
        bundle.putFloat(f59036L, this.f59062q);
        bundle.putInt(f59037M, this.f59063r);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle c() {
        Bundle bundleD = d();
        Bitmap bitmap = this.f59049d;
        if (bitmap != null) {
            bundleD.putParcelable(f59043x, bitmap);
        }
        return bundleD;
    }

    public Bundle e() {
        Bundle bundleD = d();
        if (this.f59049d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC6614a.g(this.f59049d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleD.putByteArray(f59044y, byteArrayOutputStream.toByteArray());
        }
        return bundleD;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C6403a.class == obj.getClass()) {
            C6403a c6403a = (C6403a) obj;
            if (TextUtils.equals(this.f59046a, c6403a.f59046a) && this.f59047b == c6403a.f59047b && this.f59048c == c6403a.f59048c && ((bitmap = this.f59049d) != null ? !((bitmap2 = c6403a.f59049d) == null || !bitmap.sameAs(bitmap2)) : c6403a.f59049d == null) && this.f59050e == c6403a.f59050e && this.f59051f == c6403a.f59051f && this.f59052g == c6403a.f59052g && this.f59053h == c6403a.f59053h && this.f59054i == c6403a.f59054i && this.f59055j == c6403a.f59055j && this.f59056k == c6403a.f59056k && this.f59057l == c6403a.f59057l && this.f59058m == c6403a.f59058m && this.f59059n == c6403a.f59059n && this.f59060o == c6403a.f59060o && this.f59061p == c6403a.f59061p && this.f59062q == c6403a.f59062q && this.f59063r == c6403a.f59063r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f59046a, this.f59047b, this.f59048c, this.f59049d, Float.valueOf(this.f59050e), Integer.valueOf(this.f59051f), Integer.valueOf(this.f59052g), Float.valueOf(this.f59053h), Integer.valueOf(this.f59054i), Float.valueOf(this.f59055j), Float.valueOf(this.f59056k), Boolean.valueOf(this.f59057l), Integer.valueOf(this.f59058m), Integer.valueOf(this.f59059n), Float.valueOf(this.f59060o), Integer.valueOf(this.f59061p), Float.valueOf(this.f59062q), Integer.valueOf(this.f59063r));
    }

    private C6403a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16) {
        if (charSequence == null) {
            AbstractC6614a.e(bitmap);
        } else {
            AbstractC6614a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f59046a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f59046a = charSequence.toString();
        } else {
            this.f59046a = null;
        }
        this.f59047b = alignment;
        this.f59048c = alignment2;
        this.f59049d = bitmap;
        this.f59050e = f10;
        this.f59051f = i10;
        this.f59052g = i11;
        this.f59053h = f11;
        this.f59054i = i12;
        this.f59055j = f13;
        this.f59056k = f14;
        this.f59057l = z10;
        this.f59058m = i14;
        this.f59059n = i13;
        this.f59060o = f12;
        this.f59061p = i15;
        this.f59062q = f15;
        this.f59063r = i16;
    }
}
