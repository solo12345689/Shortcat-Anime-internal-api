.class public final Lexpo/modules/video/records/BufferOptions;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u001e\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\u000c\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0006\u0010\u0013\u0012\u0004\u0008\u0018\u0010\u0012\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R(\u0010\u0008\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0008\u0010\u0019\u0012\u0004\u0008\u001e\u0010\u0012\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR(\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\t\u0010\u001f\u0012\u0004\u0008$\u0010\u0012\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lexpo/modules/video/records/BufferOptions;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "",
        "preferredForwardBufferDuration",
        "",
        "maxBufferBytes",
        "",
        "prioritizeTimeOverSizeThreshold",
        "minBufferForPlayback",
        "<init>",
        "(Ljava/lang/Double;JZD)V",
        "Ljava/lang/Double;",
        "getPreferredForwardBufferDuration",
        "()Ljava/lang/Double;",
        "setPreferredForwardBufferDuration",
        "(Ljava/lang/Double;)V",
        "getPreferredForwardBufferDuration$annotations",
        "()V",
        "J",
        "getMaxBufferBytes",
        "()J",
        "setMaxBufferBytes",
        "(J)V",
        "getMaxBufferBytes$annotations",
        "Z",
        "getPrioritizeTimeOverSizeThreshold",
        "()Z",
        "setPrioritizeTimeOverSizeThreshold",
        "(Z)V",
        "getPrioritizeTimeOverSizeThreshold$annotations",
        "D",
        "getMinBufferForPlayback",
        "()D",
        "setMinBufferForPlayback",
        "(D)V",
        "getMinBufferForPlayback$annotations",
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
.field private maxBufferBytes:J

.field private minBufferForPlayback:D

.field private preferredForwardBufferDuration:Ljava/lang/Double;

.field private prioritizeTimeOverSizeThreshold:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lexpo/modules/video/records/BufferOptions;-><init>(Ljava/lang/Double;JZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;JZD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/video/records/BufferOptions;->preferredForwardBufferDuration:Ljava/lang/Double;

    .line 4
    iput-wide p2, p0, Lexpo/modules/video/records/BufferOptions;->maxBufferBytes:J

    .line 5
    iput-boolean p4, p0, Lexpo/modules/video/records/BufferOptions;->prioritizeTimeOverSizeThreshold:Z

    .line 6
    iput-wide p5, p0, Lexpo/modules/video/records/BufferOptions;->minBufferForPlayback:D

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Double;JZDILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    const/4 p4, 0x0

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    const-wide/high16 p5, 0x3ff0000000000000L    # 1.0

    :cond_3
    move-wide p7, p5

    move p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    .line 7
    invoke-direct/range {p2 .. p8}, Lexpo/modules/video/records/BufferOptions;-><init>(Ljava/lang/Double;JZD)V

    return-void
.end method

.method public static synthetic getMaxBufferBytes$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getMinBufferForPlayback$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPreferredForwardBufferDuration$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPrioritizeTimeOverSizeThreshold$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getMaxBufferBytes()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/records/BufferOptions;->maxBufferBytes:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMinBufferForPlayback()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/records/BufferOptions;->minBufferForPlayback:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getPreferredForwardBufferDuration()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/BufferOptions;->preferredForwardBufferDuration:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrioritizeTimeOverSizeThreshold()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/records/BufferOptions;->prioritizeTimeOverSizeThreshold:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setMaxBufferBytes(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lexpo/modules/video/records/BufferOptions;->maxBufferBytes:J

    .line 2
    .line 3
    return-void
.end method

.method public final setMinBufferForPlayback(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lexpo/modules/video/records/BufferOptions;->minBufferForPlayback:D

    .line 2
    .line 3
    return-void
.end method

.method public final setPreferredForwardBufferDuration(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/records/BufferOptions;->preferredForwardBufferDuration:Ljava/lang/Double;

    .line 2
    .line 3
    return-void
.end method

.method public final setPrioritizeTimeOverSizeThreshold(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/records/BufferOptions;->prioritizeTimeOverSizeThreshold:Z

    .line 2
    .line 3
    return-void
.end method
