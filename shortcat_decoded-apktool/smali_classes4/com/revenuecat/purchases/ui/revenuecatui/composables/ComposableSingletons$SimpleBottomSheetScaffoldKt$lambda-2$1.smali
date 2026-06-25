.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LTd/L;",
        "invoke",
        "(LY/m;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 25

    move-object/from16 v0, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v0}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v0}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.ComposableSingletons$SimpleBottomSheetScaffoldKt.lambda-2.<anonymous> (SimpleBottomSheetScaffold.kt:152)"

    const v4, 0x51c4cae3

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 6
    sget-object v2, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v2}, Ls0/r0$a;->k()J

    move-result-wide v2

    const/16 v4, 0x10

    int-to-float v4, v4

    .line 7
    invoke-static {v4}, Li1/h;->n(F)F

    move-result v5

    invoke-static {v4}, Li1/h;->n(F)F

    move-result v6

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 8
    invoke-static/range {v5 .. v10}, LJ/i;->f(FFFFILjava/lang/Object;)LJ/h;

    move-result-object v5

    .line 9
    invoke-static {v1, v2, v3, v5}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLs0/E1;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 10
    invoke-static {v4}, Li1/h;->n(F)F

    move-result v2

    .line 11
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    .line 12
    sget-object v2, LC/b;->a:LC/b;

    invoke-virtual {v2}, LC/b;->h()LC/b$m;

    move-result-object v2

    .line 13
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v3}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v3

    const/4 v4, 0x0

    .line 14
    invoke-static {v2, v3, v0, v4}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v2

    .line 15
    invoke-static {v0, v4}, LY/h;->a(LY/m;I)I

    move-result v3

    .line 16
    invoke-interface {v0}, LY/m;->r()LY/I;

    move-result-object v4

    .line 17
    invoke-static {v0, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 18
    sget-object v5, LK0/g;->M:LK0/g$a;

    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 19
    invoke-interface {v0}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 20
    :cond_3
    invoke-interface {v0}, LY/m;->I()V

    .line 21
    invoke-interface {v0}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 22
    invoke-interface {v0, v6}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 23
    :cond_4
    invoke-interface {v0}, LY/m;->s()V

    .line 24
    :goto_1
    invoke-static {v0}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 25
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 28
    invoke-interface {v6}, LY/m;->e()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 29
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 31
    :cond_6
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v1, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 32
    sget-object v1, LC/j;->a:LC/j;

    const/16 v23, 0x0

    const v24, 0x1fffe

    .line 33
    const-string v0, "Hello from my bottom sheet"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x6

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 34
    const-string v0, "It\'s beautiful, isn\'t it?"

    invoke-static/range {v0 .. v24}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 35
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 36
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
