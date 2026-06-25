package w2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;
import t2.a0;

/* JADX INFO: renamed from: w2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6937d extends AbstractC6935b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f62799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f62800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f62801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f62802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f62803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62804j;

    /* JADX INFO: renamed from: w2.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends l {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public C6937d(Context context) {
        super(false);
        this.f62799e = context.getContentResolver();
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = oVar.f62825a.normalizeScheme();
            this.f62800f = uriNormalizeScheme;
            r(oVar);
            if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f62799e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f62799e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f62801g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f62802h = fileInputStream;
            if (length != -1 && oVar.f62831g > length) {
                throw new a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(oVar.f62831g + startOffset) - startOffset;
            if (jSkip != oVar.f62831g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f62803i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f62803i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f62803i = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long jMin = oVar.f62832h;
            if (jMin != -1) {
                long j11 = this.f62803i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f62803i = jMin;
            }
            this.f62804j = true;
            s(oVar);
            long j12 = oVar.f62832h;
            return j12 != -1 ? j12 : this.f62803i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f62800f;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        this.f62800f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f62802h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f62802h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f62801g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f62801g = null;
                    if (this.f62804j) {
                        this.f62804j = false;
                        q();
                    }
                }
            } catch (Throwable th2) {
                this.f62802h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f62801g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f62801g = null;
                        if (this.f62804j) {
                            this.f62804j = false;
                            q();
                        }
                        throw th2;
                    } finally {
                        this.f62801g = null;
                        if (this.f62804j) {
                            this.f62804j = false;
                            q();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(e12, 2000);
        }
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62803i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) a0.l(this.f62802h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f62803i;
        if (j11 != -1) {
            this.f62803i = j11 - ((long) i12);
        }
        p(i12);
        return i12;
    }
}
