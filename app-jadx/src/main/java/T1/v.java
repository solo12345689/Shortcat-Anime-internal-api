package T1;

import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final t a(File file) {
        AbstractC5504s.h(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC5504s.g(absolutePath, "file.canonicalFile.absolutePath");
        return u.a(absolutePath);
    }
}
