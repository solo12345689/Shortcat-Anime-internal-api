package d1;

import U0.AbstractC2207j;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class n extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2207j f44966a;

    public n(AbstractC2207j abstractC2207j) {
        this.f44966a = abstractC2207j;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f44966a.a();
    }
}
