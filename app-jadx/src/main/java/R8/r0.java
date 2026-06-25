package R8;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class r0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s0 f15366a;

    /* synthetic */ r0(s0 s0Var, byte[] bArr) {
        Objects.requireNonNull(s0Var);
        this.f15366a = s0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            s0 s0Var = this.f15366a;
            synchronized (s0Var.h()) {
                try {
                    p0 p0Var = (p0) message.obj;
                    q0 q0Var = (q0) s0Var.h().get(p0Var);
                    if (q0Var != null && q0Var.g()) {
                        if (q0Var.d()) {
                            q0Var.a("GmsClientSupervisor");
                        }
                        s0Var.h().remove(p0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        s0 s0Var2 = this.f15366a;
        synchronized (s0Var2.h()) {
            try {
                p0 p0Var2 = (p0) message.obj;
                q0 q0Var2 = (q0) s0Var2.h().get(p0Var2);
                if (q0Var2 != null && q0Var2.e() == 3) {
                    String strValueOf = String.valueOf(p0Var2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentNameI = q0Var2.i();
                    if (componentNameI == null) {
                        componentNameI = p0Var2.c();
                    }
                    if (componentNameI == null) {
                        String strB = p0Var2.b();
                        AbstractC2115p.l(strB);
                        componentNameI = new ComponentName(strB, "unknown");
                    }
                    q0Var2.onServiceDisconnected(componentNameI);
                }
            } finally {
            }
        }
        return true;
    }
}
