package K8;

import Q8.C2069q;
import R8.AbstractC2115p;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U8.a f10948c = new U8.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2069q f10950b = new C2069q(null);

    public f(String str) {
        this.f10949a = AbstractC2115p.f(str);
    }

    public static P8.h a(String str) {
        if (str == null) {
            return P8.i.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f10950b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f38935h;
        try {
            String str = this.f10949a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb2.append(str);
            URL url = new URL(sb2.toString());
            int i10 = b9.d.f33237a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f38933f;
            } else {
                f10948c.b("Unable to revoke access!", new Object[0]);
            }
            U8.a aVar = f10948c;
            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb3.append("Response Code: ");
            sb3.append(responseCode);
            aVar.a(sb3.toString(), new Object[0]);
        } catch (IOException e10) {
            f10948c.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f10948c.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f10950b.setResult(status);
    }
}
