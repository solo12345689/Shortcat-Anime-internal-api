package expo.modules.filesystem;

import Cb.v;
import Cb.w;
import com.amazon.device.iap.internal.c.b;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lexpo/modules/filesystem/FileSystemFileHandle;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Ljava/nio/channels/FileChannel;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lexpo/modules/filesystem/FileSystemFile;", "file", "<init>", "(Lexpo/modules/filesystem/FileSystemFile;)V", "LTd/L;", "S", "()V", "H", "close", "", "length", "", "k0", "(J)[B", "data", "write", "([B)V", "e", "Ljava/nio/channels/FileChannel;", "fileChannel", "value", "Y", "()Ljava/lang/Long;", "p0", "(Ljava/lang/Long;)V", b.as, "h0", "size", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemFileHandle extends SharedRef<FileChannel> implements AutoCloseable {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFileHandle(FileSystemFile file) {
        super(new RandomAccessFile(file.k0(), "rw").getChannel(), null, 2, null);
        AbstractC5504s.h(file, "file");
        this.fileChannel = (FileChannel) getRef();
    }

    private final void S() throws v {
        if (!this.fileChannel.isOpen()) {
            throw new v("file handle is closed");
        }
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void H() throws IOException {
        close();
    }

    public final Long Y() {
        try {
            return Long.valueOf(this.fileChannel.position());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.fileChannel.close();
    }

    public final Long h0() {
        try {
            return Long.valueOf(this.fileChannel.size());
        } catch (Exception unused) {
            return null;
        }
    }

    public final byte[] k0(long length) throws v {
        S();
        try {
            int iJ = (int) AbstractC5874j.j(Math.min(length, this.fileChannel.size() - this.fileChannel.position()), 2147483647L);
            int i10 = 0;
            if (iJ <= 0) {
                return new byte[0];
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iJ);
            while (i10 < iJ) {
                int i11 = this.fileChannel.read(byteBufferAllocate);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            byte[] bArrArray = byteBufferAllocate.array();
            AbstractC5504s.g(bArrArray, "array(...)");
            return bArrArray;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new v(message);
        }
    }

    public final void p0(Long l10) throws IOException {
        if (l10 == null) {
            return;
        }
        this.fileChannel.position(l10.longValue());
    }

    public final void write(byte[] data) throws w, v {
        AbstractC5504s.h(data, "data");
        S();
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
            while (byteBufferWrap.hasRemaining()) {
                this.fileChannel.write(byteBufferWrap);
            }
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new w(message);
        }
    }
}
