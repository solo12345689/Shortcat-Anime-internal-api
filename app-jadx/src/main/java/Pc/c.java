package Pc;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Parcelable, Serializable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13762b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public List a() {
        List list = this.f13762b;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public String b() {
        return this.f13761a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13761a);
        parcel.writeList(this.f13762b);
    }

    public c(String str, List list) {
        this.f13761a = str;
        this.f13762b = list;
    }

    private c(Parcel parcel) {
        this.f13761a = parcel.readString();
        this.f13762b = parcel.readArrayList(b.class.getClassLoader());
    }
}
