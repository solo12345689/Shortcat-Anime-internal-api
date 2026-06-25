package M9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.revenuecat.purchases.google.history.BillingConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f12311a = new i("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo(BillingConstants.VENDING_PACKAGE, 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(BillingConstants.VENDING_PACKAGE, 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    f12311a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature signature : signatureArr) {
                        String strA = v.a(signature.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                            return true;
                        }
                        String str = Build.TAGS;
                        if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
