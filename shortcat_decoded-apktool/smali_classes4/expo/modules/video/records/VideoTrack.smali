.class public final Lexpo/modules/video/records/VideoTrack;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/video/records/VideoTrack$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008)\u0008\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0016\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0017\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u001b\u0012\u0004\u0008\u001e\u0010\u001a\u001a\u0004\u0008\u001c\u0010\u001dR \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u001f\u0012\u0004\u0008\"\u0010\u001a\u001a\u0004\u0008 \u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0016\u0012\u0004\u0008$\u0010\u001a\u001a\u0004\u0008#\u0010\u0018R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010%\u0012\u0004\u0008\'\u0010\u001a\u001a\u0004\u0008\u000b\u0010&R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010(\u0012\u0004\u0008+\u0010\u001a\u001a\u0004\u0008)\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010(\u0012\u0004\u0008-\u0010\u001a\u001a\u0004\u0008,\u0010*R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010(\u0012\u0004\u0008/\u0010\u001a\u001a\u0004\u0008.\u0010*R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u00100\u0012\u0004\u00083\u0010\u001a\u001a\u0004\u00081\u00102R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108\u00a8\u0006;"
    }
    d2 = {
        "Lexpo/modules/video/records/VideoTrack;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "",
        "id",
        "Landroid/net/Uri;",
        "url",
        "Lexpo/modules/video/records/VideoSize;",
        "size",
        "mimeType",
        "",
        "isSupported",
        "",
        "bitrate",
        "averageBitrate",
        "peakBitrate",
        "",
        "frameRate",
        "Lq2/x;",
        "format",
        "<init>",
        "(Ljava/lang/String;Landroid/net/Uri;Lexpo/modules/video/records/VideoSize;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lq2/x;)V",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getId$annotations",
        "()V",
        "Landroid/net/Uri;",
        "getUrl",
        "()Landroid/net/Uri;",
        "getUrl$annotations",
        "Lexpo/modules/video/records/VideoSize;",
        "getSize",
        "()Lexpo/modules/video/records/VideoSize;",
        "getSize$annotations",
        "getMimeType",
        "getMimeType$annotations",
        "Z",
        "()Z",
        "isSupported$annotations",
        "Ljava/lang/Integer;",
        "getBitrate",
        "()Ljava/lang/Integer;",
        "getBitrate$annotations",
        "getAverageBitrate",
        "getAverageBitrate$annotations",
        "getPeakBitrate",
        "getPeakBitrate$annotations",
        "Ljava/lang/Float;",
        "getFrameRate",
        "()Ljava/lang/Float;",
        "getFrameRate$annotations",
        "Lq2/x;",
        "getFormat",
        "()Lq2/x;",
        "setFormat",
        "(Lq2/x;)V",
        "Companion",
        "a",
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


# static fields
.field public static final Companion:Lexpo/modules/video/records/VideoTrack$a;


# instance fields
.field private final averageBitrate:Ljava/lang/Integer;

.field private final bitrate:Ljava/lang/Integer;

.field private format:Lq2/x;

.field private final frameRate:Ljava/lang/Float;

.field private final id:Ljava/lang/String;

.field private final isSupported:Z

.field private final mimeType:Ljava/lang/String;

.field private final peakBitrate:Ljava/lang/Integer;

.field private final size:Lexpo/modules/video/records/VideoSize;

.field private final url:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/video/records/VideoTrack$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/video/records/VideoTrack$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/video/records/VideoTrack;->Companion:Lexpo/modules/video/records/VideoTrack$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;Lexpo/modules/video/records/VideoSize;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lq2/x;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/video/records/VideoTrack;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lexpo/modules/video/records/VideoTrack;->url:Landroid/net/Uri;

    .line 4
    iput-object p3, p0, Lexpo/modules/video/records/VideoTrack;->size:Lexpo/modules/video/records/VideoSize;

    .line 5
    iput-object p4, p0, Lexpo/modules/video/records/VideoTrack;->mimeType:Ljava/lang/String;

    .line 6
    iput-boolean p5, p0, Lexpo/modules/video/records/VideoTrack;->isSupported:Z

    .line 7
    iput-object p6, p0, Lexpo/modules/video/records/VideoTrack;->bitrate:Ljava/lang/Integer;

    .line 8
    iput-object p7, p0, Lexpo/modules/video/records/VideoTrack;->averageBitrate:Ljava/lang/Integer;

    .line 9
    iput-object p8, p0, Lexpo/modules/video/records/VideoTrack;->peakBitrate:Ljava/lang/Integer;

    .line 10
    iput-object p9, p0, Lexpo/modules/video/records/VideoTrack;->frameRate:Ljava/lang/Float;

    .line 11
    iput-object p10, p0, Lexpo/modules/video/records/VideoTrack;->format:Lq2/x;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/net/Uri;Lexpo/modules/video/records/VideoSize;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lq2/x;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v7, v1

    goto :goto_0

    :cond_0
    move/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_5

    move-object v12, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object v2, p0

    goto :goto_5

    :cond_5
    move-object/from16 v12, p10

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    .line 12
    :goto_5
    invoke-direct/range {v2 .. v12}, Lexpo/modules/video/records/VideoTrack;-><init>(Ljava/lang/String;Landroid/net/Uri;Lexpo/modules/video/records/VideoSize;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lq2/x;)V

    return-void
.end method

.method public static synthetic getAverageBitrate$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getBitrate$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getFrameRate$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getMimeType$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPeakBitrate$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSize$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getUrl$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic isSupported$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getAverageBitrate()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->averageBitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBitrate()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->bitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFormat()Lq2/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->format:Lq2/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFrameRate()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->frameRate:Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPeakBitrate()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->peakBitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSize()Lexpo/modules/video/records/VideoSize;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->size:Lexpo/modules/video/records/VideoSize;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUrl()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/VideoTrack;->url:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isSupported()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/records/VideoTrack;->isSupported:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setFormat(Lq2/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/VideoTrack;->format:Lq2/x;

    .line 2
    .line 3
    return-void
.end method
