package L1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: L1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1864a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f11245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11246c;

    public C1864a(int i10, B b10, int i11) {
        this.f11244a = i10;
        this.f11245b = b10;
        this.f11246c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f11244a);
        this.f11245b.n0(this.f11246c, bundle);
    }
}
