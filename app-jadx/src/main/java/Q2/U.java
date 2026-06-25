package q2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class U implements Comparable, Parcelable {
    public static final Parcelable.Creator<U> CREATOR = new a();

    /* JADX INFO: renamed from: d */
    private static final String f56632d = t2.a0.H0(0);

    /* JADX INFO: renamed from: e */
    private static final String f56633e = t2.a0.H0(1);

    /* JADX INFO: renamed from: f */
    private static final String f56634f = t2.a0.H0(2);

    /* JADX INFO: renamed from: a */
    public final int f56635a;

    /* JADX INFO: renamed from: b */
    public final int f56636b;

    /* JADX INFO: renamed from: c */
    public final int f56637c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public U createFromParcel(Parcel parcel) {
            return new U(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public U[] newArray(int i10) {
            return new U[i10];
        }
    }

    public U(int i10, int i11, int i12) {
        this.f56635a = i10;
        this.f56636b = i11;
        this.f56637c = i12;
    }

    public static U b(Bundle bundle) {
        return new U(bundle.getInt(f56632d, 0), bundle.getInt(f56633e, 0), bundle.getInt(f56634f, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(U u10) {
        int i10 = this.f56635a - u10.f56635a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f56636b - u10.f56636b;
        return i11 == 0 ? this.f56637c - u10.f56637c : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U.class == obj.getClass()) {
            U u10 = (U) obj;
            if (this.f56635a == u10.f56635a && this.f56636b == u10.f56636b && this.f56637c == u10.f56637c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f56635a * 31) + this.f56636b) * 31) + this.f56637c;
    }

    public String toString() {
        return this.f56635a + "." + this.f56636b + "." + this.f56637c;
    }

    public Bundle u() {
        Bundle bundle = new Bundle();
        int i10 = this.f56635a;
        if (i10 != 0) {
            bundle.putInt(f56632d, i10);
        }
        int i11 = this.f56636b;
        if (i11 != 0) {
            bundle.putInt(f56633e, i11);
        }
        int i12 = this.f56637c;
        if (i12 != 0) {
            bundle.putInt(f56634f, i12);
        }
        return bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f56635a);
        parcel.writeInt(this.f56636b);
        parcel.writeInt(this.f56637c);
    }

    U(Parcel parcel) {
        this.f56635a = parcel.readInt();
        this.f56636b = parcel.readInt();
        this.f56637c = parcel.readInt();
    }
}
