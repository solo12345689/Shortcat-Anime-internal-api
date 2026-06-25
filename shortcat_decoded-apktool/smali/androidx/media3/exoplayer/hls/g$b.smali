.class Landroidx/media3/exoplayer/hls/g$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/media3/exoplayer/hls/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/exoplayer/hls/g;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/hls/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/hls/g;Landroidx/media3/exoplayer/hls/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/g$b;-><init>(Landroidx/media3/exoplayer/hls/g;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/hls/l;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/hls/g;->p(Landroidx/media3/exoplayer/hls/g;)LM2/C$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 8
    .line 9
    invoke-interface {p1, v0}, LM2/d0$a;->j(LM2/d0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public e()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/g;->j(Landroidx/media3/exoplayer/hls/g;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/g;->m(Landroidx/media3/exoplayer/hls/g;)[Landroidx/media3/exoplayer/hls/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    array-length v1, v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v3, v1, :cond_1

    .line 21
    .line 22
    aget-object v5, v0, v3

    .line 23
    .line 24
    invoke-virtual {v5}, Landroidx/media3/exoplayer/hls/l;->s()LM2/n0;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    iget v5, v5, LM2/n0;->a:I

    .line 29
    .line 30
    add-int/2addr v4, v5

    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-array v0, v4, [Lq2/a0;

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 37
    .line 38
    invoke-static {v1}, Landroidx/media3/exoplayer/hls/g;->m(Landroidx/media3/exoplayer/hls/g;)[Landroidx/media3/exoplayer/hls/l;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    array-length v3, v1

    .line 43
    move v4, v2

    .line 44
    move v5, v4

    .line 45
    :goto_1
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    aget-object v6, v1, v4

    .line 48
    .line 49
    invoke-virtual {v6}, Landroidx/media3/exoplayer/hls/l;->s()LM2/n0;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    iget v7, v7, LM2/n0;->a:I

    .line 54
    .line 55
    move v8, v2

    .line 56
    :goto_2
    if-ge v8, v7, :cond_2

    .line 57
    .line 58
    add-int/lit8 v9, v5, 0x1

    .line 59
    .line 60
    invoke-virtual {v6}, Landroidx/media3/exoplayer/hls/l;->s()LM2/n0;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-virtual {v10, v8}, LM2/n0;->b(I)Lq2/a0;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    aput-object v10, v0, v5

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    move v5, v9

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 78
    .line 79
    new-instance v2, LM2/n0;

    .line 80
    .line 81
    invoke-direct {v2, v0}, LM2/n0;-><init>([Lq2/a0;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v2}, Landroidx/media3/exoplayer/hls/g;->n(Landroidx/media3/exoplayer/hls/g;LM2/n0;)LM2/n0;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 88
    .line 89
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/g;->p(Landroidx/media3/exoplayer/hls/g;)LM2/C$a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 94
    .line 95
    invoke-interface {v0, v1}, LM2/C$a;->b(LM2/C;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public bridge synthetic j(LM2/d0;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/hls/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/g$b;->a(Landroidx/media3/exoplayer/hls/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/g$b;->a:Landroidx/media3/exoplayer/hls/g;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/hls/g;->t(Landroidx/media3/exoplayer/hls/g;)LH2/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, LH2/m;->f(Landroid/net/Uri;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
