.class public final LI2/a$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI2/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LI2/a$c;-><init>(Landroid/content/Context;LI2/a$b;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LI2/a$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LI2/a$c;->a:Landroid/content/Context;

    const/4 p1, -0x1

    .line 4
    iput p1, p0, LI2/a$c;->b:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LI2/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI2/a$c;->c()LI2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b(Lq2/x;)I
    .locals 1

    .line 1
    iget-object v0, p1, Lq2/x;->o:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-static {v0}, Lq2/K;->q(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Lt2/a0;->J0(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_1
    const/4 p1, 0x1

    .line 27
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 33
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public c()LI2/a;
    .locals 4

    .line 1
    new-instance v0, LI2/a;

    .line 2
    .line 3
    iget-object v1, p0, LI2/a$c;->a:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, LI2/a$c;->b:I

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3, v2}, LI2/a;-><init>(Landroid/content/Context;LI2/a$b;ILI2/a$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
