package Uc;

import Td.z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends Uc.a implements Oc.e {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19476e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new f(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, int i10, int i11, int i12) {
        super(str);
        this.f19473b = str;
        this.f19474c = i10;
        this.f19475d = i11;
        this.f19476e = i12;
    }

    @Override // Uc.a
    public String b() {
        return this.f19473b;
    }

    @Override // Oc.e
    public Date n() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, this.f19474c);
        calendar.set(11, this.f19475d);
        calendar.set(12, this.f19476e);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.before(Calendar.getInstance())) {
            calendar.add(8, 1);
        }
        return calendar.getTime();
    }

    @Override // Uc.a, Oc.d
    public Bundle u() {
        return a(z.a("type", "weekly"), z.a("weekday", Integer.valueOf(this.f19474c)), z.a("hour", Integer.valueOf(this.f19475d)), z.a("minute", Integer.valueOf(this.f19476e)));
    }

    @Override // Uc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeString(this.f19473b);
        dest.writeInt(this.f19474c);
        dest.writeInt(this.f19475d);
        dest.writeInt(this.f19476e);
    }
}
