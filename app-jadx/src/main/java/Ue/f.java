package Ue;

import Ze.i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f {
    public static final Object a(i.d dVar, i.f extension) {
        AbstractC5504s.h(dVar, "<this>");
        AbstractC5504s.h(extension, "extension");
        if (dVar.y(extension)) {
            return dVar.v(extension);
        }
        return null;
    }

    public static final Object b(i.d dVar, i.f extension, int i10) {
        AbstractC5504s.h(dVar, "<this>");
        AbstractC5504s.h(extension, "extension");
        if (i10 < dVar.x(extension)) {
            return dVar.w(extension, i10);
        }
        return null;
    }
}
