package com.google.android.gms.common;

import R8.AbstractC2113n;
import R8.AbstractC2115p;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConnectionResult extends S8.a {
    public static final int SUCCESS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f38919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f38921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f38923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConnectionResult f38918f = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new g();

    ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f38919a = i10;
        this.f38920b = i11;
        this.f38921c = pendingIntent;
        this.f38922d = str;
        this.f38923e = num;
    }

    static String s(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return HybridPurchaseLogicBridge.RESULT_SUCCESS;
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public Integer c() {
        return this.f38923e;
    }

    public int d() {
        return this.f38920b;
    }

    public String e() {
        return this.f38922d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f38920b == connectionResult.f38920b && AbstractC2113n.a(this.f38921c, connectionResult.f38921c) && AbstractC2113n.a(this.f38922d, connectionResult.f38922d) && AbstractC2113n.a(this.f38923e, connectionResult.f38923e);
    }

    public PendingIntent f() {
        return this.f38921c;
    }

    public int hashCode() {
        return AbstractC2113n.b(Integer.valueOf(this.f38920b), this.f38921c, this.f38922d, this.f38923e);
    }

    public boolean i() {
        return (this.f38920b == 0 || this.f38921c == null) ? false : true;
    }

    public boolean l() {
        return this.f38920b == 0;
    }

    public void r(Activity activity, int i10) throws IntentSender.SendIntentException {
        if (i()) {
            PendingIntent pendingIntent = this.f38921c;
            AbstractC2115p.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public String toString() {
        AbstractC2113n.a aVarC = AbstractC2113n.c(this);
        aVarC.a("statusCode", s(this.f38920b));
        aVarC.a("resolution", this.f38921c);
        aVarC.a("message", this.f38922d);
        aVarC.a("clientMethodKey", this.f38923e);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f38919a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.j(parcel, 2, d());
        S8.c.p(parcel, 3, f(), i10, false);
        S8.c.q(parcel, 4, e(), false);
        S8.c.m(parcel, 5, c(), false);
        S8.c.b(parcel, iA);
    }

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
