.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt;->Button-sW7UJKQ(LC/I;JLandroidx/compose/ui/e;[ILie/a;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LC/I;",
        "LTd/L;",
        "invoke",
        "(LC/I;LY/m;I)V",
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
.field final synthetic $childModifier:Landroidx/compose/ui/e;

.field final synthetic $color:J

.field final synthetic $texts:[I


# direct methods
.method constructor <init>([ILandroidx/compose/ui/e;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$texts:[I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$childModifier:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$color:J

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/I;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->invoke(LC/I;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/I;LY/m;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    const-string v2, "$this$TextButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v5, 0x12

    if-ne v3, v5, :cond_3

    .line 2
    invoke-interface {v4}, LY/m;->i()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface {v4}, LY/m;->K()V

    return-void

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v5, "com.revenuecat.purchases.ui.revenuecatui.composables.Button.<anonymous>.<anonymous> (Footer.kt:216)"

    const v6, 0x15d029d5

    invoke-static {v6, v2, v3, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_4
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3$1;

    invoke-static {v3, v5}, LR0/r;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v3

    const v5, -0x3d9bbced

    invoke-interface {v4, v5}, LY/m;->V(I)V

    .line 6
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$texts:[I

    iget-object v6, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$childModifier:Landroidx/compose/ui/e;

    iget-wide v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$color:J

    .line 7
    new-instance v9, Ljava/util/ArrayList;

    array-length v10, v5

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    array-length v10, v5

    const/4 v12, 0x0

    :goto_3
    const/16 v13, 0x36

    const/4 v14, 0x1

    if-ge v12, v10, :cond_5

    aget v15, v5, v12

    .line 9
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3$2$1;

    invoke-direct {v11, v15, v6, v7, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3$2$1;-><init>(ILandroidx/compose/ui/e;J)V

    const v15, -0x73db562a

    invoke-static {v15, v14, v11, v4, v13}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v11

    .line 10
    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 11
    :cond_5
    invoke-interface {v4}, LY/m;->O()V

    const v5, -0x3d9b775c

    invoke-interface {v4, v5}, LY/m;->V(I)V

    .line 12
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$texts:[I

    iget-object v6, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$childModifier:Landroidx/compose/ui/e;

    iget-wide v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3;->$color:J

    .line 13
    new-instance v10, Ljava/util/ArrayList;

    array-length v11, v5

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    array-length v11, v5

    const/4 v12, 0x0

    :goto_4
    if-ge v12, v11, :cond_6

    aget v15, v5, v12

    .line 15
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3$3$1;

    invoke-direct {v13, v15, v6, v7, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt$Button$1$3$3$1;-><init>(ILandroidx/compose/ui/e;J)V

    const v15, 0x4d988475    # 3.19852192E8f

    const/16 v0, 0x36

    invoke-static {v15, v14, v13, v4, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v13

    .line 16
    invoke-interface {v10, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    move v13, v0

    move-object/from16 v0, p0

    goto :goto_4

    .line 17
    :cond_6
    invoke-interface {v4}, LY/m;->O()V

    .line 18
    invoke-static {v9, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt;->access$Button_sW7UJKQ$merge(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    and-int/lit8 v5, v2, 0xe

    const/4 v6, 0x0

    move-object v2, v3

    move-object v3, v0

    .line 19
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt;->AdaptiveComposable(LC/I;Landroidx/compose/ui/e;Ljava/util/List;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
