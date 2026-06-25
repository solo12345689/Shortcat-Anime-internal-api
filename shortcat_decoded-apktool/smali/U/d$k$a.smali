.class final LU/d$k$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d$k;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/s;

.field final synthetic d:LC/b$e;

.field final synthetic e:J

.field final synthetic f:Landroidx/compose/ui/layout/s;

.field final synthetic g:Landroidx/compose/ui/layout/l;

.field final synthetic h:LC/b$m;

.field final synthetic i:I

.field final synthetic j:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;ILandroidx/compose/ui/layout/s;LC/b$e;JLandroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;LC/b$m;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$k$a;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput p2, p0, LU/d$k$a;->b:I

    .line 4
    .line 5
    iput-object p3, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    .line 6
    .line 7
    iput-object p4, p0, LU/d$k$a;->d:LC/b$e;

    .line 8
    .line 9
    iput-wide p5, p0, LU/d$k$a;->e:J

    .line 10
    .line 11
    iput-object p7, p0, LU/d$k$a;->f:Landroidx/compose/ui/layout/s;

    .line 12
    .line 13
    iput-object p8, p0, LU/d$k$a;->g:Landroidx/compose/ui/layout/l;

    .line 14
    .line 15
    iput-object p9, p0, LU/d$k$a;->h:LC/b$m;

    .line 16
    .line 17
    iput p10, p0, LU/d$k$a;->i:I

    .line 18
    .line 19
    iput p11, p0, LU/d$k$a;->j:I

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LU/d$k$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 14

    .line 2
    iget-object v1, p0, LU/d$k$a;->a:Landroidx/compose/ui/layout/s;

    .line 3
    iget v0, p0, LU/d$k$a;->b:I

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v2

    sub-int/2addr v0, v2

    div-int/lit8 v3, v0, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    .line 4
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    move-object v7, v0

    .line 5
    iget-object v8, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    .line 6
    iget-object p1, p0, LU/d$k$a;->d:LC/b$e;

    .line 7
    sget-object v0, LC/b;->a:LC/b;

    invoke-virtual {v0}, LC/b;->b()LC/b$f;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    iget-wide v1, p0, LU/d$k$a;->e:J

    invoke-static {v1, v2}, Li1/b;->l(J)I

    move-result p1

    iget-object v1, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    sub-int/2addr p1, v1

    div-int/lit8 p1, p1, 0x2

    .line 9
    iget-object v1, p0, LU/d$k$a;->a:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 10
    iget-object v1, p0, LU/d$k$a;->a:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    sub-int/2addr v1, p1

    :goto_0
    add-int/2addr p1, v1

    goto :goto_1

    .line 11
    :cond_0
    iget-object v1, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    add-int/2addr v1, p1

    .line 12
    iget-wide v2, p0, LU/d$k$a;->e:J

    invoke-static {v2, v3}, Li1/b;->l(J)I

    move-result v2

    iget-object v3, p0, LU/d$k$a;->f:Landroidx/compose/ui/layout/s;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v3

    sub-int/2addr v2, v3

    if-le v1, v2, :cond_1

    .line 13
    iget-wide v1, p0, LU/d$k$a;->e:J

    invoke-static {v1, v2}, Li1/b;->l(J)I

    move-result v1

    iget-object v2, p0, LU/d$k$a;->f:Landroidx/compose/ui/layout/s;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v2

    sub-int/2addr v1, v2

    .line 14
    iget-object v2, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v2

    add-int/2addr v2, p1

    sub-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :goto_1
    move v9, p1

    goto :goto_2

    .line 15
    :cond_2
    invoke-virtual {v0}, LC/b;->c()LC/b$e;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 16
    iget-wide v1, p0, LU/d$k$a;->e:J

    invoke-static {v1, v2}, Li1/b;->l(J)I

    move-result p1

    iget-object v1, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    sub-int/2addr p1, v1

    iget-object v1, p0, LU/d$k$a;->f:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    sub-int/2addr p1, v1

    goto :goto_1

    .line 17
    :cond_3
    iget-object p1, p0, LU/d$k$a;->g:Landroidx/compose/ui/layout/l;

    invoke-static {}, LU/d;->k()F

    move-result v1

    invoke-interface {p1, v1}, Li1/d;->s0(F)I

    move-result p1

    iget-object v1, p0, LU/d$k$a;->a:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_1

    .line 18
    :goto_2
    iget-object p1, p0, LU/d$k$a;->h:LC/b$m;

    .line 19
    invoke-virtual {v0}, LC/b;->b()LC/b$f;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget p1, p0, LU/d$k$a;->b:I

    iget-object v0, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v0

    sub-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x2

    :goto_3
    move v10, p1

    goto :goto_4

    .line 20
    :cond_4
    invoke-virtual {v0}, LC/b;->a()LC/b$m;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    .line 21
    iget p1, p0, LU/d$k$a;->i:I

    if-nez p1, :cond_5

    .line 22
    iget p1, p0, LU/d$k$a;->b:I

    iget-object v0, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_3

    .line 23
    :cond_5
    iget-object v1, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v1

    iget v2, p0, LU/d$k$a;->j:I

    sub-int/2addr v1, v2

    sub-int/2addr p1, v1

    .line 24
    iget-object v1, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v1

    add-int/2addr v1, p1

    .line 25
    iget-wide v2, p0, LU/d$k$a;->e:J

    invoke-static {v2, v3}, Li1/b;->k(J)I

    move-result v2

    if-le v1, v2, :cond_6

    .line 26
    iget-wide v2, p0, LU/d$k$a;->e:J

    invoke-static {v2, v3}, Li1/b;->k(J)I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr p1, v1

    .line 27
    :cond_6
    iget v1, p0, LU/d$k$a;->b:I

    iget-object v2, p0, LU/d$k$a;->c:Landroidx/compose/ui/layout/s;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int p1, v1, p1

    goto :goto_3

    :cond_7
    move v10, v0

    :goto_4
    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    .line 28
    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    .line 29
    iget-object v8, p0, LU/d$k$a;->f:Landroidx/compose/ui/layout/s;

    .line 30
    iget-wide v0, p0, LU/d$k$a;->e:J

    invoke-static {v0, v1}, Li1/b;->l(J)I

    move-result p1

    iget-object v0, p0, LU/d$k$a;->f:Landroidx/compose/ui/layout/s;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v0

    sub-int v9, p1, v0

    .line 31
    iget p1, p0, LU/d$k$a;->b:I

    iget-object v0, p0, LU/d$k$a;->f:Landroidx/compose/ui/layout/s;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v0

    sub-int/2addr p1, v0

    div-int/lit8 v10, p1, 0x2

    .line 32
    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void
.end method
