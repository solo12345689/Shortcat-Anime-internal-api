package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class T5 extends X5 {
    T5() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void a() {
        if (!b()) {
            if (d() > 0) {
                android.support.v4.media.session.b.a(((U5) e(0)).a());
                throw null;
            }
            Iterator it = f().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
