package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import o9.AbstractC5844g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class u extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f42456d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends RecyclerView.E {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final TextView f42457u;

        a(TextView textView) {
            super(textView);
            this.f42457u = textView;
        }
    }

    u(i iVar) {
        this.f42456d = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f42456d.H().l();
    }

    int v(int i10) {
        return i10 - this.f42456d.H().k().f42432c;
    }

    int w(int i10) {
        return this.f42456d.H().k().f42432c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void k(a aVar, int i10) {
        int iW = w(i10);
        aVar.f42457u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iW)));
        TextView textView = aVar.f42457u;
        textView.setContentDescription(e.e(textView.getContext(), iW));
        c cVarI = this.f42456d.I();
        if (t.g().get(1) == iW) {
            b bVar = cVarI.f42342f;
        } else {
            b bVar2 = cVarI.f42340d;
        }
        this.f42456d.K();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a m(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5844g.f54835s, viewGroup, false));
    }
}
