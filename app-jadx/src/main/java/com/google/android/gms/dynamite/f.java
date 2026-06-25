package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0637b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0637b c0637b = new DynamiteModule.b.C0637b();
        int iB = aVar.b(context, str);
        c0637b.f39042a = iB;
        if (iB != 0) {
            c0637b.f39044c = -1;
            return c0637b;
        }
        int iA = aVar.a(context, str, true);
        c0637b.f39043b = iA;
        if (iA != 0) {
            c0637b.f39044c = 1;
        }
        return c0637b;
    }
}
