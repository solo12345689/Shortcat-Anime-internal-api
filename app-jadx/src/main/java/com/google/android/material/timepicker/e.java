package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f43113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f43114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f43115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f43116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f43119g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f43116d = i10;
        this.f43117e = i11;
        this.f43118f = i12;
        this.f43115c = i13;
        this.f43119g = c(i10);
        this.f43113a = new b(59);
        this.f43114b = new b(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f43116d == eVar.f43116d && this.f43117e == eVar.f43117e && this.f43115c == eVar.f43115c && this.f43118f == eVar.f43118f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43115c), Integer.valueOf(this.f43116d), Integer.valueOf(this.f43117e), Integer.valueOf(this.f43118f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f43116d);
        parcel.writeInt(this.f43117e);
        parcel.writeInt(this.f43118f);
        parcel.writeInt(this.f43115c);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
