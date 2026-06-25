package Fd;

import M2.D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import dg.C4618A;
import expo.modules.video.records.VideoSource;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import w2.InterfaceC6940g;
import w2.p;
import x2.c;
import y2.C7197a;

/* JADX INFO: renamed from: Fd.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1562a {
    public static final InterfaceC6940g.a a(Context context, VideoSource videoSource) {
        String scheme;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(videoSource, "videoSource");
        Uri uri = videoSource.getUri();
        return (uri == null || (scheme = uri.getScheme()) == null || !Df.r.Q(scheme, "http", false, 2, null)) ? new p.a(context) : e(context, videoSource);
    }

    public static final InterfaceC6940g.a b(Context context, VideoSource videoSource) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(videoSource, "videoSource");
        c.C0961c c0961c = new c.C0961c();
        c0961c.d(Id.m.f9065a.c().l());
        c0961c.e(2);
        c0961c.f(a(context, videoSource));
        return c0961c;
    }

    public static final M2.D c(Context context, VideoSource videoSource) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(videoSource, "videoSource");
        M2.D dE = d(context, videoSource.getUseCaching() ? b(context, videoSource) : a(context, videoSource)).e(videoSource.toMediaItem(context));
        AbstractC5504s.g(dE, "createMediaSource(...)");
        return dE;
    }

    public static final D.a d(Context context, InterfaceC6940g.a dataSourceFactory) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(dataSourceFactory, "dataSourceFactory");
        M2.r rVarP = new M2.r(context).p(dataSourceFactory);
        AbstractC5504s.g(rVarP, "setDataSourceFactory(...)");
        return rVarP;
    }

    public static final C7197a.b e(Context context, VideoSource videoSource) throws IOException {
        String str;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(videoSource, "videoSource");
        C4618A c4618aC = new C4618A.a().c();
        String strF = f(context);
        StringBuilder sb2 = new StringBuilder();
        int length = strF.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strF.charAt(i10);
            if (cCharAt >= 0 && cCharAt < 128) {
                sb2.append(cCharAt);
            }
        }
        String strY0 = t2.a0.y0(context, sb2.toString());
        AbstractC5504s.g(strY0, "getUserAgent(...)");
        C7197a.b bVar = new C7197a.b(c4618aC);
        Map<String, String> headers = videoSource.getHeaders();
        if (headers != null) {
            Map<String, String> map = !headers.isEmpty() ? headers : null;
            if (map != null) {
                bVar.c(map);
            }
        }
        if (headers != null && (str = headers.get("User-Agent")) != null) {
            strY0 = str;
        }
        bVar.d(strY0);
        return bVar;
    }

    private static final String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        AbstractC5504s.g(applicationInfo, "getApplicationInfo(...)");
        int i10 = applicationInfo.labelRes;
        if (i10 == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        String string = context.getString(i10);
        AbstractC5504s.g(string, "getString(...)");
        return string;
    }
}
