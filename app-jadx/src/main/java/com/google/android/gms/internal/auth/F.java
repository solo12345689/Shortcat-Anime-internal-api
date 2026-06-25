package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F extends M {
    F(I i10, String str, Boolean bool, boolean z10) {
        super(i10, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        if (AbstractC3367l.f39259c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (AbstractC3367l.f39260d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f39096b + ": " + ((String) obj));
        return null;
    }
}
