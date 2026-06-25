.class final Landroidx/media3/exoplayer/o0$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:LM2/e0;

.field private final c:I

.field private final d:J


# direct methods
.method private constructor <init>(Ljava/util/List;LM2/e0;IJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/o0$b;->a:Ljava/util/List;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/o0$b;->b:LM2/e0;

    .line 5
    iput p3, p0, Landroidx/media3/exoplayer/o0$b;->c:I

    .line 6
    iput-wide p4, p0, Landroidx/media3/exoplayer/o0$b;->d:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;LM2/e0;IJLandroidx/media3/exoplayer/o0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/media3/exoplayer/o0$b;-><init>(Ljava/util/List;LM2/e0;IJ)V

    return-void
.end method

.method static synthetic a(Landroidx/media3/exoplayer/o0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/o0$b;->c:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic b(Landroidx/media3/exoplayer/o0$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/o0$b;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(Landroidx/media3/exoplayer/o0$b;)LM2/e0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/o0$b;->b:LM2/e0;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(Landroidx/media3/exoplayer/o0$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/o0$b;->d:J

    .line 2
    .line 3
    return-wide v0
.end method
