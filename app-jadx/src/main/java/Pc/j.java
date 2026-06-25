package Pc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13797d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public String c() {
        return this.f13797d;
    }

    @Override // Pc.b, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f13797d);
    }

    public j(String str, String str2, boolean z10, String str3) {
        super(str, str2, z10);
        this.f13797d = str3;
    }

    private j(Parcel parcel) {
        super(parcel);
        this.f13797d = parcel.readString();
    }
}
