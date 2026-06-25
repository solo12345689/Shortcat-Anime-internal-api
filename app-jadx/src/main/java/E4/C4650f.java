package e4;

import a4.C2567b;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import c4.InterfaceC3075c;
import c4.d;
import c4.j;
import c4.k;
import c4.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: e4.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4650f {

    /* JADX INFO: renamed from: a */
    public static final C4650f f45809a = new C4650f();

    private C4650f() {
    }

    private final boolean d(k kVar, C2567b c2567b) {
        Rect rectA = kVar.a();
        if (c2567b.e()) {
            return false;
        }
        if (c2567b.d() != rectA.width() && c2567b.a() != rectA.height()) {
            return false;
        }
        if (c2567b.d() >= rectA.width() || c2567b.a() >= rectA.height()) {
            return (c2567b.d() == rectA.width() && c2567b.a() == rectA.height()) ? false : true;
        }
        return false;
    }

    public final InterfaceC3075c a(k windowMetrics, FoldingFeature oemFeature) {
        d.b bVarA;
        InterfaceC3075c.C0564c c0564c;
        AbstractC5504s.h(windowMetrics, "windowMetrics");
        AbstractC5504s.h(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = d.b.f33476b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f33476b.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            c0564c = InterfaceC3075c.C0564c.f33469c;
        } else {
            if (state != 2) {
                return null;
            }
            c0564c = InterfaceC3075c.C0564c.f33470d;
        }
        Rect bounds = oemFeature.getBounds();
        AbstractC5504s.g(bounds, "oemFeature.bounds");
        if (!d(windowMetrics, new C2567b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        AbstractC5504s.g(bounds2, "oemFeature.bounds");
        return new c4.d(new C2567b(bounds2), bVarA, c0564c);
    }

    public final j b(Context context, WindowLayoutInfo info) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(info, "info");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return c(m.f33510b.a(context), info);
        }
        if (i10 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return c(m.f33510b.b((Activity) context), info);
    }

    public final j c(k windowMetrics, WindowLayoutInfo info) {
        InterfaceC3075c interfaceC3075cA;
        AbstractC5504s.h(windowMetrics, "windowMetrics");
        AbstractC5504s.h(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        AbstractC5504s.g(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                C4650f c4650f = f45809a;
                AbstractC5504s.g(feature, "feature");
                interfaceC3075cA = c4650f.a(windowMetrics, feature);
            } else {
                interfaceC3075cA = null;
            }
            if (interfaceC3075cA != null) {
                arrayList.add(interfaceC3075cA);
            }
        }
        return new j(arrayList);
    }
}
