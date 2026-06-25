package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import o9.AbstractC5844g;
import o9.AbstractC5846i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class h extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42346d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f42347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42349c;

    static {
        f42346d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar calendarI = t.i();
        this.f42347a = calendarI;
        this.f42348b = calendarI.getMaximum(7);
        this.f42349c = calendarI.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f42349c;
        int i12 = this.f42348b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f42348b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f42348b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5844g.f54831o, viewGroup, false);
        }
        this.f42347a.set(7, b(i10));
        textView.setText(this.f42347a.getDisplayName(7, f42346d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(AbstractC5846i.f54859q), this.f42347a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = t.i();
        this.f42347a = calendarI;
        this.f42348b = calendarI.getMaximum(7);
        this.f42349c = i10;
    }
}
