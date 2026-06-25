package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import c7.f;
import com.facebook.react.AbstractC3246k;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3249n;
import com.facebook.react.AbstractC3251p;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements c7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K1.h f36818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f36819b;

    public s0(K1.h contextSupplier) {
        AbstractC5504s.h(contextSupplier, "contextSupplier");
        this.f36818a = contextSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(s0 s0Var) {
        Dialog dialog = s0Var.f36819b;
        if (dialog != null) {
            dialog.dismiss();
        }
        s0Var.f36819b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(s0 s0Var, String str, final f.a aVar) {
        Dialog dialog = s0Var.f36819b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) s0Var.f36818a.get();
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC3249n.f37099d, (ViewGroup) null);
        AbstractC5504s.g(viewInflate, "inflate(...)");
        viewInflate.findViewById(AbstractC3247l.f36919m).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.g(aVar, view);
            }
        });
        ((TextView) viewInflate.findViewById(AbstractC3247l.f36920n)).setText(str);
        Dialog dialog2 = new Dialog(context, AbstractC3251p.f37151a);
        dialog2.setContentView(viewInflate);
        dialog2.setCancelable(false);
        s0Var.f36819b = dialog2;
        Window window = dialog2.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            AbstractC5504s.g(attributes, "getAttributes(...)");
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(0.0f);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(AbstractC3246k.f36899a);
        }
        Dialog dialog3 = s0Var.f36819b;
        if (dialog3 != null) {
            dialog3.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(f.a aVar, View view) {
        aVar.onResume();
    }

    @Override // c7.i
    public void f() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.q0
            @Override // java.lang.Runnable
            public final void run() {
                s0.d(this.f36810a);
            }
        });
    }

    @Override // c7.i
    public void h(final String message, final f.a listener) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(listener, "listener");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.p0
            @Override // java.lang.Runnable
            public final void run() {
                s0.e(this.f36806a, message, listener);
            }
        });
    }
}
