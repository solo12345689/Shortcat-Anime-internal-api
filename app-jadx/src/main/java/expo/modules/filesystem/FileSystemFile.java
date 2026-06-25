package expo.modules.filesystem;

import Cb.l;
import Cb.n;
import Cb.p;
import Cb.s;
import Df.AbstractC1273f;
import Df.C1271d;
import Df.r;
import Eb.k;
import Td.L;
import Ub.d;
import android.net.Uri;
import android.util.Base64;
import expo.modules.kotlin.services.FilePermissionService;
import fe.b;
import fe.c;
import fe.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import oc.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\b\u0010\u000b\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b*\u0010\b\u001a\u0004\b)\u0010\u001bR\u0013\u0010/\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u00101\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001b¨\u00062"}, d2 = {"Lexpo/modules/filesystem/FileSystemFile;", "Lexpo/modules/filesystem/FileSystemPath;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "LTd/L;", "f2", "()V", "u1", "Lexpo/modules/filesystem/CreateOptions;", "options", "S1", "(Lexpo/modules/filesystem/CreateOptions;)V", "", "content", "", "append", "g2", "(Ljava/lang/String;Z)V", "Loc/j;", "h2", "(Loc/j;Z)V", "", "i2", "([BZ)V", "A1", "()Ljava/lang/String;", "e2", "D1", "O1", "()[B", "y1", "()Landroid/net/Uri;", "Lexpo/modules/filesystem/InfoOptions;", "Lexpo/modules/filesystem/FileInfo;", "d2", "(Lexpo/modules/filesystem/InfoOptions;)Lexpo/modules/filesystem/FileInfo;", "Z1", "()Z", "exists", "a2", "getMd5$annotations", "md5", "", "b2", "()Ljava/lang/Long;", "size", "c2", "type", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemFile extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFile(Uri uri) {
        super(uri);
        AbstractC5504s.h(uri, "uri");
    }

    public static /* synthetic */ void Y1(FileSystemFile fileSystemFile, CreateOptions createOptions, int i10, Object obj) throws n, s {
        if ((i10 & 1) != 0) {
            createOptions = new CreateOptions(false, false, false, 7, null);
        }
        fileSystemFile.S1(createOptions);
    }

    public final String A1() {
        String string = h0().c().toString();
        AbstractC5504s.g(string, "toString(...)");
        return r.A(string, "/", false, 2, null) ? r.o1(string, 1) : string;
    }

    public final String D1() throws n, IOException {
        u1();
        t1(FilePermissionService.a.f46179a);
        InputStream inputStreamL = h0().L();
        try {
            String strEncodeToString = Base64.encodeToString(b.c(inputStreamL), 2);
            AbstractC5504s.g(strEncodeToString, "encodeToString(...)");
            c.a(inputStreamL, null);
            return strEncodeToString;
        } finally {
        }
    }

    public final byte[] O1() throws n, IOException {
        u1();
        t1(FilePermissionService.a.f46179a);
        InputStream inputStreamL = h0().L();
        try {
            byte[] bArrC = b.c(inputStreamL);
            c.a(inputStreamL, null);
            return bArrC;
        } finally {
        }
    }

    public final void S1(CreateOptions options) throws n, s {
        File parentFile;
        AbstractC5504s.h(options, "options");
        u1();
        t1(FilePermissionService.a.f46180b);
        q1(options);
        if (l.b(getUri())) {
            throw new s("create function does not work with SAF Uris, use `createDirectory` and `createFile` instead");
        }
        if (options.getOverwrite() && Z1()) {
            k0().delete();
        }
        if (options.getIntermediates() && (parentFile = k0().getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (!k0().createNewFile()) {
            throw new s("file already exists or could not be created");
        }
    }

    public final boolean Z1() {
        if (J(FilePermissionService.a.f46179a)) {
            return h0().isFile();
        }
        return false;
    }

    public final String a2() throws NoSuchAlgorithmException, IOException {
        t1(FilePermissionService.a.f46179a);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        InputStream inputStreamL = h0().L();
        try {
            byte[] bArrDigest = messageDigest.digest(b.c(inputStreamL));
            AbstractC5504s.e(bArrDigest);
            String strE = AbstractC1273f.E(bArrDigest, null, 1, null);
            c.a(inputStreamL, null);
            return strE;
        } finally {
        }
    }

    public final Long b2() {
        if (h0().exists()) {
            return Long.valueOf(h0().length());
        }
        return null;
    }

    public final String c2() {
        return h0().getType();
    }

    public final FileInfo d2(InfoOptions options) throws n {
        u1();
        t1(FilePermissionService.a.f46179a);
        if (!h0().exists()) {
            return new FileInfo(false, l.c(h0().c().toString()), null, null, null, null, 60, null);
        }
        FileInfo fileInfo = new FileInfo(true, l.c(h0().c().toString()), null, b2(), p0(), Y(), 4, null);
        if (options != null && AbstractC5504s.c(options.getMd5(), Boolean.TRUE)) {
            fileInfo.setMd5(a2());
        }
        return fileInfo;
    }

    public final String e2() throws n, IOException {
        u1();
        t1(FilePermissionService.a.f46179a);
        InputStream inputStreamL = h0().L();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamL, C1271d.f3718b), 8192);
            try {
                String strE = v.e(bufferedReader);
                c.a(bufferedReader, null);
                c.a(inputStreamL, null);
                return strE;
            } finally {
            }
        } finally {
        }
    }

    public final void g2(String content, boolean append) throws n, IOException, s {
        AbstractC5504s.h(content, "content");
        u1();
        t1(FilePermissionService.a.f46180b);
        if (!Z1()) {
            Y1(this, null, 1, null);
        }
        OutputStream outputStreamP = h0().P(append);
        try {
            byte[] bytes = content.getBytes(C1271d.f3718b);
            AbstractC5504s.g(bytes, "getBytes(...)");
            outputStreamP.write(bytes);
            L l10 = L.f17438a;
            c.a(outputStreamP, null);
        } finally {
        }
    }

    public final void h2(j content, boolean append) throws n, IOException, s {
        AbstractC5504s.h(content, "content");
        u1();
        t1(FilePermissionService.a.f46180b);
        if (!Z1()) {
            Y1(this, null, 1, null);
        }
        if (l.b(getUri())) {
            OutputStream outputStreamP = h0().P(append);
            try {
                byte[] bArr = new byte[content.getLength()];
                content.toDirectBuffer().get(bArr);
                outputStreamP.write(bArr);
                L l10 = L.f17438a;
                c.a(outputStreamP, null);
            } finally {
            }
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(k0(), append);
            try {
                fileOutputStream.getChannel().write(content.toDirectBuffer());
                c.a(fileOutputStream, null);
            } finally {
            }
        }
    }

    public final void i2(byte[] content, boolean append) throws n, IOException, s {
        AbstractC5504s.h(content, "content");
        u1();
        t1(FilePermissionService.a.f46180b);
        if (!Z1()) {
            Y1(this, null, 1, null);
        }
        if (l.b(getUri())) {
            OutputStream outputStreamP = h0().P(append);
            try {
                outputStreamP.write(content);
                L l10 = L.f17438a;
                c.a(outputStreamP, null);
            } finally {
            }
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(k0(), append);
            try {
                fileOutputStream.write(content);
                L l11 = L.f17438a;
                c.a(fileOutputStream, null);
            } finally {
            }
        }
    }

    @Override // expo.modules.filesystem.FileSystemPath
    public void u1() throws n {
        t1(FilePermissionService.a.f46179a);
        if (h0().exists() && h0().isDirectory()) {
            throw new n();
        }
    }

    public final Uri y1() throws n, p {
        u1();
        t1(FilePermissionService.a.f46179a);
        k kVarH0 = h0();
        d dVarL = l();
        if (dVarL != null) {
            return kVarH0.T(dVarL);
        }
        throw new p();
    }

    public final void f2() {
    }
}
