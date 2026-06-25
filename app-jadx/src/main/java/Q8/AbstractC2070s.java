package Q8;

import R8.AbstractC2101b;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: Q8.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2070s {
    public static void a(Status status, Object obj, n9.j jVar) {
        if (status.l()) {
            jVar.c(obj);
        } else {
            jVar.b(AbstractC2101b.a(status));
        }
    }

    public static boolean b(Status status, Object obj, n9.j jVar) {
        return status.l() ? jVar.e(obj) : jVar.d(AbstractC2101b.a(status));
    }
}
