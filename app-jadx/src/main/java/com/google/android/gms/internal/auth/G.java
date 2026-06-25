package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class G extends M {
    G(I i10, String str, Double d10, boolean z10) {
        super(i10, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.f39096b + ": " + ((String) obj));
            return null;
        }
    }
}
