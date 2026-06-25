package O8;

import R8.AbstractC2115p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o;
import androidx.fragment.app.K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends DialogInterfaceOnCancelListenerC2836o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Dialog f13061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DialogInterface.OnCancelListener f13062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Dialog f13063s;

    public static m N(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) AbstractC2115p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.f13061q = dialog2;
        if (onCancelListener != null) {
            mVar.f13062r = onCancelListener;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o
    public Dialog E(Bundle bundle) {
        Dialog dialog = this.f13061q;
        if (dialog != null) {
            return dialog;
        }
        K(false);
        if (this.f13063s == null) {
            this.f13063s = new AlertDialog.Builder((Context) AbstractC2115p.l(getContext())).create();
        }
        return this.f13063s;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o
    public void M(K k10, String str) {
        super.M(k10, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13062r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
