.class final LK/d$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/d;->e(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LU0/e;

.field final synthetic c:Lkotlin/jvm/functions/Function1;

.field final synthetic d:Z

.field final synthetic e:Ljava/util/Map;

.field final synthetic f:LU0/Y0;

.field final synthetic g:I

.field final synthetic h:Z

.field final synthetic i:I

.field final synthetic j:I

.field final synthetic k:LY0/u$b;

.field final synthetic l:LP/g;

.field final synthetic m:Ls0/t0;

.field final synthetic n:Lkotlin/jvm/functions/Function1;

.field final synthetic o:I

.field final synthetic p:I

.field final synthetic q:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/d$h;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, LK/d$h;->b:LU0/e;

    .line 4
    .line 5
    iput-object p3, p0, LK/d$h;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iput-boolean p4, p0, LK/d$h;->d:Z

    .line 8
    .line 9
    iput-object p5, p0, LK/d$h;->e:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p6, p0, LK/d$h;->f:LU0/Y0;

    .line 12
    .line 13
    iput p7, p0, LK/d$h;->g:I

    .line 14
    .line 15
    iput-boolean p8, p0, LK/d$h;->h:Z

    .line 16
    .line 17
    iput p9, p0, LK/d$h;->i:I

    .line 18
    .line 19
    iput p10, p0, LK/d$h;->j:I

    .line 20
    .line 21
    iput-object p11, p0, LK/d$h;->k:LY0/u$b;

    .line 22
    .line 23
    iput-object p12, p0, LK/d$h;->l:LP/g;

    .line 24
    .line 25
    iput-object p13, p0, LK/d$h;->m:Ls0/t0;

    .line 26
    .line 27
    iput-object p14, p0, LK/d$h;->n:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iput p15, p0, LK/d$h;->o:I

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput p1, p0, LK/d$h;->p:I

    .line 34
    .line 35
    move/from16 p1, p17

    .line 36
    .line 37
    iput p1, p0, LK/d$h;->q:I

    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LK/d$h;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 19

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, LK/d$h;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LK/d$h;->b:LU0/e;

    iget-object v3, v0, LK/d$h;->c:Lkotlin/jvm/functions/Function1;

    iget-boolean v4, v0, LK/d$h;->d:Z

    iget-object v5, v0, LK/d$h;->e:Ljava/util/Map;

    iget-object v6, v0, LK/d$h;->f:LU0/Y0;

    iget v7, v0, LK/d$h;->g:I

    iget-boolean v8, v0, LK/d$h;->h:Z

    iget v9, v0, LK/d$h;->i:I

    iget v10, v0, LK/d$h;->j:I

    iget-object v11, v0, LK/d$h;->k:LY0/u$b;

    iget-object v12, v0, LK/d$h;->l:LP/g;

    iget-object v13, v0, LK/d$h;->m:Ls0/t0;

    iget-object v14, v0, LK/d$h;->n:Lkotlin/jvm/functions/Function1;

    iget v15, v0, LK/d$h;->o:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, LY/g1;->a(I)I

    move-result v16

    iget v15, v0, LK/d$h;->p:I

    invoke-static {v15}, LY/g1;->a(I)I

    move-result v17

    iget v15, v0, LK/d$h;->q:I

    move/from16 v18, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LK/d;->g(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;LY/m;III)V

    return-void
.end method
