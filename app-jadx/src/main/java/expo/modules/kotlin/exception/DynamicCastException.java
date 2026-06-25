package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/exception/DynamicCastException;", "Lexpo/modules/kotlin/exception/CodedException;", "Lpe/d;", "type", "<init>", "(Lpe/d;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicCastException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicCastException(InterfaceC6014d type) {
        super("Could not cast dynamic value to '" + type.u() + "'.", null, 2, null);
        AbstractC5504s.h(type, "type");
    }
}
