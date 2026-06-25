package com.google.android.gms.common.api;

import P8.c;
import P8.k;
import R8.AbstractC2113n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Status extends S8.a implements k, ReflectedParcelable {

    /* JADX INFO: renamed from: a */
    private final int f38940a;

    /* JADX INFO: renamed from: b */
    private final String f38941b;

    /* JADX INFO: renamed from: c */
    private final PendingIntent f38942c;

    /* JADX INFO: renamed from: d */
    private final ConnectionResult f38943d;

    /* JADX INFO: renamed from: e */
    public static final Status f38932e = new Status(-1);

    /* JADX INFO: renamed from: f */
    public static final Status f38933f = new Status(0);

    /* JADX INFO: renamed from: g */
    public static final Status f38934g = new Status(14);

    /* JADX INFO: renamed from: h */
    public static final Status f38935h = new Status(8);

    /* JADX INFO: renamed from: i */
    public static final Status f38936i = new Status(15);

    /* JADX INFO: renamed from: j */
    public static final Status f38937j = new Status(16);

    /* JADX INFO: renamed from: k */
    public static final Status f38938k = new Status(17);

    /* JADX INFO: renamed from: l */
    public static final Status f38939l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f38940a = i10;
        this.f38941b = str;
        this.f38942c = pendingIntent;
        this.f38943d = connectionResult;
    }

    public ConnectionResult c() {
        return this.f38943d;
    }

    public int d() {
        return this.f38940a;
    }

    public String e() {
        return this.f38941b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f38940a == status.f38940a && AbstractC2113n.a(this.f38941b, status.f38941b) && AbstractC2113n.a(this.f38942c, status.f38942c) && AbstractC2113n.a(this.f38943d, status.f38943d);
    }

    public boolean f() {
        return this.f38942c != null;
    }

    public int hashCode() {
        return AbstractC2113n.b(Integer.valueOf(this.f38940a), this.f38941b, this.f38942c, this.f38943d);
    }

    public boolean i() {
        return this.f38940a == 16;
    }

    public boolean l() {
        return this.f38940a <= 0;
    }

    public final String r() {
        String str = this.f38941b;
        return str != null ? str : c.a(this.f38940a);
    }

    public String toString() {
        AbstractC2113n.a aVarC = AbstractC2113n.c(this);
        aVarC.a("statusCode", r());
        aVarC.a("resolution", this.f38942c);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, d());
        S8.c.q(parcel, 2, e(), false);
        S8.c.p(parcel, 3, this.f38942c, i10, false);
        S8.c.p(parcel, 4, c(), i10, false);
        S8.c.b(parcel, iA);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(i10, str, connectionResult.f(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }

    @Override // P8.k
    public Status b() {
        return this;
    }
}
