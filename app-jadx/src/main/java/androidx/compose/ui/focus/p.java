package androidx.compose.ui.focus;

import Td.L;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a extends AbstractC5502p implements Function1 {
        a(Object obj) {
            super(1, obj, u.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            j((FocusTargetNode) obj);
            return L.f17438a;
        }

        public final void j(FocusTargetNode focusTargetNode) {
            ((u) this.receiver).a(focusTargetNode);
        }
    }

    public static final /* synthetic */ o a() {
        return new FocusTargetNode(0, null, new a(u.f26695a), 3, null);
    }
}
