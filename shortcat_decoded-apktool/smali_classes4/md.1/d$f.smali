.class final Lmd/d$f;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/d;->u(Landroidx/media3/exoplayer/ExoPlayer;Ljava/lang/String;JLjava/util/Map;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lmd/d;

.field e:I


# direct methods
.method constructor <init>(Lmd/d;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/d$f;->d:Lmd/d;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(LZd/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iput-object p1, p0, Lmd/d$f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lmd/d$f;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lmd/d$f;->e:I

    .line 9
    .line 10
    iget-object v0, p0, Lmd/d$f;->d:Lmd/d;

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    move-object v6, p0

    .line 18
    invoke-static/range {v0 .. v6}, Lmd/d;->f(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;Ljava/lang/String;JLjava/util/Map;LZd/e;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
