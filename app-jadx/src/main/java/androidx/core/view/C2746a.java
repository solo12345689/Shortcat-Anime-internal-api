package androidx.core.view;

import L1.B;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import x1.AbstractC7046c;

/* JADX INFO: renamed from: androidx.core.view.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2746a {

    /* JADX INFO: renamed from: c */
    private static final View.AccessibilityDelegate f29001c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    private final View.AccessibilityDelegate f29002a;

    /* JADX INFO: renamed from: b */
    private final View.AccessibilityDelegate f29003b;

    /* JADX INFO: renamed from: androidx.core.view.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0495a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        final C2746a f29004a;

        C0495a(C2746a c2746a) {
            this.f29004a = c2746a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f29004a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            L1.C cB = this.f29004a.b(view);
            if (cB != null) {
                return (AccessibilityNodeProvider) cB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f29004a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            L1.B bS1 = L1.B.s1(accessibilityNodeInfo);
            bS1.b1(AbstractC2747a0.S(view));
            bS1.L0(AbstractC2747a0.O(view));
            bS1.V0(AbstractC2747a0.n(view));
            bS1.h1(AbstractC2747a0.G(view));
            this.f29004a.g(view, bS1);
            bS1.f(accessibilityNodeInfo.getText(), view);
            List listC = C2746a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                bS1.b((B.a) listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f29004a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f29004a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f29004a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f29004a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f29004a.m(view, accessibilityEvent);
        }
    }

    public C2746a() {
        this(f29001c);
    }

    static List c(View view) {
        List list = (List) view.getTag(AbstractC7046c.f63614H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrT = L1.B.t(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrT != null && i10 < clickableSpanArrT.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrT[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC7046c.f63615I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f29002a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public L1.C b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f29002a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new L1.C(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f29003b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f29002a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, L1.B b10) {
        this.f29002a.onInitializeAccessibilityNodeInfo(view, b10.r1());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f29002a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f29002a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            B.a aVar = (B.a) listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f29002a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != AbstractC7046c.f63627a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f29002a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f29002a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2746a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f29002a = accessibilityDelegate;
        this.f29003b = new C0495a(this);
    }
}
