package G8;

import R8.AbstractC2107h;
import R8.AbstractC2115p;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.internal.auth.AbstractBinderC3365k0;
import com.google.android.gms.internal.auth.AbstractC3384q1;
import com.google.android.gms.internal.auth.C3352g;
import com.google.android.gms.internal.auth.EnumC3358i;
import com.google.android.gms.internal.auth.I1;
import com.google.android.gms.internal.auth.InterfaceC3342c1;
import com.google.android.gms.internal.auth.L1;
import com.google.android.gms.internal.auth.M;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import n9.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f7420a = {"com.google", "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7421b = "androidPackageName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ComponentName f7422c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final U8.a f7423d = d.a("GoogleAuthUtil");

    public static void a(Context context, String str) throws a, IOException {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0L, null).c();
    }

    public static TokenData d(final Context context, final Account account, final String str, Bundle bundle, long j10, Executor executor) throws a, IOException {
        AbstractC2115p.k("Calling this from your main thread can lead to deadlock");
        AbstractC2115p.g(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        M.d(context);
        if (L1.c() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(AbstractC3384q1.a(context).f(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (P8.b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f7422c, new h() { // from class: G8.f
            @Override // G8.h
            public final Object a(IBinder iBinder) {
                return i.e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws IOException {
        Bundle bundleT1 = AbstractBinderC3365k0.e(iBinder).T1(account, str, bundle);
        if (bundleT1 != null) {
            return h(context, "getTokenWithDetails", bundleT1);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object f(Object obj) throws IOException {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j10) throws a, IOException {
        AbstractC2115p.k("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        M.d(context);
        if (L1.c() && q(context)) {
            InterfaceC3342c1 interfaceC3342c1A = AbstractC3384q1.a(context);
            C3352g c3352g = new C3352g();
            c3352g.c(str);
            try {
                j(interfaceC3342c1A.d(c3352g), "clear token");
                return;
            } catch (P8.b e10) {
                m(e10, "clear token");
            }
        }
        i(context, f7422c, new g(str, bundle), 0L, null);
    }

    private static TokenData h(Context context, String str, Bundle bundle) throws a, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new a("Invalid state. Shouldn't happen");
    }

    private static Object i(Context context, ComponentName componentName, h hVar, long j10, Executor executor) throws IOException {
        O8.a aVar = new O8.a();
        AbstractC2107h abstractC2107hB = AbstractC2107h.b(context);
        try {
            try {
                if (!abstractC2107hB.a(componentName, aVar, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return hVar.a(aVar.a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                abstractC2107hB.d(componentName, aVar, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(n9.i iVar, String str) throws P8.b, IOException {
        try {
            return l.a(iVar);
        } catch (InterruptedException e10) {
            String str2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f7423d.e(str2, new Object[0]);
            throw new IOException(str2, e10);
        } catch (CancellationException e11) {
            String str3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f7423d.e(str3, new Object[0]);
            throw new IOException(str3, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof P8.b) {
                throw ((P8.b) cause);
            }
            String str4 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f7423d.e(str4, new Object[0]);
            throw new IOException(str4, e12);
        }
    }

    private static Object k(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        f7423d.e("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) throws a {
        try {
            com.google.android.gms.common.d.a(context.getApplicationContext(), i10);
        } catch (O8.g | GooglePlayServicesIncorrectManifestValueException e10) {
            throw new a(e10.getMessage(), e10);
        } catch (O8.h e11) {
            throw new c(e11.b(), e11.getMessage(), e11.a());
        }
    }

    private static void m(P8.b bVar, String str) {
        f7423d.e("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f7421b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws a, IOException {
        EnumC3358i enumC3358iA = EnumC3358i.a(str2);
        U8.a aVar = f7423d;
        aVar.e(String.format("[GoogleAuthUtil] error status:%s with method:%s", enumC3358iA, str), new Object[0]);
        if (!EnumC3358i.BAD_AUTHENTICATION.equals(enumC3358iA) && !EnumC3358i.CAPTCHA.equals(enumC3358iA) && !EnumC3358i.NEED_PERMISSION.equals(enumC3358iA) && !EnumC3358i.NEED_REMOTE_CONSENT.equals(enumC3358iA) && !EnumC3358i.NEEDS_BROWSER.equals(enumC3358iA) && !EnumC3358i.USER_CANCEL.equals(enumC3358iA) && !EnumC3358i.DEVICE_MANAGEMENT_REQUIRED.equals(enumC3358iA) && !EnumC3358i.DM_INTERNAL_ERROR.equals(enumC3358iA) && !EnumC3358i.DM_SYNC_DISABLED.equals(enumC3358iA) && !EnumC3358i.DM_ADMIN_BLOCKED.equals(enumC3358iA) && !EnumC3358i.DM_ADMIN_PENDING_APPROVAL.equals(enumC3358iA) && !EnumC3358i.DM_STALE_SYNC_REQUIRED.equals(enumC3358iA) && !EnumC3358i.DM_DEACTIVATED.equals(enumC3358iA) && !EnumC3358i.DM_REQUIRED.equals(enumC3358iA) && !EnumC3358i.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC3358iA) && !EnumC3358i.DM_SCREENLOCK_REQUIRED.equals(enumC3358iA)) {
            if (!EnumC3358i.NETWORK_ERROR.equals(enumC3358iA) && !EnumC3358i.SERVICE_UNAVAILABLE.equals(enumC3358iA) && !EnumC3358i.INTNERNAL_ERROR.equals(enumC3358iA) && !EnumC3358i.AUTH_SECURITY_ERROR.equals(enumC3358iA) && !EnumC3358i.ACCOUNT_NOT_PRESENT.equals(enumC3358iA)) {
                throw new a(str2);
            }
            throw new IOException(str2);
        }
        M.d(context);
        if (!I1.b()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (C3333a.n().a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            aVar.b(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, str, Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            aVar.b(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f7420a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean q(Context context) {
        if (C3333a.n().h(context, 17895000) != 0) {
            return false;
        }
        List listS = L1.a().s();
        String str = context.getApplicationInfo().packageName;
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
