package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class n extends BaseAdapter {

    /* JADX INFO: renamed from: e */
    static final int f42437e = t.i().getMaximum(4);

    /* JADX INFO: renamed from: f */
    private static final int f42438f = (t.i().getMaximum(5) + t.i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a */
    final m f42439a;

    /* JADX INFO: renamed from: b */
    private Collection f42440b;

    /* JADX INFO: renamed from: c */
    c f42441c;

    /* JADX INFO: renamed from: d */
    final a f42442d;

    n(m mVar, d dVar, a aVar, g gVar) {
        this.f42439a = mVar;
        this.f42442d = aVar;
        this.f42440b = dVar.v();
    }

    private String c(Context context, long j10) {
        return e.a(context, j10, j(j10), i(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f42441c == null) {
            this.f42441c = new c(context);
        }
    }

    private boolean h(long j10) {
        throw null;
    }

    private boolean j(long j10) {
        return t.g().getTimeInMillis() == j10;
    }

    private void m(TextView textView, long j10, int i10) {
        b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j10));
        if (this.f42442d.f().p(j10)) {
            textView.setEnabled(true);
            boolean zH = h(j10);
            textView.setSelected(zH);
            bVar = zH ? this.f42441c.f42338b : j(j10) ? this.f42441c.f42339c : this.f42441c.f42337a;
        } else {
            textView.setEnabled(false);
            bVar = this.f42441c.f42343g;
        }
        bVar.b(textView);
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (m.c(j10).equals(this.f42439a)) {
            int iQ = this.f42439a.q(j10);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iQ) - materialCalendarGridView.getFirstVisiblePosition()), j10, iQ);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f42439a.k(this.f42442d.h());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > k()) {
            return null;
        }
        return Long.valueOf(this.f42439a.m(l(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = o9.AbstractC5844g.f54830n
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.m r8 = r5.f42439a
            int r2 = r8.f42434e
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.m(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j10) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f42438f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f42439a.f42433d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j10) {
        throw null;
    }

    int k() {
        return (b() + this.f42439a.f42434e) - 1;
    }

    int l(int i10) {
        return (i10 - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f42440b.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    boolean p(int i10) {
        return i10 >= b() && i10 <= k();
    }
}
