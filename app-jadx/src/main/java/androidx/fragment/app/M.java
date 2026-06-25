package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.K;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f29816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList f29817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C2823b[] f29818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f29819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f29820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f29821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f29822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList f29823h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public M createFromParcel(Parcel parcel) {
            return new M(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public M[] newArray(int i10) {
            return new M[i10];
        }
    }

    public M() {
        this.f29820e = null;
        this.f29821f = new ArrayList();
        this.f29822g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f29816a);
        parcel.writeStringList(this.f29817b);
        parcel.writeTypedArray(this.f29818c, i10);
        parcel.writeInt(this.f29819d);
        parcel.writeString(this.f29820e);
        parcel.writeStringList(this.f29821f);
        parcel.writeTypedList(this.f29822g);
        parcel.writeTypedList(this.f29823h);
    }

    public M(Parcel parcel) {
        this.f29820e = null;
        this.f29821f = new ArrayList();
        this.f29822g = new ArrayList();
        this.f29816a = parcel.createStringArrayList();
        this.f29817b = parcel.createStringArrayList();
        this.f29818c = (C2823b[]) parcel.createTypedArray(C2823b.CREATOR);
        this.f29819d = parcel.readInt();
        this.f29820e = parcel.readString();
        this.f29821f = parcel.createStringArrayList();
        this.f29822g = parcel.createTypedArrayList(C2824c.CREATOR);
        this.f29823h = parcel.createTypedArrayList(K.m.CREATOR);
    }
}
