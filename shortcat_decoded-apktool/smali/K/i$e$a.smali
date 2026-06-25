.class final LK/i$e$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$e;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/y;

.field final synthetic b:LU0/Y0;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:LK/V;

.field final synthetic f:La1/U;

.field final synthetic g:La1/f0;

.field final synthetic h:Landroidx/compose/ui/e;

.field final synthetic i:Landroidx/compose/ui/e;

.field final synthetic j:Landroidx/compose/ui/e;

.field final synthetic k:Landroidx/compose/ui/e;

.field final synthetic l:LH/b;

.field final synthetic m:LQ/F;

.field final synthetic n:Z

.field final synthetic o:Z

.field final synthetic p:Lkotlin/jvm/functions/Function1;

.field final synthetic q:La1/J;

.field final synthetic r:Li1/d;


# direct methods
.method constructor <init>(LK/y;LU0/Y0;IILK/V;La1/U;La1/f0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LH/b;LQ/F;ZZLkotlin/jvm/functions/Function1;La1/J;Li1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$e$a;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$e$a;->b:LU0/Y0;

    .line 4
    .line 5
    iput p3, p0, LK/i$e$a;->c:I

    .line 6
    .line 7
    iput p4, p0, LK/i$e$a;->d:I

    .line 8
    .line 9
    iput-object p5, p0, LK/i$e$a;->e:LK/V;

    .line 10
    .line 11
    iput-object p6, p0, LK/i$e$a;->f:La1/U;

    .line 12
    .line 13
    iput-object p7, p0, LK/i$e$a;->g:La1/f0;

    .line 14
    .line 15
    iput-object p8, p0, LK/i$e$a;->h:Landroidx/compose/ui/e;

    .line 16
    .line 17
    iput-object p9, p0, LK/i$e$a;->i:Landroidx/compose/ui/e;

    .line 18
    .line 19
    iput-object p10, p0, LK/i$e$a;->j:Landroidx/compose/ui/e;

    .line 20
    .line 21
    iput-object p11, p0, LK/i$e$a;->k:Landroidx/compose/ui/e;

    .line 22
    .line 23
    iput-object p12, p0, LK/i$e$a;->l:LH/b;

    .line 24
    .line 25
    iput-object p13, p0, LK/i$e$a;->m:LQ/F;

    .line 26
    .line 27
    iput-boolean p14, p0, LK/i$e$a;->n:Z

    .line 28
    .line 29
    iput-boolean p15, p0, LK/i$e$a;->o:Z

    .line 30
    .line 31
    move-object/from16 p1, p16

    .line 32
    .line 33
    iput-object p1, p0, LK/i$e$a;->p:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    move-object/from16 p1, p17

    .line 36
    .line 37
    iput-object p1, p0, LK/i$e$a;->q:La1/J;

    .line 38
    .line 39
    move-object/from16 p1, p18

    .line 40
    .line 41
    iput-object p1, p0, LK/i$e$a;->r:Li1/d;

    .line 42
    .line 43
    const/4 p1, 0x2

    .line 44
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 45
    .line 46
    .line 47
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

    invoke-virtual {p0, p1, p2}, LK/i$e$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)"

    const v3, 0x7925855b

    invoke-static {v3, p2, v0, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 5
    iget-object v0, p0, LK/i$e$a;->a:LK/y;

    invoke-virtual {v0}, LK/y;->k()F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v1, v3}, Landroidx/compose/foundation/layout/s;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 6
    iget-object v0, p0, LK/i$e$a;->b:LU0/Y0;

    .line 7
    iget v1, p0, LK/i$e$a;->c:I

    .line 8
    iget v2, p0, LK/i$e$a;->d:I

    .line 9
    invoke-static {p2, v0, v1, v2}, LK/n;->a(Landroidx/compose/ui/e;LU0/Y0;II)Landroidx/compose/ui/e;

    move-result-object p2

    .line 10
    iget-object v0, p0, LK/i$e$a;->e:LK/V;

    .line 11
    iget-object v1, p0, LK/i$e$a;->f:La1/U;

    .line 12
    iget-object v2, p0, LK/i$e$a;->g:La1/f0;

    .line 13
    iget-object v3, p0, LK/i$e$a;->a:LK/y;

    invoke-interface {p1, v3}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, LK/i$e$a;->a:LK/y;

    .line 14
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    .line 15
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4

    .line 16
    :cond_3
    new-instance v5, LK/i$e$a$b;

    invoke-direct {v5, v4}, LK/i$e$a$b;-><init>(LK/y;)V

    .line 17
    invoke-interface {p1, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 18
    :cond_4
    check-cast v5, Lie/a;

    .line 19
    invoke-static {p2, v0, v1, v2, v5}, LK/U;->c(Landroidx/compose/ui/e;LK/V;La1/U;La1/f0;Lie/a;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 20
    iget-object v0, p0, LK/i$e$a;->h:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 21
    iget-object v0, p0, LK/i$e$a;->i:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 22
    iget-object v0, p0, LK/i$e$a;->b:LU0/Y0;

    invoke-static {p2, v0}, LK/X;->a(Landroidx/compose/ui/e;LU0/Y0;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 23
    iget-object v0, p0, LK/i$e$a;->j:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 24
    iget-object v0, p0, LK/i$e$a;->k:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 25
    iget-object v0, p0, LK/i$e$a;->l:LH/b;

    invoke-static {p2, v0}, Landroidx/compose/foundation/relocation/b;->b(Landroidx/compose/ui/e;LH/b;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 26
    new-instance v0, LK/i$e$a$a;

    iget-object v1, p0, LK/i$e$a;->m:LQ/F;

    iget-object v2, p0, LK/i$e$a;->a:LK/y;

    iget-boolean v3, p0, LK/i$e$a;->n:Z

    iget-boolean v4, p0, LK/i$e$a;->o:Z

    iget-object v5, p0, LK/i$e$a;->p:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, LK/i$e$a;->f:La1/U;

    iget-object v7, p0, LK/i$e$a;->q:La1/J;

    iget-object v8, p0, LK/i$e$a;->r:Li1/d;

    iget v9, p0, LK/i$e$a;->d:I

    invoke-direct/range {v0 .. v9}, LK/i$e$a$a;-><init>(LQ/F;LK/y;ZZLkotlin/jvm/functions/Function1;La1/U;La1/J;Li1/d;I)V

    const/16 v1, 0x36

    const v2, -0x15a57eaf

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {p2, v0, p1, v1, v2}, LQ/C;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LY/w;->T()V

    :cond_5
    return-void
.end method
