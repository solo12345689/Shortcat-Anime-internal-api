package expo.modules.fetch;

import Bb.j;
import Ub.d;
import Ud.AbstractC2273n;
import dg.C;
import dg.C4618A;
import dg.D;
import dg.InterfaceC4624e;
import dg.n;
import dg.t;
import dg.x;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/fetch/NativeRequest;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "LUb/d;", "appContext", "Lexpo/modules/fetch/NativeResponse;", "response", "<init>", "(LUb/d;Lexpo/modules/fetch/NativeResponse;)V", "Ldg/A;", "client", "Ljava/net/URL;", "url", "Lexpo/modules/fetch/NativeRequestInit;", "requestInit", "", "requestBody", "LTd/L;", "S", "(Ldg/A;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V", "J", "()V", "c", "Lexpo/modules/fetch/NativeResponse;", "O", "()Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/fetch/c;", "d", "Lexpo/modules/fetch/c;", "requestHolder", "Ldg/e;", "e", "Ldg/e;", "task", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeRequest extends SharedObject {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NativeResponse response;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c requestHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4624e task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeRequest(d appContext, NativeResponse response) {
        super(appContext);
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(response, "response");
        this.response = response;
        this.requestHolder = new c(null);
    }

    public final void J() {
        InterfaceC4624e interfaceC4624e = this.task;
        if (interfaceC4624e == null) {
            return;
        }
        interfaceC4624e.cancel();
        this.response.F0();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final NativeResponse getResponse() {
        return this.response;
    }

    public final void S(C4618A client, URL url, NativeRequestInit requestInit, byte[] requestBody) {
        D dK;
        AbstractC5504s.h(client, "client");
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(requestInit, "requestInit");
        C4618A.a aVarF = client.F();
        if (requestInit.getCredentials() != NativeRequestCredentials.INCLUDE) {
            aVarF.g(n.f45557b);
        }
        if (requestInit.getRedirect() != NativeRequestRedirect.FOLLOW) {
            aVarF.i(false);
            aVarF.j(false);
        }
        C4618A c4618aC = aVarF.c();
        this.response.O1(requestInit.getRedirect());
        t tVarA = Bb.n.a(requestInit.getHeaders());
        String strD = tVarA.d("Content-Type");
        x xVarC = strD != null ? x.f45605e.c(strD) : null;
        if (requestBody == null || (dK = D.a.k(D.f45262a, requestBody, xVarC, 0, 0, 6, null)) == null) {
            dK = AbstractC2273n.R(j.a(), requestInit.getMethod()) ? D.a.k(D.f45262a, new byte[]{0}, xVarC, 0, 0, 6, null) : null;
        }
        C cB = new C.a().f(tVarA).g(requestInit.getMethod(), dK).n(b.f46090b.a(url)).b();
        this.requestHolder.a(cB);
        InterfaceC4624e interfaceC4624eA = c4618aC.a(cB);
        this.task = interfaceC4624eA;
        if (interfaceC4624eA != null) {
            interfaceC4624eA.O1(this.response);
        }
        this.response.A1();
    }
}
