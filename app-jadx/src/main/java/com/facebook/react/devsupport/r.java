package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.AbstractC3249n;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements c7.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36811d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f36812e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f36813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f36814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PopupWindow f36815c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r(u0 reactInstanceDevHelper) {
        AbstractC5504s.h(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.f36813a = reactInstanceDevHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(r rVar) {
        rVar.j();
    }

    private final void j() {
        PopupWindow popupWindow = this.f36815c;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.f36815c = null;
            this.f36814b = null;
        }
    }

    private final void k(String str, Double d10, Double d11) {
        PopupWindow popupWindow = this.f36815c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity activityA = this.f36813a.a();
            if (activityA == null) {
                AbstractC7283a.m("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                activityA.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i10 = rect.top;
                Object systemService = activityA.getSystemService("layout_inflater");
                AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(AbstractC3249n.f37097b, (ViewGroup) null);
                AbstractC5504s.f(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewInflate;
                textView.setText(str);
                if (d10 != null) {
                    textView.setTextColor((int) d10.doubleValue());
                }
                if (d11 != null) {
                    textView.setBackgroundColor((int) d11.doubleValue());
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r.l(this.f36809a, view);
                    }
                });
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.showAtLocation(activityA.getWindow().getDecorView(), 0, 0, i10);
                this.f36814b = textView;
                this.f36815c = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                AbstractC7283a.m("ReactNative", "Unable to display loading message because react activity isn't active, message: " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(r rVar, View view) {
        rVar.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(r rVar, String str, Double d10, Double d11) {
        rVar.k(str, d10, d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Integer num, Integer num2, r rVar, String str) {
        String str2;
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = "";
        } else {
            kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((num.intValue() / num2.intValue()) * 100)}, 1));
            AbstractC5504s.g(str2, "format(...)");
        }
        TextView textView = rVar.f36814b;
        if (textView != null) {
            if (str == null) {
                str = "Loading";
            }
            textView.setText(str + str2 + "…");
        }
    }

    @Override // c7.d
    public void a() {
        if (f36812e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.o
                @Override // java.lang.Runnable
                public final void run() {
                    r.i(this.f36798a);
                }
            });
        }
    }

    @Override // c7.d
    public void b(String message) {
        AbstractC5504s.h(message, "message");
        c(message, null, null);
    }

    @Override // c7.d
    public void c(final String message, final Double d10, final Double d11) {
        AbstractC5504s.h(message, "message");
        if (f36812e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.n
                @Override // java.lang.Runnable
                public final void run() {
                    r.m(this.f36790a, message, d10, d11);
                }
            });
        }
    }

    @Override // c7.d
    public void d(final String str, final Integer num, final Integer num2) {
        if (f36812e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.p
                @Override // java.lang.Runnable
                public final void run() {
                    r.n(num, num2, this, str);
                }
            });
        }
    }
}
