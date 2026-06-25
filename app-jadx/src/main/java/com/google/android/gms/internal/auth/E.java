package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class E extends M {
    E(I i10, String str, Long l10, boolean z10) {
        super(i10, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f39096b + ": " + ((String) obj));
            return null;
        }
    }
}
