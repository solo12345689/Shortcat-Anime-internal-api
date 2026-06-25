package com.revenuecat.purchases.ui.revenuecatui.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.browser.customtabs.d;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.extensions.UrisKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpener;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpeningMethod;", "method", "LTd/L;", "openURL$revenuecatui_defaultsBc8Release", "(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpeningMethod;)V", "openURL", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class URLOpener {
    public static final int $stable = 0;
    public static final URLOpener INSTANCE = new URLOpener();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[URLOpeningMethod.values().length];
            try {
                iArr[URLOpeningMethod.IN_APP_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[URLOpeningMethod.EXTERNAL_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[URLOpeningMethod.DEEP_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private URLOpener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openURL$handleException(Context context, Exception exc) {
        String string = exc instanceof ActivityNotFoundException ? context.getString(R.string.no_browser_cannot_open_link) : context.getString(R.string.cannot_open_link);
        AbstractC5504s.g(string, "if (exception is Activit…_open_link)\n            }");
        Toast.makeText(context, string, 0).show();
        Logger.INSTANCE.e(string, exc);
    }

    public final /* synthetic */ void openURL$revenuecatui_defaultsBc8Release(Context context, String url, URLOpeningMethod method) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(method, "method");
        int i10 = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                UrisKt.openUriOrElse(context, url, new URLOpener$openURL$1(context));
                return;
            }
            return;
        }
        androidx.browser.customtabs.d dVarA = new d.C0430d().a();
        AbstractC5504s.g(dVarA, "Builder()\n                    .build()");
        try {
            dVarA.a(context, Uri.parse(url));
        } catch (ActivityNotFoundException e10) {
            openURL$handleException(context, e10);
        } catch (IllegalArgumentException e11) {
            openURL$handleException(context, e11);
        }
    }
}
