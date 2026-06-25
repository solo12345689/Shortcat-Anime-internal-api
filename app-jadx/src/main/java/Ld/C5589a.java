package ld;

import android.content.Context;
import cc.i;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dc.r;
import gc.c;
import gc.d;
import gc.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.U;
import pc.V;

/* JADX INFO: renamed from: ld.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lld/a;", "Lgc/c;", "<init>", "()V", "", "y", "()Ljava/lang/String;", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "z", "()Landroid/content/Context;", "context", "expo-tracking-transparency_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C5589a extends c {

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0823a implements Function1 {
        public C0823a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return C5589a.this.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String y() {
        return AdvertisingIdClient.getAdvertisingIdInfo(z()).getId();
    }

    private final Context z() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            d dVar = new d(this);
            dVar.s("ExpoTrackingTransparency");
            C5972b[] c5972bArr = new C5972b[0];
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(O.b(Object.class));
            if (u10 == null) {
                u10 = new U(O.b(Object.class));
                v10.a().put(O.b(Object.class), u10);
            }
            dVar.p().put("getAdvertisingId", new r("getAdvertisingId", c5972bArr, u10, new C0823a()));
            e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
