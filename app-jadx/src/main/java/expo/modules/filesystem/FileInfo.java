package expo.modules.filesystem;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013JV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010 \u0012\u0004\b$\u0010%\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010)R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010&\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010)R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010.\u0012\u0004\b2\u0010%\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u00101R*\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010.\u0012\u0004\b5\u0010%\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u00101R*\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010.\u0012\u0004\b8\u0010%\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u00101¨\u00069"}, d2 = {"Lexpo/modules/filesystem/FileInfo;", "Ljc/b;", "", "exists", "", "uri", "md5", "", "size", "modificationTime", "creationTime", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "component5", "component6", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lexpo/modules/filesystem/FileInfo;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getExists", "setExists", "(Z)V", "getExists$annotations", "()V", "Ljava/lang/String;", "getUri", "setUri", "(Ljava/lang/String;)V", "getUri$annotations", "getMd5", "setMd5", "getMd5$annotations", "Ljava/lang/Long;", "getSize", "setSize", "(Ljava/lang/Long;)V", "getSize$annotations", "getModificationTime", "setModificationTime", "getModificationTime$annotations", "getCreationTime", "setCreationTime", "getCreationTime$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FileInfo implements InterfaceC5364b {
    private Long creationTime;
    private boolean exists;
    private String md5;
    private Long modificationTime;
    private Long size;
    private String uri;

    public FileInfo(boolean z10, String str, String str2, Long l10, Long l11, Long l12) {
        this.exists = z10;
        this.uri = str;
        this.md5 = str2;
        this.size = l10;
        this.modificationTime = l11;
        this.creationTime = l12;
    }

    public static /* synthetic */ FileInfo copy$default(FileInfo fileInfo, boolean z10, String str, String str2, Long l10, Long l11, Long l12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fileInfo.exists;
        }
        if ((i10 & 2) != 0) {
            str = fileInfo.uri;
        }
        if ((i10 & 4) != 0) {
            str2 = fileInfo.md5;
        }
        if ((i10 & 8) != 0) {
            l10 = fileInfo.size;
        }
        if ((i10 & 16) != 0) {
            l11 = fileInfo.modificationTime;
        }
        if ((i10 & 32) != 0) {
            l12 = fileInfo.creationTime;
        }
        Long l13 = l11;
        Long l14 = l12;
        return fileInfo.copy(z10, str, str2, l10, l13, l14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getModificationTime() {
        return this.modificationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCreationTime() {
        return this.creationTime;
    }

    public final FileInfo copy(boolean exists, String uri, String md5, Long size, Long modificationTime, Long creationTime) {
        return new FileInfo(exists, uri, md5, size, modificationTime, creationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfo)) {
            return false;
        }
        FileInfo fileInfo = (FileInfo) other;
        return this.exists == fileInfo.exists && AbstractC5504s.c(this.uri, fileInfo.uri) && AbstractC5504s.c(this.md5, fileInfo.md5) && AbstractC5504s.c(this.size, fileInfo.size) && AbstractC5504s.c(this.modificationTime, fileInfo.modificationTime) && AbstractC5504s.c(this.creationTime, fileInfo.creationTime);
    }

    public final Long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getExists() {
        return this.exists;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final Long getModificationTime() {
        return this.modificationTime;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.exists) * 31;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.md5;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.size;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.modificationTime;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.creationTime;
        return iHashCode5 + (l12 != null ? l12.hashCode() : 0);
    }

    public final void setCreationTime(Long l10) {
        this.creationTime = l10;
    }

    public final void setExists(boolean z10) {
        this.exists = z10;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setModificationTime(Long l10) {
        this.modificationTime = l10;
    }

    public final void setSize(Long l10) {
        this.size = l10;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public String toString() {
        return "FileInfo(exists=" + this.exists + ", uri=" + this.uri + ", md5=" + this.md5 + ", size=" + this.size + ", modificationTime=" + this.modificationTime + ", creationTime=" + this.creationTime + ")";
    }

    public /* synthetic */ FileInfo(boolean z10, String str, String str2, Long l10, Long l11, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getCreationTime$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getExists$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMd5$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getModificationTime$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getSize$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUri$annotations() {
    }
}
