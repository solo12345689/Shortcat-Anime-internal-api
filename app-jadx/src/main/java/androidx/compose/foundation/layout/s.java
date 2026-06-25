package androidx.compose.foundation.layout;

import Td.L;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a */
    private static final FillElement f26201a;

    /* JADX INFO: renamed from: b */
    private static final FillElement f26202b;

    /* JADX INFO: renamed from: c */
    private static final FillElement f26203c;

    /* JADX INFO: renamed from: d */
    private static final WrapContentElement f26204d;

    /* JADX INFO: renamed from: e */
    private static final WrapContentElement f26205e;

    /* JADX INFO: renamed from: f */
    private static final WrapContentElement f26206f;

    /* JADX INFO: renamed from: g */
    private static final WrapContentElement f26207g;

    /* JADX INFO: renamed from: h */
    private static final WrapContentElement f26208h;

    /* JADX INFO: renamed from: i */
    private static final WrapContentElement f26209i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10) {
            super(1);
            this.f26210a = f10;
        }

        public final void a(V0 v02) {
            v02.d("height");
            v02.e(C5015h.h(this.f26210a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26211a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26212b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f26211a = f10;
            this.f26212b = f11;
        }

        public final void a(V0 v02) {
            v02.d("heightIn");
            v02.b().c("min", C5015h.h(this.f26211a));
            v02.b().c("max", C5015h.h(this.f26212b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26213a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f26213a = f10;
        }

        public final void a(V0 v02) {
            v02.d("requiredHeight");
            v02.e(C5015h.h(this.f26213a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26214a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10) {
            super(1);
            this.f26214a = f10;
        }

        public final void a(V0 v02) {
            v02.d("requiredSize");
            v02.e(C5015h.h(this.f26214a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26215a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f10, float f11) {
            super(1);
            this.f26215a = f10;
            this.f26216b = f11;
        }

        public final void a(V0 v02) {
            v02.d("requiredSize");
            v02.b().c("width", C5015h.h(this.f26215a));
            v02.b().c("height", C5015h.h(this.f26216b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26217a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26218b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f26219c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ float f26220d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f10, float f11, float f12, float f13) {
            super(1);
            this.f26217a = f10;
            this.f26218b = f11;
            this.f26219c = f12;
            this.f26220d = f13;
        }

        public final void a(V0 v02) {
            v02.d("requiredSizeIn");
            v02.b().c("minWidth", C5015h.h(this.f26217a));
            v02.b().c("minHeight", C5015h.h(this.f26218b));
            v02.b().c("maxWidth", C5015h.h(this.f26219c));
            v02.b().c("maxHeight", C5015h.h(this.f26220d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26221a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f10) {
            super(1);
            this.f26221a = f10;
        }

        public final void a(V0 v02) {
            v02.d("requiredWidth");
            v02.e(C5015h.h(this.f26221a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f10) {
            super(1);
            this.f26222a = f10;
        }

        public final void a(V0 v02) {
            v02.d("size");
            v02.e(C5015h.h(this.f26222a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26223a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26224b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f10, float f11) {
            super(1);
            this.f26223a = f10;
            this.f26224b = f11;
        }

        public final void a(V0 v02) {
            v02.d("size");
            v02.b().c("width", C5015h.h(this.f26223a));
            v02.b().c("height", C5015h.h(this.f26224b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26225a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26226b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f26227c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ float f26228d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f10, float f11, float f12, float f13) {
            super(1);
            this.f26225a = f10;
            this.f26226b = f11;
            this.f26227c = f12;
            this.f26228d = f13;
        }

        public final void a(V0 v02) {
            v02.d("sizeIn");
            v02.b().c("minWidth", C5015h.h(this.f26225a));
            v02.b().c("minHeight", C5015h.h(this.f26226b));
            v02.b().c("maxWidth", C5015h.h(this.f26227c));
            v02.b().c("maxHeight", C5015h.h(this.f26228d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26229a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f10) {
            super(1);
            this.f26229a = f10;
        }

        public final void a(V0 v02) {
            v02.d("width");
            v02.e(C5015h.h(this.f26229a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f26230a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f10, float f11) {
            super(1);
            this.f26230a = f10;
            this.f26231b = f11;
        }

        public final void a(V0 v02) {
            v02.d("widthIn");
            v02.b().c("min", C5015h.h(this.f26230a));
            v02.b().c("max", C5015h.h(this.f26231b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    static {
        FillElement.Companion companion = FillElement.INSTANCE;
        f26201a = companion.c(1.0f);
        f26202b = companion.a(1.0f);
        f26203c = companion.b(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.INSTANCE;
        e.a aVar = l0.e.f52304a;
        f26204d = companion2.c(aVar.g(), false);
        f26205e = companion2.c(aVar.k(), false);
        f26206f = companion2.a(aVar.i(), false);
        f26207g = companion2.a(aVar.l(), false);
        f26208h = companion2.b(aVar.e(), false);
        f26209i = companion2.b(aVar.o(), false);
    }

    public static final androidx.compose.ui.e A(androidx.compose.ui.e eVar, l0.e eVar2, boolean z10) {
        e.a aVar = l0.e.f52304a;
        return eVar.then((!AbstractC5504s.c(eVar2, aVar.e()) || z10) ? (!AbstractC5504s.c(eVar2, aVar.o()) || z10) ? WrapContentElement.INSTANCE.b(eVar2, z10) : f26209i : f26208h);
    }

    public static /* synthetic */ androidx.compose.ui.e B(androidx.compose.ui.e eVar, l0.e eVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar2 = l0.e.f52304a.e();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A(eVar, eVar2, z10);
    }

    public static final androidx.compose.ui.e C(androidx.compose.ui.e eVar, e.b bVar, boolean z10) {
        e.a aVar = l0.e.f52304a;
        return eVar.then((!AbstractC5504s.c(bVar, aVar.g()) || z10) ? (!AbstractC5504s.c(bVar, aVar.k()) || z10) ? WrapContentElement.INSTANCE.c(bVar, z10) : f26205e : f26204d);
    }

    public static /* synthetic */ androidx.compose.ui.e D(androidx.compose.ui.e eVar, e.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = l0.e.f52304a.g();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C(eVar, bVar, z10);
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.then(new UnspecifiedConstraintsElement(f10, f11, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.f48547b.c();
        }
        return a(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(f10 == 1.0f ? f26202b : FillElement.INSTANCE.a(f10));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return c(eVar, f10);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(f10 == 1.0f ? f26203c : FillElement.INSTANCE.b(f10));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return e(eVar, f10);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(f10 == 1.0f ? f26201a : FillElement.INSTANCE.c(f10));
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return g(eVar, f10);
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(new SizeElement(0.0f, f10, 0.0f, f10, true, T0.b() ? new a(f10) : T0.a(), 5, null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.then(new SizeElement(0.0f, f10, 0.0f, f11, true, T0.b() ? new b(f10, f11) : T0.a(), 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.f48547b.c();
        }
        return j(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(new SizeElement(0.0f, f10, 0.0f, f10, false, T0.b() ? new c(f10) : T0.a(), 5, null));
    }

    public static final androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(new SizeElement(f10, f10, f10, f10, false, T0.b() ? new d(f10) : T0.a(), null));
    }

    public static final androidx.compose.ui.e n(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.then(new SizeElement(f10, f11, f10, f11, false, T0.b() ? new e(f10, f11) : T0.a(), null));
    }

    public static final androidx.compose.ui.e o(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13) {
        return eVar.then(new SizeElement(f10, f11, f12, f13, false, T0.b() ? new f(f10, f11, f12, f13) : T0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.e p(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.f48547b.c();
        }
        if ((i10 & 4) != 0) {
            f12 = C5015h.f48547b.c();
        }
        if ((i10 & 8) != 0) {
            f13 = C5015h.f48547b.c();
        }
        return o(eVar, f10, f11, f12, f13);
    }

    public static final androidx.compose.ui.e q(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(new SizeElement(f10, 0.0f, f10, 0.0f, false, T0.b() ? new g(f10) : T0.a(), 10, null));
    }

    public static final androidx.compose.ui.e r(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(new SizeElement(f10, f10, f10, f10, true, T0.b() ? new h(f10) : T0.a(), null));
    }

    public static final androidx.compose.ui.e s(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.then(new SizeElement(f10, f11, f10, f11, true, T0.b() ? new i(f10, f11) : T0.a(), null));
    }

    public static final androidx.compose.ui.e t(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13) {
        return eVar.then(new SizeElement(f10, f11, f12, f13, true, T0.b() ? new j(f10, f11, f12, f13) : T0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.e u(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.f48547b.c();
        }
        if ((i10 & 4) != 0) {
            f12 = C5015h.f48547b.c();
        }
        if ((i10 & 8) != 0) {
            f13 = C5015h.f48547b.c();
        }
        return t(eVar, f10, f11, f12, f13);
    }

    public static final androidx.compose.ui.e v(androidx.compose.ui.e eVar, float f10) {
        return eVar.then(new SizeElement(f10, 0.0f, f10, 0.0f, true, T0.b() ? new k(f10) : T0.a(), 10, null));
    }

    public static final androidx.compose.ui.e w(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.then(new SizeElement(f10, 0.0f, f11, 0.0f, true, T0.b() ? new l(f10, f11) : T0.a(), 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.e x(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.f48547b.c();
        }
        return w(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e y(androidx.compose.ui.e eVar, e.c cVar, boolean z10) {
        e.a aVar = l0.e.f52304a;
        return eVar.then((!AbstractC5504s.c(cVar, aVar.i()) || z10) ? (!AbstractC5504s.c(cVar, aVar.l()) || z10) ? WrapContentElement.INSTANCE.a(cVar, z10) : f26207g : f26206f);
    }

    public static /* synthetic */ androidx.compose.ui.e z(androidx.compose.ui.e eVar, e.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = l0.e.f52304a.i();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return y(eVar, cVar, z10);
    }
}
