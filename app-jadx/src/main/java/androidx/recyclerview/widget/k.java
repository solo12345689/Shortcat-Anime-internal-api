package androidx.recyclerview.widget;

import L1.B;
import L1.C;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class k extends C2746a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f32142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f32143e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends C2746a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final k f32144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f32145e = new WeakHashMap();

        public a(k kVar) {
            this.f32144d = kVar;
        }

        @Override // androidx.core.view.C2746a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            return c2746a != null ? c2746a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C2746a
        public C b(View view) {
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            return c2746a != null ? c2746a.b(view) : super.b(view);
        }

        @Override // androidx.core.view.C2746a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            if (c2746a != null) {
                c2746a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            if (this.f32144d.o() || this.f32144d.f32142d.getLayoutManager() == null) {
                super.g(view, b10);
                return;
            }
            this.f32144d.f32142d.getLayoutManager().S0(view, b10);
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            if (c2746a != null) {
                c2746a.g(view, b10);
            } else {
                super.g(view, b10);
            }
        }

        @Override // androidx.core.view.C2746a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            if (c2746a != null) {
                c2746a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C2746a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2746a c2746a = (C2746a) this.f32145e.get(viewGroup);
            return c2746a != null ? c2746a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C2746a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f32144d.o() || this.f32144d.f32142d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            if (c2746a != null) {
                if (c2746a.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f32144d.f32142d.getLayoutManager().m1(view, i10, bundle);
        }

        @Override // androidx.core.view.C2746a
        public void l(View view, int i10) {
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            if (c2746a != null) {
                c2746a.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.C2746a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C2746a c2746a = (C2746a) this.f32145e.get(view);
            if (c2746a != null) {
                c2746a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        C2746a n(View view) {
            return (C2746a) this.f32145e.remove(view);
        }

        void o(View view) {
            C2746a c2746aK = AbstractC2747a0.k(view);
            if (c2746aK == null || c2746aK == this) {
                return;
            }
            this.f32145e.put(view, c2746aK);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f32142d = recyclerView;
        C2746a c2746aN = n();
        if (c2746aN == null || !(c2746aN instanceof a)) {
            this.f32143e = new a(this);
        } else {
            this.f32143e = (a) c2746aN;
        }
    }

    @Override // androidx.core.view.C2746a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2746a
    public void g(View view, B b10) {
        super.g(view, b10);
        if (o() || this.f32142d.getLayoutManager() == null) {
            return;
        }
        this.f32142d.getLayoutManager().Q0(b10);
    }

    @Override // androidx.core.view.C2746a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f32142d.getLayoutManager() == null) {
            return false;
        }
        return this.f32142d.getLayoutManager().k1(i10, bundle);
    }

    public C2746a n() {
        return this.f32143e;
    }

    boolean o() {
        return this.f32142d.p0();
    }
}
