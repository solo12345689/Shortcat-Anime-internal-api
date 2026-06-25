.class final Lx/f$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/f;->N1(Lp0/f;Ls0/h0;Ls0/i1$c;JJZF)Lp0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ls0/h0;

.field final synthetic c:J

.field final synthetic d:F

.field final synthetic e:F

.field final synthetic f:J

.field final synthetic g:J

.field final synthetic h:Lu0/k;


# direct methods
.method constructor <init>(ZLs0/h0;JFFJJLu0/k;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx/f$c;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, Lx/f$c;->b:Ls0/h0;

    .line 4
    .line 5
    iput-wide p3, p0, Lx/f$c;->c:J

    .line 6
    .line 7
    iput p5, p0, Lx/f$c;->d:F

    .line 8
    .line 9
    iput p6, p0, Lx/f$c;->e:F

    .line 10
    .line 11
    iput-wide p7, p0, Lx/f$c;->f:J

    .line 12
    .line 13
    iput-wide p9, p0, Lx/f$c;->g:J

    .line 14
    .line 15
    iput-object p11, p0, Lx/f$c;->h:Lu0/k;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/c;

    invoke-virtual {p0, p1}, Lx/f$c;->invoke(Lu0/c;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/c;)V
    .locals 30

    move-object/from16 v1, p0

    .line 2
    invoke-interface/range {p1 .. p1}, Lu0/c;->B1()V

    .line 3
    iget-boolean v0, v1, Lx/f$c;->a:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v3, v1, Lx/f$c;->b:Ls0/h0;

    iget-wide v8, v1, Lx/f$c;->c:J

    const/16 v14, 0xf6

    const/4 v15, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v15}, Lu0/f;->v1(Lu0/f;Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    return-void

    .line 5
    :cond_0
    iget-wide v2, v1, Lx/f$c;->c:J

    invoke-static {v2, v3}, Lr0/a;->d(J)F

    move-result v0

    iget v2, v1, Lx/f$c;->d:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    .line 6
    iget v4, v1, Lx/f$c;->e:F

    .line 7
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Lr0/l;->i(J)F

    move-result v0

    iget v2, v1, Lx/f$c;->e:F

    sub-float v6, v0, v2

    .line 8
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Lr0/l;->g(J)F

    move-result v0

    iget v2, v1, Lx/f$c;->e:F

    sub-float v7, v0, v2

    .line 9
    sget-object v0, Ls0/q0;->a:Ls0/q0$a;

    invoke-virtual {v0}, Ls0/q0$a;->a()I

    move-result v8

    .line 10
    iget-object v0, v1, Lx/f$c;->b:Ls0/h0;

    iget-wide v9, v1, Lx/f$c;->c:J

    .line 11
    invoke-interface/range {p1 .. p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v2

    .line 12
    invoke-interface {v2}, Lu0/d;->f()J

    move-result-wide v11

    .line 13
    invoke-interface {v2}, Lu0/d;->b()Ls0/j0;

    move-result-object v3

    invoke-interface {v3}, Ls0/j0;->p()V

    .line 14
    :try_start_0
    invoke-interface {v2}, Lu0/d;->a()Lu0/h;

    move-result-object v3

    move v5, v4

    .line 15
    invoke-interface/range {v3 .. v8}, Lu0/h;->c(FFFFI)V

    const/16 v28, 0xf6

    const/16 v29, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, p1

    move-object/from16 v17, v0

    move-wide/from16 v22, v9

    .line 16
    invoke-static/range {v16 .. v29}, Lu0/f;->v1(Lu0/f;Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-interface {v2}, Lu0/d;->b()Ls0/j0;

    move-result-object v0

    invoke-interface {v0}, Ls0/j0;->k()V

    .line 18
    invoke-interface {v2, v11, v12}, Lu0/d;->e(J)V

    return-void

    :catchall_0
    move-exception v0

    .line 19
    invoke-interface {v2}, Lu0/d;->b()Ls0/j0;

    move-result-object v3

    invoke-interface {v3}, Ls0/j0;->k()V

    .line 20
    invoke-interface {v2, v11, v12}, Lu0/d;->e(J)V

    throw v0

    .line 21
    :cond_1
    iget-object v0, v1, Lx/f$c;->b:Ls0/h0;

    .line 22
    iget-wide v3, v1, Lx/f$c;->f:J

    .line 23
    iget-wide v5, v1, Lx/f$c;->g:J

    .line 24
    iget-wide v7, v1, Lx/f$c;->c:J

    invoke-static {v7, v8, v2}, Lx/e;->d(JF)J

    move-result-wide v22

    .line 25
    iget-object v2, v1, Lx/f$c;->h:Lu0/k;

    const/16 v28, 0xd0

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, p1

    move-object/from16 v17, v0

    move-object/from16 v25, v2

    move-wide/from16 v18, v3

    move-wide/from16 v20, v5

    .line 26
    invoke-static/range {v16 .. v29}, Lu0/f;->v1(Lu0/f;Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    return-void
.end method
