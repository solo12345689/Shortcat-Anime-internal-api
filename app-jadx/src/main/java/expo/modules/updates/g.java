package expo.modules.updates;

import Df.r;
import Td.AbstractC2163n;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Base64;
import android.util.Log;
import expo.modules.updates.d;
import fe.k;
import fe.s;
import ie.InterfaceC5082a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;
import rd.C6306a;
import xd.C7136g;
import xd.EnumC7131b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a */
    public static final g f46458a = new g();

    /* JADX INFO: renamed from: b */
    private static final String f46459b = g.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    private static final char[] f46460c;

    /* JADX INFO: renamed from: d */
    private static final Lazy f46461d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46462a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.f46430a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.a.f46431b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.a.f46432c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.a.f46433d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46462a = iArr;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        AbstractC5504s.g(charArray, "toCharArray(...)");
        f46460c = charArray;
        f46461d = AbstractC2163n.b(new InterfaceC5082a() { // from class: nd.h
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return expo.modules.updates.g.b();
            }
        });
    }

    private g() {
    }

    public static final Pattern b() {
        return Pattern.compile(";\\s*(?:\\s*([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)\\s*=\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)" + com.amazon.a.a.o.b.f.f34696c + "\"([^\"]*)\"))?\\s*");
    }

    private final Pattern f() {
        Object value = f46461d.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (Pattern) value;
    }

    public final String c(C6306a asset) {
        AbstractC5504s.h(asset, "asset");
        String strE = asset.e();
        if (asset.j() != null) {
            return asset.j() + strE;
        }
        return "asset-" + new Date().getTime() + "-" + new Random().nextInt() + strE;
    }

    public final Map d(String stringifiedJSON) throws Exception {
        AbstractC5504s.h(stringifiedJSON, "stringifiedJSON");
        JSONObject jSONObject = new JSONObject(stringifiedJSON);
        Iterator<String> itKeys = jSONObject.keys();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(next, (String) obj);
            } catch (ClassCastException unused) {
                throw new Exception("The values in the JSON object must be strings");
            }
        }
        return linkedHashMap;
    }

    public final File e(Context context) throws Exception {
        AbstractC5504s.h(context, "context");
        File file = new File(context.getFilesDir(), ".expo-internal");
        if (file.exists()) {
            if (file.isFile()) {
                throw new Exception("File already exists at the location of the Updates Directory: " + file + " ; aborting");
            }
        } else if (!file.mkdir()) {
            throw new Exception("Failed to create Updates Directory: mkdir() returned false");
        }
        return file;
    }

    public final String g(String str) {
        AbstractC5504s.h(str, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Matcher matcher = f().matcher(str);
        int iI0 = r.i0(str, ';', 0, false, 6, null);
        while (iI0 < str.length()) {
            matcher.region(iI0, str.length());
            if (!matcher.lookingAt()) {
                String strSubstring = str.substring(iI0);
                AbstractC5504s.g(strSubstring, "substring(...)");
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + strSubstring + "\" for: \"" + str + "\"").toString());
            }
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                iI0 = matcher.end();
            } else {
                String strGroup2 = matcher.group(2);
                if (strGroup2 == null) {
                    strGroup2 = matcher.group(3);
                } else if (r.Q(strGroup2, "'", false, 2, null) && r.A(strGroup2, "'", false, 2, null) && strGroup2.length() > 2) {
                    strGroup2 = strGroup2.substring(1, strGroup2.length() - 1);
                    AbstractC5504s.g(strGroup2, "substring(...)");
                }
                if (!linkedHashMap.containsKey(strGroup)) {
                    linkedHashMap.put(strGroup, strGroup2);
                }
                iI0 = matcher.end();
            }
        }
        return (String) linkedHashMap.get("name");
    }

    public final Date h(String dateString) throws ParseException {
        AbstractC5504s.h(dateString, "dateString");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'X'", Locale.US).parse(dateString);
            AbstractC5504s.f(date, "null cannot be cast to non-null type java.util.Date");
            return date;
        } catch (Exception unused) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date2 = simpleDateFormat.parse(dateString);
            AbstractC5504s.f(date2, "null cannot be cast to non-null type java.util.Date");
            return date2;
        }
    }

    public final byte[] i(File file) throws NoSuchAlgorithmException, IOException {
        AbstractC5504s.h(file, "file");
        try {
            byte[] bArr = new byte[8192];
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("SHA-256"));
                do {
                    try {
                    } finally {
                    }
                } while (digestInputStream.read(bArr) != -1);
                byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                AbstractC5504s.g(bArrDigest, "digest(...)");
                fe.c.a(digestInputStream, null);
                fe.c.a(fileInputStream, null);
                return bArrDigest;
            } finally {
            }
        } catch (IOException e10) {
            Log.e(f46459b, "Failed to checksum file via SHA-256: " + file, e10);
            throw e10;
        } catch (NoSuchAlgorithmException e11) {
            Log.e(f46459b, "Failed to checksum file via SHA-256: " + file, e11);
            throw e11;
        }
    }

    public final boolean j(d updatesConfiguration, C7136g logger, Context context) {
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(context, "context");
        int i10 = a.f46462a[updatesConfiguration.e().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return true;
                }
                throw new Td.r();
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                logger.f("Could not determine active network connection is metered; not checking for updates", new Exception("Null ConnectivityManager system service"), EnumC7131b.f64350l);
                return false;
            }
            if (!connectivityManager.isActiveNetworkMetered()) {
                return true;
            }
        }
        return false;
    }

    public final String k(byte[] bytes) {
        AbstractC5504s.h(bytes, "bytes");
        String strEncodeToString = Base64.encodeToString(bytes, 11);
        AbstractC5504s.g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final byte[] l(InputStream inputStream, File destination, String str) throws IOException {
        AbstractC5504s.h(inputStream, "inputStream");
        AbstractC5504s.h(destination, "destination");
        DigestInputStream digestInputStream = new DigestInputStream(inputStream, MessageDigest.getInstance("SHA-256"));
        try {
            File file = new File(destination.getAbsolutePath() + ".tmp");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fe.b.b(digestInputStream, fileOutputStream, 0, 2, null);
                    fe.c.a(fileOutputStream, null);
                    fe.c.a(digestInputStream, null);
                    byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                    g gVar = f46458a;
                    AbstractC5504s.e(bArrDigest);
                    String strK = gVar.k(bArrDigest);
                    if (str != null && !AbstractC5504s.c(str, strK)) {
                        throw new IOException("File download was successful but base64url-encoded SHA-256 did not match expected; expected: " + str + "; actual: " + strK);
                    }
                    try {
                        try {
                            try {
                                k.y(file, destination, true, 0, 4, null);
                                file.delete();
                                fe.c.a(digestInputStream, null);
                                return bArrDigest;
                            } catch (s unused) {
                                throw new IOException("File download was successful, but temp file " + file.getAbsolutePath() + " does not exist");
                            }
                        } catch (Exception e10) {
                            throw new IOException("File download was successful, but an exception occurred: " + e10);
                        }
                    } catch (Throwable th2) {
                        file.delete();
                        throw th2;
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
