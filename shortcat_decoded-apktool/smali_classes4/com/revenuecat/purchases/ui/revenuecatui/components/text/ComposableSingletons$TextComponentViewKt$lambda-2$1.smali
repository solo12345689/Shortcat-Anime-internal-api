.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt$lambda-2$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt;
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt$lambda-2$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt$lambda-2$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt$lambda-2$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt$lambda-2$1;

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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt$lambda-2$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 34

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

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.text.ComposableSingletons$TextComponentViewKt.lambda-2.<anonymous> (TextComponentView.kt:178)"

    const v4, 0x3553291

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LU/j0;->d()LY/b1;

    move-result-object v1

    .line 5
    invoke-interface {v0, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LU0/Y0;

    .line 6
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v1}, Ls0/r0$a;->b()J

    move-result-wide v3

    const v32, 0xfffffe

    const/16 v33, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v2 .. v33}, LU0/Y0;->e(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;LU0/G;Lg1/h;IILg1/u;ILjava/lang/Object;)LU0/Y0;

    move-result-object v1

    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/ComposableSingletons$TextComponentViewKt;->getLambda-1$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v1, v2, v0, v3}, LU/j0;->a(LU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
