package O8;

import R8.AbstractC2115p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Dialog f13047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f13048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f13049c;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) AbstractC2115p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f13047a = dialog2;
        if (onCancelListener != null) {
            bVar.f13048b = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13048b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13047a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f13049c == null) {
            this.f13049c = new AlertDialog.Builder((Context) AbstractC2115p.l(getActivity())).create();
        }
        return this.f13049c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
