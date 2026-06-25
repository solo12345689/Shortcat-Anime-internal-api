package com.swmansion.rnscreens.gamma.tabs;

import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.view.A;
import i.AbstractC4956a;
import kotlin.jvm.internal.AbstractC5504s;
import o9.AbstractC5838a;
import q9.C6164a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.view.d f44621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f44622b;

    public p(androidx.appcompat.view.d context, com.google.android.material.bottomnavigation.c bottomNavigationView) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(bottomNavigationView, "bottomNavigationView");
        this.f44621a = context;
        this.f44622b = bottomNavigationView;
    }

    private final int a(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f44621a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.data;
    }

    public final void b(MenuItem menuItem, a tabScreen) {
        AbstractC5504s.h(menuItem, "menuItem");
        AbstractC5504s.h(tabScreen, "tabScreen");
        Menu menu = this.f44622b.getMenu();
        AbstractC5504s.g(menu, "getMenu(...)");
        int iF = Cf.l.F(A.a(menu), menuItem);
        String badgeValue = tabScreen.getBadgeValue();
        if (badgeValue == null) {
            C6164a c6164aD = this.f44622b.d(iF);
            if (c6164aD != null) {
                c6164aD.X(false);
                return;
            }
            return;
        }
        Integer numR = Df.r.r(badgeValue);
        C6164a c6164aE = this.f44622b.e(iF);
        AbstractC5504s.g(c6164aE, "getOrCreateBadge(...)");
        c6164aE.X(true);
        c6164aE.f();
        c6164aE.e();
        if (numR != null) {
            c6164aE.V(numR.intValue());
        } else if (!AbstractC5504s.c(badgeValue, "")) {
            c6164aE.W(badgeValue);
        }
        Integer tabBarItemBadgeTextColor = tabScreen.getTabBarItemBadgeTextColor();
        c6164aE.U(tabBarItemBadgeTextColor != null ? tabBarItemBadgeTextColor.intValue() : a(AbstractC5838a.f54637h));
        Integer tabBarItemBadgeBackgroundColor = tabScreen.getTabBarItemBadgeBackgroundColor();
        c6164aE.S(tabBarItemBadgeBackgroundColor != null ? tabBarItemBadgeBackgroundColor.intValue() : a(AbstractC4956a.f47975v));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.swmansion.rnscreens.gamma.tabs.l r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.gamma.tabs.p.c(com.swmansion.rnscreens.gamma.tabs.l):void");
    }

    public final void d(MenuItem menuItem, a tabScreen) {
        AbstractC5504s.h(menuItem, "menuItem");
        AbstractC5504s.h(tabScreen, "tabScreen");
        if (!AbstractC5504s.c(menuItem.getTitle(), tabScreen.getTabTitle())) {
            menuItem.setTitle(tabScreen.getTabTitle());
        }
        if (AbstractC5504s.c(menuItem.getIcon(), tabScreen.getIcon())) {
            return;
        }
        menuItem.setIcon(tabScreen.getIcon());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.swmansion.rnscreens.gamma.tabs.l r6) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.gamma.tabs.p.e(com.swmansion.rnscreens.gamma.tabs.l):void");
    }
}
