package expo.modules.webbrowser;

import Ud.AbstractC2279u;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import sb.g;
import sb.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/webbrowser/WebBrowserPackage;", "Lsb/g;", "<init>", "()V", "Landroid/content/Context;", "activityContext", "", "Lsb/i;", "b", "(Landroid/content/Context;)Ljava/util/List;", "expo-web-browser_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebBrowserPackage implements g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i {
        a() {
        }

        @Override // sb.i
        public boolean onNewIntent(Intent intent) {
            BrowserProxyActivity browserProxyActivity;
            AbstractC5504s.h(intent, "intent");
            if (!AbstractC5504s.c(intent.getAction(), "android.intent.action.VIEW") || (browserProxyActivity = (BrowserProxyActivity) BrowserProxyActivity.INSTANCE.a().get()) == null || browserProxyActivity.isFinishing()) {
                return false;
            }
            browserProxyActivity.finishAndRemoveTask();
            return false;
        }
    }

    @Override // sb.g
    public List b(Context activityContext) {
        return AbstractC2279u.e(new a());
    }
}
