package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/exception/UnexpectedException;", "Lexpo/modules/kotlin/exception/CodedException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "throwable", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnexpectedException extends CodedException {
    public UnexpectedException(String str, Throwable th2) {
        super(str, th2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnexpectedException(Throwable throwable) {
        this(throwable.toString(), throwable);
        AbstractC5504s.h(throwable, "throwable");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnexpectedException(String message) {
        this(message, null);
        AbstractC5504s.h(message, "message");
    }
}
