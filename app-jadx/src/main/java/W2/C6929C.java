package w2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.revenuecat.purchases.common.Constants;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: w2.C */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6929C extends AbstractC6935b {

    /* JADX INFO: renamed from: e */
    private final Context f62767e;

    /* JADX INFO: renamed from: f */
    private o f62768f;

    /* JADX INFO: renamed from: g */
    private AssetFileDescriptor f62769g;

    /* JADX INFO: renamed from: h */
    private InputStream f62770h;

    /* JADX INFO: renamed from: i */
    private long f62771i;

    /* JADX INFO: renamed from: j */
    private boolean f62772j;

    /* JADX INFO: renamed from: w2.C$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends l {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public C6929C(Context context) {
        super(false);
        this.f62767e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor t(Context context, o oVar) throws a {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = oVar.f62825a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = u(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            String strSubstring = (String) AbstractC6614a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = u(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    private static int u(String str) throws a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
        }
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws a {
        this.f62768f = oVar;
        r(oVar);
        AssetFileDescriptor assetFileDescriptorT = t(this.f62767e, oVar);
        this.f62769g = assetFileDescriptorT;
        long length = assetFileDescriptorT.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f62769g.getFileDescriptor());
        this.f62770h = fileInputStream;
        if (length != -1) {
            try {
                if (oVar.f62831g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        }
        long startOffset = this.f62769g.getStartOffset();
        long jSkip = fileInputStream.skip(oVar.f62831g + startOffset) - startOffset;
        if (jSkip != oVar.f62831g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f62771i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f62771i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f62771i = j10;
            if (j10 < 0) {
                throw new l(2008);
            }
        }
        long jMin = oVar.f62832h;
        if (jMin != -1) {
            long j11 = this.f62771i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f62771i = jMin;
        }
        this.f62772j = true;
        s(oVar);
        long j12 = oVar.f62832h;
        return j12 != -1 ? j12 : this.f62771i;
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        o oVar = this.f62768f;
        if (oVar != null) {
            return oVar.f62825a;
        }
        return null;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        this.f62768f = null;
        try {
            try {
                InputStream inputStream = this.f62770h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f62770h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f62769g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f62769g = null;
                    if (this.f62772j) {
                        this.f62772j = false;
                        q();
                    }
                }
            } catch (Throwable th2) {
                this.f62770h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f62769g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f62769g = null;
                        if (this.f62772j) {
                            this.f62772j = false;
                            q();
                        }
                        throw th2;
                    } finally {
                        this.f62769g = null;
                        if (this.f62772j) {
                            this.f62772j = false;
                            q();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(null, e12, 2000);
        }
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62771i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) a0.l(this.f62770h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f62771i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f62771i;
        if (j11 != -1) {
            this.f62771i = j11 - ((long) i12);
        }
        p(i12);
        return i12;
    }
}
