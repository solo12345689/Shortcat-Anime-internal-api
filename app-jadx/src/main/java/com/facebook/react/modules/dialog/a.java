package com.facebook.react.modules.dialog;

import L1.B;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3249n;
import com.facebook.react.modules.dialog.DialogModule;
import i.j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B!\b\u0011\u0012\f\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/modules/dialog/a;", "Landroidx/fragment/app/o;", "Landroid/content/DialogInterface$OnClickListener;", "<init>", "()V", "Lcom/facebook/react/modules/dialog/DialogModule$a;", "Lcom/facebook/react/modules/dialog/DialogModule;", "listener", "Landroid/os/Bundle;", "arguments", "(Lcom/facebook/react/modules/dialog/DialogModule$a;Landroid/os/Bundle;)V", "savedInstanceState", "Landroid/app/Dialog;", "E", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "", "which", "LTd/L;", "onClick", "(Landroid/content/DialogInterface;I)V", "onDismiss", "(Landroid/content/DialogInterface;)V", "q", "Lcom/facebook/react/modules/dialog/DialogModule$a;", "r", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends DialogInterfaceOnCancelListenerC2836o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final DialogModule.a listener;

    /* JADX INFO: renamed from: com.facebook.react.modules.dialog.a$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.react.modules.dialog.a$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0619a extends C2746a {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ TextView f37025d;

            C0619a(TextView textView) {
                this.f37025d = textView;
            }

            @Override // androidx.core.view.C2746a
            public void g(View view, B info) {
                AbstractC5504s.h(view, "view");
                AbstractC5504s.h(info, "info");
                super.g(this.f37025d, info);
                info.L0(true);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Dialog a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
            b.a aVar = new b.a(context);
            if (bundle.containsKey(com.amazon.a.a.o.b.f34626S)) {
                String str = (String) Q6.a.c(bundle.getString(com.amazon.a.a.o.b.f34626S));
                AbstractC5504s.e(str);
                aVar.b(d(context, str));
            }
            if (bundle.containsKey("button_positive")) {
                aVar.i(bundle.getString("button_positive"), onClickListener);
            }
            if (bundle.containsKey("button_negative")) {
                aVar.f(bundle.getString("button_negative"), onClickListener);
            }
            if (bundle.containsKey("button_neutral")) {
                aVar.g(bundle.getString("button_neutral"), onClickListener);
            }
            if (bundle.containsKey("message")) {
                aVar.e(bundle.getString("message"));
            }
            if (bundle.containsKey("items")) {
                aVar.d(bundle.getCharSequenceArray("items"), onClickListener);
            }
            androidx.appcompat.app.b bVarCreate = aVar.create();
            AbstractC5504s.g(bVarCreate, "create(...)");
            return bVarCreate;
        }

        private final Dialog b(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            if (bundle.containsKey(com.amazon.a.a.o.b.f34626S)) {
                String str = (String) Q6.a.c(bundle.getString(com.amazon.a.a.o.b.f34626S));
                AbstractC5504s.e(str);
                builder.setCustomTitle(d(context, str));
            }
            if (bundle.containsKey("button_positive")) {
                builder.setPositiveButton(bundle.getString("button_positive"), onClickListener);
            }
            if (bundle.containsKey("button_negative")) {
                builder.setNegativeButton(bundle.getString("button_negative"), onClickListener);
            }
            if (bundle.containsKey("button_neutral")) {
                builder.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
            }
            if (bundle.containsKey("message")) {
                builder.setMessage(bundle.getString("message"));
            }
            if (bundle.containsKey("items")) {
                builder.setItems(bundle.getCharSequenceArray("items"), onClickListener);
            }
            AlertDialog alertDialogCreate = builder.create();
            AbstractC5504s.g(alertDialogCreate, "create(...)");
            return alertDialogCreate;
        }

        private final View d(Context context, String str) {
            View viewInflate = LayoutInflater.from(context).inflate(AbstractC3249n.f37096a, (ViewGroup) null);
            AbstractC5504s.g(viewInflate, "inflate(...)");
            Object objC = Q6.a.c(viewInflate.findViewById(AbstractC3247l.f36918l));
            AbstractC5504s.g(objC, "assertNotNull(...)");
            TextView textView = (TextView) objC;
            textView.setText(str);
            textView.setFocusable(true);
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setAccessibilityHeading(true);
                return viewInflate;
            }
            AbstractC2747a0.k0(textView, new C0619a(textView));
            return viewInflate;
        }

        private final boolean e(Context context) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(j.f48379y0);
            AbstractC5504s.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(j.f48146D0);
            typedArrayObtainStyledAttributes.recycle();
            return zHasValue;
        }

        public final Dialog c(Context activityContext, Bundle arguments, DialogInterface.OnClickListener fragment) {
            AbstractC5504s.h(activityContext, "activityContext");
            AbstractC5504s.h(arguments, "arguments");
            AbstractC5504s.h(fragment, "fragment");
            return e(activityContext) ? a(activityContext, arguments, fragment) : b(activityContext, arguments, fragment);
        }

        private Companion() {
        }
    }

    public a() {
        this.listener = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o
    public Dialog E(Bundle savedInstanceState) {
        Companion companion = INSTANCE;
        AbstractActivityC2842v abstractActivityC2842vRequireActivity = requireActivity();
        AbstractC5504s.g(abstractActivityC2842vRequireActivity, "requireActivity(...)");
        Bundle bundleRequireArguments = requireArguments();
        AbstractC5504s.g(bundleRequireArguments, "requireArguments(...)");
        return companion.c(abstractActivityC2842vRequireActivity, bundleRequireArguments, this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        AbstractC5504s.h(dialog, "dialog");
        DialogModule.a aVar = this.listener;
        if (aVar != null) {
            aVar.onClick(dialog, which);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC5504s.h(dialog, "dialog");
        super.onDismiss(dialog);
        DialogModule.a aVar = this.listener;
        if (aVar != null) {
            aVar.onDismiss(dialog);
        }
    }

    public a(DialogModule.a aVar, Bundle bundle) {
        this.listener = aVar;
        setArguments(bundle);
    }
}
