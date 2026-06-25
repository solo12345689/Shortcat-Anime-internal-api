package com.google.android.gms.auth.api.signin;

import R8.AbstractC2115p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SignInAccount extends S8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f38895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f38896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f38897c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f38896b = googleSignInAccount;
        this.f38895a = AbstractC2115p.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f38897c = AbstractC2115p.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount c() {
        return this.f38896b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f38895a;
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 4, str, false);
        S8.c.p(parcel, 7, this.f38896b, i10, false);
        S8.c.q(parcel, 8, this.f38897c, false);
        S8.c.b(parcel, iA);
    }
}
