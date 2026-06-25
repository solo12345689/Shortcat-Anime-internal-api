package androidx.compose.foundation.layout;

import C.EnumC1152x;
import Td.L;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC1152x f26168a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC1152x enumC1152x) {
            super(1);
            this.f26168a = enumC1152x;
        }

        public final void a(V0 v02) {
            v02.d("height");
            v02.b().c("intrinsicSize", this.f26168a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC1152x f26169a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC1152x enumC1152x) {
            super(1);
            this.f26169a = enumC1152x;
        }

        public final void a(V0 v02) {
            v02.d("width");
            v02.b().c("intrinsicSize", this.f26169a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, EnumC1152x enumC1152x) {
        return eVar.then(new IntrinsicHeightElement(enumC1152x, true, T0.b() ? new a(enumC1152x) : T0.a()));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, EnumC1152x enumC1152x) {
        return eVar.then(new IntrinsicWidthElement(enumC1152x, true, T0.b() ? new b(enumC1152x) : T0.a()));
    }
}
