package com.google.android.gms.auth.api.signin.internal;

import K8.b;
import K8.y;
import R8.AbstractC2115p;
import S8.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class SignInConfiguration extends S8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f38901b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f38900a = AbstractC2115p.f(str);
        this.f38901b = googleSignInOptions;
    }

    public final GoogleSignInOptions c() {
        return this.f38901b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f38900a.equals(signInConfiguration.f38900a)) {
            GoogleSignInOptions googleSignInOptions = this.f38901b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f38901b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f38900a).a(this.f38901b).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f38900a;
        int iA = c.a(parcel);
        c.q(parcel, 2, str, false);
        c.p(parcel, 5, this.f38901b, i10, false);
        c.b(parcel, iA);
    }
}
