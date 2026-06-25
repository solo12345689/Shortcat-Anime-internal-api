.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->AutoResizedText-W72HBGU(Ljava/lang/String;Landroidx/compose/ui/e;JLU0/Y0;LY0/L;ILY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LU0/T0;",
        "result",
        "LTd/L;",
        "invoke",
        "(LU0/T0;)V",
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
.field final synthetic $defaultFontSize:J

.field final synthetic $resizedTextStyle$delegate:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field

.field final synthetic $shouldDraw$delegate:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field

.field final synthetic $style:LU0/Y0;


# direct methods
.method constructor <init>(LU0/Y0;JLY/C0;LY/C0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU0/Y0;",
            "J",
            "LY/C0;",
            "LY/C0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$style:LU0/Y0;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$defaultFontSize:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$resizedTextStyle$delegate:LY/C0;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$shouldDraw$delegate:LY/C0;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU0/T0;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->invoke(LU0/T0;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LU0/T0;)V
    .locals 37

    move-object/from16 v0, p0

    const-string v1, "result"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v2}, LU0/T0;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$style:LU0/Y0;

    invoke-virtual {v1}, LU0/Y0;->n()J

    move-result-wide v1

    invoke-static {v1, v2}, Li1/w;->g(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$resizedTextStyle$delegate:LY/C0;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->access$AutoResizedText_W72HBGU$lambda$1(LY/C0;)LU0/Y0;

    move-result-object v2

    .line 5
    iget-wide v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$defaultFontSize:J

    const v32, 0xfffffd

    const/16 v33, 0x0

    const-wide/16 v3, 0x0

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

    .line 6
    invoke-static/range {v2 .. v33}, LU0/Y0;->e(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;LU0/G;Lg1/h;IILg1/u;ILjava/lang/Object;)LU0/Y0;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->access$AutoResizedText_W72HBGU$lambda$2(LY/C0;LU0/Y0;)V

    .line 7
    :cond_0
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$resizedTextStyle$delegate:LY/C0;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->access$AutoResizedText_W72HBGU$lambda$1(LY/C0;)LU0/Y0;

    move-result-object v1

    invoke-virtual {v1}, LU0/Y0;->n()J

    move-result-wide v1

    .line 8
    invoke-static {v1, v2}, Li1/w;->b(J)V

    .line 9
    invoke-static {v1, v2}, Li1/v;->f(J)J

    move-result-wide v3

    invoke-static {v1, v2}, Li1/v;->h(J)F

    move-result v1

    float-to-double v1, v1

    const-wide v5, 0x3fee666666666666L    # 0.95

    mul-double/2addr v1, v5

    double-to-float v1, v1

    invoke-static {v3, v4, v1}, Li1/w;->i(JF)J

    move-result-wide v8

    .line 10
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$resizedTextStyle$delegate:LY/C0;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->access$AutoResizedText_W72HBGU$lambda$1(LY/C0;)LU0/Y0;

    move-result-object v5

    const v35, 0xfffffd

    const/16 v36, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v5 .. v36}, LU0/Y0;->e(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;LU0/G;Lg1/h;IILg1/u;ILjava/lang/Object;)LU0/Y0;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->access$AutoResizedText_W72HBGU$lambda$2(LY/C0;LU0/Y0;)V

    return-void

    .line 11
    :cond_1
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;->$shouldDraw$delegate:LY/C0;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->access$AutoResizedText_W72HBGU$lambda$5(LY/C0;Z)V

    return-void
.end method
