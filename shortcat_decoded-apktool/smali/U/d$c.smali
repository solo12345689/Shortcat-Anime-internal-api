.class final LU/d$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LU0/Y0;ZLkotlin/jvm/functions/Function2;Lie/o;FLC/P;LU/k0;LU/m0;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/P;

.field final synthetic b:F

.field final synthetic c:LU/m0;

.field final synthetic d:LU/k0;

.field final synthetic e:Lkotlin/jvm/functions/Function2;

.field final synthetic f:LU0/Y0;

.field final synthetic g:Z

.field final synthetic h:Lkotlin/jvm/functions/Function2;

.field final synthetic i:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(LC/P;FLU/m0;LU/k0;Lkotlin/jvm/functions/Function2;LU0/Y0;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$c;->a:LC/P;

    .line 2
    .line 3
    iput p2, p0, LU/d$c;->b:F

    .line 4
    .line 5
    iput-object p3, p0, LU/d$c;->c:LU/m0;

    .line 6
    .line 7
    iput-object p4, p0, LU/d$c;->d:LU/k0;

    .line 8
    .line 9
    iput-object p5, p0, LU/d$c;->e:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    iput-object p6, p0, LU/d$c;->f:LU0/Y0;

    .line 12
    .line 13
    iput-boolean p7, p0, LU/d$c;->g:Z

    .line 14
    .line 15
    iput-object p8, p0, LU/d$c;->h:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    iput-object p9, p0, LU/d$c;->i:Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic a(LU/m0;)F
    .locals 0

    .line 1
    invoke-static {p0}, LU/d$c;->b(LU/m0;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final b(LU/m0;)F
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, LU/m0;->getState()LU/n0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LU/n0;->d()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LU/d$c;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 21

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

    const-string v4, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)"

    const v5, -0x73db1c9a

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    iget-object v3, v0, LU/d$c;->a:LC/P;

    invoke-static {v2, v3}, LC/T;->c(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 6
    invoke-static {v2}, Lp0/g;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 7
    iget v3, v0, LU/d$c;->b:F

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v6, v3, v4, v5}, Landroidx/compose/foundation/layout/s;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 8
    iget-object v3, v0, LU/d$c;->c:LU/m0;

    invoke-interface {v1, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, LU/d$c;->c:LU/m0;

    .line 9
    invoke-interface {v1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    .line 10
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4

    .line 11
    :cond_3
    new-instance v5, LU/e;

    invoke-direct {v5, v4}, LU/e;-><init>(LU/m0;)V

    .line 12
    invoke-interface {v1, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 13
    :cond_4
    check-cast v5, LU/S;

    .line 14
    iget-object v3, v0, LU/d$c;->d:LU/k0;

    invoke-virtual {v3}, LU/k0;->d()J

    move-result-wide v3

    .line 15
    iget-object v6, v0, LU/d$c;->d:LU/k0;

    invoke-virtual {v6}, LU/k0;->e()J

    move-result-wide v6

    .line 16
    iget-object v8, v0, LU/d$c;->d:LU/k0;

    invoke-virtual {v8}, LU/k0;->c()J

    move-result-wide v8

    move-object v1, v2

    move-object v2, v5

    move-wide v5, v6

    move-wide v7, v8

    .line 17
    iget-object v9, v0, LU/d$c;->e:Lkotlin/jvm/functions/Function2;

    .line 18
    iget-object v10, v0, LU/d$c;->f:LU0/Y0;

    .line 19
    sget-object v11, LC/b;->a:LC/b;

    invoke-virtual {v11}, LC/b;->b()LC/b$f;

    move-result-object v12

    .line 20
    iget-boolean v13, v0, LU/d$c;->g:Z

    if-eqz v13, :cond_5

    invoke-virtual {v11}, LC/b;->b()LC/b$f;

    move-result-object v11

    :goto_1
    move-object v13, v11

    goto :goto_2

    :cond_5
    invoke-virtual {v11}, LC/b;->g()LC/b$e;

    move-result-object v11

    goto :goto_1

    .line 21
    :goto_2
    iget-object v11, v0, LU/d$c;->h:Lkotlin/jvm/functions/Function2;

    .line 22
    iget-object v14, v0, LU/d$c;->i:Lkotlin/jvm/functions/Function2;

    const/high16 v19, 0x6c00000

    const/16 v20, 0xc36

    move-object/from16 v16, v11

    const/high16 v11, 0x3f800000    # 1.0f

    move-object/from16 v17, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v18, p1

    .line 23
    invoke-static/range {v1 .. v20}, LU/d;->i(Landroidx/compose/ui/e;LU/S;JJJLkotlin/jvm/functions/Function2;LU0/Y0;FLC/b$m;LC/b$e;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    return-void
.end method
