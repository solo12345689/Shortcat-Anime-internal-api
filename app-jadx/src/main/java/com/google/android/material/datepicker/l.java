package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l<S> extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.material.datepicker.a f42428c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends p {
        a() {
        }
    }

    static l y(d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.setArguments(bundle);
        return lVar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f42427b = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f42428c = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f42427b));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f42427b);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f42428c);
    }
}
