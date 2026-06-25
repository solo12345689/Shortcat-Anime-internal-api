package androidx.compose.ui.platform;

import U0.C2197e;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2713l implements InterfaceC2733t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClipboardManager f27480a;

    public C2713l(ClipboardManager clipboardManager) {
        this.f27480a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2733t0
    public void a(C2197e c2197e) {
        this.f27480a.setPrimaryClip(ClipData.newPlainText("plain text", AbstractC2716m.b(c2197e)));
    }

    @Override // androidx.compose.ui.platform.InterfaceC2733t0
    public boolean b() {
        ClipDescription primaryClipDescription = this.f27480a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2733t0
    public C2197e getText() {
        ClipData primaryClip = this.f27480a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AbstractC2716m.a(itemAt != null ? itemAt.getText() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2713l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
