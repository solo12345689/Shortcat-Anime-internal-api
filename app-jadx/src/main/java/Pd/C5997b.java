package pd;

import Ud.S;
import android.net.Uri;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONException;
import org.json.JSONObject;
import sd.EnumC6451a;
import sd.EnumC6452b;

/* JADX INFO: renamed from: pd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5997b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55986a = C5997b.class.getSimpleName();

    /* JADX INFO: renamed from: pd.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55987a;

        static {
            int[] iArr = new int[EnumC6452b.values().length];
            try {
                iArr[EnumC6452b.f59348a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6452b.f59349b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6452b.f59350c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6452b.f59351d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f55987a = iArr;
        }
    }

    public final UUID a(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public final Long b(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    public final int c(EnumC6451a enumC6451a) {
        return 0;
    }

    public final EnumC6451a d(int i10) {
        return EnumC6451a.f59345a;
    }

    public final EnumC6452b e(int i10) {
        if (i10 == 1) {
            return EnumC6452b.f59348a;
        }
        if (i10 == 3) {
            return EnumC6452b.f59349b;
        }
        if (i10 == 5) {
            return EnumC6452b.f59350c;
        }
        if (i10 == 6) {
            return EnumC6452b.f59351d;
        }
        throw new AssertionError("Invalid UpdateStatus value in database: " + i10);
    }

    public final String f(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    public final Date g(Long l10) {
        if (l10 == null) {
            return null;
        }
        return new Date(l10.longValue());
    }

    public final int h(EnumC6452b enumC6452b) {
        int i10 = enumC6452b == null ? -1 : a.f55987a[enumC6452b.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 5;
        }
        if (i10 == 4) {
            return 6;
        }
        throw new AssertionError("Invalid UpdateStatus value: " + enumC6452b);
    }

    public final String i(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject.toString();
    }

    public final JSONObject j(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            Log.e(this.f55986a, "Could not convert string to JSONObject", e10);
            return new JSONObject();
        }
    }

    public final Map k(String str) {
        if (str == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Map mapC = S.c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC5504s.e(next);
            String strOptString = jSONObject.optString(next);
            AbstractC5504s.g(strOptString, "optString(...)");
            mapC.put(next, strOptString);
        }
        return S.b(mapC);
    }

    public final Uri l(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public final String m(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public final byte[] n(UUID uuid) {
        AbstractC5504s.h(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        AbstractC5504s.g(bArrArray, "array(...)");
        return bArrArray;
    }
}
