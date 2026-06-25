package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import o9.AbstractC5842e;
import o9.AbstractC5844g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class o extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f42443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i.m f42444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42445f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f42446a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f42446a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f42446a.getAdapter().p(i10)) {
                o.this.f42444e.a(this.f42446a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends RecyclerView.E {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final TextView f42448u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final MaterialCalendarGridView f42449v;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(AbstractC5842e.f54808u);
            this.f42448u = textView;
            AbstractC2747a0.l0(textView, true);
            this.f42449v = (MaterialCalendarGridView) linearLayout.findViewById(AbstractC5842e.f54804q);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    o(Context context, d dVar, com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        m mVarK = aVar.k();
        m mVarG = aVar.g();
        m mVarJ = aVar.j();
        if (mVarK.compareTo(mVarJ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (mVarJ.compareTo(mVarG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f42445f = (n.f42437e * i.L(context)) + (k.X(context) ? i.L(context) : 0);
        this.f42443d = aVar;
        this.f42444e = mVar;
        t(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b m(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5844g.f54833q, viewGroup, false);
        if (!k.X(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f42445f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f42443d.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i10) {
        return this.f42443d.k().w(i10).s();
    }

    m w(int i10) {
        return this.f42443d.k().w(i10);
    }

    CharSequence x(int i10) {
        return w(i10).r();
    }

    int y(m mVar) {
        return this.f42443d.k().x(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void k(b bVar, int i10) {
        m mVarW = this.f42443d.k().w(i10);
        bVar.f42448u.setText(mVarW.r());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f42449v.findViewById(AbstractC5842e.f54804q);
        if (materialCalendarGridView.getAdapter() == null || !mVarW.equals(materialCalendarGridView.getAdapter().f42439a)) {
            n nVar = new n(mVarW, null, this.f42443d, null);
            materialCalendarGridView.setNumColumns(mVarW.f42433d);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }
}
