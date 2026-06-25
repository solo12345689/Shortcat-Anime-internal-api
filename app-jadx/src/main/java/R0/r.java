package R0;

import Ud.AbstractC2279u;
import Ud.S;
import androidx.compose.ui.platform.V0;
import androidx.compose.ui.platform.x1;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a */
    private static AtomicInteger f15008a = new AtomicInteger(0);

    public static final void b(V0 v02, SemanticsConfiguration semanticsConfiguration) {
        x1 x1VarB = v02.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(semanticsConfiguration, 10)), 16));
        Iterator it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            B b10 = (B) entry.getKey();
            Pair pairA = Td.z.a(b10.b(), entry.getValue());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        x1VarB.c(DiagnosticsEntry.PROPERTIES_KEY, linkedHashMap);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, Function1 function1) {
        return eVar.then(new ClearAndSetSemanticsElement(function1));
    }

    public static final int d() {
        return f15008a.addAndGet(1);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, boolean z10, Function1 function1) {
        return eVar.then(new AppendedSemanticsElement(z10, function1));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(eVar, z10, function1);
    }
}
