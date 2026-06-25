package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.view.menu.e f42690a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42692c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42693d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42694e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f42691b = new ArrayList();

    g(androidx.appcompat.view.menu.e eVar) {
        this.f42690a = eVar;
        f();
    }

    public int a() {
        return this.f42692c;
    }

    public MenuItem b(int i10) {
        return (MenuItem) this.f42691b.get(i10);
    }

    public int c() {
        return this.f42693d;
    }

    public int d() {
        return this.f42694e;
    }

    public boolean e(MenuItem menuItem, androidx.appcompat.view.menu.j jVar, int i10) {
        return this.f42690a.P(menuItem, jVar, i10);
    }

    public void f() {
        this.f42691b.clear();
        this.f42692c = 0;
        this.f42693d = 0;
        this.f42694e = 0;
        for (int i10 = 0; i10 < this.f42690a.size(); i10++) {
            MenuItem item = this.f42690a.getItem(i10);
            if (item.hasSubMenu()) {
                if (!this.f42691b.isEmpty()) {
                    if (!(this.f42691b.get(r3.size() - 1) instanceof a) && item.isVisible()) {
                        this.f42691b.add(new a());
                    }
                }
                this.f42691b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i11 = 0; i11 < subMenu.size(); i11++) {
                    MenuItem item2 = subMenu.getItem(i11);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f42691b.add(item2);
                    this.f42692c++;
                    if (item2.isVisible()) {
                        this.f42693d++;
                    }
                }
                this.f42691b.add(new a());
            } else {
                this.f42691b.add(item);
                this.f42692c++;
                if (item.isVisible()) {
                    this.f42693d++;
                    this.f42694e++;
                }
            }
        }
        if (this.f42691b.isEmpty()) {
            return;
        }
        if (this.f42691b.get(r0.size() - 1) instanceof a) {
            this.f42691b.remove(r0.size() - 1);
        }
    }

    public int g() {
        return this.f42691b.size();
    }
}
