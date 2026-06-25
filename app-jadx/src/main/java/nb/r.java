package nb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public r(String image, Throwable th2) {
        AbstractC5504s.h(image, "image");
        String strSubstring = image.substring(0, Math.min(image.length(), 32));
        AbstractC5504s.g(strSubstring, "substring(...)");
        super("Invalid base64 image: " + ((Object) (strSubstring + (image.length() > 32 ? "..." : ""))), th2);
    }
}
