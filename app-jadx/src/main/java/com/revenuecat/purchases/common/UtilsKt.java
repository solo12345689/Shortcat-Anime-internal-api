package com.revenuecat.purchases.common;

import Df.C1271d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.google.history.BillingConstants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0005H\u0000\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0002\u001a\f\u0010\u0013\u001a\u00020\b*\u00020\bH\u0007\u001a\f\u0010\u0014\u001a\u00020\b*\u00020\bH\u0007\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u001a\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0015"}, d2 = {"canUsePaywallUI", "", "getCanUsePaywallUI", "()Z", "isDeviceProtectedStorageCompat", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "playServicesVersionName", "", "getPlayServicesVersionName", "(Landroid/content/Context;)Ljava/lang/String;", "playStoreVersionName", "getPlayStoreVersionName", "versionName", "getVersionName", "getLocale", "Ljava/util/Locale;", "packageVersionName", "packageName", "sha1", SigningManager.POST_PARAMS_ALGORITHM, "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UtilsKt {
    public static final boolean getCanUsePaywallUI() {
        return true;
    }

    public static final Locale getLocale(Context context) {
        AbstractC5504s.h(context, "<this>");
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static final String getPlayServicesVersionName(Context context) {
        AbstractC5504s.h(context, "<this>");
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final String getPlayStoreVersionName(Context context) {
        AbstractC5504s.h(context, "<this>");
        return packageVersionName(context, BillingConstants.VENDING_PACKAGE);
    }

    public static final String getVersionName(Context context) {
        AbstractC5504s.h(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    public static final boolean isDeviceProtectedStorageCompat(Context context) {
        AbstractC5504s.h(context, "<this>");
        return context.isDeviceProtectedStorage();
    }

    private static final String packageVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String sha1(String str) throws NoSuchAlgorithmException {
        AbstractC5504s.h(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = C1271d.f3718b;
        byte[] bytes = str.getBytes(charset);
        AbstractC5504s.g(bytes, "getBytes(...)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        AbstractC5504s.g(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }

    public static final String sha256(String str) throws NoSuchAlgorithmException {
        AbstractC5504s.h(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = C1271d.f3718b;
        byte[] bytes = str.getBytes(charset);
        AbstractC5504s.g(bytes, "getBytes(...)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        AbstractC5504s.g(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }
}
