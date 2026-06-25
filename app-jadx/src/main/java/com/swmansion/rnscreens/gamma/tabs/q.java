package com.swmansion.rnscreens.gamma.tabs;

import Ud.AbstractC2279u;
import android.view.Menu;
import android.view.MenuItem;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f44623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f44624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f44625c;

    public q(androidx.appcompat.view.d context, com.google.android.material.bottomnavigation.c bottomNavigationView, List tabScreenFragments) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(bottomNavigationView, "bottomNavigationView");
        AbstractC5504s.h(tabScreenFragments, "tabScreenFragments");
        this.f44623a = bottomNavigationView;
        this.f44624b = tabScreenFragments;
        this.f44625c = new p(context, bottomNavigationView);
    }

    private final void b() {
        Menu menu = this.f44623a.getMenu();
        AbstractC5504s.g(menu, "getMenu(...)");
        if (menu.size() != this.f44624b.size()) {
            this.f44623a.getMenu().clear();
        }
        int i10 = 0;
        for (Object obj : this.f44624b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            e eVar = (e) obj;
            Menu menu2 = this.f44623a.getMenu();
            AbstractC5504s.g(menu2, "getMenu(...)");
            MenuItem menuItemB = r.b(menu2, i10, eVar.w());
            if (menuItemB.getItemId() != i10) {
                throw new IllegalStateException("[RNScreens] Illegal state: menu items are shuffled");
            }
            a(menuItemB, eVar.w());
            i10 = i11;
        }
    }

    public final void a(MenuItem menuItem, a tabScreen) {
        AbstractC5504s.h(menuItem, "menuItem");
        AbstractC5504s.h(tabScreen, "tabScreen");
        this.f44625c.d(menuItem, tabScreen);
        this.f44625c.b(menuItem, tabScreen);
    }

    public final void c(l tabsHost) {
        AbstractC5504s.h(tabsHost, "tabsHost");
        this.f44625c.e(tabsHost);
        b();
        this.f44625c.c(tabsHost);
    }
}
