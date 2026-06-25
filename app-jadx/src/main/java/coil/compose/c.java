package coil.compose;

import G4.h;
import G4.k;
import H4.g;
import I0.InterfaceC1680f;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import i1.AbstractC5026s;
import i1.C5009b;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;
import r0.C6230l;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f33869a = C5009b.f48540b.c(0, 0);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f33870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f33871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f33872c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, Function1 function12, Function1 function13) {
            super(1);
            this.f33870a = function1;
            this.f33871b = function12;
            this.f33872c = function13;
        }

        public final void a(AsyncImagePainter.State state) {
            Function1 function1;
            if (state instanceof AsyncImagePainter.State.Loading) {
                Function1 function12 = this.f33870a;
                if (function12 != null) {
                    function12.invoke(state);
                    return;
                }
                return;
            }
            if (state instanceof AsyncImagePainter.State.Success) {
                Function1 function13 = this.f33871b;
                if (function13 != null) {
                    function13.invoke(state);
                    return;
                }
                return;
            }
            if (!(state instanceof AsyncImagePainter.State.Error) || (function1 = this.f33872c) == null) {
                return;
            }
            function1.invoke(state);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AsyncImagePainter.State) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6923b f33873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6923b f33874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6923b f33875c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC6923b abstractC6923b, AbstractC6923b abstractC6923b2, AbstractC6923b abstractC6923b3) {
            super(1);
            this.f33873a = abstractC6923b;
            this.f33874b = abstractC6923b2;
            this.f33875c = abstractC6923b3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AsyncImagePainter.State invoke(AsyncImagePainter.State state) {
            if (state instanceof AsyncImagePainter.State.Loading) {
                AbstractC6923b abstractC6923b = this.f33873a;
                AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
                return abstractC6923b != null ? loading.b(abstractC6923b) : loading;
            }
            if (!(state instanceof AsyncImagePainter.State.Error)) {
                return state;
            }
            AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
            if (error.getResult().c() instanceof k) {
                AbstractC6923b abstractC6923b2 = this.f33874b;
                return abstractC6923b2 != null ? AsyncImagePainter.State.Error.c(error, abstractC6923b2, null, 2, null) : error;
            }
            AbstractC6923b abstractC6923b3 = this.f33875c;
            return abstractC6923b3 != null ? AsyncImagePainter.State.Error.c(error, abstractC6923b3, null, 2, null) : error;
        }
    }

    public static final float a(long j10, float f10) {
        return AbstractC5874j.l(f10, C5009b.m(j10), C5009b.k(j10));
    }

    public static final float b(long j10, float f10) {
        return AbstractC5874j.l(f10, C5009b.n(j10), C5009b.l(j10));
    }

    public static final long c() {
        return f33869a;
    }

    public static final Function1 d(Function1 function1, Function1 function12, Function1 function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new a(function1, function12, function13);
    }

    public static final h e(Object obj, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1151830858, i10, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        return obj instanceof h ? (h) obj : new h.a((Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g())).c(obj).a();
    }

    public static final long f(long j10) {
        return AbstractC5026s.a(AbstractC5466a.d(C6230l.i(j10)), AbstractC5466a.d(C6230l.g(j10)));
    }

    public static final g g(InterfaceC1680f interfaceC1680f) {
        InterfaceC1680f.a aVar = InterfaceC1680f.f8703a;
        return AbstractC5504s.c(interfaceC1680f, aVar.b()) ? true : AbstractC5504s.c(interfaceC1680f, aVar.c()) ? g.FIT : g.FILL;
    }

    public static final Function1 h(AbstractC6923b abstractC6923b, AbstractC6923b abstractC6923b2, AbstractC6923b abstractC6923b3) {
        return (abstractC6923b == null && abstractC6923b2 == null && abstractC6923b3 == null) ? AsyncImagePainter.INSTANCE.a() : new b(abstractC6923b, abstractC6923b3, abstractC6923b2);
    }
}
