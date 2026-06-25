package K8;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c */
    private static final Lock f10944c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    private static c f10945d;

    /* JADX INFO: renamed from: a */
    private final Lock f10946a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    private final SharedPreferences f10947b;

    c(Context context) {
        this.f10947b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        AbstractC2115p.l(context);
        Lock lock = f10944c;
        lock.lock();
        try {
            if (f10945d == null) {
                f10945d = new c(context.getApplicationContext());
            }
            c cVar = f10945d;
            lock.unlock();
            return cVar;
        } catch (Throwable th2) {
            f10944c.unlock();
            throw th2;
        }
    }

    private static final String i(String str, String str2) {
        return str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2;
    }

    public void a() {
        this.f10946a.lock();
        try {
            this.f10947b.edit().clear().apply();
        } finally {
            this.f10946a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInAccount", strG2))) != null) {
            try {
                return GoogleSignInAccount.A(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInOptions", strG2))) != null) {
            try {
                return GoogleSignInOptions.x(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC2115p.l(googleSignInAccount);
        AbstractC2115p.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.B());
        AbstractC2115p.l(googleSignInAccount);
        AbstractC2115p.l(googleSignInOptions);
        String strB = googleSignInAccount.B();
        h(i("googleSignInAccount", strB), googleSignInAccount.W());
        h(i("googleSignInOptions", strB), googleSignInOptions.B());
    }

    protected final String g(String str) {
        this.f10946a.lock();
        try {
            return this.f10947b.getString(str, null);
        } finally {
            this.f10946a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f10946a.lock();
        try {
            this.f10947b.edit().putString(str, str2).apply();
        } finally {
            this.f10946a.unlock();
        }
    }
}
