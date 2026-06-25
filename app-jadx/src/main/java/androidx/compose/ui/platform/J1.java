package androidx.compose.ui.platform;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.C1639v0;
import Y.C2433o1;
import ae.AbstractC2605b;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J1 f27239a = new J1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f27240b = new AtomicReference(I1.f27235a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27241c = 8;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2433o1 f27244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f27245c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2433o1 c2433o1, View view, Zd.e eVar) {
            super(2, eVar);
            this.f27244b = c2433o1;
            this.f27245c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f27244b, this.f27245c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            View view;
            Object objF = AbstractC2605b.f();
            int i10 = this.f27243a;
            try {
                if (i10 == 0) {
                    Td.v.b(obj);
                    C2433o1 c2433o1 = this.f27244b;
                    this.f27243a = 1;
                    if (c2433o1.t0(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                if (K1.f(view) == this.f27244b) {
                    K1.i(this.f27245c, null);
                }
                return Td.L.f17438a;
            } finally {
                if (K1.f(this.f27245c) == this.f27244b) {
                    K1.i(this.f27245c, null);
                }
            }
        }
    }

    private J1() {
    }

    public final C2433o1 a(View view) {
        C2433o1 c2433o1A = ((I1) f27240b.get()).a(view);
        K1.i(view, c2433o1A);
        view.addOnAttachStateChangeListener(new a(AbstractC1617k.d(C1639v0.f7613a, Hf.h.b(view.getHandler(), "windowRecomposer cleanup").d2(), null, new b(c2433o1A, view, null), 2, null)));
        return c2433o1A;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Gf.C0 f27242a;

        a(Gf.C0 c02) {
            this.f27242a = c02;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C0.a.a(this.f27242a, null, 1, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
