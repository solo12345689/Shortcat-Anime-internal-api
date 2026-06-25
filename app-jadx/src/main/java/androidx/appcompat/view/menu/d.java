package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f24724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24725b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f24728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24729f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f24727d = z10;
        this.f24728e = layoutInflater;
        this.f24724a = eVar;
        this.f24729f = i10;
        a();
    }

    void a() {
        g gVarX = this.f24724a.x();
        if (gVarX != null) {
            ArrayList arrayListB = this.f24724a.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListB.get(i10)) == gVarX) {
                    this.f24725b = i10;
                    return;
                }
            }
        }
        this.f24725b = -1;
    }

    public e b() {
        return this.f24724a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListB = this.f24727d ? this.f24724a.B() : this.f24724a.G();
        int i11 = this.f24725b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f24726c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24725b < 0 ? (this.f24727d ? this.f24724a.B() : this.f24724a.G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f24728e.inflate(this.f24729f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f24724a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f24726c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
