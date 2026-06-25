package Pc;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Parcelable, Serializable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13760c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, String str2, boolean z10) {
        this.f13758a = str;
        this.f13759b = str2;
        this.f13760c = z10;
    }

    public String a() {
        return this.f13758a;
    }

    public boolean b() {
        return this.f13760c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getTitle() {
        return this.f13759b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13758a);
        parcel.writeString(this.f13759b);
        parcel.writeByte(this.f13760c ? (byte) 1 : (byte) 0);
    }

    protected b(Parcel parcel) {
        this.f13758a = parcel.readString();
        this.f13759b = parcel.readString();
        this.f13760c = parcel.readByte() != 0;
    }
}
