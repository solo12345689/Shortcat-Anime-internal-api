package Nd;

import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.browser.customtabs.d c() {
        androidx.browser.customtabs.d dVarA = new d.C0430d().a();
        AbstractC5504s.g(dVarA, "build(...)");
        dVarA.f25542a.setData(Uri.parse("https://expo.dev"));
        return dVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent d() {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        return intent;
    }
}
