package cc;

import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: cc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C3093a extends AbstractC3094b {
    private C3093a(InterfaceC6027q interfaceC6027q, InterfaceC6027q interfaceC6027q2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + interfaceC6027q2 + "' required by the collection of type: '" + interfaceC6027q + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3093a(InterfaceC6027q collectionType, InterfaceC6027q elementType, ReadableType providedType, CodedException cause) {
        this(collectionType, elementType, providedType.name(), cause);
        AbstractC5504s.h(collectionType, "collectionType");
        AbstractC5504s.h(elementType, "elementType");
        AbstractC5504s.h(providedType, "providedType");
        AbstractC5504s.h(cause, "cause");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3093a(InterfaceC6027q collectionType, InterfaceC6027q elementType, InterfaceC6014d providedType, CodedException cause) {
        this(collectionType, elementType, providedType.toString(), cause);
        AbstractC5504s.h(collectionType, "collectionType");
        AbstractC5504s.h(elementType, "elementType");
        AbstractC5504s.h(providedType, "providedType");
        AbstractC5504s.h(cause, "cause");
    }
}
