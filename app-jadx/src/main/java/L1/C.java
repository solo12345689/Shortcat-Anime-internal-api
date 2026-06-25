package L1;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11242a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C f11243a;

        a(C c10) {
            this.f11243a = c10;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            B b10 = this.f11243a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.r1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f11243a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((B) listC.get(i11)).r1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            B bD = this.f11243a.d(i10);
            if (bD == null) {
                return null;
            }
            return bD.r1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f11243a.f(i10, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends a {
        b(C c10) {
            super(c10);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f11243a.a(i10, B.s1(accessibilityNodeInfo), str, bundle);
        }
    }

    public C() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11242a = new b(this);
        } else {
            this.f11242a = new a(this);
        }
    }

    public B b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public B d(int i10) {
        return null;
    }

    public Object e() {
        return this.f11242a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public C(Object obj) {
        this.f11242a = obj;
    }

    public void a(int i10, B b10, String str, Bundle bundle) {
    }
}
