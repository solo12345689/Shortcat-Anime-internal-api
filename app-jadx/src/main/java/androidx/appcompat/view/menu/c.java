package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    Context f24712a;

    /* JADX INFO: renamed from: b */
    LayoutInflater f24713b;

    /* JADX INFO: renamed from: c */
    e f24714c;

    /* JADX INFO: renamed from: d */
    ExpandedMenuView f24715d;

    /* JADX INFO: renamed from: e */
    int f24716e;

    /* JADX INFO: renamed from: f */
    int f24717f;

    /* JADX INFO: renamed from: g */
    int f24718g;

    /* JADX INFO: renamed from: h */
    private j.a f24719h;

    /* JADX INFO: renamed from: i */
    a f24720i;

    /* JADX INFO: renamed from: j */
    private int f24721j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        private int f24722a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarX = c.this.f24714c.x();
            if (gVarX != null) {
                ArrayList arrayListB = c.this.f24714c.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListB.get(i10)) == gVarX) {
                        this.f24722a = i10;
                        return;
                    }
                }
            }
            this.f24722a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b */
        public g getItem(int i10) {
            ArrayList arrayListB = c.this.f24714c.B();
            int i11 = i10 + c.this.f24716e;
            int i12 = this.f24722a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f24714c.B().size() - c.this.f24716e;
            return this.f24722a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f24713b.inflate(cVar.f24718g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f24712a = context;
        this.f24713b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z10) {
        j.a aVar = this.f24719h;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f24720i == null) {
            this.f24720i = new a();
        }
        return this.f24720i;
    }

    public k c(ViewGroup viewGroup) {
        if (this.f24715d == null) {
            this.f24715d = (ExpandedMenuView) this.f24713b.inflate(i.g.f48096g, viewGroup, false);
            if (this.f24720i == null) {
                this.f24720i = new a();
            }
            this.f24715d.setAdapter((ListAdapter) this.f24720i);
            this.f24715d.setOnItemClickListener(this);
        }
        return this.f24715d;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f24719h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f24719h;
        if (aVar == null) {
            return true;
        }
        aVar.b(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f24721j;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        if (this.f24715d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        a aVar = this.f24720i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        if (this.f24717f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f24717f);
            this.f24712a = contextThemeWrapper;
            this.f24713b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f24712a != null) {
            this.f24712a = context;
            if (this.f24713b == null) {
                this.f24713b = LayoutInflater.from(context);
            }
        }
        this.f24714c = eVar;
        a aVar = this.f24720i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f24715d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f24715d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f24714c.P(this.f24720i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f24718g = i10;
        this.f24717f = i11;
    }
}
