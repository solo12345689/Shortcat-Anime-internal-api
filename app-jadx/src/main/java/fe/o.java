package fe;

import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends n {
    public static i q(File file, j direction) {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(direction, "direction");
        return new i(file, direction);
    }

    public static final i r(File file) {
        AbstractC5504s.h(file, "<this>");
        return q(file, j.f47037b);
    }

    public static i s(File file) {
        AbstractC5504s.h(file, "<this>");
        return q(file, j.f47036a);
    }
}
