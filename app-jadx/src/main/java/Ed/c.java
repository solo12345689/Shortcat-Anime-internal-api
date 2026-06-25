package ed;

import Td.u;
import Td.v;
import Zd.k;
import ae.AbstractC2605b;
import android.R;
import android.content.Context;
import androidx.fragment.app.AbstractActivityC2842v;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.jvm.internal.AbstractC5504s;
import r.f;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractActivityC2842v f45915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f45916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f.d f45917c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends f.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Zd.e f45919b;

        a(Zd.e eVar) {
            this.f45919b = eVar;
        }

        @Override // r.f.a
        public void a(int i10, CharSequence errString) {
            AbstractC5504s.h(errString, "errString");
            super.a(i10, errString);
            String str = c.this.c(i10) + ". " + ((Object) errString);
            Zd.e eVar = this.f45919b;
            u.a aVar = u.f17466b;
            eVar.resumeWith(u.b(v.a(new C4668a(str, null, 2, null))));
        }

        @Override // r.f.a
        public void c(f.b result) {
            AbstractC5504s.h(result, "result");
            super.c(result);
            this.f45919b.resumeWith(u.b(result));
        }
    }

    public c(AbstractActivityC2842v currentActivity, Context context, String title) {
        AbstractC5504s.h(currentActivity, "currentActivity");
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(title, "title");
        this.f45915a = currentActivity;
        Executor executorH = AbstractC7194b.h(context);
        AbstractC5504s.g(executorH, "getMainExecutor(...)");
        this.f45916b = executorH;
        f.d dVarA = new f.d.a().c(title).b(context.getString(R.string.cancel)).a();
        AbstractC5504s.g(dVarA, "build(...)");
        this.f45917c = dVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(int i10) {
        switch (i10) {
            case 1:
                return "Hardware unavailable";
            case 2:
                return "Unable to process";
            case 3:
                return "Timeout";
            case 4:
                return "No space";
            case 5:
            case 6:
            default:
                return "Unknown error (code: " + i10 + ")";
            case 7:
                return "Lockout";
            case 8:
                return "Vendor error";
            case 9:
                return "Lockout permanent";
            case 10:
                return "User canceled the authentication";
            case 11:
                return "No biometrics enrolled";
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return "Hardware not present";
            case 13:
                return "User canceled the authentication";
            case 14:
                return "No device credential";
        }
    }

    public final Object b(Cipher cipher, Zd.e eVar) {
        k kVar = new k(AbstractC2605b.c(eVar));
        new r.f(this.f45915a, this.f45916b, new a(kVar)).a(this.f45917c, new f.c(cipher));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }
}
