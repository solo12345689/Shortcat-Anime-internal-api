package androidx.compose.foundation.layout;

import C.InterfaceC1132c;
import Td.L;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC1132c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f26161a = new h();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0.e f26162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.e eVar) {
            super(1);
            this.f26162a = eVar;
        }

        public final void a(V0 v02) {
            v02.d("align");
            v02.e(this.f26162a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {
        public b() {
            super(1);
        }

        public final void a(V0 v02) {
            v02.d("matchParentSize");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    private h() {
    }

    @Override // C.InterfaceC1132c
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, l0.e eVar2) {
        return eVar.then(new BoxChildDataElement(eVar2, false, T0.b() ? new a(eVar2) : T0.a()));
    }

    @Override // C.InterfaceC1132c
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        return eVar.then(new BoxChildDataElement(l0.e.f52304a.e(), true, T0.b() ? new b() : T0.a()));
    }
}
