package Pc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0225a();

    /* JADX INFO: renamed from: a */
    private g f13756a;

    /* JADX INFO: renamed from: b */
    private Date f13757b;

    /* JADX INFO: renamed from: Pc.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0225a implements Parcelable.Creator {
        C0225a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(g gVar) {
        this(gVar, new Date());
    }

    public g a() {
        return this.f13756a;
    }

    public Date b() {
        return this.f13757b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f13756a, 0);
        parcel.writeLong(this.f13757b.getTime());
    }

    public a(g gVar, Date date) {
        this.f13756a = gVar;
        this.f13757b = date;
    }

    protected a(Parcel parcel) {
        this.f13756a = (g) parcel.readParcelable(getClass().getClassLoader());
        this.f13757b = new Date(parcel.readLong());
    }
}
