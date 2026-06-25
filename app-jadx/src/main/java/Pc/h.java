package Pc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f13781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Pc.a f13782b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(b bVar, Pc.a aVar) {
        this.f13781a = bVar;
        this.f13782b = aVar;
    }

    public b a() {
        return this.f13781a;
    }

    public String b() {
        return this.f13781a.a();
    }

    public Pc.a c() {
        return this.f13782b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f13781a, 0);
        parcel.writeParcelable(this.f13782b, 0);
    }

    protected h(Parcel parcel) {
        this.f13781a = (b) parcel.readParcelable(getClass().getClassLoader());
        this.f13782b = (Pc.a) parcel.readParcelable(getClass().getClassLoader());
    }
}
