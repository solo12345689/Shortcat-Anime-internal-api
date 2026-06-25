package Uc;

import Td.z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Uc.a implements Oc.e {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f19472e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new e(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public /* synthetic */ e(String str, long j10, boolean z10, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, z10, (i10 & 8) != 0 ? new Date(System.currentTimeMillis() + (((long) 1000) * j10)) : date);
    }

    @Override // Uc.a
    public String b() {
        return this.f19469b;
    }

    @Override // Oc.e
    public Date n() {
        Date date = new Date();
        if (this.f19471d && this.f19472e.before(date)) {
            long j10 = this.f19470c * ((long) 1000);
            this.f19472e.setTime(date.getTime() + (j10 - ((date.getTime() - this.f19472e.getTime()) % j10)));
        }
        if (this.f19472e.before(date)) {
            return null;
        }
        return this.f19472e;
    }

    @Override // Uc.a, Oc.d
    public Bundle u() {
        return a(z.a("type", "timeInterval"), z.a("repeats", Boolean.valueOf(this.f19471d)), z.a("seconds", Long.valueOf(this.f19470c)));
    }

    @Override // Uc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC5504s.h(dest, "dest");
        dest.writeString(this.f19469b);
        dest.writeLong(this.f19470c);
        dest.writeInt(this.f19471d ? 1 : 0);
        dest.writeSerializable(this.f19472e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, long j10, boolean z10, Date triggerDate) {
        super(str);
        AbstractC5504s.h(triggerDate, "triggerDate");
        this.f19469b = str;
        this.f19470c = j10;
        this.f19471d = z10;
        this.f19472e = triggerDate;
    }
}
