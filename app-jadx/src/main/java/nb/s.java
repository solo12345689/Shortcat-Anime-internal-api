package nb;

import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends CodedException {
    public s(SecurityException securityException) {
        super("App has no permission to read this clipboard item", securityException);
    }
}
