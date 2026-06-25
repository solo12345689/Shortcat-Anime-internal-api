.class final LU/d$n;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->g(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LU0/Y0;FLkotlin/jvm/functions/Function2;LU0/Y0;Lkotlin/jvm/functions/Function2;Lie/o;FFLC/P;LU/k0;LU/m0;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/P;

.field final synthetic b:F

.field final synthetic c:LU/k0;

.field final synthetic d:Lkotlin/jvm/functions/Function2;

.field final synthetic e:LU0/Y0;

.field final synthetic f:F

.field final synthetic g:Z

.field final synthetic h:Lkotlin/jvm/functions/Function2;

.field final synthetic i:Lkotlin/jvm/functions/Function2;

.field final synthetic j:F

.field final synthetic k:LU/m0;

.field final synthetic l:Lkotlin/jvm/functions/Function2;

.field final synthetic m:LU0/Y0;

.field final synthetic n:F

.field final synthetic o:Lkotlin/jvm/internal/L;

.field final synthetic p:Z


# direct methods
.method constructor <init>(LC/P;FLU/k0;Lkotlin/jvm/functions/Function2;LU0/Y0;FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLU/m0;Lkotlin/jvm/functions/Function2;LU0/Y0;FLkotlin/jvm/internal/L;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$n;->a:LC/P;

    .line 2
    .line 3
    iput p2, p0, LU/d$n;->b:F

    .line 4
    .line 5
    iput-object p3, p0, LU/d$n;->c:LU/k0;

    .line 6
    .line 7
    iput-object p4, p0, LU/d$n;->d:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iput-object p5, p0, LU/d$n;->e:LU0/Y0;

    .line 10
    .line 11
    iput p6, p0, LU/d$n;->f:F

    .line 12
    .line 13
    iput-boolean p7, p0, LU/d$n;->g:Z

    .line 14
    .line 15
    iput-object p8, p0, LU/d$n;->h:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    iput-object p9, p0, LU/d$n;->i:Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    iput p10, p0, LU/d$n;->j:F

    .line 20
    .line 21
    iput-object p11, p0, LU/d$n;->k:LU/m0;

    .line 22
    .line 23
    iput-object p12, p0, LU/d$n;->l:Lkotlin/jvm/functions/Function2;

    .line 24
    .line 25
    iput-object p13, p0, LU/d$n;->m:LU0/Y0;

    .line 26
    .line 27
    iput p14, p0, LU/d$n;->n:F

    .line 28
    .line 29
    iput-object p15, p0, LU/d$n;->o:Lkotlin/jvm/internal/L;

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput-boolean p1, p0, LU/d$n;->p:Z

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static synthetic a(LU/m0;)F
    .locals 0

    .line 1
    invoke-static {p0}, LU/d$n;->e(LU/m0;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b()F
    .locals 1

    .line 1
    invoke-static {}, LU/d$n;->c()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static final c()F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method private static final e(LU/m0;)F
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

    invoke-virtual {p0, p1, p2}, LU/d$n;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 37

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

    const-string v4, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)"

    const v5, -0x5078521b

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, LU/d$n;->a:LC/P;

    iget v3, v0, LU/d$n;->b:F

    iget-object v4, v0, LU/d$n;->c:LU/k0;

    iget-object v9, v0, LU/d$n;->d:Lkotlin/jvm/functions/Function2;

    iget-object v10, v0, LU/d$n;->e:LU0/Y0;

    iget v11, v0, LU/d$n;->f:F

    iget-boolean v15, v0, LU/d$n;->g:Z

    iget-object v5, v0, LU/d$n;->h:Lkotlin/jvm/functions/Function2;

    iget-object v6, v0, LU/d$n;->i:Lkotlin/jvm/functions/Function2;

    iget v7, v0, LU/d$n;->j:F

    iget-object v8, v0, LU/d$n;->k:LU/m0;

    iget-object v12, v0, LU/d$n;->l:Lkotlin/jvm/functions/Function2;

    iget-object v13, v0, LU/d$n;->m:LU0/Y0;

    iget v14, v0, LU/d$n;->n:F

    move/from16 v16, v14

    iget-object v14, v0, LU/d$n;->o:Lkotlin/jvm/internal/L;

    move-object/from16 v17, v14

    iget-boolean v14, v0, LU/d$n;->p:Z

    move/from16 v18, v14

    .line 5
    sget-object v14, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 6
    sget-object v21, LC/b;->a:LC/b;

    invoke-virtual/range {v21 .. v21}, LC/b;->h()LC/b$m;

    move-result-object v0

    .line 7
    sget-object v19, Ll0/e;->a:Ll0/e$a;

    move-object/from16 v20, v4

    invoke-virtual/range {v19 .. v19}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v4

    move-object/from16 v19, v5

    const/4 v5, 0x0

    .line 8
    invoke-static {v0, v4, v1, v5}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v0

    .line 9
    invoke-static {v1, v5}, LY/h;->a(LY/m;I)I

    move-result v4

    .line 10
    invoke-interface {v1}, LY/m;->r()LY/I;

    move-result-object v5

    move/from16 p2, v4

    .line 11
    invoke-static {v1, v14}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 12
    sget-object v22, LK0/g;->M:LK0/g$a;

    move-object/from16 v23, v6

    invoke-virtual/range {v22 .. v22}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 13
    invoke-interface {v1}, LY/m;->j()LY/d;

    move-result-object v24

    if-nez v24, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 14
    :cond_3
    invoke-interface {v1}, LY/m;->I()V

    .line 15
    invoke-interface {v1}, LY/m;->e()Z

    move-result v24

    if-eqz v24, :cond_4

    .line 16
    invoke-interface {v1, v6}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-interface {v1}, LY/m;->s()V

    .line 18
    :goto_1
    invoke-static {v1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 19
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v0, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v5, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 22
    invoke-interface {v6}, LY/m;->e()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 23
    :cond_5
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_6
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v4, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object v0, LC/j;->a:LC/j;

    .line 27
    invoke-static {v14, v2}, LC/T;->c(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 28
    invoke-static {v0}, Lp0/g;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 29
    invoke-static {v0, v1, v3, v4, v5}, Landroidx/compose/foundation/layout/s;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object v6, v2

    new-instance v2, LU/f;

    invoke-direct {v2}, LU/f;-><init>()V

    move/from16 v22, v3

    move/from16 v24, v4

    .line 30
    invoke-virtual/range {v20 .. v20}, LU/k0;->d()J

    move-result-wide v3

    move-object/from16 v26, v5

    move-object/from16 v25, v6

    .line 31
    invoke-virtual/range {v20 .. v20}, LU/k0;->e()J

    move-result-wide v5

    move/from16 v27, v7

    move-object/from16 v28, v8

    .line 32
    invoke-virtual/range {v20 .. v20}, LU/k0;->c()J

    move-result-wide v7

    move-object/from16 v29, v12

    .line 33
    invoke-virtual/range {v21 .. v21}, LC/b;->b()LC/b$f;

    move-result-object v12

    move-object/from16 v30, v13

    .line 34
    invoke-virtual/range {v21 .. v21}, LC/b;->g()LC/b$e;

    move-result-object v13

    move/from16 v31, v16

    move-object/from16 v16, v19

    const v19, 0x36000030

    move-object/from16 v32, v20

    const/16 v20, 0xc06

    move-object/from16 v33, v14

    const/4 v14, 0x0

    move-object v1, v0

    move-object/from16 v35, v17

    move-object/from16 v17, v23

    move-object/from16 v0, v25

    move-object/from16 v34, v28

    move-object/from16 v36, v33

    move/from16 v23, v18

    move-object/from16 v18, p1

    .line 35
    invoke-static/range {v1 .. v20}, LU/d;->i(Landroidx/compose/ui/e;LU/S;JJJLkotlin/jvm/functions/Function2;LU0/Y0;FLC/b$m;LC/b$e;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LY/m;II)V

    move-object/from16 v1, v18

    .line 36
    sget-object v2, LC/V;->a:LC/V$a;

    invoke-virtual {v2}, LC/V$a;->f()I

    move-result v2

    invoke-static {v0, v2}, LC/S;->e(LC/P;I)LC/P;

    move-result-object v0

    move-object/from16 v2, v36

    invoke-static {v2, v0}, LC/T;->c(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 37
    invoke-static {v0}, Lp0/g;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sub-float v7, v27, v22

    .line 38
    invoke-static {v7}, Li1/h;->n(F)F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 39
    invoke-static {v0, v5, v2, v4, v3}, Landroidx/compose/foundation/layout/s;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v2, v34

    .line 40
    invoke-interface {v1, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    .line 41
    invoke-interface {v1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    .line 42
    sget-object v3, LY/m;->a:LY/m$a;

    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_8

    .line 43
    :cond_7
    new-instance v4, LU/g;

    invoke-direct {v4, v2}, LU/g;-><init>(LU/m0;)V

    .line 44
    invoke-interface {v1, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 45
    :cond_8
    move-object v2, v4

    check-cast v2, LU/S;

    .line 46
    invoke-virtual/range {v32 .. v32}, LU/k0;->d()J

    move-result-wide v3

    .line 47
    invoke-virtual/range {v32 .. v32}, LU/k0;->e()J

    move-result-wide v5

    .line 48
    invoke-virtual/range {v32 .. v32}, LU/k0;->c()J

    move-result-wide v7

    .line 49
    invoke-virtual/range {v21 .. v21}, LC/b;->a()LC/b$m;

    move-result-object v12

    .line 50
    invoke-virtual/range {v21 .. v21}, LC/b;->g()LC/b$e;

    move-result-object v13

    move-object/from16 v9, v35

    .line 51
    iget v14, v9, Lkotlin/jvm/internal/L;->a:I

    .line 52
    sget-object v9, LU/o;->a:LU/o;

    invoke-virtual {v9}, LU/o;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v16

    invoke-virtual {v9}, LU/o;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v17

    const/high16 v19, 0x36000000

    const/16 v20, 0xd80

    move-object/from16 v18, v1

    move/from16 v15, v23

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move/from16 v11, v31

    move-object v1, v0

    .line 53
    invoke-static/range {v1 .. v20}, LU/d;->i(Landroidx/compose/ui/e;LU/S;JJJLkotlin/jvm/functions/Function2;LU0/Y0;FLC/b$m;LC/b$e;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 54
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 55
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
