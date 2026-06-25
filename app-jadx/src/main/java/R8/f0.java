package R8;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class f0 extends f9.p {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC2102c f15308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC2102c abstractC2102c, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC2102c);
        this.f15308b = abstractC2102c;
    }

    private static final void a(Message message) {
        g0 g0Var = (g0) message.obj;
        if (g0Var != null) {
            g0Var.c();
        }
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC2102c abstractC2102c = this.f15308b;
        if (abstractC2102c.f15241C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !abstractC2102c.r()) || message.what == 5)) && !abstractC2102c.c()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            abstractC2102c.f0(new ConnectionResult(message.arg2));
            if (abstractC2102c.Y() && !abstractC2102c.g0()) {
                abstractC2102c.V(3, null);
                return;
            }
            ConnectionResult connectionResultE0 = abstractC2102c.e0() != null ? abstractC2102c.e0() : new ConnectionResult(8);
            abstractC2102c.f15257p.a(connectionResultE0);
            abstractC2102c.K(connectionResultE0);
            return;
        }
        if (i11 == 5) {
            ConnectionResult connectionResultE02 = abstractC2102c.e0() != null ? abstractC2102c.e0() : new ConnectionResult(8);
            abstractC2102c.f15257p.a(connectionResultE02);
            abstractC2102c.K(connectionResultE02);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC2102c.f15257p.a(connectionResult);
            abstractC2102c.K(connectionResult);
            return;
        }
        if (i11 == 6) {
            abstractC2102c.V(5, null);
            if (abstractC2102c.c0() != null) {
                abstractC2102c.c0().e(message.arg2);
            }
            abstractC2102c.L(message.arg2);
            abstractC2102c.W(5, 1, null);
            return;
        }
        if (i11 == 2 && !abstractC2102c.A()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((g0) message.obj).b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
