package u7;

import Td.r;
import Ud.S;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import dg.C;
import dg.C4618A;
import dg.C4623d;
import dg.t;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import v6.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v6.b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61411a;

        static {
            int[] iArr = new int[EnumC6741a.values().length];
            try {
                iArr[EnumC6741a.f61403b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6741a.f61404c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6741a.f61405d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6741a.f61402a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61411a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C4618A okHttpClient) {
        super(okHttpClient);
        AbstractC5504s.h(okHttpClient, "okHttpClient");
    }

    private final Map p(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = readableMap.getString(strNextKey);
            if (string != null) {
                map.put(strNextKey, string);
            }
        }
        return map;
    }

    @Override // v6.b, com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: j */
    public void a(b.C0932b fetchState, X.a callback) {
        Map mapI;
        AbstractC5504s.h(fetchState, "fetchState");
        AbstractC5504s.h(callback, "callback");
        fetchState.f61973f = SystemClock.elapsedRealtime();
        Uri uriG = fetchState.g();
        AbstractC5504s.g(uriG, "getUri(...)");
        C4623d.a aVar = new C4623d.a();
        if (fetchState.b().q() instanceof C6742b) {
            K6.b bVarQ = fetchState.b().q();
            AbstractC5504s.f(bVarQ, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            C6742b c6742b = (C6742b) bVarQ;
            mapI = p(c6742b.B());
            int i10 = a.f61411a[c6742b.A().ordinal()];
            if (i10 == 1) {
                aVar.e().d();
            } else if (i10 == 2) {
                aVar.c(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else if (i10 == 3) {
                aVar.f().c(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else {
                if (i10 != 4) {
                    throw new r();
                }
                aVar.e();
            }
        } else {
            aVar.e();
            mapI = null;
        }
        t.b bVar = t.f45580b;
        if (mapI == null) {
            mapI = S.i();
        }
        C.a aVarC = new C.a().f(bVar.a(mapI)).c(aVar.a());
        String string = uriG.toString();
        AbstractC5504s.g(string, "toString(...)");
        k(fetchState, callback, aVarC.m(string).d().b());
    }
}
