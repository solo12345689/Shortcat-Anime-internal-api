package androidx.compose.foundation;

import K0.Y;
import Td.L;
import androidx.compose.ui.platform.S0;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import x.AbstractC6982B;
import x.C7026x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FocusableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final S0 f25738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f25739b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {
        public a() {
            super(1);
        }

        public final void a(V0 v02) {
            v02.d("focusGroup");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f25738a = new S0(T0.b() ? new a() : T0.a());
        f25739b = new Y() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // K0.Y
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7026x create() {
                return new C7026x();
            }

            public boolean equals(Object other) {
                return this == other;
            }

            public int hashCode() {
                return AbstractC6982B.a(this);
            }

            @Override // K0.Y
            public void inspectableProperties(V0 v02) {
                v02.d("focusableInNonTouchMode");
            }

            @Override // K0.Y
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void update(C7026x node) {
            }
        };
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, boolean z10, B.m mVar) {
        return eVar.then(z10 ? new FocusableElement(mVar) : androidx.compose.ui.e.f26613a);
    }
}
