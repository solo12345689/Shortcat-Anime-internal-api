package jg;

import dg.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: jg.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5402b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f51822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51825d;

    public C5402b(List connectionSpecs) {
        AbstractC5504s.h(connectionSpecs, "connectionSpecs");
        this.f51822a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f51822a.size();
        for (int i10 = this.f51823b; i10 < size; i10++) {
            if (((l) this.f51822a.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException {
        l lVar;
        AbstractC5504s.h(sslSocket, "sslSocket");
        int i10 = this.f51823b;
        int size = this.f51822a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f51822a.get(i10);
            if (lVar.e(sslSocket)) {
                this.f51823b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f51824c = c(sslSocket);
            lVar.c(sslSocket, this.f51825d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f51825d);
        sb2.append(", modes=");
        sb2.append(this.f51822a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        AbstractC5504s.e(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC5504s.g(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException e10) {
        AbstractC5504s.h(e10, "e");
        this.f51825d = true;
        if (!this.f51824c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
