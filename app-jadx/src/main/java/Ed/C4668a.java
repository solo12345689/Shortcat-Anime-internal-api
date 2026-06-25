package ed;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ed.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4668a extends CodedException {
    public /* synthetic */ C4668a(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    public C4668a(String str, Throwable th2) {
        super("Could not Authenticate the user: " + (str == null ? "unknown" : str), th2);
    }
}
