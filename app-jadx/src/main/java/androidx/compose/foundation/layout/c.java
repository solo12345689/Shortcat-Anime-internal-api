package androidx.compose.foundation.layout;

import Td.L;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f26131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, boolean z10) {
            super(1);
            this.f26131a = f10;
            this.f26132b = z10;
        }

        public final void a(V0 v02) {
            v02.d("aspectRatio");
            v02.b().c("ratio", Float.valueOf(this.f26131a));
            v02.b().c("matchHeightConstraintsFirst", Boolean.valueOf(this.f26132b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        return eVar.then(new AspectRatioElement(f10, z10, T0.b() ? new a(f10, z10) : T0.a()));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(eVar, f10, z10);
    }
}
