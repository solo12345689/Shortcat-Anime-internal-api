package expo.modules.clipboard;

import Df.C1271d;
import Gf.AbstractC1647z0;
import Gf.C1608f0;
import Td.L;
import Ud.AbstractC2273n;
import Zd.e;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import fe.k;
import ie.InterfaceC5082a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import nb.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: expo.modules.clipboard.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class C0729a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46027a;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            try {
                iArr[ImageFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageFormat.JPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46027a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f46028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f46029b;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46028a = obj;
            this.f46029b |= Integer.MIN_VALUE;
            return a.h(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f46030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f46031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f46032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f46034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46035f;

        c(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46034e = obj;
            this.f46035f |= Integer.MIN_VALUE;
            return a.k(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f46036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f46037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f46038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f46039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46040e;

        d(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46039d = obj;
            this.f46040e |= Integer.MIN_VALUE;
            return a.t(null, null, null, this);
        }
    }

    public static final Bitmap g(String base64Image) throws r {
        AbstractC5504s.h(base64Image, "base64Image");
        try {
            byte[] bArrDecode = Base64.decode(base64Image, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray != null) {
                return bitmapDecodeByteArray;
            }
            throw new RuntimeException("Failed to convert base64 into Bitmap");
        } catch (RuntimeException e10) {
            throw new r(base64Image, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(final android.content.Context r4, final android.net.Uri r5, Zd.e r6) {
        /*
            boolean r0 = r6 instanceof expo.modules.clipboard.a.b
            if (r0 == 0) goto L13
            r0 = r6
            expo.modules.clipboard.a$b r0 = (expo.modules.clipboard.a.b) r0
            int r1 = r0.f46029b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46029b = r1
            goto L18
        L13:
            expo.modules.clipboard.a$b r0 = new expo.modules.clipboard.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f46028a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f46029b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            Td.v.b(r6)
            Gf.K r6 = Gf.C1608f0.b()
            nb.e r2 = new nb.e
            r2.<init>()
            r0.f46029b = r3
            java.lang.Object r6 = Gf.AbstractC1647z0.b(r6, r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "runInterruptible(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.clipboard.a.h(android.content.Context, android.net.Uri, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap i(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 28) {
            return MediaStore.Images.Media.getBitmap(contentResolver, uri);
        }
        ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(contentResolver, uri);
        AbstractC5504s.g(sourceCreateSource, "createSource(...)");
        return ImageDecoder.decodeBitmap(sourceCreateSource);
    }

    public static final void j(File clipboardCacheDir) {
        File[] fileArrListFiles;
        AbstractC5504s.h(clipboardCacheDir, "clipboardCacheDir");
        if (clipboardCacheDir.exists() && clipboardCacheDir.isDirectory() && (fileArrListFiles = clipboardCacheDir.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    AbstractC5504s.e(file);
                    k.z(file);
                } else {
                    file.delete();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(android.content.Context r9, java.lang.String r10, java.io.File r11, Zd.e r12) throws java.security.NoSuchAlgorithmException, java.io.IOException, nb.r {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.clipboard.a.k(android.content.Context, java.lang.String, java.io.File, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileOutputStream l(File file) {
        return new FileOutputStream(file, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L m(BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.flush();
        return L.f17438a;
    }

    private static final Object n(final File file, e eVar) {
        return AbstractC1647z0.b(C1608f0.b(), new InterfaceC5082a() { // from class: nb.f
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Boolean.valueOf(expo.modules.clipboard.a.o(file));
            }
        }, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file.createNewFile();
    }

    public static final ImageFormat p(String base64Image) {
        AbstractC5504s.h(base64Image, "base64Image");
        String strSubstring = base64Image.substring(0, 8);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return Df.r.Q(strSubstring, "iVBORw0K", false, 2, null) ? ImageFormat.PNG : Df.r.Q(strSubstring, "/9j/", false, 2, null) ? ImageFormat.JPG : ImageFormat.JPG;
    }

    public static final String q() throws NoSuchAlgorithmException {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String str = "copied_image" + AbstractC2273n.w0(bArr, "", null, null, 0, null, new Function1() { // from class: nb.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return expo.modules.clipboard.a.r(((Byte) obj).byteValue());
            }
        }, 30, null);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(C1271d.f3718b);
        AbstractC5504s.g(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC5504s.e(bArrDigest);
        return AbstractC2273n.w0(bArrDigest, "", null, null, 0, null, new Function1() { // from class: nb.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return expo.modules.clipboard.a.s(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence s(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object t(android.content.Context r6, android.net.Uri r7, expo.modules.clipboard.GetImageOptions r8, Zd.e r9) {
        /*
            boolean r0 = r9 instanceof expo.modules.clipboard.a.d
            if (r0 == 0) goto L13
            r0 = r9
            expo.modules.clipboard.a$d r0 = (expo.modules.clipboard.a.d) r0
            int r1 = r0.f46040e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46040e = r1
            goto L18
        L13:
            expo.modules.clipboard.a$d r0 = new expo.modules.clipboard.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46039d
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f46040e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f46038c
            java.io.ByteArrayOutputStream r6 = (java.io.ByteArrayOutputStream) r6
            java.lang.Object r7 = r0.f46037b
            expo.modules.clipboard.ImageFormat r7 = (expo.modules.clipboard.ImageFormat) r7
            java.lang.Object r8 = r0.f46036a
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            Td.v.b(r9)
            goto L84
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f46036a
            r8 = r6
            expo.modules.clipboard.GetImageOptions r8 = (expo.modules.clipboard.GetImageOptions) r8
            Td.v.b(r9)
            goto L57
        L49:
            Td.v.b(r9)
            r0.f46036a = r8
            r0.f46040e = r4
            java.lang.Object r9 = h(r6, r7, r0)
            if (r9 != r1) goto L57
            goto L81
        L57:
            r6 = r9
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            expo.modules.clipboard.ImageFormat r7 = r8.getImageFormat()
            double r8 = r8.getJpegQuality()
            r2 = 100
            double r4 = (double) r2
            double r8 = r8 * r4
            int r8 = (int) r8
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            android.graphics.Bitmap$CompressFormat r2 = r7.getCompressFormat()
            r6.compress(r2, r8, r9)
            r0.f46036a = r6
            r0.f46037b = r7
            r0.f46038c = r9
            r0.f46040e = r3
            java.lang.Object r8 = Gf.j1.a(r0)
            if (r8 != r1) goto L82
        L81:
            return r1
        L82:
            r8 = r6
            r6 = r9
        L84:
            byte[] r6 = r6.toByteArray()
            r9 = 0
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r7 = r7.getMimeType()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "data:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ";base64,"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r9.<init>(r7)
            r9.append(r6)
            nb.q r6 = new nb.q
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r7, r9)
            int r9 = r8.getWidth()
            int r8 = r8.getHeight()
            r6.<init>(r7, r9, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.clipboard.a.t(android.content.Context, android.net.Uri, expo.modules.clipboard.GetImageOptions, Zd.e):java.lang.Object");
    }
}
