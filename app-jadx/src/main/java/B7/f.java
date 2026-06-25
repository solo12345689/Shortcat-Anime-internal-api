package b7;

import Df.C1271d;
import Td.L;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import dg.C;
import dg.E;
import dg.F;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import dg.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f33232a = new f();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC4625f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InspectorNetworkRequestListener f33233a;

        a(InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            this.f33233a = inspectorNetworkRequestListener;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e call, E response) {
            InputStream inputStreamA;
            byte[] bArr;
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(response, "response");
            t tVarG = response.g();
            HashMap map = new HashMap();
            for (String str : tVarG.i()) {
                map.put(str, tVarG.d(str));
            }
            this.f33233a.onHeaders(response.b(), map);
            try {
                F fA = response.a();
                InspectorNetworkRequestListener inspectorNetworkRequestListener = this.f33233a;
                if (fA != null) {
                    try {
                        inputStreamA = fA.a();
                        bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    } finally {
                    }
                    while (true) {
                        try {
                            int i10 = inputStreamA.read(bArr);
                            if (i10 == -1) {
                                break;
                            } else {
                                inspectorNetworkRequestListener.onData(new String(bArr, 0, i10, C1271d.f3718b));
                            }
                        } finally {
                        }
                    }
                    L l10 = L.f17438a;
                    fe.c.a(inputStreamA, null);
                }
                inspectorNetworkRequestListener.onCompletion();
                L l11 = L.f17438a;
                fe.c.a(fA, null);
            } catch (IOException e10) {
                this.f33233a.onError(e10.getMessage());
            }
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            if (call.u1()) {
                return;
            }
            this.f33233a.onError(e10.getMessage());
        }
    }

    private f() {
    }

    public static final void a(String url, InspectorNetworkRequestListener listener) {
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(listener, "listener");
        try {
            C3026a.f33222a.a().a(new C.a().m(url).b()).O1(new a(listener));
        } catch (IllegalArgumentException unused) {
            listener.onError("Not a valid URL: " + url);
        }
    }
}
