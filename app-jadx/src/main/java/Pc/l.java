package Pc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13798c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(b bVar, Pc.a aVar, String str) {
        super(bVar, aVar);
        this.f13798c = str;
    }

    public String d() {
        return this.f13798c;
    }

    @Override // Pc.h, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f13798c);
    }

    protected l(Parcel parcel) {
        super(parcel);
        this.f13798c = parcel.readString();
    }
}
