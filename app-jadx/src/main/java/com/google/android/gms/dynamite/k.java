package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k implements DynamiteModule.b {
    k() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0637b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0637b c0637b = new DynamiteModule.b.C0637b();
        int iB = aVar.b(context, str);
        c0637b.f39042a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0637b.f39043b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0637b.f39043b = iA;
        }
        int i12 = c0637b.f39042a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            c0637b.f39044c = i10;
            return c0637b;
        }
        i11 = i12;
        if (iA < i11) {
            i10 = -1;
        }
        c0637b.f39044c = i10;
        return c0637b;
    }
}
