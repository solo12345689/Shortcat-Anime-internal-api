package ed;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends CodedException {
    public /* synthetic */ j(String str, String str2, String str3, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String key, String keychain, Throwable th2) {
        super("An error occurred when writing to key: '" + key + "' under keychain: '" + keychain + "'. Caused by: " + (str == null ? "unknown" : str), th2);
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(keychain, "keychain");
    }
}
