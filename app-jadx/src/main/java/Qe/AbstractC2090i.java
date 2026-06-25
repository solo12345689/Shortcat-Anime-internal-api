package Qe;

import kotlin.jvm.internal.AbstractC5504s;
import ye.M;

/* JADX INFO: renamed from: Qe.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2090i {
    public static final C2089h a(ye.H module, M notFoundClasses, pf.n storageManager, v kotlinClassFinder, Ue.c metadataVersion) {
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        C2089h c2089h = new C2089h(module, notFoundClasses, storageManager, kotlinClassFinder);
        c2089h.S(metadataVersion);
        return c2089h;
    }
}
