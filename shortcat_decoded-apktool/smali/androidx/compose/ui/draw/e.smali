.class final Landroidx/compose/ui/draw/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls0/Z0;


# instance fields
.field private a:Lt/L;

.field private b:Ls0/Z0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lv0/c;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/e;->b:Ls0/Z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-nez v1, :cond_1

    .line 9
    .line 10
    const-string v1, "GraphicsContext not provided"

    .line 11
    .line 12
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-interface {v0}, Ls0/Z0;->a()Lv0/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Landroidx/compose/ui/draw/e;->a:Lt/L;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-static {v0}, Lt/W;->c(Ljava/lang/Object;)Lt/L;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Landroidx/compose/ui/draw/e;->a:Lt/L;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_2
    invoke-virtual {v1, v0}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public b(Lv0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/e;->b:Ls0/Z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ls0/Z0;->b(Lv0/c;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final c()Ls0/Z0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/e;->b:Ls0/Z0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/e;->a:Lt/L;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lt/V;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v2, v0, Lt/V;->b:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v4, v1, v3

    .line 13
    .line 14
    check-cast v4, Lv0/c;

    .line 15
    .line 16
    invoke-virtual {p0, v4}, Landroidx/compose/ui/draw/e;->b(Lv0/c;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Lt/L;->n()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final e(Ls0/Z0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/e;->d()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/draw/e;->b:Ls0/Z0;

    .line 5
    .line 6
    return-void
.end method
