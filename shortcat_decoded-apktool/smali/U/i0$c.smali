.class final LU/i0$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/i0;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Landroidx/compose/ui/layout/s;

.field final synthetic e:Landroidx/compose/ui/layout/s;

.field final synthetic f:Landroidx/compose/ui/layout/s;

.field final synthetic g:Landroidx/compose/ui/layout/s;

.field final synthetic h:Landroidx/compose/ui/layout/s;

.field final synthetic i:Landroidx/compose/ui/layout/s;

.field final synthetic j:Landroidx/compose/ui/layout/s;

.field final synthetic k:Landroidx/compose/ui/layout/s;

.field final synthetic l:LU/i0;

.field final synthetic m:I

.field final synthetic n:Landroidx/compose/ui/layout/l;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;IILandroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;LU/i0;ILandroidx/compose/ui/layout/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/i0$c;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput p2, p0, LU/i0$c;->b:I

    .line 4
    .line 5
    iput p3, p0, LU/i0$c;->c:I

    .line 6
    .line 7
    iput-object p4, p0, LU/i0$c;->d:Landroidx/compose/ui/layout/s;

    .line 8
    .line 9
    iput-object p5, p0, LU/i0$c;->e:Landroidx/compose/ui/layout/s;

    .line 10
    .line 11
    iput-object p6, p0, LU/i0$c;->f:Landroidx/compose/ui/layout/s;

    .line 12
    .line 13
    iput-object p7, p0, LU/i0$c;->g:Landroidx/compose/ui/layout/s;

    .line 14
    .line 15
    iput-object p8, p0, LU/i0$c;->h:Landroidx/compose/ui/layout/s;

    .line 16
    .line 17
    iput-object p9, p0, LU/i0$c;->i:Landroidx/compose/ui/layout/s;

    .line 18
    .line 19
    iput-object p10, p0, LU/i0$c;->j:Landroidx/compose/ui/layout/s;

    .line 20
    .line 21
    iput-object p11, p0, LU/i0$c;->k:Landroidx/compose/ui/layout/s;

    .line 22
    .line 23
    iput-object p12, p0, LU/i0$c;->l:LU/i0;

    .line 24
    .line 25
    iput p13, p0, LU/i0$c;->m:I

    .line 26
    .line 27
    iput-object p14, p0, LU/i0$c;->n:Landroidx/compose/ui/layout/l;

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LU/i0$c;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 32

    move-object/from16 v0, p0

    .line 2
    iget-object v5, v0, LU/i0$c;->a:Landroidx/compose/ui/layout/s;

    if-eqz v5, :cond_0

    .line 3
    iget v2, v0, LU/i0$c;->b:I

    .line 4
    iget v3, v0, LU/i0$c;->c:I

    .line 5
    iget-object v4, v0, LU/i0$c;->d:Landroidx/compose/ui/layout/s;

    .line 6
    iget-object v6, v0, LU/i0$c;->e:Landroidx/compose/ui/layout/s;

    .line 7
    iget-object v7, v0, LU/i0$c;->f:Landroidx/compose/ui/layout/s;

    .line 8
    iget-object v8, v0, LU/i0$c;->g:Landroidx/compose/ui/layout/s;

    .line 9
    iget-object v9, v0, LU/i0$c;->h:Landroidx/compose/ui/layout/s;

    .line 10
    iget-object v10, v0, LU/i0$c;->i:Landroidx/compose/ui/layout/s;

    .line 11
    iget-object v11, v0, LU/i0$c;->j:Landroidx/compose/ui/layout/s;

    .line 12
    iget-object v12, v0, LU/i0$c;->k:Landroidx/compose/ui/layout/s;

    .line 13
    iget-object v1, v0, LU/i0$c;->l:LU/i0;

    invoke-static {v1}, LU/i0;->c(LU/i0;)Z

    move-result v13

    .line 14
    iget v14, v0, LU/i0$c;->m:I

    .line 15
    iget-object v1, v0, LU/i0$c;->a:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v1

    add-int v15, v14, v1

    .line 16
    iget-object v1, v0, LU/i0$c;->l:LU/i0;

    invoke-static {v1}, LU/i0;->a(LU/i0;)F

    move-result v16

    .line 17
    iget-object v1, v0, LU/i0$c;->n:Landroidx/compose/ui/layout/l;

    invoke-interface {v1}, Li1/d;->getDensity()F

    move-result v17

    move-object/from16 v1, p1

    .line 18
    invoke-static/range {v1 .. v17}, LU/h0;->d(Landroidx/compose/ui/layout/s$a;IILandroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;ZIIFF)V

    return-void

    .line 19
    :cond_0
    iget v1, v0, LU/i0$c;->b:I

    .line 20
    iget v2, v0, LU/i0$c;->c:I

    .line 21
    iget-object v3, v0, LU/i0$c;->d:Landroidx/compose/ui/layout/s;

    .line 22
    iget-object v4, v0, LU/i0$c;->e:Landroidx/compose/ui/layout/s;

    .line 23
    iget-object v5, v0, LU/i0$c;->f:Landroidx/compose/ui/layout/s;

    .line 24
    iget-object v6, v0, LU/i0$c;->g:Landroidx/compose/ui/layout/s;

    .line 25
    iget-object v7, v0, LU/i0$c;->h:Landroidx/compose/ui/layout/s;

    .line 26
    iget-object v8, v0, LU/i0$c;->i:Landroidx/compose/ui/layout/s;

    .line 27
    iget-object v9, v0, LU/i0$c;->j:Landroidx/compose/ui/layout/s;

    .line 28
    iget-object v10, v0, LU/i0$c;->k:Landroidx/compose/ui/layout/s;

    .line 29
    iget-object v11, v0, LU/i0$c;->l:LU/i0;

    invoke-static {v11}, LU/i0;->c(LU/i0;)Z

    move-result v29

    .line 30
    iget-object v11, v0, LU/i0$c;->n:Landroidx/compose/ui/layout/l;

    invoke-interface {v11}, Li1/d;->getDensity()F

    move-result v30

    .line 31
    iget-object v11, v0, LU/i0$c;->l:LU/i0;

    invoke-static {v11}, LU/i0;->b(LU/i0;)LC/A;

    move-result-object v31

    move-object/from16 v18, p1

    move/from16 v19, v1

    move/from16 v20, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    move-object/from16 v28, v10

    .line 32
    invoke-static/range {v18 .. v31}, LU/h0;->e(Landroidx/compose/ui/layout/s$a;IILandroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;ZFLC/A;)V

    return-void
.end method
