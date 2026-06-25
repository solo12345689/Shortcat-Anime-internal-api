package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0641a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f42317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f42318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f42319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f42320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f42323g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0641a implements Parcelable.Creator {
        C0641a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f42324f = t.a(m.b(1900, 0).f42435f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f42325g = t.a(m.b(2100, 11).f42435f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f42326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f42327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f42328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f42329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f42330e;

        b(a aVar) {
            this.f42326a = f42324f;
            this.f42327b = f42325g;
            this.f42330e = f.a(Long.MIN_VALUE);
            this.f42326a = aVar.f42317a.f42435f;
            this.f42327b = aVar.f42318b.f42435f;
            this.f42328c = Long.valueOf(aVar.f42320d.f42435f);
            this.f42329d = aVar.f42321e;
            this.f42330e = aVar.f42319c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f42330e);
            m mVarC = m.c(this.f42326a);
            m mVarC2 = m.c(this.f42327b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f42328c;
            return new a(mVarC, mVarC2, cVar, l10 == null ? null : m.c(l10.longValue()), this.f42329d, null);
        }

        public b b(long j10) {
            this.f42328c = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c extends Parcelable {
        boolean p(long j10);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i10, C0641a c0641a) {
        this(mVar, mVar2, cVar, mVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f42317a.equals(aVar.f42317a) && this.f42318b.equals(aVar.f42318b) && K1.b.a(this.f42320d, aVar.f42320d) && this.f42321e == aVar.f42321e && this.f42319c.equals(aVar.f42319c);
    }

    public c f() {
        return this.f42319c;
    }

    m g() {
        return this.f42318b;
    }

    int h() {
        return this.f42321e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42317a, this.f42318b, this.f42320d, Integer.valueOf(this.f42321e), this.f42319c});
    }

    int i() {
        return this.f42323g;
    }

    m j() {
        return this.f42320d;
    }

    m k() {
        return this.f42317a;
    }

    int l() {
        return this.f42322f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f42317a, 0);
        parcel.writeParcelable(this.f42318b, 0);
        parcel.writeParcelable(this.f42320d, 0);
        parcel.writeParcelable(this.f42319c, 0);
        parcel.writeInt(this.f42321e);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i10) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f42317a = mVar;
        this.f42318b = mVar2;
        this.f42320d = mVar3;
        this.f42321e = i10;
        this.f42319c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > t.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f42323g = mVar.x(mVar2) + 1;
        this.f42322f = (mVar2.f42432c - mVar.f42432c) + 1;
    }
}
