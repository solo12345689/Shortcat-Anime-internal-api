.class public final Lexpo/modules/video/records/DRMOptions;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\u0010\u0012\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0006\u0010\u0017\u0012\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR6\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0008\u0010\u001d\u0012\u0004\u0008\"\u0010\u0016\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\n\u0010#\u0012\u0004\u0008(\u0010\u0016\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lexpo/modules/video/records/DRMOptions;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "Lexpo/modules/video/enums/DRMType;",
        "type",
        "",
        "licenseServer",
        "",
        "headers",
        "",
        "multiKey",
        "<init>",
        "(Lexpo/modules/video/enums/DRMType;Ljava/lang/String;Ljava/util/Map;Z)V",
        "Lq2/C$f;",
        "toDRMConfiguration",
        "()Lq2/C$f;",
        "Lexpo/modules/video/enums/DRMType;",
        "getType",
        "()Lexpo/modules/video/enums/DRMType;",
        "setType",
        "(Lexpo/modules/video/enums/DRMType;)V",
        "getType$annotations",
        "()V",
        "Ljava/lang/String;",
        "getLicenseServer",
        "()Ljava/lang/String;",
        "setLicenseServer",
        "(Ljava/lang/String;)V",
        "getLicenseServer$annotations",
        "Ljava/util/Map;",
        "getHeaders",
        "()Ljava/util/Map;",
        "setHeaders",
        "(Ljava/util/Map;)V",
        "getHeaders$annotations",
        "Z",
        "getMultiKey",
        "()Z",
        "setMultiKey",
        "(Z)V",
        "getMultiKey$annotations",
        "expo-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private licenseServer:Ljava/lang/String;

.field private multiKey:Z

.field private type:Lexpo/modules/video/enums/DRMType;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lexpo/modules/video/records/DRMOptions;-><init>(Lexpo/modules/video/enums/DRMType;Ljava/lang/String;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lexpo/modules/video/enums/DRMType;Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/video/enums/DRMType;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/video/records/DRMOptions;->type:Lexpo/modules/video/enums/DRMType;

    .line 4
    iput-object p2, p0, Lexpo/modules/video/records/DRMOptions;->licenseServer:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lexpo/modules/video/records/DRMOptions;->headers:Ljava/util/Map;

    .line 6
    iput-boolean p4, p0, Lexpo/modules/video/records/DRMOptions;->multiKey:Z

    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/video/enums/DRMType;Ljava/lang/String;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 7
    sget-object p1, Lexpo/modules/video/enums/DRMType;->WIDEVINE:Lexpo/modules/video/enums/DRMType;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/video/records/DRMOptions;-><init>(Lexpo/modules/video/enums/DRMType;Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method public static synthetic getHeaders$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLicenseServer$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getMultiKey$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/DRMOptions;->headers:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLicenseServer()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/DRMOptions;->licenseServer:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMultiKey()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/records/DRMOptions;->multiKey:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getType()Lexpo/modules/video/enums/DRMType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/DRMOptions;->type:Lexpo/modules/video/enums/DRMType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setHeaders(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/DRMOptions;->headers:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public final setLicenseServer(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/DRMOptions;->licenseServer:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setMultiKey(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/records/DRMOptions;->multiKey:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setType(Lexpo/modules/video/enums/DRMType;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/video/records/DRMOptions;->type:Lexpo/modules/video/enums/DRMType;

    .line 7
    .line 8
    return-void
.end method

.method public final toDRMConfiguration()Lq2/C$f;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$f$a;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/video/records/DRMOptions;->type:Lexpo/modules/video/enums/DRMType;

    .line 4
    .line 5
    invoke-virtual {v1}, Lexpo/modules/video/enums/DRMType;->toUUID()Ljava/util/UUID;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lq2/C$f$a;-><init>(Ljava/util/UUID;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lexpo/modules/video/records/DRMOptions;->licenseServer:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lq2/C$f$a;->o(Ljava/lang/String;)Lq2/C$f$a;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lexpo/modules/video/records/DRMOptions;->headers:Ljava/util/Map;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lq2/C$f$a;->m(Ljava/util/Map;)Lq2/C$f$a;

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-boolean v1, p0, Lexpo/modules/video/records/DRMOptions;->multiKey:Z

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lq2/C$f$a;->p(Z)Lq2/C$f$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lq2/C$f$a;->i()Lq2/C$f;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "build(...)"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method
