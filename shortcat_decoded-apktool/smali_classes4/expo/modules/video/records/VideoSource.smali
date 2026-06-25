.class public final Lexpo/modules/video/records/VideoSource;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008&\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\u001e\u0012\u0004\u0008#\u0010$\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0006\u0010%\u0012\u0004\u0008*\u0010$\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R*\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0008\u0010+\u0012\u0004\u00080\u0010$\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R6\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000b\u00101\u0012\u0004\u00086\u0010$\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R(\u0010\r\u001a\u00020\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\r\u00107\u0012\u0004\u0008<\u0010$\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010=\u0012\u0004\u0008@\u0010$\u001a\u0004\u0008>\u0010?\u00a8\u0006A"
    }
    d2 = {
        "Lexpo/modules/video/records/VideoSource;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "Landroid/net/Uri;",
        "uri",
        "Lexpo/modules/video/records/DRMOptions;",
        "drm",
        "Lexpo/modules/video/records/VideoMetadata;",
        "metadata",
        "",
        "",
        "headers",
        "",
        "useCaching",
        "Lexpo/modules/video/enums/ContentType;",
        "contentType",
        "<init>",
        "(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;)V",
        "toMediaId",
        "()Ljava/lang/String;",
        "Landroid/content/Context;",
        "context",
        "parseLocalAssetId",
        "(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;",
        "LM2/D;",
        "toMediaSource",
        "(Landroid/content/Context;)LM2/D;",
        "Lq2/C;",
        "toMediaItem",
        "(Landroid/content/Context;)Lq2/C;",
        "Landroid/net/Uri;",
        "getUri",
        "()Landroid/net/Uri;",
        "setUri",
        "(Landroid/net/Uri;)V",
        "getUri$annotations",
        "()V",
        "Lexpo/modules/video/records/DRMOptions;",
        "getDrm",
        "()Lexpo/modules/video/records/DRMOptions;",
        "setDrm",
        "(Lexpo/modules/video/records/DRMOptions;)V",
        "getDrm$annotations",
        "Lexpo/modules/video/records/VideoMetadata;",
        "getMetadata",
        "()Lexpo/modules/video/records/VideoMetadata;",
        "setMetadata",
        "(Lexpo/modules/video/records/VideoMetadata;)V",
        "getMetadata$annotations",
        "Ljava/util/Map;",
        "getHeaders",
        "()Ljava/util/Map;",
        "setHeaders",
        "(Ljava/util/Map;)V",
        "getHeaders$annotations",
        "Z",
        "getUseCaching",
        "()Z",
        "setUseCaching",
        "(Z)V",
        "getUseCaching$annotations",
        "Lexpo/modules/video/enums/ContentType;",
        "getContentType",
        "()Lexpo/modules/video/enums/ContentType;",
        "getContentType$annotations",
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
.field private final contentType:Lexpo/modules/video/enums/ContentType;

.field private drm:Lexpo/modules/video/records/DRMOptions;

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

.field private metadata:Lexpo/modules/video/records/VideoMetadata;

.field private uri:Landroid/net/Uri;

.field private useCaching:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lexpo/modules/video/records/VideoSource;-><init>(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lexpo/modules/video/records/DRMOptions;",
            "Lexpo/modules/video/records/VideoMetadata;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lexpo/modules/video/enums/ContentType;",
            ")V"
        }
    .end annotation

    const-string v0, "contentType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/video/records/VideoSource;->uri:Landroid/net/Uri;

    .line 4
    iput-object p2, p0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 5
    iput-object p3, p0, Lexpo/modules/video/records/VideoSource;->metadata:Lexpo/modules/video/records/VideoMetadata;

    .line 6
    iput-object p4, p0, Lexpo/modules/video/records/VideoSource;->headers:Ljava/util/Map;

    .line 7
    iput-boolean p5, p0, Lexpo/modules/video/records/VideoSource;->useCaching:Z

    .line 8
    iput-object p6, p0, Lexpo/modules/video/records/VideoSource;->contentType:Lexpo/modules/video/enums/ContentType;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    const/4 p5, 0x0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 9
    sget-object p6, Lexpo/modules/video/enums/ContentType;->AUTO:Lexpo/modules/video/enums/ContentType;

    :cond_5
    move-object p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p7}, Lexpo/modules/video/records/VideoSource;-><init>(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/video/records/VideoSource;->toMediaId$lambda$1(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/video/records/VideoSource;->toMediaId$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic getContentType$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getDrm$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getHeaders$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getMetadata$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getUri$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getUseCaching$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method private final parseLocalAssetId(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "raw"

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    new-instance v1, Landroid/net/Uri$Builder;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, "android.resource"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lw2/o;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Lw2/o;-><init>(Landroid/net/Uri;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lw2/C;

    .line 57
    .line 58
    invoke-direct {v0, p2}, Lw2/C;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lw2/C;->a(Lw2/o;)J

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lw2/C;->c()Landroid/net/Uri;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_0
    .catch Lw2/C$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    return-object p1

    .line 69
    :catch_0
    move-exception p2

    .line 70
    const-string v0, "ExpoVideo"

    .line 71
    .line 72
    const-string v1, "Error parsing local asset id, falling back to original uri"

    .line 73
    .line 74
    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    return-object p1
.end method

.method private final toMediaId()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lexpo/modules/video/records/VideoSource;->uri:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v2, v0, Lexpo/modules/video/records/VideoSource;->headers:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v3, v0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {v3}, Lexpo/modules/video/records/DRMOptions;->getType()Lexpo/modules/video/enums/DRMType;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v3, v4

    .line 18
    :goto_0
    iget-object v5, v0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    invoke-virtual {v5}, Lexpo/modules/video/records/DRMOptions;->getLicenseServer()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v5, v4

    .line 28
    :goto_1
    iget-object v6, v0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 29
    .line 30
    if-eqz v6, :cond_2

    .line 31
    .line 32
    invoke-virtual {v6}, Lexpo/modules/video/records/DRMOptions;->getMultiKey()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move-object v6, v4

    .line 42
    :goto_2
    iget-object v7, v0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 43
    .line 44
    if-eqz v7, :cond_3

    .line 45
    .line 46
    invoke-virtual {v7}, Lexpo/modules/video/records/DRMOptions;->getHeaders()Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-eqz v7, :cond_3

    .line 51
    .line 52
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    if-eqz v7, :cond_3

    .line 57
    .line 58
    move-object v8, v7

    .line 59
    check-cast v8, Ljava/lang/Iterable;

    .line 60
    .line 61
    new-instance v14, LLd/b;

    .line 62
    .line 63
    invoke-direct {v14}, LLd/b;-><init>()V

    .line 64
    .line 65
    .line 66
    const/16 v15, 0x1f

    .line 67
    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    invoke-static/range {v8 .. v16}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    move-object v7, v4

    .line 81
    :goto_3
    iget-object v8, v0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 82
    .line 83
    if-eqz v8, :cond_4

    .line 84
    .line 85
    invoke-virtual {v8}, Lexpo/modules/video/records/DRMOptions;->getHeaders()Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    if-eqz v8, :cond_4

    .line 90
    .line 91
    invoke-interface {v8}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    if-eqz v8, :cond_4

    .line 96
    .line 97
    move-object v9, v8

    .line 98
    check-cast v9, Ljava/lang/Iterable;

    .line 99
    .line 100
    new-instance v15, LLd/c;

    .line 101
    .line 102
    invoke-direct {v15}, LLd/c;-><init>()V

    .line 103
    .line 104
    .line 105
    const/16 v16, 0x1f

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v11, 0x0

    .line 111
    const/4 v12, 0x0

    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    invoke-static/range {v9 .. v17}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    move-object v8, v4

    .line 120
    :goto_4
    iget-object v9, v0, Lexpo/modules/video/records/VideoSource;->metadata:Lexpo/modules/video/records/VideoMetadata;

    .line 121
    .line 122
    if-eqz v9, :cond_5

    .line 123
    .line 124
    invoke-virtual {v9}, Lexpo/modules/video/records/VideoMetadata;->getTitle()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    goto :goto_5

    .line 129
    :cond_5
    move-object v9, v4

    .line 130
    :goto_5
    iget-object v10, v0, Lexpo/modules/video/records/VideoSource;->metadata:Lexpo/modules/video/records/VideoMetadata;

    .line 131
    .line 132
    if-eqz v10, :cond_6

    .line 133
    .line 134
    invoke-virtual {v10}, Lexpo/modules/video/records/VideoMetadata;->getArtist()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    goto :goto_6

    .line 139
    :cond_6
    move-object v10, v4

    .line 140
    :goto_6
    iget-object v11, v0, Lexpo/modules/video/records/VideoSource;->metadata:Lexpo/modules/video/records/VideoMetadata;

    .line 141
    .line 142
    if-eqz v11, :cond_7

    .line 143
    .line 144
    invoke-virtual {v11}, Lexpo/modules/video/records/VideoMetadata;->getArtwork()Landroid/net/Uri;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    if-eqz v11, :cond_7

    .line 149
    .line 150
    invoke-virtual {v11}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    :cond_7
    iget-object v11, v0, Lexpo/modules/video/records/VideoSource;->contentType:Lexpo/modules/video/enums/ContentType;

    .line 155
    .line 156
    invoke-virtual {v11}, Lexpo/modules/video/enums/ContentType;->getValue()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    new-instance v12, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v13, "uri:"

    .line 166
    .line 167
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v1, "Headers: "

    .line 174
    .line 175
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v1, "DrmType:"

    .line 182
    .line 183
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v1, "DrmLicenseServer:"

    .line 190
    .line 191
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v1, "DrmMultiKey:"

    .line 198
    .line 199
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v1, "DRMHeadersKeys:"

    .line 206
    .line 207
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v1, "}DRMHeadersValues:"

    .line 214
    .line 215
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v1, "}NotificationDataTitle:"

    .line 222
    .line 223
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v1, "NotificationDataSecondaryText:"

    .line 230
    .line 231
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v1, "NotificationDataArtwork:"

    .line 238
    .line 239
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v1, "ContentType:"

    .line 246
    .line 247
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    return-object v1
.end method

.method private static final toMediaId$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private static final toMediaId$lambda$1(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public final getContentType()Lexpo/modules/video/enums/ContentType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSource;->contentType:Lexpo/modules/video/enums/ContentType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDrm()Lexpo/modules/video/records/DRMOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 2
    .line 3
    return-object v0
.end method

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
    iget-object v0, p0, Lexpo/modules/video/records/VideoSource;->headers:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMetadata()Lexpo/modules/video/records/VideoMetadata;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSource;->metadata:Lexpo/modules/video/records/VideoMetadata;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoSource;->uri:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUseCaching()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/records/VideoSource;->useCaching:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setDrm(Lexpo/modules/video/records/DRMOptions;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 2
    .line 3
    return-void
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
    iput-object p1, p0, Lexpo/modules/video/records/VideoSource;->headers:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public final setMetadata(Lexpo/modules/video/records/VideoMetadata;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/VideoSource;->metadata:Lexpo/modules/video/records/VideoMetadata;

    .line 2
    .line 3
    return-void
.end method

.method public final setUri(Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/VideoSource;->uri:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public final setUseCaching(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/records/VideoSource;->useCaching:Z

    .line 2
    .line 3
    return-void
.end method

.method public final toMediaItem(Landroid/content/Context;)Lq2/C;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq2/C$c;

    .line 7
    .line 8
    invoke-direct {v0}, Lq2/C$c;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lexpo/modules/video/records/VideoSource;->uri:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-direct {p0, v1, p1}, Lexpo/modules/video/records/VideoSource;->parseLocalAssetId(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Lq2/C$c;->j(Landroid/net/Uri;)Lq2/C$c;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lexpo/modules/video/records/VideoSource;->contentType:Lexpo/modules/video/enums/ContentType;

    .line 21
    .line 22
    invoke-virtual {p1}, Lexpo/modules/video/enums/ContentType;->toMimeTypeString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lq2/C$c;->f(Ljava/lang/String;)Lq2/C$c;

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p0, Lexpo/modules/video/records/VideoSource;->drm:Lexpo/modules/video/records/DRMOptions;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lexpo/modules/video/records/DRMOptions;->getType()Lexpo/modules/video/enums/DRMType;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lexpo/modules/video/enums/DRMType;->isSupported()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Lexpo/modules/video/records/DRMOptions;->toDRMConfiguration()Lq2/C$f;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Lq2/C$c;->b(Lq2/C$f;)Lq2/C$c;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance v0, LFd/B;

    .line 54
    .line 55
    invoke-virtual {p1}, Lexpo/modules/video/records/DRMOptions;->getType()Lexpo/modules/video/enums/DRMType;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {v0, p1}, LFd/B;-><init>(Lexpo/modules/video/enums/DRMType;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_2
    :goto_0
    new-instance p1, Lq2/I$b;

    .line 64
    .line 65
    invoke-direct {p1}, Lq2/I$b;-><init>()V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lexpo/modules/video/records/VideoSource;->metadata:Lexpo/modules/video/records/VideoMetadata;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-virtual {v1}, Lexpo/modules/video/records/VideoMetadata;->getTitle()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p1, v2}, Lq2/I$b;->q0(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lexpo/modules/video/records/VideoMetadata;->getArtist()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p1, v2}, Lq2/I$b;->Q(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Lexpo/modules/video/records/VideoMetadata;->getArtwork()Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1, v1}, Lq2/I$b;->S(Landroid/net/Uri;)Lq2/I$b;

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {p1}, Lq2/I$b;->J()Lq2/I;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v0, p1}, Lq2/C$c;->e(Lq2/I;)Lq2/C$c;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lq2/C$c;->a()Lq2/C;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string v0, "build(...)"

    .line 107
    .line 108
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public final toMediaSource(Landroid/content/Context;)LM2/D;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/video/records/VideoSource;->uri:Landroid/net/Uri;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-static {p1, p0}, LFd/a;->c(Landroid/content/Context;Lexpo/modules/video/records/VideoSource;)LM2/D;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
