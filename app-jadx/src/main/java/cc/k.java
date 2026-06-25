package cc;

import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends AbstractC3094b {
    private k(String str, CodedException codedException) {
        super(str, codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(String fieldName, InterfaceC6027q fieldType, ReadableType providedType, CodedException cause) {
        this("Cannot cast '" + providedType.name() + "' for field '" + fieldName + "' ('" + fieldType + "').", cause);
        AbstractC5504s.h(fieldName, "fieldName");
        AbstractC5504s.h(fieldType, "fieldType");
        AbstractC5504s.h(providedType, "providedType");
        AbstractC5504s.h(cause, "cause");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(String fieldName, InterfaceC6027q fieldType, InterfaceC6027q recordType, CodedException cause) {
        this("Cannot cast value for field '" + fieldName + "' ('" + fieldType + "') in record '" + recordType + "'.", cause);
        AbstractC5504s.h(fieldName, "fieldName");
        AbstractC5504s.h(fieldType, "fieldType");
        AbstractC5504s.h(recordType, "recordType");
        AbstractC5504s.h(cause, "cause");
    }
}
