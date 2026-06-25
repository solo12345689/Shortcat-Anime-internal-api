package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3459f4 extends AbstractC3540o4 {
    C3459f4(C3486i4 c3486i4, String str, Boolean bool, boolean z10) {
        super(c3486i4, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3540o4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (I3.f39384c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (I3.f39385d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f39910b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + string.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
