package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.y1;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface y1 {

    /* JADX INFO: renamed from: a */
    public static final a f27631a = a.f27632a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f27632a = new a();

        private a() {
        }

        public final y1 a() {
            return b.f27633b;
        }
    }

    InterfaceC5082a a(AbstractC2680a abstractC2680a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements y1 {

        /* JADX INFO: renamed from: b */
        public static final b f27633b = new b();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AbstractC2680a f27634a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0473b f27635b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ P1.b f27636c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC2680a abstractC2680a, ViewOnAttachStateChangeListenerC0473b viewOnAttachStateChangeListenerC0473b, P1.b bVar) {
                super(0);
                this.f27634a = abstractC2680a;
                this.f27635b = viewOnAttachStateChangeListenerC0473b;
                this.f27636c = bVar;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m85invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m85invoke() {
                this.f27634a.removeOnAttachStateChangeListener(this.f27635b);
                P1.a.g(this.f27634a, this.f27636c);
            }
        }

        private b() {
        }

        public static final void c(AbstractC2680a abstractC2680a) {
            abstractC2680a.disposeComposition();
        }

        @Override // androidx.compose.ui.platform.y1
        public InterfaceC5082a a(final AbstractC2680a abstractC2680a) {
            ViewOnAttachStateChangeListenerC0473b viewOnAttachStateChangeListenerC0473b = new ViewOnAttachStateChangeListenerC0473b(abstractC2680a);
            abstractC2680a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0473b);
            P1.b bVar = new P1.b() { // from class: androidx.compose.ui.platform.z1
                @Override // P1.b
                public final void a() {
                    y1.b.c(abstractC2680a);
                }
            };
            P1.a.a(abstractC2680a, bVar);
            return new a(abstractC2680a, viewOnAttachStateChangeListenerC0473b, bVar);
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.y1$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class ViewOnAttachStateChangeListenerC0473b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AbstractC2680a f27637a;

            ViewOnAttachStateChangeListenerC0473b(AbstractC2680a abstractC2680a) {
                this.f27637a = abstractC2680a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (P1.a.f(this.f27637a)) {
                    return;
                }
                this.f27637a.disposeComposition();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }
        }
    }
}
