package Pc;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Parcelable, Serializable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Oc.a f13779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Oc.d f13780c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(String str, Oc.a aVar, Oc.d dVar) {
        this.f13778a = str;
        this.f13779b = aVar;
        this.f13780c = dVar;
    }

    public Oc.a a() {
        return this.f13779b;
    }

    public String b() {
        return this.f13778a;
    }

    public Oc.d c() {
        return this.f13780c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13778a);
        parcel.writeParcelable(this.f13779b, 0);
        parcel.writeParcelable(this.f13780c, 0);
    }

    protected g(Parcel parcel) {
        this.f13778a = parcel.readString();
        this.f13779b = (Oc.a) parcel.readParcelable(getClass().getClassLoader());
        this.f13780c = (Oc.d) parcel.readParcelable(getClass().getClassLoader());
    }
}
