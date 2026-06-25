.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt;->ButtonComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V
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


# instance fields
.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

.field final synthetic $style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Landroidx/compose/ui/e;",
            "Lkotlin/jvm/functions/Function2;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$modifier:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$onClick:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic access$invoke$lambda$0(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$0(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$invoke$lambda$2(LY/C0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$2(LY/C0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$invoke$lambda$3(LY/C0;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$3(LY/C0;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final invoke$lambda$0(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getActionInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final invoke$lambda$2(LY/C0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final invoke$lambda$3(LY/C0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final invoke$lambda$5(LY/h2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final invoke$lambda$7(LY/h2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final invoke$lambda$8(LY/h2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final invoke$lambda$9(LY/h2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v6}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView.<anonymous> (ButtonComponentView.kt:85)"

    const v5, -0x10bae3b

    invoke-static {v5, v1, v2, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 6
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    const/4 v9, 0x0

    .line 7
    invoke-static {v1, v2, v6, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentStateKt;->rememberButtonComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;

    move-result-object v15

    .line 8
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    .line 9
    sget-object v16, LY/m;->a:LY/m$a;

    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    .line 10
    sget-object v1, LZd/j;->a:LZd/j;

    .line 11
    invoke-static {v1, v6}, LY/b0;->i(LZd/i;LY/m;)LGf/O;

    move-result-object v1

    .line 12
    new-instance v2, LY/L;

    invoke-direct {v2, v1}, LY/L;-><init>(LGf/O;)V

    .line 13
    invoke-interface {v6, v2}, LY/m;->u(Ljava/lang/Object;)V

    move-object v1, v2

    .line 14
    :cond_3
    check-cast v1, LY/L;

    .line 15
    invoke-virtual {v1}, LY/L;->a()LGf/O;

    move-result-object v12

    .line 16
    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    const v1, -0x6ab3f7dc

    invoke-interface {v6, v1}, LY/m;->V(I)V

    .line 17
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    .line 18
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v11, 0x0

    if-ne v1, v2, :cond_4

    .line 19
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v11, v3, v11}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v1

    .line 20
    invoke-interface {v6, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 21
    :cond_4
    move-object v13, v1

    check-cast v13, LY/C0;

    invoke-interface {v6}, LY/m;->O()V

    const v1, -0x6ab3ef9b

    invoke-interface {v6, v1}, LY/m;->V(I)V

    .line 22
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    .line 23
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_5

    .line 24
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$contentAlpha$2$1;

    invoke-direct {v1, v13, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$contentAlpha$2$1;-><init>(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    invoke-static {v1}, LY/U1;->d(Lie/a;)LY/h2;

    move-result-object v1

    .line 25
    invoke-interface {v6, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 26
    :cond_5
    check-cast v1, LY/h2;

    invoke-interface {v6}, LY/m;->O()V

    const v2, -0x6ab3dbbc

    invoke-interface {v6, v2}, LY/m;->V(I)V

    .line 27
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    .line 28
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_6

    .line 29
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1;

    invoke-direct {v2, v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1;-><init>(LY/C0;)V

    invoke-static {v2}, LY/U1;->d(Lie/a;)LY/h2;

    move-result-object v2

    .line 30
    invoke-interface {v6, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 31
    :cond_6
    move-object v14, v2

    check-cast v14, LY/h2;

    invoke-interface {v6}, LY/m;->O()V

    .line 32
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$5(LY/h2;)F

    move-result v1

    const/4 v7, 0x0

    const/16 v8, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lw/c;->d(FLw/i;FLjava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    move-result-object v17

    .line 33
    invoke-static {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$7(LY/h2;)F

    move-result v1

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v8}, Lw/c;->d(FLw/i;FLjava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    move-result-object v18

    .line 34
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    move-result-object v1

    .line 35
    invoke-interface {v6, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v1

    .line 36
    check-cast v1, Li1/t;

    .line 37
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v2

    const v3, -0x6ab3b365

    invoke-interface {v6, v3}, LY/m;->V(I)V

    invoke-interface {v6, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 38
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_7

    .line 39
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_8

    .line 40
    :cond_7
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v2

    invoke-interface {v2}, LC/A;->d()F

    move-result v2

    invoke-static {v2}, Li1/h;->h(F)Li1/h;

    move-result-object v4

    .line 41
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 42
    :cond_8
    check-cast v4, Li1/h;

    invoke-virtual {v4}, Li1/h;->t()F

    move-result v2

    invoke-interface {v6}, LY/m;->O()V

    .line 43
    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v3

    const v4, -0x6ab3a0c2

    invoke-interface {v6, v4}, LY/m;->V(I)V

    invoke-interface {v6, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 44
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_9

    .line 45
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_a

    .line 46
    :cond_9
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v3

    invoke-interface {v3}, LC/A;->c()F

    move-result v3

    invoke-static {v3}, Li1/h;->h(F)Li1/h;

    move-result-object v5

    .line 47
    invoke-interface {v6, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 48
    :cond_a
    check-cast v5, Li1/h;

    invoke-virtual {v5}, Li1/h;->t()F

    move-result v3

    invoke-interface {v6}, LY/m;->O()V

    .line 49
    iget-object v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v4

    const v5, -0x6ab38dc3

    invoke-interface {v6, v5}, LY/m;->V(I)V

    invoke-interface {v6, v4}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 50
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_b

    .line 51
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_c

    .line 52
    :cond_b
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v4

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/p;->g(LC/A;Li1/t;)F

    move-result v4

    invoke-static {v4}, Li1/h;->h(F)Li1/h;

    move-result-object v7

    .line 53
    invoke-interface {v6, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 54
    :cond_c
    check-cast v7, Li1/h;

    invoke-virtual {v7}, Li1/h;->t()F

    move-result v4

    invoke-interface {v6}, LY/m;->O()V

    .line 55
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v5

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v5

    const v7, -0x6ab37745

    invoke-interface {v6, v7}, LY/m;->V(I)V

    invoke-interface {v6, v5}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 56
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_d

    .line 57
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v8, v5, :cond_e

    .line 58
    :cond_d
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v5

    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getMargin()LC/A;

    move-result-object v5

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/p;->f(LC/A;Li1/t;)F

    move-result v1

    invoke-static {v1}, Li1/h;->h(F)Li1/h;

    move-result-object v8

    .line 59
    invoke-interface {v6, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 60
    :cond_e
    check-cast v8, Li1/h;

    invoke-virtual {v8}, Li1/h;->t()F

    move-result v1

    invoke-interface {v6}, LY/m;->O()V

    .line 61
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 62
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$modifier:Landroidx/compose/ui/e;

    invoke-static {v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$0(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)Z

    move-result v10

    xor-int/lit8 v20, v10, 0x1

    const v10, -0x6ab2d6fb

    invoke-interface {v6, v10}, LY/m;->V(I)V

    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-interface {v6, v10}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v6, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    iget-object v14, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$onClick:Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v14}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    invoke-interface {v6, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    move-object v14, v11

    iget-object v11, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    move-object/from16 v19, v14

    iget-object v14, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->$onClick:Lkotlin/jvm/functions/Function2;

    .line 63
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    if-nez v10, :cond_10

    .line 64
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_f

    goto :goto_1

    :cond_f
    move-object v10, v9

    move-object/from16 v9, v19

    goto :goto_2

    .line 65
    :cond_10
    :goto_1
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$2$1;

    move-object/from16 v9, v19

    invoke-direct/range {v10 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LGf/O;LY/C0;Lkotlin/jvm/functions/Function2;Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;)V

    .line 66
    invoke-interface {v6, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 67
    :goto_2
    move-object/from16 v23, v10

    check-cast v23, Lie/a;

    invoke-interface {v6}, LY/m;->O()V

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v8

    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    const v10, -0x6ab2a48a

    invoke-interface {v6, v10}, LY/m;->V(I)V

    invoke-interface {v6, v4}, LY/m;->b(F)Z

    move-result v10

    invoke-interface {v6, v1}, LY/m;->b(F)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-interface {v6, v2}, LY/m;->b(F)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-interface {v6, v3}, LY/m;->b(F)Z

    move-result v11

    or-int/2addr v10, v11

    .line 68
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_11

    .line 69
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_12

    .line 70
    :cond_11
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1;

    invoke-direct {v11, v4, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1;-><init>(FFFF)V

    .line 71
    invoke-interface {v6, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 72
    :cond_12
    check-cast v11, LI0/B;

    invoke-interface {v6}, LY/m;->O()V

    const/4 v1, 0x0

    .line 73
    invoke-static {v6, v1}, LY/h;->a(LY/m;I)I

    move-result v2

    .line 74
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v1

    .line 75
    invoke-static {v6, v8}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    .line 76
    sget-object v4, LK0/g;->M:LK0/g$a;

    invoke-virtual {v4}, LK0/g$a;->a()Lie/a;

    move-result-object v8

    .line 77
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v10

    if-nez v10, :cond_13

    invoke-static {}, LY/h;->d()V

    .line 78
    :cond_13
    invoke-interface {v6}, LY/m;->I()V

    .line 79
    invoke-interface {v6}, LY/m;->e()Z

    move-result v10

    if-eqz v10, :cond_14

    .line 80
    invoke-interface {v6, v8}, LY/m;->h(Lie/a;)V

    goto :goto_3

    .line 81
    :cond_14
    invoke-interface {v6}, LY/m;->s()V

    .line 82
    :goto_3
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v8

    .line 83
    invoke-virtual {v4}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v8, v11, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 84
    invoke-virtual {v4}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v8, v1, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 85
    invoke-virtual {v4}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 86
    invoke-interface {v8}, LY/m;->e()Z

    move-result v10

    if-nez v10, :cond_15

    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    .line 87
    :cond_15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v8, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 88
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v8, v2, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 89
    :cond_16
    invoke-virtual {v4}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v8, v3, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 90
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v1

    .line 91
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$1$1;

    invoke-direct {v3, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$1$1;-><init>(LZd/e;)V

    .line 92
    invoke-static/range {v17 .. v17}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$8(LY/h2;)F

    move-result v2

    move-object v4, v5

    move v5, v2

    move-object v2, v7

    const/16 v7, 0x180

    const/16 v8, 0x8

    move-object v9, v4

    const/4 v4, 0x0

    .line 93
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 94
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    invoke-static/range {v18 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2;->invoke$lambda$9(LY/h2;)F

    move-result v2

    invoke-static {v1, v2}, Lp0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    .line 95
    invoke-virtual {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getBackground()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v6, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt;->access$progressColorFor(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LY/m;I)J

    move-result-wide v2

    const/4 v9, 0x0

    const/16 v10, 0x1c

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, p1

    .line 96
    invoke-static/range {v1 .. v10}, LU/K;->a(Landroidx/compose/ui/e;JFJILY/m;II)V

    .line 97
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 98
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {}, LY/w;->T()V

    :cond_17
    return-void
.end method
