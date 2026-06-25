package com.facebook.react.devsupport;

import b7.C3026a;
import dg.C;
import dg.C4618A;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f36799b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4618A f36800a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
            String str2 = String.format(Locale.US, "%s://%s/status", Arrays.copyOf(new Object[]{C3026a.f33222a.c(str), str}, 2));
            AbstractC5504s.g(str2, "format(...)");
            return str2;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC4625f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c7.h f36801a;

        b(c7.h hVar) {
            this.f36801a = hVar;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e call, dg.E response) throws IOException {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(response, "response");
            if (!response.J()) {
                AbstractC7283a.m("ReactNative", "Got non-success http code from packager when requesting status: " + response.b());
                this.f36801a.a(false);
                return;
            }
            dg.F fA = response.a();
            if (fA == null) {
                AbstractC7283a.m("ReactNative", "Got null body response from packager when requesting status");
                this.f36801a.a(false);
                return;
            }
            String strL = fA.l();
            if (AbstractC5504s.c("packager-status:running", strL)) {
                this.f36801a.a(true);
                return;
            }
            AbstractC7283a.m("ReactNative", "Got unexpected response from packager when requesting status: " + strL);
            this.f36801a.a(false);
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            AbstractC7283a.I("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + e10.getMessage());
            this.f36801a.a(false);
        }
    }

    public o0(C4618A client) {
        AbstractC5504s.h(client, "client");
        this.f36800a = client;
    }

    public final void a(String host, c7.h callback) {
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(callback, "callback");
        this.f36800a.a(new C.a().m(f36799b.b(host)).b()).O1(new b(callback));
    }
}
