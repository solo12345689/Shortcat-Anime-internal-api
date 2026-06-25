package lb;

import android.content.pm.PackageManager;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PackageManager.NameNotFoundException cause) {
        super("Unable to get install time of this application. Could not get package info or package name.", cause);
        AbstractC5504s.h(cause, "cause");
    }
}
