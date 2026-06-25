package com.swmansion.rnscreens.gamma.tabs;

import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuItem b(Menu menu, int i10, a aVar) {
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem != null) {
            return menuItemFindItem;
        }
        MenuItem menuItemAdd = menu.add(0, i10, 0, aVar.getTabTitle());
        AbstractC5504s.g(menuItemAdd, "add(...)");
        return menuItemAdd;
    }
}
