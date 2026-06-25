package androidx.compose.foundation.layout;

import C.A;
import C.B;
import Td.L;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import i1.EnumC5027t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f26181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f26182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f26183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f26184d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f26181a = f10;
            this.f26182b = f11;
            this.f26183c = f12;
            this.f26184d = f13;
        }

        public final void a(V0 v02) {
            v02.d("padding");
            v02.b().c("start", C5015h.h(this.f26181a));
            v02.b().c("top", C5015h.h(this.f26182b));
            v02.b().c("end", C5015h.h(this.f26183c));
            v02.b().c("bottom", C5015h.h(this.f26184d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f26185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f26186b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f26185a = f10;
            this.f26186b = f11;
        }

        public final void a(V0 v02) {
            v02.d("padding");
            v02.b().c("horizontal", C5015h.h(this.f26185a));
            v02.b().c("vertical", C5015h.h(this.f26186b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f26187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f26187a = f10;
        }

        public final void a(V0 v02) {
            v02.d("padding");
            v02.e(C5015h.h(this.f26187a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f26188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(A a10) {
            super(1);
            this.f26188a = a10;
        }

        public final void a(V0 v02) {
            v02.d("padding");
            v02.b().c("paddingValues", this.f26188a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public static final A a(float f10) {
        return new B(f10, f10, f10, f10, null);
    }

    public static final A b(float f10, float f11) {
        return new B(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ A c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.n(0);
        }
        return b(f10, f11);
    }

    public static final A d(float f10, float f11, float f12, float f13) {
        return new B(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ A e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.n(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C5015h.n(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C5015h.n(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(A a10, EnumC5027t enumC5027t) {
        return enumC5027t == EnumC5027t.f48573a ? a10.a(enumC5027t) : a10.b(enumC5027t);
    }

    public static final float g(A a10, EnumC5027t enumC5027t) {
        return enumC5027t == EnumC5027t.f48573a ? a10.b(enumC5027t) : a10.a(enumC5027t);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, A a10) {
        return eVar.then(new PaddingValuesElement(a10, new d(a10)));
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(new PaddingElement(f10, f10, f10, f10, true, new c(f10), null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.then(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.n(0);
        }
        return j(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13) {
        return eVar.then(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), null));
    }

    public static /* synthetic */ androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.n(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C5015h.n(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C5015h.n(0);
        }
        return l(eVar, f10, f11, f12, f13);
    }
}
