package q9;

import E9.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.m;
import java.util.Locale;
import o9.AbstractC5840c;
import o9.AbstractC5845h;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f57864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f57865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f57866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f57867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f57868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f57869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f57870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f57871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f57872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f57873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f57874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f57875l;

    b(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f57865b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f57881a = i10;
        }
        TypedArray typedArrayC = c(context, aVar.f57881a, i11, i12);
        Resources resources = context.getResources();
        this.f57866c = typedArrayC.getDimensionPixelSize(AbstractC5848k.f55280v, -1);
        this.f57872i = context.getResources().getDimensionPixelSize(AbstractC5840c.f54702V);
        this.f57873j = context.getResources().getDimensionPixelSize(AbstractC5840c.f54704X);
        this.f57867d = typedArrayC.getDimensionPixelSize(AbstractC5848k.f54938F, -1);
        this.f57868e = typedArrayC.getDimension(AbstractC5848k.f54922D, resources.getDimension(AbstractC5840c.f54745t));
        this.f57870g = typedArrayC.getDimension(AbstractC5848k.f54962I, resources.getDimension(AbstractC5840c.f54747u));
        this.f57869f = typedArrayC.getDimension(AbstractC5848k.f55272u, resources.getDimension(AbstractC5840c.f54745t));
        this.f57871h = typedArrayC.getDimension(AbstractC5848k.f54930E, resources.getDimension(AbstractC5840c.f54747u));
        boolean z10 = true;
        this.f57874k = typedArrayC.getInt(AbstractC5848k.f55018P, 1);
        this.f57875l = typedArrayC.getInt(AbstractC5848k.f55256s, 0);
        aVar2.f57889i = aVar.f57889i == -2 ? 255 : aVar.f57889i;
        if (aVar.f57891k != -2) {
            aVar2.f57891k = aVar.f57891k;
        } else if (typedArrayC.hasValue(AbstractC5848k.f55010O)) {
            aVar2.f57891k = typedArrayC.getInt(AbstractC5848k.f55010O, 0);
        } else {
            aVar2.f57891k = -1;
        }
        if (aVar.f57890j != null) {
            aVar2.f57890j = aVar.f57890j;
        } else if (typedArrayC.hasValue(AbstractC5848k.f55304y)) {
            aVar2.f57890j = typedArrayC.getString(AbstractC5848k.f55304y);
        }
        aVar2.f57895o = aVar.f57895o;
        aVar2.f57896p = aVar.f57896p == null ? context.getString(AbstractC5846i.f54852j) : aVar.f57896p;
        aVar2.f57897q = aVar.f57897q == 0 ? AbstractC5845h.f54838a : aVar.f57897q;
        aVar2.f57898r = aVar.f57898r == 0 ? AbstractC5846i.f54857o : aVar.f57898r;
        if (aVar.f57900t != null && !aVar.f57900t.booleanValue()) {
            z10 = false;
        }
        aVar2.f57900t = Boolean.valueOf(z10);
        aVar2.f57892l = aVar.f57892l == -2 ? typedArrayC.getInt(AbstractC5848k.f54994M, -2) : aVar.f57892l;
        aVar2.f57893m = aVar.f57893m == -2 ? typedArrayC.getInt(AbstractC5848k.f55002N, -2) : aVar.f57893m;
        aVar2.f57885e = Integer.valueOf(aVar.f57885e == null ? typedArrayC.getResourceId(AbstractC5848k.f55288w, AbstractC5847j.f54873b) : aVar.f57885e.intValue());
        aVar2.f57886f = Integer.valueOf(aVar.f57886f == null ? typedArrayC.getResourceId(AbstractC5848k.f55296x, 0) : aVar.f57886f.intValue());
        aVar2.f57887g = Integer.valueOf(aVar.f57887g == null ? typedArrayC.getResourceId(AbstractC5848k.f54946G, AbstractC5847j.f54873b) : aVar.f57887g.intValue());
        aVar2.f57888h = Integer.valueOf(aVar.f57888h == null ? typedArrayC.getResourceId(AbstractC5848k.f54954H, 0) : aVar.f57888h.intValue());
        aVar2.f57882b = Integer.valueOf(aVar.f57882b == null ? J(context, typedArrayC, AbstractC5848k.f55248r) : aVar.f57882b.intValue());
        aVar2.f57884d = Integer.valueOf(aVar.f57884d == null ? typedArrayC.getResourceId(AbstractC5848k.f55312z, AbstractC5847j.f54874c) : aVar.f57884d.intValue());
        if (aVar.f57883c != null) {
            aVar2.f57883c = aVar.f57883c;
        } else if (typedArrayC.hasValue(AbstractC5848k.f54898A)) {
            aVar2.f57883c = Integer.valueOf(J(context, typedArrayC, AbstractC5848k.f54898A));
        } else {
            aVar2.f57883c = Integer.valueOf(new e(context, aVar2.f57884d.intValue()).j().getDefaultColor());
        }
        aVar2.f57899s = Integer.valueOf(aVar.f57899s == null ? typedArrayC.getInt(AbstractC5848k.f55264t, 8388661) : aVar.f57899s.intValue());
        aVar2.f57901u = Integer.valueOf(aVar.f57901u == null ? typedArrayC.getDimensionPixelSize(AbstractC5848k.f54914C, resources.getDimensionPixelSize(AbstractC5840c.f54703W)) : aVar.f57901u.intValue());
        aVar2.f57902v = Integer.valueOf(aVar.f57902v == null ? typedArrayC.getDimensionPixelSize(AbstractC5848k.f54906B, resources.getDimensionPixelSize(AbstractC5840c.f54748v)) : aVar.f57902v.intValue());
        aVar2.f57903w = Integer.valueOf(aVar.f57903w == null ? typedArrayC.getDimensionPixelOffset(AbstractC5848k.f54970J, 0) : aVar.f57903w.intValue());
        aVar2.f57904x = Integer.valueOf(aVar.f57904x == null ? typedArrayC.getDimensionPixelOffset(AbstractC5848k.f55026Q, 0) : aVar.f57904x.intValue());
        aVar2.f57905y = Integer.valueOf(aVar.f57905y == null ? typedArrayC.getDimensionPixelOffset(AbstractC5848k.f54978K, aVar2.f57903w.intValue()) : aVar.f57905y.intValue());
        aVar2.f57906z = Integer.valueOf(aVar.f57906z == null ? typedArrayC.getDimensionPixelOffset(AbstractC5848k.f55034R, aVar2.f57904x.intValue()) : aVar.f57906z.intValue());
        aVar2.f57878C = Integer.valueOf(aVar.f57878C == null ? typedArrayC.getDimensionPixelOffset(AbstractC5848k.f54986L, 0) : aVar.f57878C.intValue());
        aVar2.f57876A = Integer.valueOf(aVar.f57876A == null ? 0 : aVar.f57876A.intValue());
        aVar2.f57877B = Integer.valueOf(aVar.f57877B == null ? 0 : aVar.f57877B.intValue());
        aVar2.f57879D = Boolean.valueOf(aVar.f57879D == null ? typedArrayC.getBoolean(AbstractC5848k.f55240q, false) : aVar.f57879D.booleanValue());
        typedArrayC.recycle();
        if (aVar.f57894n == null) {
            aVar2.f57894n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f57894n = aVar.f57894n;
        }
        this.f57864a = aVar;
    }

    private static int J(Context context, TypedArray typedArray, int i10) {
        return E9.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray c(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = d.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return m.i(context, attributeSetI, AbstractC5848k.f55232p, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    a A() {
        return this.f57864a;
    }

    String B() {
        return this.f57865b.f57890j;
    }

    int C() {
        return this.f57865b.f57884d.intValue();
    }

    int D() {
        return this.f57865b.f57906z.intValue();
    }

    int E() {
        return this.f57865b.f57904x.intValue();
    }

    boolean F() {
        return this.f57865b.f57891k != -1;
    }

    boolean G() {
        return this.f57865b.f57890j != null;
    }

    boolean H() {
        return this.f57865b.f57879D.booleanValue();
    }

    boolean I() {
        return this.f57865b.f57900t.booleanValue();
    }

    void K(int i10) {
        this.f57864a.f57889i = i10;
        this.f57865b.f57889i = i10;
    }

    void L(int i10) {
        this.f57864a.f57882b = Integer.valueOf(i10);
        this.f57865b.f57882b = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f57864a.f57883c = Integer.valueOf(i10);
        this.f57865b.f57883c = Integer.valueOf(i10);
    }

    void N(int i10) {
        this.f57864a.f57891k = i10;
        this.f57865b.f57891k = i10;
    }

    void O(String str) {
        this.f57864a.f57890j = str;
        this.f57865b.f57890j = str;
    }

    void P(boolean z10) {
        this.f57864a.f57900t = Boolean.valueOf(z10);
        this.f57865b.f57900t = Boolean.valueOf(z10);
    }

    void a() {
        N(-1);
    }

    void b() {
        O(null);
    }

    int d() {
        return this.f57865b.f57876A.intValue();
    }

    int e() {
        return this.f57865b.f57877B.intValue();
    }

    int f() {
        return this.f57865b.f57889i;
    }

    int g() {
        return this.f57865b.f57882b.intValue();
    }

    int h() {
        return this.f57865b.f57899s.intValue();
    }

    int i() {
        return this.f57865b.f57901u.intValue();
    }

    int j() {
        return this.f57865b.f57886f.intValue();
    }

    int k() {
        return this.f57865b.f57885e.intValue();
    }

    int l() {
        return this.f57865b.f57883c.intValue();
    }

    int m() {
        return this.f57865b.f57902v.intValue();
    }

    int n() {
        return this.f57865b.f57888h.intValue();
    }

    int o() {
        return this.f57865b.f57887g.intValue();
    }

    int p() {
        return this.f57865b.f57898r;
    }

    CharSequence q() {
        return this.f57865b.f57895o;
    }

    CharSequence r() {
        return this.f57865b.f57896p;
    }

    int s() {
        return this.f57865b.f57897q;
    }

    int t() {
        return this.f57865b.f57905y.intValue();
    }

    int u() {
        return this.f57865b.f57903w.intValue();
    }

    int v() {
        return this.f57865b.f57878C.intValue();
    }

    int w() {
        return this.f57865b.f57892l;
    }

    int x() {
        return this.f57865b.f57893m;
    }

    int y() {
        return this.f57865b.f57891k;
    }

    Locale z() {
        return this.f57865b.f57894n;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0874a();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private Integer f57876A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private Integer f57877B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private Integer f57878C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private Boolean f57879D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private Integer f57880E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f57881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f57882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f57883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f57884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f57885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f57886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f57887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f57888h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f57889i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f57890j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f57891k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f57892l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f57893m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Locale f57894n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private CharSequence f57895o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private CharSequence f57896p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f57897q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f57898r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Integer f57899s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Boolean f57900t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f57901u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f57902v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f57903w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Integer f57904x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f57905y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Integer f57906z;

        /* JADX INFO: renamed from: q9.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0874a implements Parcelable.Creator {
            C0874a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f57889i = 255;
            this.f57891k = -2;
            this.f57892l = -2;
            this.f57893m = -2;
            this.f57900t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f57881a);
            parcel.writeSerializable(this.f57882b);
            parcel.writeSerializable(this.f57883c);
            parcel.writeSerializable(this.f57884d);
            parcel.writeSerializable(this.f57885e);
            parcel.writeSerializable(this.f57886f);
            parcel.writeSerializable(this.f57887g);
            parcel.writeSerializable(this.f57888h);
            parcel.writeInt(this.f57889i);
            parcel.writeString(this.f57890j);
            parcel.writeInt(this.f57891k);
            parcel.writeInt(this.f57892l);
            parcel.writeInt(this.f57893m);
            CharSequence charSequence = this.f57895o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f57896p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f57897q);
            parcel.writeSerializable(this.f57899s);
            parcel.writeSerializable(this.f57901u);
            parcel.writeSerializable(this.f57902v);
            parcel.writeSerializable(this.f57903w);
            parcel.writeSerializable(this.f57904x);
            parcel.writeSerializable(this.f57905y);
            parcel.writeSerializable(this.f57906z);
            parcel.writeSerializable(this.f57878C);
            parcel.writeSerializable(this.f57876A);
            parcel.writeSerializable(this.f57877B);
            parcel.writeSerializable(this.f57900t);
            parcel.writeSerializable(this.f57894n);
            parcel.writeSerializable(this.f57879D);
            parcel.writeSerializable(this.f57880E);
        }

        a(Parcel parcel) {
            this.f57889i = 255;
            this.f57891k = -2;
            this.f57892l = -2;
            this.f57893m = -2;
            this.f57900t = Boolean.TRUE;
            this.f57881a = parcel.readInt();
            this.f57882b = (Integer) parcel.readSerializable();
            this.f57883c = (Integer) parcel.readSerializable();
            this.f57884d = (Integer) parcel.readSerializable();
            this.f57885e = (Integer) parcel.readSerializable();
            this.f57886f = (Integer) parcel.readSerializable();
            this.f57887g = (Integer) parcel.readSerializable();
            this.f57888h = (Integer) parcel.readSerializable();
            this.f57889i = parcel.readInt();
            this.f57890j = parcel.readString();
            this.f57891k = parcel.readInt();
            this.f57892l = parcel.readInt();
            this.f57893m = parcel.readInt();
            this.f57895o = parcel.readString();
            this.f57896p = parcel.readString();
            this.f57897q = parcel.readInt();
            this.f57899s = (Integer) parcel.readSerializable();
            this.f57901u = (Integer) parcel.readSerializable();
            this.f57902v = (Integer) parcel.readSerializable();
            this.f57903w = (Integer) parcel.readSerializable();
            this.f57904x = (Integer) parcel.readSerializable();
            this.f57905y = (Integer) parcel.readSerializable();
            this.f57906z = (Integer) parcel.readSerializable();
            this.f57878C = (Integer) parcel.readSerializable();
            this.f57876A = (Integer) parcel.readSerializable();
            this.f57877B = (Integer) parcel.readSerializable();
            this.f57900t = (Boolean) parcel.readSerializable();
            this.f57894n = (Locale) parcel.readSerializable();
            this.f57879D = (Boolean) parcel.readSerializable();
            this.f57880E = (Integer) parcel.readSerializable();
        }
    }
}
