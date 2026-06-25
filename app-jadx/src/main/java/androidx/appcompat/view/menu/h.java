package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import n.InterfaceC5708e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements InterfaceC5708e, j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f24793a;

    h() {
    }

    protected static d A(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (d) listAdapter;
    }

    protected static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    protected static boolean z(e eVar) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    public abstract void m(e eVar);

    protected boolean n() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        A(listAdapter).f24724a.P((MenuItem) listAdapter.getItem(i10), this, n() ? 0 : 4);
    }

    public Rect p() {
        return this.f24793a;
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.f24793a = rect;
    }

    public abstract void t(boolean z10);

    public abstract void u(int i10);

    public abstract void v(int i10);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z10);

    public abstract void y(int i10);

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
    }
}
