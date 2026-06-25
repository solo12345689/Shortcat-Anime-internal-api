package expo.modules.kotlin.types;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B+\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00028\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfThree;", "", "FirstType", "SecondType", "ThirdType", "Lexpo/modules/kotlin/types/Either;", "bareValue", "", "Lpc/s;", "deferredValue", "", "Lpe/q;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "Lpe/d;", "type", "", "h", "(Lpe/d;)Z", "g", "(Lpe/d;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class EitherOfThree<FirstType, SecondType, ThirdType> extends Either<FirstType, SecondType> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherOfThree(Object bareValue, List deferredValue, List types) {
        super(bareValue, deferredValue, types);
        AbstractC5504s.h(bareValue, "bareValue");
        AbstractC5504s.h(deferredValue, "deferredValue");
        AbstractC5504s.h(types, "types");
    }

    public final Object g(InterfaceC6014d type) {
        AbstractC5504s.h(type, "type");
        Object objA = a(2);
        AbstractC5504s.f(objA, "null cannot be cast to non-null type ThirdType of expo.modules.kotlin.types.EitherOfThree");
        return objA;
    }

    public final boolean h(InterfaceC6014d type) {
        AbstractC5504s.h(type, "type");
        return d(2);
    }
}
