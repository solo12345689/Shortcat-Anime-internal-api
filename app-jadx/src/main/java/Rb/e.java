package rb;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends CancellationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String message) {
        super(message);
        AbstractC5504s.h(message, "message");
    }

    public /* synthetic */ e(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "Module destroyed. All coroutines are cancelled." : str);
    }
}
