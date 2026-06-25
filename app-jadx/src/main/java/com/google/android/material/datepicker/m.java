package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final Calendar f42430a;

    /* JADX INFO: renamed from: b */
    final int f42431b;

    /* JADX INFO: renamed from: c */
    final int f42432c;

    /* JADX INFO: renamed from: d */
    final int f42433d;

    /* JADX INFO: renamed from: e */
    final int f42434e;

    /* JADX INFO: renamed from: f */
    final long f42435f;

    /* JADX INFO: renamed from: g */
    private String f42436g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return m.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = t.c(calendar);
        this.f42430a = calendarC;
        this.f42431b = calendarC.get(2);
        this.f42432c = calendarC.get(1);
        this.f42433d = calendarC.getMaximum(7);
        this.f42434e = calendarC.getActualMaximum(5);
        this.f42435f = calendarC.getTimeInMillis();
    }

    static m b(int i10, int i11) {
        Calendar calendarI = t.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new m(calendarI);
    }

    static m c(long j10) {
        Calendar calendarI = t.i();
        calendarI.setTimeInMillis(j10);
        return new m(calendarI);
    }

    static m h() {
        return new m(t.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(m mVar) {
        return this.f42430a.compareTo(mVar.f42430a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f42431b == mVar.f42431b && this.f42432c == mVar.f42432c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42431b), Integer.valueOf(this.f42432c)});
    }

    int k(int i10) {
        int i11 = this.f42430a.get(7);
        if (i10 <= 0) {
            i10 = this.f42430a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f42433d : i12;
    }

    long m(int i10) {
        Calendar calendarC = t.c(this.f42430a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    int q(long j10) {
        Calendar calendarC = t.c(this.f42430a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String r() {
        if (this.f42436g == null) {
            this.f42436g = e.f(this.f42430a.getTimeInMillis());
        }
        return this.f42436g;
    }

    long s() {
        return this.f42430a.getTimeInMillis();
    }

    m w(int i10) {
        Calendar calendarC = t.c(this.f42430a);
        calendarC.add(2, i10);
        return new m(calendarC);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42432c);
        parcel.writeInt(this.f42431b);
    }

    int x(m mVar) {
        if (this.f42430a instanceof GregorianCalendar) {
            return ((mVar.f42432c - this.f42432c) * 12) + (mVar.f42431b - this.f42431b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
