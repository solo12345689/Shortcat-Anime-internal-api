package com.swmansion.rnscreens.gamma.tabs;

import Ud.AbstractC2279u;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f44619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f44620b;

    public o(com.google.android.material.bottomnavigation.c bottomNavigationView, List tabScreenFragments) {
        AbstractC5504s.h(bottomNavigationView, "bottomNavigationView");
        AbstractC5504s.h(tabScreenFragments, "tabScreenFragments");
        this.f44619a = bottomNavigationView;
        this.f44620b = tabScreenFragments;
    }

    public final void a() {
        int i10 = 0;
        for (Object obj : this.f44620b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            Menu menu = this.f44619a.getMenu();
            AbstractC5504s.g(menu, "getMenu(...)");
            b(menu.getItem(i10), ((e) obj).w());
            i10 = i11;
        }
    }

    public final void b(MenuItem menuItem, a tabScreen) {
        AbstractC5504s.h(menuItem, "menuItem");
        AbstractC5504s.h(tabScreen, "tabScreen");
        com.google.android.material.navigation.e eVar = (com.google.android.material.navigation.e) this.f44619a.findViewById(menuItem.getItemId());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(tabScreen.getTabBarItemAccessibilityLabel());
        }
        eVar.setTag(tabScreen.getTabBarItemTestID());
    }
}
