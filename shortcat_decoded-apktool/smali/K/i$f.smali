.class final LK/i$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i;->a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:La1/U;

.field final synthetic b:Lkotlin/jvm/functions/Function1;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:LU0/Y0;

.field final synthetic e:La1/f0;

.field final synthetic f:Lkotlin/jvm/functions/Function1;

.field final synthetic g:LB/m;

.field final synthetic h:Ls0/h0;

.field final synthetic i:Z

.field final synthetic j:I

.field final synthetic k:I

.field final synthetic l:La1/t;

.field final synthetic m:LK/w;

.field final synthetic n:Z

.field final synthetic o:Z

.field final synthetic p:Lie/o;

.field final synthetic q:I

.field final synthetic r:I

.field final synthetic s:I


# direct methods
.method constructor <init>(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;III)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$f;->a:La1/U;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$f;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$f;->c:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$f;->d:LU0/Y0;

    .line 8
    .line 9
    iput-object p5, p0, LK/i$f;->e:La1/f0;

    .line 10
    .line 11
    iput-object p6, p0, LK/i$f;->f:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iput-object p7, p0, LK/i$f;->g:LB/m;

    .line 14
    .line 15
    iput-object p8, p0, LK/i$f;->h:Ls0/h0;

    .line 16
    .line 17
    iput-boolean p9, p0, LK/i$f;->i:Z

    .line 18
    .line 19
    iput p10, p0, LK/i$f;->j:I

    .line 20
    .line 21
    iput p11, p0, LK/i$f;->k:I

    .line 22
    .line 23
    iput-object p12, p0, LK/i$f;->l:La1/t;

    .line 24
    .line 25
    iput-object p13, p0, LK/i$f;->m:LK/w;

    .line 26
    .line 27
    iput-boolean p14, p0, LK/i$f;->n:Z

    .line 28
    .line 29
    iput-boolean p15, p0, LK/i$f;->o:Z

    .line 30
    .line 31
    move-object/from16 p1, p16

    .line 32
    .line 33
    iput-object p1, p0, LK/i$f;->p:Lie/o;

    .line 34
    .line 35
    move/from16 p1, p17

    .line 36
    .line 37
    iput p1, p0, LK/i$f;->q:I

    .line 38
    .line 39
    move/from16 p1, p18

    .line 40
    .line 41
    iput p1, p0, LK/i$f;->r:I

    .line 42
    .line 43
    move/from16 p1, p19

    .line 44
    .line 45
    iput p1, p0, LK/i$f;->s:I

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 49
    .line 50
    .line 51
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

    invoke-virtual {p0, p1, p2}, LK/i$f;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 21

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, LK/i$f;->a:La1/U;

    iget-object v2, v0, LK/i$f;->b:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, LK/i$f;->c:Landroidx/compose/ui/e;

    iget-object v4, v0, LK/i$f;->d:LU0/Y0;

    iget-object v5, v0, LK/i$f;->e:La1/f0;

    iget-object v6, v0, LK/i$f;->f:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, LK/i$f;->g:LB/m;

    iget-object v8, v0, LK/i$f;->h:Ls0/h0;

    iget-boolean v9, v0, LK/i$f;->i:Z

    iget v10, v0, LK/i$f;->j:I

    iget v11, v0, LK/i$f;->k:I

    iget-object v12, v0, LK/i$f;->l:La1/t;

    iget-object v13, v0, LK/i$f;->m:LK/w;

    iget-boolean v14, v0, LK/i$f;->n:Z

    iget-boolean v15, v0, LK/i$f;->o:Z

    move-object/from16 v16, v1

    iget-object v1, v0, LK/i$f;->p:Lie/o;

    move-object/from16 v17, v1

    iget v1, v0, LK/i$f;->q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LY/g1;->a(I)I

    move-result v18

    iget v1, v0, LK/i$f;->r:I

    invoke-static {v1}, LY/g1;->a(I)I

    move-result v19

    iget v1, v0, LK/i$f;->s:I

    move/from16 v20, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, p1

    invoke-static/range {v1 .. v20}, LK/i;->a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V

    return-void
.end method
