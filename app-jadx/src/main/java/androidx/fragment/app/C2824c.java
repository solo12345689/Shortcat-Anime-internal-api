package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2824c implements Parcelable {
    public static final Parcelable.Creator<C2824c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f29942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f29943b;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2824c createFromParcel(Parcel parcel) {
            return new C2824c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2824c[] newArray(int i10) {
            return new C2824c[i10];
        }
    }

    C2824c(Parcel parcel) {
        this.f29942a = parcel.createStringArrayList();
        this.f29943b = parcel.createTypedArrayList(C2823b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f29942a);
        parcel.writeTypedList(this.f29943b);
    }
}
