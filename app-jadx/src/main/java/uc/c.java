package Uc;

import Td.z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends Uc.a implements Oc.e {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19464c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new c(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, long j10) {
        super(str);
        this.f19463b = str;
        this.f19464c = j10;
    }

    @Override // Uc.a
    public String b() {
        return this.f19463b;
    }

    @Override // Oc.e
    public Date n() {
        Date date = new Date();
        Date date2 = new Date(this.f19464c);
        if (date2.before(date)) {
            return null;
        }
        return date2;
    }

    @Override // Uc.a, Oc.d
    public Bundle u() {
        return a(z.a("type", "date"), z.a("repeats", Boolean.FALSE), z.a("value", Long.valueOf(this.f19464c)));
    }

    @Override // Uc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeString(this.f19463b);
        dest.writeLong(this.f19464c);
    }
}
