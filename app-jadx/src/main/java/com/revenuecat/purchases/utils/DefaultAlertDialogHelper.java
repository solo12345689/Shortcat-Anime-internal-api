package com.revenuecat.purchases.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultAlertDialogHelper;", "Lcom/revenuecat/purchases/utils/AlertDialogHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", com.amazon.a.a.o.b.f34626S, "message", "positiveButtonText", "negativeButtonText", "neutralButtonText", "Lkotlin/Function0;", "LTd/L;", "onPositiveButtonClicked", "onNegativeButtonClicked", "onNeutralButtonClicked", "showDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lie/a;Lie/a;Lie/a;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultAlertDialogHelper implements AlertDialogHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$0(InterfaceC5082a interfaceC5082a, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        interfaceC5082a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$1(InterfaceC5082a interfaceC5082a, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        interfaceC5082a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$2(InterfaceC5082a interfaceC5082a, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        interfaceC5082a.invoke();
    }

    @Override // com.revenuecat.purchases.utils.AlertDialogHelper
    public void showDialog(Activity activity, String title, String message, String positiveButtonText, String negativeButtonText, String neutralButtonText, final InterfaceC5082a onPositiveButtonClicked, final InterfaceC5082a onNegativeButtonClicked, final InterfaceC5082a onNeutralButtonClicked) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(title, "title");
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(positiveButtonText, "positiveButtonText");
        AbstractC5504s.h(negativeButtonText, "negativeButtonText");
        AbstractC5504s.h(neutralButtonText, "neutralButtonText");
        AbstractC5504s.h(onPositiveButtonClicked, "onPositiveButtonClicked");
        AbstractC5504s.h(onNegativeButtonClicked, "onNegativeButtonClicked");
        AbstractC5504s.h(onNeutralButtonClicked, "onNeutralButtonClicked");
        new AlertDialog.Builder(activity).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.revenuecat.purchases.utils.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DefaultAlertDialogHelper.showDialog$lambda$0(onPositiveButtonClicked, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.revenuecat.purchases.utils.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DefaultAlertDialogHelper.showDialog$lambda$1(onNegativeButtonClicked, dialogInterface, i10);
            }
        }).setNeutralButton(neutralButtonText, new DialogInterface.OnClickListener() { // from class: com.revenuecat.purchases.utils.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DefaultAlertDialogHelper.showDialog$lambda$2(onNeutralButtonClicked, dialogInterface, i10);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.revenuecat.purchases.utils.d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                onNeutralButtonClicked.invoke();
            }
        }).show();
    }
}
