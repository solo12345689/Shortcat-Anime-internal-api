package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class DebugImage implements B0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            DebugImage debugImage = new DebugImage();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "debug_file":
                        debugImage.debugFile = interfaceC5218j1.i1();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = interfaceC5218j1.i1();
                        break;
                    case "image_size":
                        debugImage.imageSize = interfaceC5218j1.d1();
                        break;
                    case "code_file":
                        debugImage.codeFile = interfaceC5218j1.i1();
                        break;
                    case "arch":
                        debugImage.arch = interfaceC5218j1.i1();
                        break;
                    case "type":
                        debugImage.type = interfaceC5218j1.i1();
                        break;
                    case "uuid":
                        debugImage.uuid = interfaceC5218j1.i1();
                        break;
                    case "debug_id":
                        debugImage.debugId = interfaceC5218j1.i1();
                        break;
                    case "code_id":
                        debugImage.codeId = interfaceC5218j1.i1();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC5218j1.l1(iLogger, map, strR0);
                        break;
                }
            }
            interfaceC5218j1.I();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.uuid != null) {
            interfaceC5223k1.e("uuid").f(this.uuid);
        }
        if (this.type != null) {
            interfaceC5223k1.e("type").f(this.type);
        }
        if (this.debugId != null) {
            interfaceC5223k1.e("debug_id").f(this.debugId);
        }
        if (this.debugFile != null) {
            interfaceC5223k1.e("debug_file").f(this.debugFile);
        }
        if (this.codeId != null) {
            interfaceC5223k1.e("code_id").f(this.codeId);
        }
        if (this.codeFile != null) {
            interfaceC5223k1.e("code_file").f(this.codeFile);
        }
        if (this.imageAddr != null) {
            interfaceC5223k1.e("image_addr").f(this.imageAddr);
        }
        if (this.imageSize != null) {
            interfaceC5223k1.e("image_size").i(this.imageSize);
        }
        if (this.arch != null) {
            interfaceC5223k1.e("arch").f(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.unknown.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l10) {
        this.imageSize = l10;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j10) {
        this.imageSize = Long.valueOf(j10);
    }
}
