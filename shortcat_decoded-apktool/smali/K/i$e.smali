.class final LK/i$e;
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
.field final synthetic a:Lie/o;

.field final synthetic b:LK/y;

.field final synthetic c:LU0/Y0;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:LK/V;

.field final synthetic g:La1/U;

.field final synthetic h:La1/f0;

.field final synthetic i:Landroidx/compose/ui/e;

.field final synthetic j:Landroidx/compose/ui/e;

.field final synthetic k:Landroidx/compose/ui/e;

.field final synthetic l:Landroidx/compose/ui/e;

.field final synthetic m:LH/b;

.field final synthetic n:LQ/F;

.field final synthetic o:Z

.field final synthetic p:Z

.field final synthetic q:Lkotlin/jvm/functions/Function1;

.field final synthetic r:La1/J;

.field final synthetic s:Li1/d;


# direct methods
.method constructor <init>(Lie/o;LK/y;LU0/Y0;IILK/V;La1/U;La1/f0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LH/b;LQ/F;ZZLkotlin/jvm/functions/Function1;La1/J;Li1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$e;->a:Lie/o;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$e;->b:LK/y;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$e;->c:LU0/Y0;

    .line 6
    .line 7
    iput p4, p0, LK/i$e;->d:I

    .line 8
    .line 9
    iput p5, p0, LK/i$e;->e:I

    .line 10
    .line 11
    iput-object p6, p0, LK/i$e;->f:LK/V;

    .line 12
    .line 13
    iput-object p7, p0, LK/i$e;->g:La1/U;

    .line 14
    .line 15
    iput-object p8, p0, LK/i$e;->h:La1/f0;

    .line 16
    .line 17
    iput-object p9, p0, LK/i$e;->i:Landroidx/compose/ui/e;

    .line 18
    .line 19
    iput-object p10, p0, LK/i$e;->j:Landroidx/compose/ui/e;

    .line 20
    .line 21
    iput-object p11, p0, LK/i$e;->k:Landroidx/compose/ui/e;

    .line 22
    .line 23
    iput-object p12, p0, LK/i$e;->l:Landroidx/compose/ui/e;

    .line 24
    .line 25
    iput-object p13, p0, LK/i$e;->m:LH/b;

    .line 26
    .line 27
    iput-object p14, p0, LK/i$e;->n:LQ/F;

    .line 28
    .line 29
    iput-boolean p15, p0, LK/i$e;->o:Z

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput-boolean p1, p0, LK/i$e;->p:Z

    .line 34
    .line 35
    move-object/from16 p1, p17

    .line 36
    .line 37
    iput-object p1, p0, LK/i$e;->q:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    move-object/from16 p1, p18

    .line 40
    .line 41
    iput-object p1, p0, LK/i$e;->r:La1/J;

    .line 42
    .line 43
    move-object/from16 p1, p19

    .line 44
    .line 45
    iput-object p1, p0, LK/i$e;->s:Li1/d;

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

    invoke-virtual {p0, p1, p2}, LK/i$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 2
    invoke-interface {v1}, LY/m;->i()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)"

    const v5, -0x164ff220

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, LK/i$e;->a:Lie/o;

    new-instance v3, LK/i$e$a;

    iget-object v4, v0, LK/i$e;->b:LK/y;

    iget-object v5, v0, LK/i$e;->c:LU0/Y0;

    iget v6, v0, LK/i$e;->d:I

    iget v7, v0, LK/i$e;->e:I

    iget-object v8, v0, LK/i$e;->f:LK/V;

    iget-object v9, v0, LK/i$e;->g:La1/U;

    iget-object v10, v0, LK/i$e;->h:La1/f0;

    iget-object v11, v0, LK/i$e;->i:Landroidx/compose/ui/e;

    iget-object v12, v0, LK/i$e;->j:Landroidx/compose/ui/e;

    iget-object v13, v0, LK/i$e;->k:Landroidx/compose/ui/e;

    iget-object v14, v0, LK/i$e;->l:Landroidx/compose/ui/e;

    iget-object v15, v0, LK/i$e;->m:LH/b;

    move-object/from16 p2, v3

    iget-object v3, v0, LK/i$e;->n:LQ/F;

    move-object/from16 v16, v3

    iget-boolean v3, v0, LK/i$e;->o:Z

    move/from16 v17, v3

    iget-boolean v3, v0, LK/i$e;->p:Z

    move/from16 v18, v3

    iget-object v3, v0, LK/i$e;->q:Lkotlin/jvm/functions/Function1;

    move-object/from16 v19, v3

    iget-object v3, v0, LK/i$e;->r:La1/J;

    move-object/from16 v20, v3

    iget-object v3, v0, LK/i$e;->s:Li1/d;

    move-object/from16 v21, v3

    move-object/from16 v3, p2

    invoke-direct/range {v3 .. v21}, LK/i$e$a;-><init>(LK/y;LU0/Y0;IILK/V;La1/U;La1/f0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LH/b;LQ/F;ZZLkotlin/jvm/functions/Function1;La1/J;Li1/d;)V

    const/16 v4, 0x36

    const v5, 0x7925855b

    const/4 v6, 0x1

    invoke-static {v5, v6, v3, v1, v4}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v1, v4}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
