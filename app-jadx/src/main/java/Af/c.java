package Af;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final boolean a(Throwable th2) {
        AbstractC5504s.h(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!AbstractC5504s.c(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e10) throws Throwable {
        AbstractC5504s.h(e10, "e");
        throw e10;
    }
}
