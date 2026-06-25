.class final Landroidx/media3/exoplayer/Y$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/media3/exoplayer/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LM2/D;

.field private c:Lq2/Y;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LM2/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/Y$e;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/Y$e;->b:LM2/D;

    .line 7
    .line 8
    invoke-virtual {p2}, LM2/A;->W()Lq2/Y;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/Y$e;->c:Lq2/Y;

    .line 13
    .line 14
    return-void
.end method

.method static synthetic b(Landroidx/media3/exoplayer/Y$e;)LM2/D;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y$e;->b:LM2/D;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Lq2/Y;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y$e;->c:Lq2/Y;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Lq2/Y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y$e;->c:Lq2/Y;

    .line 2
    .line 3
    return-void
.end method

.method public s()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y$e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
