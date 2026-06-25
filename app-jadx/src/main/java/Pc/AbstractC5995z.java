package pc;

import Ud.AbstractC2279u;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5995z {
    private static final AbstractC5988s c(Object obj, boolean z10, expo.modules.kotlin.types.b bVar, ExpectedType expectedType, Ub.d dVar) {
        Object objF;
        for (SingleType singleType : expectedType.getInnerPossibleTypes()) {
            if (z10) {
                return new h0(obj, bVar, dVar);
            }
            if ((singleType.getExpectedCppType().b().t(obj) || (obj instanceof Dynamic)) && (objF = f(bVar, obj, dVar)) != null) {
                return new C5984n(objF);
            }
        }
        return C5963E.f55887a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Object obj, Ub.d dVar, List list, List list2) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AbstractC5988s abstractC5988sC = c(obj, z10, (expo.modules.kotlin.types.b) pair.getSecond(), (ExpectedType) pair.getFirst(), dVar);
            if (abstractC5988sC instanceof C5984n) {
                z10 = true;
            }
            arrayList.add(abstractC5988sC);
        }
        if (z10) {
            return arrayList;
        }
        throw new Td.A("Cannot cast '" + obj + "' to 'Either<" + AbstractC2279u.w0(list2, ", ", null, null, 0, null, new Function1() { // from class: pc.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbstractC5995z.e((InterfaceC6027q) obj2);
            }
        }, 30, null) + ">'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(InterfaceC6027q it) {
        AbstractC5504s.h(it, "it");
        return it.toString();
    }

    private static final Object f(expo.modules.kotlin.types.b bVar, Object obj, Ub.d dVar) {
        try {
            return (!bVar.b() || (obj instanceof Dynamic)) ? bVar.a(obj, dVar, true) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
