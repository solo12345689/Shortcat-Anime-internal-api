package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class H extends M {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ N1 f39069l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(I i10, String str, Object obj, boolean z10, N1 n12) {
        super(i10, "getTokenRefactor__blocked_packages", obj, true, null);
        this.f39069l = n12;
    }

    @Override // com.google.android.gms.internal.auth.M
    final Object a(Object obj) {
        try {
            return H1.r(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + this.f39096b + ": " + ((String) obj));
            return null;
        }
    }
}
