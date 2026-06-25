package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: cc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3094b extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC3094b(String message, CodedException cause) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(cause, "cause");
        String code = cause.getCode();
        String strLineSeparator = System.lineSeparator();
        Object localizedMessage = cause.getLocalizedMessage();
        super(code, message + strLineSeparator + "→ Caused by: " + (localizedMessage == null ? cause : localizedMessage), cause);
    }
}
