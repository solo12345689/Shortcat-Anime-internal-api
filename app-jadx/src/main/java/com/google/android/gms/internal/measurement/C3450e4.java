package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3450e4 extends AbstractC3540o4 {
    C3450e4(C3486i4 c3486i4, String str, Long l10, boolean z10) {
        super(c3486i4, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3540o4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f39910b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
