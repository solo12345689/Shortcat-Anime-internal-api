package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.U;
import androidx.lifecycle.AbstractC2857k;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2823b implements Parcelable {
    public static final Parcelable.Creator<C2823b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f29926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f29927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f29928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f29929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f29930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f29931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f29932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f29933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f29934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f29935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f29936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList f29937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList f29938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f29939n;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2823b createFromParcel(Parcel parcel) {
            return new C2823b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2823b[] newArray(int i10) {
            return new C2823b[i10];
        }
    }

    C2823b(C2822a c2822a) {
        int size = c2822a.f29861c.size();
        this.f29926a = new int[size * 6];
        if (!c2822a.f29867i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f29927b = new ArrayList(size);
        this.f29928c = new int[size];
        this.f29929d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            U.a aVar = (U.a) c2822a.f29861c.get(i11);
            int i12 = i10 + 1;
            this.f29926a[i10] = aVar.f29878a;
            ArrayList arrayList = this.f29927b;
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = aVar.f29879b;
            arrayList.add(abstractComponentCallbacksC2838q != null ? abstractComponentCallbacksC2838q.mWho : null);
            int[] iArr = this.f29926a;
            iArr[i12] = aVar.f29880c ? 1 : 0;
            iArr[i10 + 2] = aVar.f29881d;
            iArr[i10 + 3] = aVar.f29882e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f29883f;
            i10 += 6;
            iArr[i13] = aVar.f29884g;
            this.f29928c[i11] = aVar.f29885h.ordinal();
            this.f29929d[i11] = aVar.f29886i.ordinal();
        }
        this.f29930e = c2822a.f29866h;
        this.f29931f = c2822a.f29869k;
        this.f29932g = c2822a.f29922v;
        this.f29933h = c2822a.f29870l;
        this.f29934i = c2822a.f29871m;
        this.f29935j = c2822a.f29872n;
        this.f29936k = c2822a.f29873o;
        this.f29937l = c2822a.f29874p;
        this.f29938m = c2822a.f29875q;
        this.f29939n = c2822a.f29876r;
    }

    private void a(C2822a c2822a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f29926a.length) {
                c2822a.f29866h = this.f29930e;
                c2822a.f29869k = this.f29931f;
                c2822a.f29867i = true;
                c2822a.f29870l = this.f29933h;
                c2822a.f29871m = this.f29934i;
                c2822a.f29872n = this.f29935j;
                c2822a.f29873o = this.f29936k;
                c2822a.f29874p = this.f29937l;
                c2822a.f29875q = this.f29938m;
                c2822a.f29876r = this.f29939n;
                return;
            }
            U.a aVar = new U.a();
            int i12 = i10 + 1;
            aVar.f29878a = this.f29926a[i10];
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Instantiate " + c2822a + " op #" + i11 + " base fragment #" + this.f29926a[i12]);
            }
            aVar.f29885h = AbstractC2857k.b.values()[this.f29928c[i11]];
            aVar.f29886i = AbstractC2857k.b.values()[this.f29929d[i11]];
            int[] iArr = this.f29926a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f29880c = z10;
            int i14 = iArr[i13];
            aVar.f29881d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f29882e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f29883f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f29884g = i18;
            c2822a.f29862d = i14;
            c2822a.f29863e = i15;
            c2822a.f29864f = i17;
            c2822a.f29865g = i18;
            c2822a.f(aVar);
            i11++;
        }
    }

    public C2822a b(K k10) {
        C2822a c2822a = new C2822a(k10);
        a(c2822a);
        c2822a.f29922v = this.f29932g;
        for (int i10 = 0; i10 < this.f29927b.size(); i10++) {
            String str = (String) this.f29927b.get(i10);
            if (str != null) {
                ((U.a) c2822a.f29861c.get(i10)).f29879b = k10.m0(str);
            }
        }
        c2822a.w(1);
        return c2822a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f29926a);
        parcel.writeStringList(this.f29927b);
        parcel.writeIntArray(this.f29928c);
        parcel.writeIntArray(this.f29929d);
        parcel.writeInt(this.f29930e);
        parcel.writeString(this.f29931f);
        parcel.writeInt(this.f29932g);
        parcel.writeInt(this.f29933h);
        TextUtils.writeToParcel(this.f29934i, parcel, 0);
        parcel.writeInt(this.f29935j);
        TextUtils.writeToParcel(this.f29936k, parcel, 0);
        parcel.writeStringList(this.f29937l);
        parcel.writeStringList(this.f29938m);
        parcel.writeInt(this.f29939n ? 1 : 0);
    }

    C2823b(Parcel parcel) {
        this.f29926a = parcel.createIntArray();
        this.f29927b = parcel.createStringArrayList();
        this.f29928c = parcel.createIntArray();
        this.f29929d = parcel.createIntArray();
        this.f29930e = parcel.readInt();
        this.f29931f = parcel.readString();
        this.f29932g = parcel.readInt();
        this.f29933h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f29934i = (CharSequence) creator.createFromParcel(parcel);
        this.f29935j = parcel.readInt();
        this.f29936k = (CharSequence) creator.createFromParcel(parcel);
        this.f29937l = parcel.createStringArrayList();
        this.f29938m = parcel.createStringArrayList();
        this.f29939n = parcel.readInt() != 0;
    }
}
