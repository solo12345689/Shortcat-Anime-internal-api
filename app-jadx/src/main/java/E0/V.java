package E0;

import Td.InterfaceC2158i;
import Ud.AbstractC2279u;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.InterfaceC5499m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a */
    private static final C1307q f4093a = new C1307q(AbstractC2279u.m());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements PointerInputEventHandler, InterfaceC5499m {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function2 f4094a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Function2 function2) {
            this.f4094a = function2;
        }

        @Override // kotlin.jvm.internal.InterfaceC5499m
        public final InterfaceC2158i b() {
            return this.f4094a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC5499m)) {
                return AbstractC5504s.c(b(), ((InterfaceC5499m) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(L l10, Zd.e eVar) {
            return this.f4094a.invoke(l10, eVar);
        }
    }

    public static final /* synthetic */ X a(Function2 function2) {
        return new Y((Object) null, (Object) null, (Object[]) null, function2);
    }
}
