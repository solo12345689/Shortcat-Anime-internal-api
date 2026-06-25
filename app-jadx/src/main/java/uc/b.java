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
public final class b extends Uc.a implements Oc.e {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19462d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new b(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, int i10, int i11) {
        super(str);
        this.f19460b = str;
        this.f19461c = i10;
        this.f19462d = i11;
    }

    @Override // Uc.a
    public String b() {
        return this.f19460b;
    }

    @Override // Oc.e
    public Date n() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, this.f19461c);
        calendar.set(12, this.f19462d);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.before(Calendar.getInstance())) {
            calendar.add(5, 1);
        }
        return calendar.getTime();
    }

    @Override // Uc.a, Oc.d
    public Bundle u() {
        return a(z.a("type", "daily"), z.a("hour", Integer.valueOf(this.f19461c)), z.a("minute", Integer.valueOf(this.f19462d)));
    }

    @Override // Uc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeString(this.f19460b);
        dest.writeInt(this.f19461c);
        dest.writeInt(this.f19462d);
    }
}
