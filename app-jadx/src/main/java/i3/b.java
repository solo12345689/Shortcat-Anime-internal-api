package I3;

import Gf.W;
import Td.L;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.p;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f8806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f8807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, W w10) {
            super(1);
            this.f8806a = aVar;
            this.f8807b = w10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return L.f17438a;
        }

        public final void invoke(Throwable th2) {
            if (th2 == null) {
                this.f8806a.b(this.f8807b.q());
            } else if (th2 instanceof CancellationException) {
                this.f8806a.c();
            } else {
                this.f8806a.e(th2);
            }
        }
    }

    public static final p b(final W w10, final Object obj) {
        AbstractC5504s.h(w10, "<this>");
        p pVarA = c.a(new c.InterfaceC0486c() { // from class: I3.a
            @Override // androidx.concurrent.futures.c.InterfaceC0486c
            public final Object a(c.a aVar) {
                return b.d(w10, obj, aVar);
            }
        });
        AbstractC5504s.g(pVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return pVarA;
    }

    public static /* synthetic */ p c(W w10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(w10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(W this_asListenableFuture, Object obj, c.a completer) {
        AbstractC5504s.h(this_asListenableFuture, "$this_asListenableFuture");
        AbstractC5504s.h(completer, "completer");
        this_asListenableFuture.H(new a(completer, this_asListenableFuture));
        return obj;
    }
}
