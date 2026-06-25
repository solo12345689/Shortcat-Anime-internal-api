package expo.modules.kotlin.exception;

import Df.p;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\b\u0017\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\fB\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\nB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "()V", "a", "Ljava/lang/String;", "providedCode", "getCode", "()Ljava/lang/String;", "b", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CodedException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String providedCode;

    /* JADX INFO: renamed from: expo.modules.kotlin.exception.CodedException$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class clazz) {
            AbstractC5504s.h(clazz, "clazz");
            String strI = new p("(.)([A-Z])").i(new p("(Exception)$").i(clazz.getSimpleName(), ""), "$1_$2");
            Locale ROOT = Locale.ROOT;
            AbstractC5504s.g(ROOT, "ROOT");
            String upperCase = strI.toUpperCase(ROOT);
            AbstractC5504s.g(upperCase, "toUpperCase(...)");
            return "ERR_" + upperCase;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CodedException(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    public final String getCode() {
        String str = this.providedCode;
        return str == null ? INSTANCE.a(getClass()) : str;
    }

    public CodedException(String str, Throwable th2) {
        super(str, th2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedException(String code, String str, Throwable th2) {
        this(str, th2);
        AbstractC5504s.h(code, "code");
        this.providedCode = code;
    }

    public CodedException() {
        this(null, null);
    }
}
